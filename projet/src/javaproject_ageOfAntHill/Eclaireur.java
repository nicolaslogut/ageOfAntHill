class Eclaireur extends Unit� {
	/**
	 * vitesse d�placement par d�faut d'un �claireur
	 */
	private final static int DEFAULT_SCOUT_SPEED=6;
	
	/**
	 * cr�e �claireur avec toutes ses caract�ristiques par d�faut sp�cifiques
	 */
	public Eclaireur(int numEquipe){
		this.armure=DEFAULT_LIGHT_UNIT_ARMOR;
		this.degats=DEFAULT_LIGHT_UNIT_DAMAGE;
		this.pointsDeVieMax=DEFAULT_LIGHT_UNIT_PV;
		this.pointsDeVie=DEFAULT_LIGHT_UNIT_PV;
		this.deplacements=DEFAULT_SCOUT_SPEED;
		this.equipe=numEquipe;
	}
}
