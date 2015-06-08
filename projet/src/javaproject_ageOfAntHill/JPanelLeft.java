package javaproject_ageOfAntHill;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

@SuppressWarnings("serial")
public class JPanelLeft extends JPanel{
	
	private JLabel image;
	private JLabel ressources;
	private JLabel nourriture;
	
	public JPanelLeft(){
		setLayout(new OverlayLayout(this));
		image = new JLabel(new ImageIcon("./img/LeftPaneOverlay.png"));
		
		ressources = new JLabel("<html>Ressources :<br>", JLabel.CENTER);
		ressources.setForeground(Color.white);
		ressources.setFont(new Font("Sherif", Font.ITALIC, 20));
		
		//nourriture = new JLabel("<html>Nourriture :<br>", new ImageIcon("./img/Nourriture.png"), 0);

		add(ressources, 0);
		add(image, 1);
		//add(nourriture, 1);
	}
	
	public JLabel getRessources(){
		return ressources;
	}
	
	public JLabel getImage(){
		return image;
	}
}
