package javaproject_ageOfAntHill.entity;


class Warrior extends Unit {
	/**
	 * vitesse d�placement par d�faut d'un guerrier
	 */
	private final static int DEFAULT_WARRIOR_SPEED=3;
	
	/**
	 * cr�e guerrier avec toutes ses caract�ristiques par d�faut sp�cifiques
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
