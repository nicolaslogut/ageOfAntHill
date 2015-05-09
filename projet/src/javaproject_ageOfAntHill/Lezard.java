package javaproject_ageOfAntHill;
class Lezard extends Unit {
	/**
	 * lizard's default movement speed
	 */
	private final static int DEFAULT_LIZARD_SPEED=3;
	
	/**
	 * creates a lizard with its default stats
	 */
	public Lezard(int teamNumber){
		this.armor=DEFAULT_MEDIUM_UNIT_ARMOR;
		this.damages=DEFAULT_MEDIUM_UNIT_DAMAGE;
		this.maxHealthPoints=DEFAULT_MEDIUM_UNIT_HP;
		this.healthPoints=DEFAULT_MEDIUM_UNIT_HP;
		this.deplacements=DEFAULT_LIZARD_SPEED;
		this.team=teamNumber;
	}
	
}
