class Ouvrier extends Unité {
	/**
	 * vitesse déplacement par défaut d'un ouvrier
	 */
	private final static int DEFAULT_WORKER_SPEED=4;
	
	/**
	 * crée ouvrier avec ses caractéristiques par défaut
	 */
	public Ouvrier(int numEquipe){
		this.degats=DEFAULT_PEACEFUL_UNIT_DAMAGE;
		this.armure=DEFAULT_PEACEFUL_UNIT_ARMOR;
		this.pointsDeVieMax=DEFAULT_PEACEFUL_UNIT_PV;
		this.pointsDeVie=DEFAULT_PEACEFUL_UNIT_PV;
		this.deplacements=DEFAULT_WORKER_SPEED;
		this.equipe=numEquipe;
	}
	
	/**
	 * construit un bâtiment devant lui
	 */
	public void construire() {
	}

}
