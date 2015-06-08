package javaproject_ageOfAntHill;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javaproject_ageOfAntHill.entity.Entity;
import javaproject_ageOfAntHill.entity.Unit;
import javaproject_ageOfAntHill.entity.buildable.Building;
import javaproject_ageOfAntHill.map.Map;
import javaproject_ageOfAntHill.map.Position;

/**
 * Class for an interface of the game.
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 * @version 20150607
 */
public class Interface implements InterfaceHM, MouseListener, MouseMotionListener {
	
	private static final int DEFAULT_VALUE_DELAY_MOUSE_DRAGGED = -1;
	private static final long DELAY_MOUSE_DRAGGED_CLICKED = 300;
 
	private long delayDraggredMouse = DEFAULT_VALUE_DELAY_MOUSE_DRAGGED;
	private boolean draggredMouse = false;
	
	/**
	 * 	value changing according to the situation: 
	 * 		=> 0 when no selected unit; 
	 * 		=> 1 when 1 (or more) unit is selected; 
	 * 		=> 2 when the destination cell has been selected
	 */
	private volatile int clickState;
	/**
	 * used to store the current selected units
	 */
	private Unit[] units;
	/**
	 * corresponds to the selected building
	 */
	private Building building;
	/**
	 * used to store the current position of selected units
	 */
	private Position[] startingPos;
	/**
	 * creates new interface with all attributes non-existent
	 */
	public Interface(){
		this.units = null;
		this.building = null;
		clickState=0;
	}
	
	/**
	 * Allow the player to select one of multiple entities (Units or Building).
	 */
	public void selectUnits(Unit unit) {
		for (int numUnit=0;numUnit<20;numUnit++){
			if (this.units[numUnit]==null){
				this.units[numUnit]=unit;
				return;
			}
		}
	}

	/**
	 * Allows the player to move any unit.
	 */
	public void moveUnit(Unit[] unit, Position destPos) {
		//unit.moveUnit(destPos, startingPos, map);
	}
	
	@Override
	public void selectBuilding(Building building) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Allows the player to create a building.
	 */
	public void createBuilding() {
	}
	
	
	@Override
	public void mouseDragged(MouseEvent e){
		System.out.println(e.getButton());
		System.out.println(e.getModifiers());
		if (e.getButton()==1){
			int numLabel;
			for (numLabel=0;numLabel<Map.NBCOLUMN*Map.NBLINE;numLabel++){
				if (e.getSource()==(LabelCustom) e.getComponent().getParent().getComponent(numLabel)){
					System.out.println("label num "+numLabel);
				}
			}
		}
		int modif = e.getModifiers();
		if ((modif & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK) {
			if (delayDraggredMouse == DEFAULT_VALUE_DELAY_MOUSE_DRAGGED) {
				delayDraggredMouse = System.currentTimeMillis();
			} else {
				if (System.currentTimeMillis() - delayDraggredMouse > DELAY_MOUSE_DRAGGED_CLICKED) {
					System.out.println("ça drague !");
					draggredMouse = true;
				}
			}
		}
	}
	/**
	 * Used when the user is clicking on a cell.
	 * its main use is to move units
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		switch (e.getButton()){
		case 1:		// looses all the selected entities
			
			this.units=null;
			this.building=null;
			clickState=0;
			break;
		case 3:		// calls the moveUnit method 
			
			//this.moveUnit(this.units, destPos);
			clickState=2;
			break;
		case 2: default:	// nothing happening
			
			break;
		}
	}

	// these following listeners probably won't be used
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
				
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	/**
	 * used when entering a cell
	 * its main use is to select units/building with their current position
	 * @param e
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		int numLabel;
		switch (e.getButton()){
		case 1:		// start unit selection
			for (numLabel=0;numLabel<Map.NBCOLUMN*Map.NBLINE;numLabel++){
				if (e.getSource()==(LabelCustom) e.getComponent().getParent().getComponent(numLabel)){
					//System.out.println("label num "+numLabel);
				}
			}
		default:
			break;
		}
		// ((LabelCustom) e.getSource()).getJlguard().setOpaque(true);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		// displays units current HP/maxHP
		
	}

}
