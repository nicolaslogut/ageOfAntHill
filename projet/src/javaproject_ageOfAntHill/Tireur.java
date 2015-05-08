/**
 * repr�sente un Tireur (une unit� ayant pour particularit� sa longue port�e)
 * @author joris
 *
 */
class Tireur extends Unite {
	/**
	 * vitesse d�placement par d�faut du tireur
	 */
	private final static int DEFAULT_SHOOTER_SPEED=4;
	/**
	 * valeur par defaut de la port�e d'un tireur (sans bonus)
	 */
	private final static int DEFAULT_SHOOTER_RANGE=5;
	
	/**
	 * Port�e d'attaque actuelle du tireur (en nombre de cases)
	 */
	private int portee;
	
	/**
	 * cr�e tireur avec toutes ses caract�ristiques par d�faut sp�cifiques
	 */
	public Tireur(int numEquipe){
		this.portee=DEFAULT_SHOOTER_RANGE;
		this.armure=DEFAULT_LIGHT_UNIT_ARMOR;
		this.degats=DEFAULT_LIGHT_UNIT_DAMAGE;
		this.pointsDeVieMax=DEFAULT_LIGHT_UNIT_PV;
		this.pointsDeVie=DEFAULT_LIGHT_UNIT_PV;
		this.deplacements=DEFAULT_SHOOTER_SPEED;
		this.equipe=numEquipe;
	}
	
	/**
	 * attaque l'ennemi si possible (s'il est dans la port�e)
	 * si l'attaque r�ussit, l'ennemi perd (degat tireur - armure ennemi) pv
	 */
	public void tirer() {
		
	}
	
	/**
	 * renvoie true si la cible est dans la port�e d'attaque du Tireur ; false sinon
	 */
	private boolean verifierPortee(){ // eventuellement supprimer cette m�thode en l'ins�rant dans la m�thode tirer()
		
	}


}
