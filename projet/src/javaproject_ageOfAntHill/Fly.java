package javaproject_ageOfAntHill;
class Fly extends Unit {
	/**
	 * vitesse d�placement par d�faut d'une mouche
	 */
	private final static int DEFAULT_FLY_SPEED=6;
	
	/**
	 * cr�e mouche avec toutes ses caract�ristiques par d�faut sp�cifiques
	 */
	public Mouche(int numEquipe){
		this.armure=DEFAULT_LIGHT_UNIT_ARMOR;
		this.degats=DEFAULT_LIGHT_UNIT_DAMAGE;
		this.pointsDeVieMax=DEFAULT_LIGHT_UNIT_PV;
		this.pointsDeVie=DEFAULT_LIGHT_UNIT_PV;
		this.deplacements=DEFAULT_FLY_SPEED;
		this.equipe=numEquipe;
	}
}
