package javaproject_ageOfAntHill.entity;

/**
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 * 
 * @version 20150526
 */
public class Snake extends Unit {
	/**
	 * Snake's default movement speed
	 */
	private final static int DEFAULT_LIZARD_SPEED = 3;
	/**
	 * Just like a serial name, it's used to identify a Snake's type
	 */
	private final static String LIZARD_TYPE = "LIZ";

	/**
	 * creates a Snake with its default stats
	 */
	public Snake(int teamNumber) {
		this.setRange(DEFAULT_UNIT_RANGE);
		this.setArmor(DEFAULT_MEDIUM_UNIT_ARMOR);
		this.setDamages(DEFAULT_MEDIUM_UNIT_DAMAGE);
		this.setMaxHealthPoints(DEFAULT_MEDIUM_UNIT_HP);
		this.setHealthPoints(DEFAULT_MEDIUM_UNIT_HP);
		this.setDeplacements(DEFAULT_LIZARD_SPEED);
		this.setTeam(teamNumber);
		this.setType(LIZARD_TYPE);
	}

}
