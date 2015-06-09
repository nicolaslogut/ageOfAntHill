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
	private JLabel dirtValue;
	private JButton building;
	private JLabel selection;
	
	private int foodValueInt;
	private int dirtValueInt;

	public JPanelLeft(InterfaceHM interfHM){
		
		setLayout(new OverlayLayout(this));
		
		overlay = new JLabel(new ImageIcon("./img/overlay/LEFTPANEL_OVERLAY.png"));
		
		ressources = new JLabel("<html>Ressources :<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>", JLabel.CENTER);
		ressources.setForeground(Color.white);
		ressources.setFont(new Font("Sherif", Font.ITALIC, 20));
		
		food = new JLabel("<html>Food :<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>", new ImageIcon("./img/miscs/FOOD.png"), JLabel.CENTER);
		food.setForeground(Color.white);
		food.setFont(new Font("Sherif", Font.ITALIC, 15));
		
		foodValue = new JLabel("<html>" + foodValueInt + "<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>", JLabel.CENTER);
		foodValue.setForeground(Color.white);
		foodValue.setFont(new Font("Sherif", Font.ITALIC, 15));
		
		earth = new JLabel("<html>Dirt :<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>", JLabel.CENTER);
		earth.setForeground(Color.white);
		earth.setFont(new Font("Sherif", Font.ITALIC, 15));
		
		dirtValue = new JLabel("<html>" + dirtValueInt + "<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>", JLabel.CENTER);
		dirtValue.setForeground(Color.white);
		dirtValue.setFont(new Font("Sherif", Font.ITALIC, 15));
		
		building = new JButton(new ImageIcon("./img/overlay/BUILDING_ICON.png"));
		building.addActionListener((ActionListener) interfHM);
		building.setBorder(null);
		
		selection = new JLabel(new ImageIcon("./img/mobs/worker/workerDisplay.png"), JLabel.CENTER);
		
		add(ressources, 0);
		add(food, 1);
		add(foodValue, 2);
		add(earth, 3);
		add(dirtValue, 4);
		add(selection, 5);
		add(building, 6);
		add(overlay, 7);
	}
	/**
	 * This method get the Ressources (food & dirt)
	 * @return
	 */
	public JLabel getRessources(){
		return ressources;
	}
	/**
	 * This method get the background Picture
	 * @return overlay
	 */
	public JLabel getImage(){
		return overlay;
	}
	
	
	
	/**
	 * Add food in the JPanelLeft
	 * @param foodValue
	 */
	public void addFoodValue(int foodValue){
		this.foodValueInt += foodValue;
		this.foodValue.setText("<html>" + this.foodValueInt + "<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br></html>");
	}
	/**
	 * Remove food in the JPanelLeft
	 * @param foodValue
	 */
	public void removeFoodValue(int foodValue){
		this.foodValueInt -= foodValue;
		this.foodValue.setText("<html>" + this.foodValueInt + "<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br></html>");
	}
	/**
	 * Add dirt in the JPanelLeft
	 * @param dirtValue
	 */
	public void addDirtValue(int dirtValue){
		this.dirtValueInt += dirtValue;
		this.dirtValue.setText("<html>" + this.dirtValueInt + "<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br></html>");
	}
	/**
	 * Remove dirt in the JPanelLeft
	 * @param dirtValue
	 */
	public void removeDirtValue(int dirtValue){
		this.dirtValueInt -= dirtValue;
		this.dirtValue.setText("<html>" + this.dirtValueInt + "<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br></html>");
	}
	
	
	
	
	public void selectionEntity(Entity ent){
		switch(ent.getType()){
		case "FLY":
			selection.setIcon(new ImageIcon("./img/mobs/fly/flyDisplay.png"));
			break;
		case "GUARD":
			selection.setIcon(new ImageIcon("./img/mobs/guardian/guardianDisplay.png"));
			break;
		case "LIZ":
			selection.setIcon(new ImageIcon("./img/mobs/lizard/lizardDisplay.png"));
			break;
		case "QUEEN":
			selection.setIcon(new ImageIcon("./img/mobs/queen/queenDisplay.png"));
			break;
		case "SCAR":
			selection.setIcon(new ImageIcon("./img/mobs/scarab/scarabDisplay.png"));
			break;
		case "SCOUT":
			selection.setIcon(new ImageIcon("./img/mobs/scout/scoutDisplay.png"));
			break;
		case "SHOOT":
			selection.setIcon(new ImageIcon("./img/mobs/shooter/shooterDisplay.png"));
			break;
		case "WARR":
			selection.setIcon(new ImageIcon("./img/mobs/warrior/warriorDisplay.png"));
			break;
		case "WORK":
			selection.setIcon(new ImageIcon("./img/mobs/worker/workerDisplay.png"));
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
