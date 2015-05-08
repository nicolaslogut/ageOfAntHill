class Gardien extends Unite {
	/**
	 * vitesse déplacement par défaut du gardien
	 */
	private final static int DEFAULT_GUARDIAN_SPEED=2;
	
	/**
	 * crée gardien avec toutes ses caractéristiques par défaut spécifiques
	 */
	public Gardien(int numEquipe){
		this.armure=DEFAULT_HEAVY_UNIT_ARMOR;
		this.degats=DEFAULT_HEAVY_UNIT_DAMAGE;
		this.pointsDeVieMax=DEFAULT_HEAVY_UNIT_PV;
		this.pointsDeVie=DEFAULT_HEAVY_UNIT_PV;
		this.deplacements=DEFAULT_GUARDIAN_SPEED;
		this.equipe=numEquipe;
	}
	
	/**
	 * le gardien devient momentanément beaucoup plus résistant
	 */
	public void resister() { // si le 'momentanément' (le temps) est trop dur à gérer, trouver autre chose
	}

}
