package javaproject_ageOfAntHill.entity;
/**
 * This class is a scout, a pathfinder
 * This unit got a huge move scope
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */
class Scout extends Unit {
	/**
	 * This is the default move range
	 */
	private final static int DEFAULT_SCOUT_SPEED=6;
	
	/**
	 * creates a Shooter with its default stats
	 */
	public Scout(int teamNumber){
		this.armor=DEFAULT_LIGHT_UNIT_ARMOR;
		this.damages=DEFAULT_LIGHT_UNIT_DAMAGE;
		this.maxHealthPoints =DEFAULT_LIGHT_UNIT_HP;
		this.healthPoints=DEFAULT_LIGHT_UNIT_HP;
		this.deplacements=DEFAULT_SCOUT_SPEED;
		this.team=teamNumber;
	}
}
