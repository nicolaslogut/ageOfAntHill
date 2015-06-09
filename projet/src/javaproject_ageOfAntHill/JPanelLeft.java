package javaproject_ageOfAntHill;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javaproject_ageOfAntHill.entity.Entity;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

@SuppressWarnings("serial")
public class JPanelLeft extends JPanel {
	
	private JLabel overlay;
	private JLabel ressources;
	private JLabel food;
	private JLabel foodValue;
	private JLabel earth;
	private JLabel earthValue;
	private JButton building;
	private JLabel selection;
	
	private int tamer = 1;
	
	public JPanelLeft(InterfaceHM interfHM){
		
		setLayout(new OverlayLayout(this));
		
		overlay = new JLabel(new ImageIcon("./img/overlay/LEFTPANEL_OVERLAY.png"));
		
		ressources = new JLabel("<html>Ressources :<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>", JLabel.CENTER);
		ressources.setForeground(Color.white);
		ressources.setFont(new Font("Sherif", Font.ITALIC, 20));
		
		food = new JLabel("<html>Nourriture :<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>", new ImageIcon("./img/miscs/FOOD.png"), JLabel.CENTER);
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
		
		building = new JButton(new ImageIcon("./img/overlay/BUILDING_ICON.png"));
		building.addActionListener((ActionListener) interfHM);
		selection = new JLabel("", JLabel.CENTER);
		
		add(ressources, 0);
		add(food, 1);
		add(foodValue, 2);
		add(earth, 3);
		add(earthValue, 4);
		add(selection, 5);
		add(building, 6);
		add(overlay, 7);
	}
	
	public JLabel getRessources(){
		return ressources;
	}
	
	public JLabel getImage(){
		return overlay;
	}
	
	public void selectionEntity(Entity ent){
		switch(ent.getType()){
		case "FLY":
			selection.setIcon(new ImageIcon("./img/mobs/fly/fly.png"));
			break;
		case "GUARD":
			selection.setIcon(new ImageIcon("./img/mobs/guardian/guardian.png"));
			break;
		case "LIZ":
			selection.setIcon(new ImageIcon("./img/mobs/lizard/lizard.png"));
			break;
		case "QUEEN":
			selection.setIcon(new ImageIcon("./img/mobs/queen/queen-b.png"));
			break;
		case "SCAR":
			selection.setIcon(new ImageIcon("./img/mobs/scarab/scarab.png"));
			break;
		case "SCOUT":
			selection.setIcon(new ImageIcon("./img/mobs/scout/scout.png"));
			break;
		case "SHOOT":
			selection.setIcon(new ImageIcon("./img/mobs/shooter/shooter.png"));
			break;
		case "WARR":
			selection.setIcon(new ImageIcon("./img/mobs/warrior/warrior.png"));
			break;
		case "WORK":
			selection.setIcon(new ImageIcon("./img/mobs/worker/worker.png"));
			break;
		case "AHILL":
			selection.setIcon(new ImageIcon("./img/buildings/ANTHILL_BUILDING.png"));
			break;
		case "HOUSE":
			selection.setIcon(new ImageIcon("./img/buildings/HOUSE_BUILDING.png"));
			break;
		case "WALL":
			selection.setIcon(new ImageIcon("./img/buildings/HOUSE_BUILDING.png"));
			break;
		default:
		}
	}
}
