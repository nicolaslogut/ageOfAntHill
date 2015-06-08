package javaproject_ageOfAntHill;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

@SuppressWarnings("serial")
public class JPanelLeft extends JPanel{
	
	private JLabel overlay;
	private JLabel ressources;
	private JLabel food;
	private JLabel foodValue;
	private JLabel earth;
	private JLabel earthValue;
	
	private int tamer = 1;
	
	public JPanelLeft(){
		
		setLayout(new OverlayLayout(this));
		
		overlay = new JLabel(new ImageIcon("./img/LeftPaneOverlay.png"));
		
		ressources = new JLabel("<html>Ressources :<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>", JLabel.CENTER);
		ressources.setForeground(Color.white);
		ressources.setFont(new Font("Sherif", Font.ITALIC, 20));
		
		food = new JLabel("<html>Nourriture :<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>", new ImageIcon("./img/Nourriture.png"), JLabel.CENTER);
		food.setForeground(Color.white);
		food.setFont(new Font("Sherif", Font.ITALIC, 15));
		
		foodValue = new JLabel("<html>" + tamer + "<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>", JLabel.CENTER);
		foodValue.setForeground(Color.white);
		foodValue.setFont(new Font("Sherif", Font.ITALIC, 15));
		
		earth = new JLabel("<html>Terre :<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>", JLabel.CENTER);
		earth.setForeground(Color.white);
		earth.setFont(new Font("Sherif", Font.ITALIC, 15));
		
		earthValue = new JLabel("<html>" + tamer + "<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>", JLabel.CENTER);
		earthValue.setForeground(Color.white);
		earthValue.setFont(new Font("Sherif", Font.ITALIC, 15));

		add(ressources, 0);
		add(food, 1);
		add(foodValue, 2);
		add(earth, 3);
		add(earthValue, 4);
		add(overlay, 5);
	}
	
	public JLabel getRessources(){
		return ressources;
	}
	
	public JLabel getImage(){
		return overlay;
	}
}
