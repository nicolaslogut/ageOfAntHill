package javaproject_ageOfAntHill.entity;
/**
 * repr�sente une reine fourmis dans la partie
 * sa principale caract�ristique est de donner naissance � d'autre fourmis
 * @author Maxime Augst, Jorris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */

class Queen extends Unit {
	/**
	 * Queen's default movement speed
	 */
	private final static int DEFAULT_QUEEN_SPEED=0;
	
	/**
	 * creates a queen ant with its default stats
	 */
	public Queen(int teamNumber){
		this.damages=DEFAULT_PEACEFUL_UNIT_DAMAGE;
		this.armor=DEFAULT_PEACEFUL_UNIT_ARMOR;
		this.maxHealthPoints=DEFAULT_PEACEFUL_UNIT_HP;
		this.healthPoints=DEFAULT_PEACEFUL_UNIT_HP;
		this.deplacements=DEFAULT_QUEEN_SPEED;
		this.team=teamNumber;
	}
}
