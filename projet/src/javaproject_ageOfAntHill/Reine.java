/**
 * représente une reine fourmis dans la partie
 * sa principale caractéristique est de donner naissance à d'autre fourmis
 * @author joris
 *
 */
class Reine extends Unité {
	/**
	 * vitesse déplacement par défaut de la reine
	 */
	private final static int DEFAULT_QUEEN_SPEED=0;
	
	/**
	 * crée reine avec ses caractéristiques par défaut
	 */
	public Reine(int numEquipe){
		this.degats=DEFAULT_PEACEFUL_UNIT_DAMAGE;
		this.armure=DEFAULT_PEACEFUL_UNIT_ARMOR;
		this.pointsDeVieMax=DEFAULT_PEACEFUL_UNIT_PV;
		this.pointsDeVie=DEFAULT_PEACEFUL_UNIT_PV;
		this.deplacements=DEFAULT_QUEEN_SPEED;
		this.equipe=numEquipe;
	}
}
