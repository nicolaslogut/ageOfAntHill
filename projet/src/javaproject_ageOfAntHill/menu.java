package javaproject_ageOfAntHill;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class menu extends JFrame implements ActionListener {

	
	private JButton buttonNewGame;
	private JButton buttonLoadGame;
	private JButton buttonClose;
	private JButton button4;
	private Object frame;
	
	
	public void Menu(){
		buttonNewGame = new JButton("New game");
		buttonLoadGame = new JButton("Load a game");
		buttonClose = new JButton("close");
		//button4 = new JButton();
		
		init();
	}
	
	
	public void init()
	{
	this.setSize(300, 100);
	
	this.getContentPane().add(buttonNewGame);
	this.getContentPane().add(buttonLoadGame);
	this.getContentPane().add(buttonClose);
	buttonNewGame.addActionListener(this);
	buttonLoadGame.addActionListener(this);
	buttonClose.addActionListener(this);
	//this.getContentPane().add(button4);
	
	this.setVisible(true);
	}
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource() == buttonClose){
		this.dispose();	
	}else if(e.getSource() == buttonNewGame){
		
	}else if (e.getSource() == buttonLoadGame){
		
	}
	}
	
	}


