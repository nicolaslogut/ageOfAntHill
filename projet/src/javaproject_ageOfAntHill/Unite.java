/**
 * repr�sente une unit� dans une partie
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
	 * vitesse de d�placement d'une unit� (en cases parcourues par seconde)
	 */
	private int deplacement;
	
	/**
	 * nombre de d�g�ts inflig�s par unit� lors d'une attaque	
	 */
	private int degats;
	
	/**
	 * nouvelle unit�
	 */
	public Unite(){
		
	}
	
	/**
	 * renvoie true si l'unit� a �t� d�plac�e ; false si d�placement impossible
	 */
	public boolean deplacerUnite(){
		
	}
}
