package javaproject_ageOfAntHill.entity;
/**
 * 
 * @author Maxime Augst, Jorris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */

class Lizard extends Unit {
	/**
	 * lizard's default movement speed
	 */
	private final static int DEFAULT_LIZARD_SPEED=3;
	
	/**
	 * creates a lizard with its default stats
	 */
	public Lizard(int teamNumber){
		this.armor=DEFAULT_MEDIUM_UNIT_ARMOR;
		this.damages=DEFAULT_MEDIUM_UNIT_DAMAGE;
		this.maxHealthPoints=DEFAULT_MEDIUM_UNIT_HP;
		this.healthPoints=DEFAULT_MEDIUM_UNIT_HP;
		this.deplacements=DEFAULT_LIZARD_SPEED;
		this.team=teamNumber;
	}
	
}
