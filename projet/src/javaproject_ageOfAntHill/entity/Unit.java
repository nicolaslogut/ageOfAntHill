package javaproject_ageOfAntHill.entity;

import javaproject_ageOfAntHill.map.CellState;

/**
 * repr�sente une unit� dans une partie
 * c'est une entit� avec, en plus, la possibilite de se d�placer, attaquer...
 * @author joris
 *
 */
public class Unit extends Entity {
	// �ventuellement cr�er une nouvelle classe (abstraite ?) pour stocker toutes ces constantes
	/**
	 * armure, d�g�ts et PDV par d�faut des unit�s qui n'attaquent pas (ouvriers, reines, ...)
	 */
	protected final static int DEFAULT_PEACEFUL_UNIT_ARMOR=1;
	protected final static int DEFAULT_PEACEFUL_UNIT_DAMAGE=0;
	protected final static int DEFAULT_PEACEFUL_UNIT_HP=20;
	/**
	 * armure, d�g�ts et PDV par d�faut des unit�s � faible armure (�claireurs, tireurs et mouches)
	 */
	protected final static int DEFAULT_LIGHT_UNIT_ARMOR=2;
	protected final static int DEFAULT_LIGHT_UNIT_DAMAGE=6;
	protected final static int DEFAULT_LIGHT_UNIT_HP=24;
	/**
	 * armure, d�g�ts et PDV par d�faut des unit�s � armure normale (guerriers, l�zards)
	 */
	protected final static int DEFAULT_MEDIUM_UNIT_ARMOR=3;
	protected final static int DEFAULT_MEDIUM_UNIT_DAMAGE=10;
	protected final static int DEFAULT_MEDIUM_UNIT_HP=32;
	/**
	 * armure, d�g�ts et PDV par d�faut des unit�s � armure r�sistante (gardiens, scarab�es)
	 */
	protected final static int DEFAULT_HEAVY_UNIT_ARMOR=5;
	protected final static int DEFAULT_HEAVY_UNIT_DAMAGE=7;
	protected final static int DEFAULT_HEAVY_UNIT_HP=30;
	
	
	/**
	 * The units armor : It reduce the damages taken.
	 */
	protected int armor;
	
	/**
	 * The damages amount that the unit can inflict.
	 */
	protected int damages;
	
	/**
	 * The maximum health points for the unit.
	 */
	protected int maxHealthPoints;
	
	/**
	 * The current health points
	 */
	protected int healthPoints;
	
	/**
	 * The unit movement range
	 */
	protected int deplacements;
	
	/**
	 * The attack range
	 */
	protected int range;
	
	/**
	 * new unit
	 */
	public Unit(){
		
	}
	
	/**
	 * return true if the unit moved ; false if it was impossible
	 */
	public boolean moveUnit(CellState thisCase){
		return true;
	}
}
