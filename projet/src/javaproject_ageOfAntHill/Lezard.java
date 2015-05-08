class Lezard extends Unité {
	/**
	 * vitesse déplacement par défaut d'un lézard
	 */
	private final static int DEFAULT_LIZARD_SPEED=3;
	
	/**
	 * crée lézard avec toutes ses caractéristiques par défaut spécifiques
	 */
	public Lezard(int numEquipe){
		this.armure=DEFAULT_MEDIUM_UNIT_ARMOR;
		this.degats=DEFAULT_MEDIUM_UNIT_DAMAGE;
		this.pointsDeVieMax=DEFAULT_MEDIUM_UNIT_PV;
		this.pointsDeVie=DEFAULT_MEDIUM_UNIT_PV;
		this.deplacements=DEFAULT_LIZARD_SPEED;
		this.equipe=numEquipe;
	}
	
}
