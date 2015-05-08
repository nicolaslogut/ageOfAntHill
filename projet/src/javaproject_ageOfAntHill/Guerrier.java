class Guerrier extends Unité {
	/**
	 * vitesse déplacement par défaut d'un guerrier
	 */
	private final static int DEFAULT_WARRIOR_SPEED=3;
	
	/**
	 * crée guerrier avec toutes ses caractéristiques par défaut spécifiques
	 */
	public Guerrier(int numEquipe){
		this.armure=DEFAULT_MEDIUM_UNIT_ARMOR;
		this.degats=DEFAULT_MEDIUM_UNIT_DAMAGE;
		this.pointsDeVieMax=DEFAULT_MEDIUM_UNIT_PV;
		this.pointsDeVie=DEFAULT_MEDIUM_UNIT_PV;
		this.deplacements=DEFAULT_WARRIOR_SPEED;
		this.equipe=numEquipe;
	}
	
	
	public void attaquer() {
	}

}
