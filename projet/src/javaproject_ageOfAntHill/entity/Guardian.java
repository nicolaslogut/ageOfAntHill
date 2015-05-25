package javaproject_ageOfAntHill.entity;
/**
 * 
 * @author Maxime Augst, Jorris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */

class Guardian extends Unit {
	/**
	 * Default speed
	 */
	private final static int DEFAULT_GUARDIAN_SPEED=2;
	
	/**
	 * Default armor
	 */
	private static final int DEFAULT_HEAVY_UNIT_ARMOR = 0;
	
	/**
	 * Default damages
	 */
	private static final int DEFAULT_HEAVY_UNIT_DAMAGE = 0;
	
	/**
	 * Default health
	 */
	private static final int DEFAULT_HEAVY_UNIT_HP = 0;
	
	
	
	/**
	 * creates a guardian with its default stats
	 */
	public Guardian(int teamNumber){
		this.armor=DEFAULT_HEAVY_UNIT_ARMOR;
		this.damages=DEFAULT_HEAVY_UNIT_DAMAGE;
		this.maxHealthPoints=DEFAULT_HEAVY_UNIT_HP;
		this.healthPoints=DEFAULT_HEAVY_UNIT_HP;
		this.deplacements=DEFAULT_GUARDIAN_SPEED;
		this.team=teamNumber;
	}
	
	/**
	 * The guardian's armor is momentarily strenghened
	 */
	public void resister() { // si le 'momentanement' (le temps) est trop dur a gerer, trouver autre chose
	}

}
