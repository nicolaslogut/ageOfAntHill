class Scarabée extends Unité {
	/**
	 * vitesse déplacement par défaut du scarabée
	 */
	private final static int DEFAULT_BEETLE_SPEED=2;
	
	/**
	 * crée scarabée avec toutes ses caractéristiques par défaut spécifiques
	 */
	public Gardien(int numEquipe){
		this.armure=DEFAULT_HEAVY_UNIT_ARMOR;
		this.degats=DEFAULT_HEAVY_UNIT_DAMAGE;
		this.pointsDeVieMax=DEFAULT_HEAVY_UNIT_PV;
		this.pointsDeVie=DEFAULT_HEAVY_UNIT_PV;
		this.deplacements=DEFAULT_BEETLE_SPEED;
		this.equipe=numEquipe;
	}
}
