class Gardien extends Unite {
	/**
	 * vitesse d�placement par d�faut du gardien
	 */
	private final static int DEFAULT_GUARDIAN_SPEED=2;
	
	/**
	 * cr�e gardien avec toutes ses caract�ristiques par d�faut sp�cifiques
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
	 * le gardien devient momentan�ment beaucoup plus r�sistant
	 */
	public void resister() { // si le 'momentan�ment' (le temps) est trop dur � g�rer, trouver autre chose
	}

}
