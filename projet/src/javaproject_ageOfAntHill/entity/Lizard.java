package javaproject_ageOfAntHill.entity;

/**
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 * 
 * @version 20150526
 */

public class Lizard extends Unit {
	/**
	 * lizard's default movement speed
	 */
	private final static int DEFAULT_LIZARD_SPEED = 3;
	/**
	 * Just like a serial name, it's used to identify a lizard's type
	 */
	private final static String LIZARD_TYPE = "LIZ";

	/**
	 * creates a lizard with its default stats
	 */
	public Lizard(int teamNumber) {
		this.armor = DEFAULT_MEDIUM_UNIT_ARMOR;
		this.damages = DEFAULT_MEDIUM_UNIT_DAMAGE;
		this.maxHealthPoints = DEFAULT_MEDIUM_UNIT_HP;
		this.healthPoints = DEFAULT_MEDIUM_UNIT_HP;
		this.deplacements = DEFAULT_LIZARD_SPEED;
		this.team = teamNumber;
		this.setType(LIZARD_TYPE);
	}

}
