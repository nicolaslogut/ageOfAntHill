package javaproject_ageOfAntHill.entity;

import javaproject_ageOfAntHill.map.CellState;
import javaproject_ageOfAntHill.map.InterfaceMap;
import javaproject_ageOfAntHill.map.Position;

/**
 * represents a unit in a game this is an entity that has the capacity to move
 * and attack
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 * @version 20150706
 */

public abstract class Unit extends Entity {
	// eventuellement creer une nouvelle classe (abstraite ?) pour stocker
	// toutes ces constantes
	/**
	 * default range for all units (except Shooter)
	 */
	protected final static int DEFAULT_UNIT_RANGE = 1;
	/**
	 * default armor, damages and HP for non-attacking units (queen, workers...)
	 */
	protected final static int DEFAULT_PEACEFUL_UNIT_ARMOR = 1;
	protected final static int DEFAULT_PEACEFUL_UNIT_DAMAGE = 0;
	protected final static int DEFAULT_PEACEFUL_UNIT_HP = 20;
	/**
	 * default armor, damages and HP for non-attacking units (scouts,
	 * shooters,flies...)
	 */
	protected final static int DEFAULT_LIGHT_UNIT_ARMOR = 2;
	protected final static int DEFAULT_LIGHT_UNIT_DAMAGE = 6;
	protected final static int DEFAULT_LIGHT_UNIT_HP = 24;
	/**
	 * default armor, damages and HP for medium armor units (warriors,
	 * lizards...)
	 */
	protected final static int DEFAULT_MEDIUM_UNIT_ARMOR = 3;
	protected final static int DEFAULT_MEDIUM_UNIT_DAMAGE = 10;
	protected final static int DEFAULT_MEDIUM_UNIT_HP = 32;
	/**
	 * default armor, damages and HP for heavy armor units (guardians,
	 * scarab...)
	 */
	protected final static int DEFAULT_HEAVY_UNIT_ARMOR = 5;
	protected final static int DEFAULT_HEAVY_UNIT_DAMAGE = 7;
	protected final static int DEFAULT_HEAVY_UNIT_HP = 30;

	/**
	 * The units armor : It reduce the damages taken.
	 */
	private int armor;

	/**
	 * The damages amount that the unit can inflict.
	 */
	private int damages;

//	/**
//	 * The maximum health points for the unit.
//	 */
//	private int maxHealthPoints;
//
//	/**
//	 * The current health points
//	 */
//	private int healthPoints;

	/**
	 * The unit movement range
	 */
	private int deplacements;

	/**
	 * The attack range
	 */
	private int range;

	/**
	 * new unit
	 */
	public Unit() {

	}

	/**
	 * this method allow you to get the position of a unit TOUT DOUX :3
	 */
	public Position getUnit() {
		// TODO later
		return null;
	}

	/**
	 * return true if the unit moved ; false if it was impossible
	 */
	public boolean moveUnit(Position finalPos, Position startingPos,
			InterfaceMap map) { // movement speed ????
		if (moveAvailable(finalPos, map)) {
			map.getCell(finalPos).setEntity(this);
			map.getCell(startingPos).setEntity(null);
			return true;
		}
		return false;
	}

	/**
	 * checks if the given Position is in the Map, and if there is no Entity at
	 * this Position returns true if it's 'OK' to move ; false otherwise
	 */
	private boolean moveAvailable(Position pos, InterfaceMap map) {
		if (map.notOutOfTheMap(pos))
			if (map.getCell(pos).getEntity() == null)
				if (map.getCell(pos).getCellState() != CellState.TREE_SQUARE
						&& map.getCell(pos).getCellState() != CellState.WATER_SQUARE)
					return true;
		return false;
	}

	public int getDamages() {
		return damages;
	}

	public void setDamages(int damages) {
		this.damages = damages;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getDeplacements() {
		return deplacements;
	}

	public void setDeplacements(int deplacements) {
		this.deplacements = deplacements;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

}
