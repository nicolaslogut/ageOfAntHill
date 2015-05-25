package javaproject_ageOfAntHill.entity;
/**
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 * 
 */

import javaproject_ageOfAntHill.entity.buildable.Building;

public class Worker extends Unit {
	/**
	 * a worker's default movement speed
	 */
	private final static int DEFAULT_WORKER_SPEED=4;
	
	/**
	 * creates a worker with its default stats
	 */
	public Worker(int teamNumber){
		this.damages=DEFAULT_PEACEFUL_UNIT_DAMAGE;
		this.armor=DEFAULT_PEACEFUL_UNIT_ARMOR;
		this.maxHealthPoints=DEFAULT_PEACEFUL_UNIT_HP;
		this.healthPoints=DEFAULT_PEACEFUL_UNIT_HP;
		this.deplacements=DEFAULT_WORKER_SPEED;
		this.team=teamNumber;
	}
	
	/**
	 * builds a building in front of him
	 * the building is defined in parameters
	 */
	public void construire(Building thisBuilding) {
	}

}
