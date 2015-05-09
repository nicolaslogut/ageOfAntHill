package javaproject_ageOfAntHill;

/**
 * représente une unité dans une partie
 * c'est une entité avec, en plus, la possibilite de se déplacer, attaquer...
 * @author joris
 *
 */
class Unite extends Entite {
	// éventuellement créer une nouvelle classe (abstraite ?) pour stocker toutes ces constantes
	/**
	 * armure, dégâts et PDV par défaut des unités qui n'attaquent pas (ouvriers, reines, ...)
	 */
	private final static int DEFAULT_PEACEFUL_UNIT_ARMOR=1;
	private final static int DEFAULT_PEACEFUL_UNIT_DAMAGE=0;
	private final static int DEFAULT_PEACEFUL_UNIT_HP=20;
	/**
	 * armure, dégâts et PDV par défaut des unités à faible armure (éclaireurs, tireurs et mouches)
	 */
	private final static int DEFAULT_LIGHT_UNIT_ARMOR=2;
	private final static int DEFAULT_LIGHT_UNIT_DAMAGE=6;
	private final static int DEFAULT_LIGHT_UNIT_HP=24;
	/**
	 * armure, dégâts et PDV par défaut des unités à armure normale (guerriers, lézards)
	 */
	private final static int DEFAULT_MEDIUM_UNIT_ARMOR=3;
	private final static int DEFAULT_MEDIUM_UNIT_DAMAGE=10;
	private final static int DEFAULT_MEDIUM_UNIT_HP=32;
	/**
	 * armure, dégâts et PDV par défaut des unités à armure résistante (gardiens, scarabées)
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
	 * nouvelle unité
	 */
	public Unite(){
		
	}
	
	/**
	 * renvoie true si l'unité a été déplacée ; false si déplacement impossible
	 */
	public boolean deplacerUnite(int positionX,int positionY){
		
	}
}
