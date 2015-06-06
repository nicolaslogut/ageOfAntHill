package javaproject_ageOfAntHill.map;

import javaproject_ageOfAntHill.Displaying;

public interface InterfaceMap {
	
	/**
	 * adds a water block randomly on the map, and fill its surroundings with sand
	 */
	public void generateSandWater(Displaying disp);
	
	public boolean notOutOfTheMap(Position position);
	
	public String mapToString();
	
}
