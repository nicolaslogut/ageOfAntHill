package javaproject_ageOfAntHill.map;

import javaproject_ageOfAntHill.Displaying;
/**
 * 
 *@author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 *@version 20150607
 */

public interface InterfaceMap {
	
	/**
	 * adds a water block randomly on the map, and fill its surroundings with sand
	 */
	public void generateSandWater(Displaying disp);
	
	public void generateTree(Displaying disp);
	
	public boolean notOutOfTheMap(Position position);
	
	public String mapToString();
	
}
