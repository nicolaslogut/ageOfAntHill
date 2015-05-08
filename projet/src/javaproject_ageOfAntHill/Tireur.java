/**
 * représente un Tireur (une unité ayant pour particularité sa longue portée)
 * @author joris
 *
 */
class Tireur extends Unite {
	/**
	 * vitesse déplacement par défaut du tireur
	 */
	private final static int DEFAULT_SHOOTER_SPEED=4;
	/**
	 * valeur par defaut de la portée d'un tireur (sans bonus)
	 */
	private final static int DEFAULT_SHOOTER_RANGE=5;
	
	/**
	 * Portée d'attaque actuelle du tireur (en nombre de cases)
	 */
	private int portee;
	
	/**
	 * crée tireur avec toutes ses caractéristiques par défaut spécifiques
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
	 * attaque l'ennemi si possible (s'il est dans la portée)
	 * si l'attaque réussit, l'ennemi perd (degat tireur - armure ennemi) pv
	 */
	public void tirer() {
		
	}
	
	/**
	 * renvoie true si la cible est dans la portée d'attaque du Tireur ; false sinon
	 */
	private boolean verifierPortee(){ // eventuellement supprimer cette méthode en l'insérant dans la méthode tirer()
		
	}


}
