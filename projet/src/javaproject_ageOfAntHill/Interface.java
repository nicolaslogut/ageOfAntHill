package javaproject_ageOfAntHill;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javaproject_ageOfAntHill.entity.Entity;
import javaproject_ageOfAntHill.entity.Unit;
import javaproject_ageOfAntHill.entity.buildable.Building;
import javaproject_ageOfAntHill.map.Map;
import javaproject_ageOfAntHill.map.Position;
import javaproject_ageOfAntHill.Displaying;

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
	//private boolean draggredMouse = false;
	
	/**
	 * 	value changing according to the situation: 
	 * 		=> 0 when no selected unit;
	 * 		=> 1 when waiting for the end cell of group selection
	 * 		=> 2 when 1 (or more) unit is selected; 
	 * 		=> 3 when the destination cell has been selected
	 */
	private volatile int clickState;
	/**
	 * temporary selected cell
	 */
	private LabelCustom lab;
	/**
	 * used to store the current selected units
	 */
	private Unit[] units;
	/**
	 * current number of elements in the table units 
	 */
	private int unitCounter;
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
		this.unitCounter=0;
		this.building = null;
		clickState=0;
	}
	
	/**
	 * Allow the player to select a group of units
	 * @param e 
	 */
	public void selectUnits(LabelCustom labelUnit1, LabelCustom labelUnit2, MouseEvent e) {
		int numLabel1=0;
		int numLabel2=0;
		// store the number of the labels 1 and 2
		for (int numLabel=0;numLabel<Map.NBCOLUMN*Map.NBLINE;numLabel++){
			if (labelUnit1==(LabelCustom) e.getComponent().getParent().getComponent(numLabel)){
				numLabel1=numLabel;
			}
			if (labelUnit2==(LabelCustom) e.getComponent().getParent().getComponent(numLabel)){
				numLabel2=numLabel;
			}
		}
		
		this.addUnits(numLabel1/Map.NBLINE, numLabel2/Map.NBLINE, numLabel1%Map.NBCOLUMN, numLabel2%Map.NBCOLUMN, e);
		
		if (labelUnit1.getLabEntity()!=null){
			this.units[unitCounter]=(Unit) labelUnit1.getLabEntity();
			unitCounter++;
		}
		if (this.units[unitCounter]==null){
			//this.units[numUnit]=(Unit) labelUnit;
			return;
		}
	}
	
	private void addUnits(int numLine1, int numLine2, int numCol1, int numCol2, MouseEvent e){
		int lineNumber;
		int colNumber;
		if (numLine1 <= numLine2 && numCol1 <= numCol2){
			for (lineNumber = numLine1 ; lineNumber <= numLine2 ; lineNumber++){
				for (colNumber = numCol1 ; colNumber <= numCol2 ; colNumber++){
					JFrame disp;
					/*this.units[this.unitCounter]*///disp = e.getComponent().getParent()).getParent(); //.getLabelTab(lineNumber, colNumber).getLabEntity();
				}
			}
		}
		else {
			if (numLine1 <= numLine2 && numCol1 > numCol2){
				for (lineNumber = numLine1 ; lineNumber <= numLine2 ; lineNumber++){
					for (colNumber = numCol2 ; colNumber <= numCol1 ; colNumber++){
						
					}
				}
			}
			else {
				if (numLine1 > numLine2 && numCol1 <= numCol2){
					for (lineNumber = numLine2 ; lineNumber <= numLine1 ; lineNumber++){
						for (colNumber = numCol1 ; colNumber <= numCol2 ; colNumber++){
							
						}
					}
				}
				else {
					for (lineNumber = numLine2 ; lineNumber <= numLine1 ; lineNumber++){
						for (colNumber = numCol2 ; colNumber <= numCol1 ; colNumber++){
							
						}
					}
				}
			}
		}
	}
	
	/**
	 * Allow the player to select one unit
	 */
	public void selectUnit(LabelCustom labelUnit){
		Unit unit = (Unit) labelUnit.getLabEntity();
		
		// ...
		
	}
	
	/**
	 * Allows the player to move any unit.
	 */
	public void moveUnit(Unit[] unit, Position destPos) {
		//unit.moveUnit(destPos, startingPos, map);
	}
	
	/**
	 * Allow the player to select one building
	 * @param building
	 */
	@Override
	public void selectBuilding(Building building) {
	}
	
	/**
	 * Allows the player to create a building.
	 */
	public void createBuilding() {
	}
	
	
	@Override
	public void mouseDragged(MouseEvent e){		// not enough efficient
//		if (e.getButton()==1){
//			if ((e.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK) {
//				if (delayDraggredMouse == DEFAULT_VALUE_DELAY_MOUSE_DRAGGED) {
//					delayDraggredMouse = System.currentTimeMillis();
//				} else {
//					if (System.currentTimeMillis() - delayDraggredMouse > DELAY_MOUSE_DRAGGED_CLICKED) {
//							// each "dragged" cell
//						// draggredMouse = true;
//					}
//				}
//			}
//		}
	}
	/**
	 * Used when the user is clicking on a cell.
	 * its main use is to move units
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		LabelCustom label=(LabelCustom) e.getComponent();
		// if there is no entity (either building or unit) on the cell, unselect everything and leave
		if (label.getLabEntity()==null && e.getButton()!=3){
			this.units=null;
			this.building=null;
			this.lab=null;
			clickState=0;
			return;
		}
		
		switch (e.getButton()){
		case 1:		// looses all the selected entities and then select the cell
			this.units=null;
			this.building=null;
			this.selectUnit(label);
			clickState=1;
			break;
		case 3:		// move - attack
			
			//this.moveUnit(this.units, destPos);
			clickState=3;
			break;
		case 2:
			
			switch (clickState){
			case 0:
				this.lab = (LabelCustom) e.getComponent();
				clickState=1;
				break;
			case 1:
				this.selectUnits(this.lab, label, e);
				clickState=2;
				break;
			default:
				this.units=null;
				this.building=null;
				this.lab=null;
				clickState=0;
			}
			break;
			
		default:	// nothing happening
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
//		int numLabel;
//		switch (e.getButton()){
//		case 1:		// start unit selection
//			for (numLabel=0;numLabel<Map.NBCOLUMN*Map.NBLINE;numLabel++){
//				if (e.getSource()==(LabelCustom) e.getComponent().getParent().getComponent(numLabel)){
//					//System.out.println("label num "+numLabel);
//				}
//			}
//		default:
//			break;
//		}
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
