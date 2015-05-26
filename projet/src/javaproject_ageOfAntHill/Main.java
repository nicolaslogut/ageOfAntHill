package javaproject_ageOfAntHill;

import javaproject_ageOfAntHill.map.Map;

/**
 * launching the game menu etc...
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */
public class Main {

	// To check later. Eventually insert into another class.
	public static void main(String[] args) 
	{
		// System.out.println(new javaproject_ageOfAntHill.map.Map()); 
		Map map = new Map();
		System.out.println("map : \n" + map.displayMap());
	}

}
