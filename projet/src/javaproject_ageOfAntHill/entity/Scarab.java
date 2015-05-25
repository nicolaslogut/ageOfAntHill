package javaproject_ageOfAntHill.entity;
/**
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */

class Scarab extends Unit {
	/**
	 * Scarab's default movement speed
	 */
	private final static int DEFAULT_BEETLE_SPEED=2;
	
	/**
	 * creates a scarab with its default stats
	 */
	public Scarab(int teamNumber){
		this.armor=DEFAULT_HEAVY_UNIT_ARMOR;
		this.damages=DEFAULT_HEAVY_UNIT_DAMAGE;
		this.maxHealthPoints=DEFAULT_HEAVY_UNIT_HP;
		this.healthPoints=DEFAULT_HEAVY_UNIT_HP;
		this.deplacements=DEFAULT_BEETLE_SPEED;
		this.team=teamNumber;
	}
}
