package javaproject_ageOfAntHill;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javaproject_ageOfAntHill.map.Map;

/**
 * Class for an interface of the game.
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 * @version 20150607
 */
public class Interface implements InterfaceHM, MouseListener {
	
	public Interface(){
	}
	
	/**
	 * Allow the player to select one of multiple entities (Units or Building).
	 */
	public void selectEntities() {
	}

	/**
	 * Allows the player to move any unit.
	 */
	public void moveUnit() {
	}

	/**
	 * Allows the player to create a building.
	 */
	public void createBuilding() {
	}

	/**
	 * Used when the user is clicking on a cell.
	 */
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("MouseEvents already working");
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

	@Override
	public void mousePressed(MouseEvent e) {
		int numLabel;
		for (numLabel=0;numLabel<Map.NBCOLUMN*Map.NBLINE;numLabel++){
			if (e.getSource()==(LabelCustom) e.getComponent().getParent().getComponent(numLabel)){
				System.out.println("label num "+numLabel);
			}
		}
		// ((LabelCustom) e.getSource()).getJlguard().setOpaque(true);
		// this one not working
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
