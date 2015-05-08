class Ouvrier extends Unit� {
	/**
	 * vitesse d�placement par d�faut d'un ouvrier
	 */
	private final static int DEFAULT_WORKER_SPEED=4;
	
	/**
	 * cr�e ouvrier avec ses caract�ristiques par d�faut
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
	 * construit un b�timent devant lui
	 */
	public void construire() {
	}

}
