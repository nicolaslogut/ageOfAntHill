package javaproject_ageOfAntHill.entity;

/**
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 * @version 20150526
 */

public class Scarab extends Unit {
	/**
	 * Scarab's default movement speed
	 */
	private final static int DEFAULT_BEETLE_SPEED = 2;
	/**
	 * Just like a serial name, it's used to identify a scarab's type
	 */
	private final static String SCARAB_TYPE = "SCAR";

	/**
	 * creates a scarab with its default stats
	 */
	public Scarab(int teamNumber) {
		this.armor = DEFAULT_HEAVY_UNIT_ARMOR;
		this.damages = DEFAULT_HEAVY_UNIT_DAMAGE;
		this.maxHealthPoints = DEFAULT_HEAVY_UNIT_HP;
		this.healthPoints = DEFAULT_HEAVY_UNIT_HP;
		this.deplacements = DEFAULT_BEETLE_SPEED;
		this.team = teamNumber;
		this.setType(SCARAB_TYPE);
	}
}
