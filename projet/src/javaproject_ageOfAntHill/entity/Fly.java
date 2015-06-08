package javaproject_ageOfAntHill.entity;

/**
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 * 
 * @version 20150526
 */

class Fly extends Unit {
	/**
	 * a fly's movement speed
	 */
	private final static int DEFAULT_FLY_SPEED = 6;
	/**
	 * Just like a serial name, it's used to identify a fly's type
	 */
	private final static String FLY_TYPE = "FLY";
	
	/**
	 * creates a fly with all its default stats values
	 */
	public Fly(int teamNumber) {
		this.armor = DEFAULT_LIGHT_UNIT_ARMOR;
		this.damages = DEFAULT_LIGHT_UNIT_DAMAGE;
		this.maxHealthPoints = DEFAULT_LIGHT_UNIT_HP;
		this.healthPoints = DEFAULT_LIGHT_UNIT_HP;
		this.deplacements = DEFAULT_FLY_SPEED;
		this.team = teamNumber;
		this.setType(FLY_TYPE);
	}
}
