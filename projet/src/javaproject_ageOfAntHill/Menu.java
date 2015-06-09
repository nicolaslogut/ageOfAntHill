package javaproject_ageOfAntHill;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javaproject_ageOfAntHill.map.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

@SuppressWarnings("serial")
public class Menu extends JFrame implements ActionListener {
	/**
	 * used to start a new game
	 */
	private JButton buttonNewGame;
	/**
	 * used to load a game
	 */
	private JButton buttonLoadGame;
	/**
	 * closes the game
	 */
	private JButton buttonClose;
	/**
	 * window of the game
	 */
	private Displaying disp;
	
	private JSplitPane split1;
	private JSplitPane split2;
	private JSplitPane split3;
	
	
	
	public Menu(Displaying disp){
		this.disp = disp;
		buttonNewGame = new JButton("New game");
		buttonLoadGame = new JButton("Load a game");
		buttonClose = new JButton("close");
		this.split1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		this.split2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		//this.split3 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		
		init();
	}
	
	
	public void init()
	{
	this.setSize(300, 400);
	this.setResizable(false);
	this.setLocationRelativeTo(null);
	JPanel pan1 = new JPanel();
	JPanel pan2 = new JPanel();
	JPanel pan3 = new JPanel();
	//pan.setSize(500,500);
	//GridLayout gl = new GridLayout(3, 1);
	//gl.setVgap(30);
	
	
	//pan.setLayout(gl);
	pan1.add(buttonNewGame);
	pan2.add(buttonLoadGame);
	pan3.add(buttonClose);
	split1.add(pan1);
	split1.add(pan2);
	split2.add(split1);
	split2.add(pan3);
	split1.setDividerLocation(150);
	split1.setDividerSize(0);
	split1.setEnabled(true);
	split2.setDividerLocation(300);
	split2.setDividerSize(0);
	split2.setEnabled(true);
	this.setContentPane(split2);
	buttonNewGame.addActionListener(this);
	buttonLoadGame.addActionListener(this);
	buttonClose.addActionListener(this);
	
	
	this.setVisible(true);
	}
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource() == buttonClose){
		this.disp.getFrame().dispose();
		this.dispose();	
	} else if(e.getSource() == buttonNewGame){
		this.disp.getFrame().setVisible(true);
		this.disp.startNewGame();
		this.dispose();
	} else if (e.getSource() == buttonLoadGame){
		
		this.dispose();
	}
	}
	
}


