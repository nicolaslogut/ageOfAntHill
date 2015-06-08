package javaproject_ageOfAntHill.entity;

/**
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 * @version 20150526
 */

public class Warrior extends Unit {
	/**
	 * warrior's moving speed
	 */
	private final static int DEFAULT_WARRIOR_SPEED = 3;
	/**
	 * Just like a serial name, it's used to identify a warrior's type
	 */
	private final static String WARRIOR_TYPE = "WARR";

	/**
	 * creates a warrior with all its default stats
	 */
	public Warrior(int teamNumber) {
		this.armor = DEFAULT_MEDIUM_UNIT_ARMOR;
		this.damages = DEFAULT_MEDIUM_UNIT_DAMAGE;
		this.maxHealthPoints = DEFAULT_MEDIUM_UNIT_HP;
		this.healthPoints = DEFAULT_MEDIUM_UNIT_HP;
		this.deplacements = DEFAULT_WARRIOR_SPEED;
		this.team = teamNumber;
		this.setType(WARRIOR_TYPE);
	}

	public void attack() {
	}

}
