/**
 * repr�sente une unit� dans une partie
 * c'est une entit� avec, en plus, la possibilite de se d�placer, attaquer...
 * @author joris
 *
 */
class Unite extends Entite {
	// �ventuellement cr�er une nouvelle classe (abstraite ?) pour stocker toutes ces constantes
	/**
	 * armure, d�g�ts et PDV par d�faut des unit�s qui n'attaquent pas (ouvriers, reines, ...)
	 */
	private final static int DEFAULT_PEACEFUL_UNIT_ARMOR=1;
	private final static int DEFAULT_PEACEFUL_UNIT_DAMAGE=0;
	private final static int DEFAULT_PEACEFUL_UNIT_HP=20;
	/**
	 * armure, d�g�ts et PDV par d�faut des unit�s � faible armure (�claireurs, tireurs et mouches)
	 */
	private final static int DEFAULT_LIGHT_UNIT_ARMOR=2;
	private final static int DEFAULT_LIGHT_UNIT_DAMAGE=6;
	private final static int DEFAULT_LIGHT_UNIT_HP=24;
	/**
	 * armure, d�g�ts et PDV par d�faut des unit�s � armure normale (guerriers, l�zards)
	 */
	private final static int DEFAULT_MEDIUM_UNIT_ARMOR=3;
	private final static int DEFAULT_MEDIUM_UNIT_DAMAGE=10;
	private final static int DEFAULT_MEDIUM_UNIT_HP=32;
	/**
	 * armure, d�g�ts et PDV par d�faut des unit�s � armure r�sistante (gardiens, scarab�es)
	 */
	private final static int DEFAULT_HEAVY_UNIT_ARMOR=5;
	private final static int DEFAULT_HEAVY_UNIT_DAMAGE=7;
	private final static int DEFAULT_HEAVY_UNIT_HP=30;
	
	
	/**
	 * The units armor : It reduce the damages taken.
	 */
	private int armor;
	
	/**
	 * The damages amount that the unit can inflict.
	 */
	private int damages;
	
	/**
	 * The maximum health points for the unit.
	 */
	private int maxHealthPoints;
	
	/**
	 * The current health points
	 */
	private int healthPoints;
	
	/**
	 * The unit movement scope
	 */
	private int deplacements;
	
	/**
	 * The team the unit belong.
	 */
	private int equipe;
	
	/**
	 * The attack scope
	 */
	private int scope;
	
	/**
	 * nouvelle unit�
	 */
	public Unite(){
		
	}
	
	/**
	 * renvoie true si l'unit� a �t� d�plac�e ; false si d�placement impossible
	 */
	public boolean deplacerUnite(int positionX,int positionY){
		
	}
}
