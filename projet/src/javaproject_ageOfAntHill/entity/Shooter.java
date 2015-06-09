package javaproject_ageOfAntHill.entity;

/**
 * represents a Shooter (a special unit with long range attacks)
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 * @version 20150526
 */

public class Shooter extends Unit {
	/**
	 * shooter's default movement speed
	 */
	private final static int DEFAULT_SHOOTER_SPEED = 4;
	/**
	 * shooter's default attack range
	 */
	private final static int DEFAULT_SHOOTER_RANGE = 5;
	/**
	 * Just like a serial name, it's used to identify a shooter's type
	 */
	private final static String SHOOTER_TYPE = "SHOOT";

	/**
	 * creates a Shooter with its default stats
	 */
	public Shooter(int teamNumber) {
		this.setRange(DEFAULT_SHOOTER_RANGE);
		this.setArmor(DEFAULT_LIGHT_UNIT_ARMOR);
		this.setDamages(DEFAULT_LIGHT_UNIT_DAMAGE);
		this.setMaxHealthPoints(DEFAULT_LIGHT_UNIT_HP);
		this.setHealthPoints(DEFAULT_LIGHT_UNIT_HP);
		this.setDeplacements(DEFAULT_SHOOTER_SPEED);
		this.setTeam(teamNumber);
		this.setType(SHOOTER_TYPE);
	}

	/**
	 * attacks the enemy if this is possible (if he's in range for an attack) if
	 * the enemy is hit, he will loose (shooter's damages - enemy's armor) hp
	 */
	public void tirer() {

	}

	/**
	 * return true if the target is in the attack range of the shooter ; false
	 * otherwise
	 */
	private boolean checkRange() { // eventuellement supprimer cette m�thode en
									// l'ins�rant dans la m�thode tirer()
		return true;
	}

}
