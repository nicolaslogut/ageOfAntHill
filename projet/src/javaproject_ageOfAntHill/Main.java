package javaproject_ageOfAntHill;

import javax.swing.SwingUtilities;

import javaproject_ageOfAntHill.map.InterfaceMap;
import javaproject_ageOfAntHill.map.Map;

/**
 * launching the game menu etc...
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 * @version 20150526
 */
public class Main {

	// To check later. Eventually insert into another class.
	public static void main(String[] args) 
	{
		// System.out.println(new javaproject_ageOfAntHill.map.Map());
		InterfaceHM interfHM = new Interface();
		InterfaceMap map = new Map();
		Displaying disp = new Displaying(interfHM);
		SwingUtilities.invokeLater(disp);
		
		// System.out.println("map :\n" + map.mapToString());
		
		// Game myGame = new Game();
	}

}
