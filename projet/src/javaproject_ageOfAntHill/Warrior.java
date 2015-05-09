package javaproject_ageOfAntHill;
class Warrior extends Unit {
	/**
	 * vitesse déplacement par défaut d'un guerrier
	 */
	private final static int DEFAULT_WARRIOR_SPEED=3;
	
	/**
	 * crée guerrier avec toutes ses caractéristiques par défaut spécifiques
	 */
	public Warrior(int teamNumber){
		this.armor=DEFAULT_MEDIUM_UNIT_ARMOR;
		this.damages=DEFAULT_MEDIUM_UNIT_DAMAGE;
		this.maxHealthPoints=DEFAULT_MEDIUM_UNIT_HP;
		this.healthPoints=DEFAULT_MEDIUM_UNIT_HP;
		this.deplacements=DEFAULT_WARRIOR_SPEED;
		this.team=teamNumber;
	}
	
	
	public void attack() {
	}

}
