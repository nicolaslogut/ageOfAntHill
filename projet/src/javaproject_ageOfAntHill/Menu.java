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
	
	
	public Menu(Displaying disp){
		this.disp = disp;
		buttonNewGame = new JButton("New game");
		buttonLoadGame = new JButton("Load a game");
		buttonClose = new JButton("close");
		init();
	}
	
	
	public void init()
	{
	this.setSize(980, 980);
	this.setResizable(false);
	this.setLocationRelativeTo(null);
	JPanel pan = new JPanel();
	
	pan.setSize(500,500);
	GridLayout gl = new GridLayout(3, 1);
	gl.setVgap(100);
	
	
	pan.setLayout(gl);
	pan.add(buttonNewGame);
	pan.add(buttonLoadGame);
	pan.add(buttonClose);
	this.setContentPane(pan);
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


