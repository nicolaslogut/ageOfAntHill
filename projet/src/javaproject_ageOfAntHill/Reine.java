/**
 * repr�sente une reine fourmis dans la partie
 * sa principale caract�ristique est de donner naissance � d'autre fourmis
 * @author joris
 *
 */
class Reine extends Unit� {
	/**
	 * vitesse d�placement par d�faut de la reine
	 */
	private final static int DEFAULT_QUEEN_SPEED=0;
	
	/**
	 * cr�e reine avec ses caract�ristiques par d�faut
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
