package javaproject_ageOfAntHill;

import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import javaproject_ageOfAntHill.entity.Entity;
import javaproject_ageOfAntHill.entity.Unit;
import javaproject_ageOfAntHill.entity.buildable.Building;
import javaproject_ageOfAntHill.map.Position;

/**
 * Interface which controls the class "Interface" ; used by the user to do many actions.
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 */
public interface InterfaceHM {

	public void selectUnits(JLabel labelUnit);
	
	public void selectBuilding(Building building);

	public void moveUnit(Unit[] unit, Position destPos);

	public void createBuilding();

	void mouseClicked(MouseEvent e);
	
	void mouseDragged(MouseEvent e);

}
