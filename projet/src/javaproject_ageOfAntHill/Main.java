package javaproject_ageOfAntHill;

import javax.swing.SwingUtilities;

import javaproject_ageOfAntHill.map.InterfaceMap;
import javaproject_ageOfAntHill.map.Map;

/**
 * launching the game menu etc...
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 * @version 20150607
 */
public class Main {
	/**
	 * This is the main
	 * @param args
	 */
	// To check later. Eventually insert into another class.
	public static void main(String[] args) 
	{
		InterfaceHM interfHM = new Interface();
		InterfaceMap map = new Map();
		Displaying disp = new Displaying(interfHM);
		disp.run();
		//SwingUtilities.invokeLater(disp);
		map.generateSandWater(disp);
		map.generateTree(disp);
		
//		Map map = new Map();
//		System.out.println("map :\n" + map.mapToString());
	}

}
