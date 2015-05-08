class Scarab�e extends Unit� {
	/**
	 * vitesse d�placement par d�faut du scarab�e
	 */
	private final static int DEFAULT_BEETLE_SPEED=2;
	
	/**
	 * cr�e scarab�e avec toutes ses caract�ristiques par d�faut sp�cifiques
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
