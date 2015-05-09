package javaproject_ageOfAntHill;
class Fly extends Unit {
	/**
	 * a fly's movement speed
	 */
	private final static int DEFAULT_FLY_SPEED=6;
	
	/**
	 * creates a fly with all its default stats values
	 */
	public Fly(int teamNumber){
		this.armor=DEFAULT_LIGHT_UNIT_ARMOR;
		this.damages=DEFAULT_LIGHT_UNIT_DAMAGE;
		this.maxHealthPoints=DEFAULT_LIGHT_UNIT_HP;
		this.healthPoints=DEFAULT_LIGHT_UNIT_HP;
		this.deplacements=DEFAULT_FLY_SPEED;
		this.team=teamNumber;
	}
}
