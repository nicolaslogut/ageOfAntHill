package javaproject_ageOfAntHill.entity;
/**
 * represents a Shooter (a special unit with long range attacks)
 * @author Maxime Augst, Jorris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */

class Shooter extends Unit {
	/**
	 * shooter's default movement speed
	 */
	private final static int DEFAULT_SHOOTER_SPEED=4;
	/**
	 * shooter's default attack range
	 */
	private final static int DEFAULT_SHOOTER_RANGE=5;
	
	/**
	 * creates a Shooter with its default stats
	 */
	public Shooter(int teamNumber){
		this.range=DEFAULT_SHOOTER_RANGE;
		this.armor=DEFAULT_LIGHT_UNIT_ARMOR;
		this.damages=DEFAULT_LIGHT_UNIT_DAMAGE;
		this.maxHealthPoints=DEFAULT_LIGHT_UNIT_HP;
		this.healthPoints=DEFAULT_LIGHT_UNIT_HP;
		this.deplacements=DEFAULT_SHOOTER_SPEED;
		this.team=teamNumber;
	}
	
	/**
	 * attacks the enemy if this is possible (if he's in range for an attack)
	 * if the enemy is hit, he will loose (shooter's damages - enemy's armor) hp
	 */
	public void tirer() {
		
	}
	
	/**
	 * return true if the target is in the attack range of the shooter ; false otherwise
	 */
	private boolean checkRange(){ // eventuellement supprimer cette m�thode en l'ins�rant dans la m�thode tirer()
		return true;
	}


}
