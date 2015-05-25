package javaproject_ageOfAntHill.entity;

import javaproject_ageOfAntHill.map.CellState;
/**
 * represents a unit in a game
 * this is an entity that has the capacity to move and attack
 * @author Maxime Augst, Jorris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */

public class Unit extends Entity {
	// eventuellement creer une nouvelle classe (abstraite ?) pour stocker toutes ces constantes
	/**
	 * default armor, damages and HP for non-attacking units (queen, workers...)
	 */
	protected final static int DEFAULT_PEACEFUL_UNIT_ARMOR=1;
	protected final static int DEFAULT_PEACEFUL_UNIT_DAMAGE=0;
	protected final static int DEFAULT_PEACEFUL_UNIT_HP=20;
	/**
	 * default armor, damages and HP for non-attacking units (scouts, shooters,flies...)
	 */
	protected final static int DEFAULT_LIGHT_UNIT_ARMOR=2;
	protected final static int DEFAULT_LIGHT_UNIT_DAMAGE=6;
	protected final static int DEFAULT_LIGHT_UNIT_HP=24;
	/**
	 * default armor, damages and HP for medium armor units (warriors, lizards...)
	 */
	protected final static int DEFAULT_MEDIUM_UNIT_ARMOR=3;
	protected final static int DEFAULT_MEDIUM_UNIT_DAMAGE=10;
	protected final static int DEFAULT_MEDIUM_UNIT_HP=32;
	/**
	 * default armor, damages and HP for heavy armor units (guardians, scarab...)
	 */
	protected final static int DEFAULT_HEAVY_UNIT_ARMOR=5;
	protected final static int DEFAULT_HEAVY_UNIT_DAMAGE=7;
	protected final static int DEFAULT_HEAVY_UNIT_HP=30;
	
	
	/**
	 * The units armor : It reduce the damages taken.
	 */
	protected int armor;
	
	/**
	 * The damages amount that the unit can inflict.
	 */
	protected int damages;
	
	/**
	 * The maximum health points for the unit.
	 */
	protected int maxHealthPoints;
	
	/**
	 * The current health points
	 */
	protected int healthPoints;
	
	/**
	 * The unit movement range
	 */
	protected int deplacements;
	
	/**
	 * The attack range
	 */
	protected int range;
	
	/**
	 * new unit
	 */
	public Unit(){
		
	}
	
	/**
	 * return true if the unit moved ; false if it was impossible
	 */
	public boolean moveUnit(CellState thisCase){
		return true;
	}
}
