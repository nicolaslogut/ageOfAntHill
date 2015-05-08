class Lezard extends Unit� {
	/**
	 * vitesse d�placement par d�faut d'un l�zard
	 */
	private final static int DEFAULT_LIZARD_SPEED=3;
	
	/**
	 * cr�e l�zard avec toutes ses caract�ristiques par d�faut sp�cifiques
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
