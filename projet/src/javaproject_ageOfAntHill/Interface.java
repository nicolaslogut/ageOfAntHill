package javaproject_ageOfAntHill;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * class for a interface of the game
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 * @version 20150607
 */
public class Interface implements InterfaceHM, MouseListener {
	/**
	 * Allow the player to select one of multiple entities (Units or Building)
	 */
	public void selectEntities() {
	}

	/**
	 * Allows the player to move any Unit
	 */
	public void moveUnit() {
	}

	/**
	 * Allows the player to create a building
	 */
	public void createBuilding() {
	}

	/**
	 * used when clicked on a cell
	 */
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		// event when clicked on a cell => ....
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
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
