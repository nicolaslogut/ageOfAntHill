package javaproject_ageOfAntHill.entity;

/**
 * represents a Queen ant in a game Her main characteristic is to give birth to
 * other ants
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 * @version 20150526
 */

class Queen extends Unit {
	/**
	 * Queen's default movement speed
	 */
	private final static int DEFAULT_QUEEN_SPEED = 0;
	/**
	 * Just like a serial name, it's used to identify a queen's type
	 */
	private final static String QUEEN_TYPE = "QUEEN";

	/**
	 * creates a queen ant with its default stats
	 */
	public Queen(int teamNumber) {
		this.damages = DEFAULT_PEACEFUL_UNIT_DAMAGE;
		this.armor = DEFAULT_PEACEFUL_UNIT_ARMOR;
		this.maxHealthPoints = DEFAULT_PEACEFUL_UNIT_HP;
		this.healthPoints = DEFAULT_PEACEFUL_UNIT_HP;
		this.deplacements = DEFAULT_QUEEN_SPEED;
		this.team = teamNumber;
		this.setType(QUEEN_TYPE);
	}
}
