package javaproject_ageOfAntHill;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;

import javax.swing.ImageIcon;

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
public class Interface implements InterfaceHM, MouseListener, ActionListener {	
	/**
	 * 	value changing according to the situation: 
	 * 		=> 0 when no selected unit;
	 * 		=> 1 when waiting for the end cell of group selection
	 * 		=> 2 when 1 (or more) unit is selected; 
	 * 		=> 3 when the destination cell has been selected
	 * 		=> check if there is a fight ? then => 0
	 */
	private volatile int clickState;
	/**
	 * temporary selected cell
	 */
	private LabelCustom lab;
	/**
	 * used to store the current selected units
	 */
	private LinkedList<Unit> units;
	/**
	 * event of the last selection
	 */
	private MouseEvent event;
	/**
	 * corresponds to the selected building
	 */
	private Building building;
	/**
	 * used to store the current position of selected units
	 */
	private LinkedList<Position> unitsPos;
	/**
	 * window of the game
	 */
	private Window wind;
	
	/**
	 * creates new interface with all attributes non-existent
	 */
	public Interface(){
		this.units = new LinkedList<Unit>();
		this.unitsPos = new LinkedList<Position>();
		this.building = null;
		this.wind = null;
		clickState=0;
	}
	
	/**
	 * Allow the player to select a group of units
	 * @param e 
	 */
	public void selectUnits(LabelCustom labelUnit1, LabelCustom labelUnit2, MouseEvent e) {
		int numLabel1=0;
		int numLabel2=0;
		this.event=e;	// store this event in order to call it back later (when unselecting units)
		// store the number of the labels 1 and 2
		for (int numLabel=0;numLabel<Map.NBCOLUMN*Map.NBLINE;numLabel++){
			if (labelUnit1==(LabelCustom) e.getComponent().getParent().getComponent(numLabel)){
				numLabel1=numLabel;
			}
			if (labelUnit2==(LabelCustom) e.getComponent().getParent().getComponent(numLabel)){
				numLabel2=numLabel;
			}
		}
		
		int team = labelUnit1.getLabEntity().getTeam();		// only select units of the same team as the first selected one
		
		
		
		this.addUnits(numLabel1/Map.NBLINE, numLabel2/Map.NBLINE, numLabel1%Map.NBCOLUMN, numLabel2%Map.NBCOLUMN, e, team);
		
		this.addPictureSelection();
		
	}
	
	/**
	 * adds all the units in the field range inside the units collection
	 * @param numLine1
	 * @param numLine2
	 * @param numCol1
	 * @param numCol2
	 * @param e
	 */
	private void addUnits(int numLine1, int numLine2, int numCol1, int numCol2, MouseEvent e, int team){		
		int lineNumber;
		int colNumber;
			// gets the window of the game through this component's event
		
		if (numLine1 <= numLine2 && numCol1 <= numCol2){
			for (lineNumber = numLine1 ; lineNumber <= numLine2 ; lineNumber++){
				for (colNumber = numCol1 ; colNumber <= numCol2 ; colNumber++){
					if (wind.getLabelTab(lineNumber, colNumber).getLabEntity() != null 
							&& team == wind.getLabelTab(lineNumber, colNumber).getLabEntity().getTeam()){
						Entity ent = wind.getLabelTab(lineNumber, colNumber).getLabEntity();
						Position pos = new Position(lineNumber, colNumber);
						this.unitsPos.add(pos);
						this.units.add((Unit) ent);
					}
				}
			}
		}
		else {
			if (numLine1 <= numLine2 && numCol1 > numCol2){
				for (lineNumber = numLine1 ; lineNumber <= numLine2 ; lineNumber++){
					for (colNumber = numCol2 ; colNumber <= numCol1 ; colNumber++){
						if (wind.getLabelTab(lineNumber, colNumber).getLabEntity() != null 
								&& team == wind.getLabelTab(lineNumber, colNumber).getLabEntity().getTeam()){
							Entity ent = wind.getLabelTab(lineNumber, colNumber).getLabEntity();
							Position pos = new Position(lineNumber, colNumber);
							this.unitsPos.add(pos);
							this.units.add((Unit) ent);
						}
					}
				}
			}
			else {
				if (numLine1 > numLine2 && numCol1 <= numCol2){
					for (lineNumber = numLine2 ; lineNumber <= numLine1 ; lineNumber++){
						for (colNumber = numCol1 ; colNumber <= numCol2 ; colNumber++){
							if (wind.getLabelTab(lineNumber, colNumber).getLabEntity() != null 
									&& team == wind.getLabelTab(lineNumber, colNumber).getLabEntity().getTeam()){
								Entity ent = wind.getLabelTab(lineNumber, colNumber).getLabEntity();
								Position pos = new Position(lineNumber, colNumber);
								this.unitsPos.add(pos);
								this.units.add((Unit) ent);
							}
						}
					}
				}
				else {
					for (lineNumber = numLine2 ; lineNumber <= numLine1 ; lineNumber++){
						for (colNumber = numCol2 ; colNumber <= numCol1 ; colNumber++){
							if (wind.getLabelTab(lineNumber, colNumber).getLabEntity() != null 
									&& team == wind.getLabelTab(lineNumber, colNumber).getLabEntity().getTeam()){
								Entity ent = wind.getLabelTab(lineNumber, colNumber).getLabEntity();
								Position pos = new Position(lineNumber, colNumber);
								this.unitsPos.add(pos);
								this.units.add((Unit) ent);
							}
						}
					}
				}
			}
		}
	}
	
	/**
	 * changes picture selection unit
	 */
	private void addPictureSelection() {
		for (int numUnit= 0; numUnit < this.units.size(); numUnit++){
			int line = this.unitsPos.get(numUnit).getX();
			int col = this.unitsPos.get(numUnit).getY();
			switch (this.units.get(numUnit).getType()){
			case "FLY":
				wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/fly/flySelect.png"));
				break;
			case "GUARD":
				wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/guardian/guardianSelect.png"));
				break;
			case "LIZ":
				wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/lizard/lizardSelect.png"));
				break;
			case "QUEEN":
				wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/queen/queenSelect.png"));
				break;
			case "SCAR":
				wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/scarab/scarabSelect.png"));
				break;
			case "SCOUT":
				wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/scout/scoutSelect.png"));
				break;
			case "SHOOT":
				wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/shooter/shooterSelect.png"));
				break;
			case "WARR":
				wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/warrior/warriorSelect.png"));
				break;
			case "WORK":
				wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/worker/workerSelect.png"));
				break;
			case "AHILL":
				//wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/buildings/ANTHILL_BUILDING.png"));
				break;
			case "HOUSE":
				//wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/buildings/HOUSE_BUILDING.png"));
				break;
			case "WALL":
				//wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/buildings/POSTGUARD_BUILDING.png"));
				break;
			default:
			}
			wind.getDisp().getJpanelLeft().selectionEntity(this.units.get(numUnit));
		}
	}
	
	/**
	 * changes picture unselection unit
	 */
	private void addPictureUnselection() {
		if (this.units != null){
			for (int numUnit= 0; numUnit < this.units.size(); numUnit++){
				int line = this.unitsPos.get(numUnit).getX();
				int col = this.unitsPos.get(numUnit).getY();
				switch (this.units.get(numUnit).getType()){
				case "FLY":
					wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/fly/fly.png"));
					break;
				case "GUARD":
					wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/guardian/guardian.png"));
					break;
				case "LIZ":
					wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/lizard/lizard.png"));
					break;
				case "QUEEN":
					wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/queen/queen.png"));
					break;
				case "SCAR":
					wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/scarab/scarab.png"));
					break;
				case "SCOUT":
					wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/scout/scout.png"));
					break;
				case "SHOOT":
					wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/shooter/shooter.png"));
					break;
				case "WARR":
					wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/warrior/warrior.png"));
					break;
				case "WORK":
					wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/mobs/worker/worker.png"));
					break;
				case "AHILL":
					//wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/buildings/ANTHILL_BUILDING.png"));
					break;
				case "HOUSE":
					//wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/buildings/HOUSE_BUILDING.png"));
					break;
				case "WALL":
					//wind.getLabelTab(line, col).getJlentity().setIcon(new ImageIcon("./img/buildings/POSTGUARD_BUILDING.png"));
					break;
				default:
				}
			}
		}
		this.event=null;
	}
	
	/**
	 * Allows the player to move any unit.
	 */
	public void moveUnit(LabelCustom label) {
		//Position destPos = label.get;
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
		// selectionEntity(Entity ent); in JPanelLeft
	}
	
	/**
	 * Used when the user is clicking on a cell.
	 * its main use is to move units
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		this.wind = (Window) e.getComponent().getParent().getParent().getParent().getParent().getParent().getParent();
		LabelCustom label = (LabelCustom) e.getComponent();
		
		if (label.getLabEntity()==null && e.getButton()!=3){
				// looses all the selected entities and then select the cell
			this.addPictureUnselection();
			this.units=null;
			this.building=null;
			this.unitsPos=null;
			this.lab=null;
			clickState=0;
			return;
		}
			// different action depending on which mouse button was pressed
		switch (e.getButton()){
		case 3:		// move - attack         RIGHT CLICK
			if (clickState !=2 || this.units == null || this.units.get(0).getTeam() != 1){
				// no ally unit selected (=> unselect everything)
				this.reinitializeSelection();
				break;
			}
			
			this.moveUnit(label);
			clickState = 3;
			break;
			
		case 1:
		case 2:		//						LEFT CLICK - MIDDLE CLICK
			switch (clickState){
			case 0:
				this.lab = (LabelCustom) e.getComponent();
				clickState=1;
				break;
			case 1:
				this.units = new LinkedList<Unit>();
				this.unitsPos = new LinkedList<Position>();
				this.selectUnits(this.lab, label, e);
				clickState=2;
				break;
			case 2:
				this.reinitializeSelection();
				break;
			default:	// looses all the selected entities and then select the cell
				this.reinitializeSelection();
			}
			break;
			
		default:	// nothing happening
		}
	}
	
	/**
	 * reset all the attributes to null,
	 * except clickState wich is taking the value 0 (=nothing selected)
	 */
	public void reinitializeSelection(){
		if (this.event != null)
			addPictureUnselection();
		this.units = null;
		this.unitsPos = null;
		this.building = null;
		this.lab = null;
		this.clickState = 0;
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
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
