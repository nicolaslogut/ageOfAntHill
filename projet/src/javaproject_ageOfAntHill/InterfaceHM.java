package javaproject_ageOfAntHill;

import java.awt.event.MouseEvent;

/**
 * Interface which controls the class "Interface" ; used by the user to do many actions.
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 */
public interface InterfaceHM {

	public void selectEntities();

	public void moveUnit();

	public void createBuilding();

	void mouseEntered(MouseEvent e);

}
