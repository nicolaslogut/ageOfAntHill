package javaproject_ageOfAntHill.map;

import javaproject_ageOfAntHill.Displaying;

/**
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 * @version 20150607
 */

public interface InterfaceMap {

	/**
	 * adds a defined number of water blocks randomly on the map, and fill its surroundings with sand
	 * @param disp
	 */
	public void generateSandWater(Displaying disp);
	/**
	 * adds a defined number of tree forests randomly on the map
	 * @param disp
	 */
	public void generateTree(Displaying disp);
	/**
	 * generates the player's starting units : a Queen and a Worker
	 * @param disp
	 */
	public void generateStartingUnits(Displaying disp);
	
	public void generateIAUnits(Displaying disp);
	
	public boolean notOutOfTheMap(Position position);

	public String mapToString();

	public Cell getCell(Position pos);

}
