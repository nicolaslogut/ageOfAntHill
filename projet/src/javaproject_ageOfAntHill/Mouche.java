class Mouche extends Unité {
	/**
	 * vitesse déplacement par défaut d'une mouche
	 */
	private final static int DEFAULT_FLY_SPEED=6;
	
	/**
	 * crée mouche avec toutes ses caractéristiques par défaut spécifiques
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
