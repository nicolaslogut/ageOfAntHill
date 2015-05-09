package javaproject_ageOfAntHill;

class Gardien extends Unite {
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
	/*
	 * Default health
	 */
	private static final int DEFAULT_HEAVY_UNIT_HP = 0;
	
	
	
	/**
	 * create a unit with default caracteristics
	 */
	public Gardien(int numEquipe){
		this.armor=DEFAULT_HEAVY_UNIT_ARMOR;
		this.damages=DEFAULT_HEAVY_UNIT_DAMAGE;
		this.maxHealthPoints=DEFAULT_HEAVY_UNIT_HP;
		this.healthPoints=DEFAULT_HEAVY_UNIT_HP;
		this.deplacements=DEFAULT_GUARDIAN_SPEED;
		this.equipe=numEquipe;
	}
	
	/**
	 * le gardien devient momentanément beaucoup plus résistant
	 */
	public void resister() { // si le 'momentanément' (le temps) est trop dur à gérer, trouver autre chose
	}

}
