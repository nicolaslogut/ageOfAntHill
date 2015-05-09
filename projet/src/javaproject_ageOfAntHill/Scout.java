package javaproject_ageOfAntHill;
/**
 * This class is a scout, a pathfinder
 * This unit got a huge move scope
 * @author joris
 *
 */
class Scout extends Unite {
	/**
	 * This is the default move scope
	 */
	private final static int DEFAULT_SCOUT_SPEED=6;
	
	/**
	 * crée éclaireur avec toutes ses caractéristiques par défaut spécifiques
	 */
	public Pathfinder(int numEquipe){
		this.armure=DEFAULT_LIGHT_UNIT_ARMOR;
		this.degats=DEFAULT_LIGHT_UNIT_DAMAGE;
		this.pointsDeVieMax=DEFAULT_LIGHT_UNIT_PV;
		this.pointsDeVie=DEFAULT_LIGHT_UNIT_PV;
		this.deplacements=DEFAULT_SCOUT_SPEED;
		this.equipe=numEquipe;
	}
}
