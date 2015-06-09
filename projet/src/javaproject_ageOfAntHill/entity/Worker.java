package javaproject_ageOfAntHill.entity;

/**
 *@author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 * @version 20150526
 */

import javaproject_ageOfAntHill.entity.buildable.Building;

public class Worker extends Unit {
	/**
	 * a worker's default movement speed
	 */
	private final static int DEFAULT_WORKER_SPEED = 4;
	/**
	 * Just like a serial name, it's used to identify a worker's type
	 */
	private final static String WORKER_TYPE = "WORK";

	/**
	 * creates a worker with its default stats
	 */
	public Worker(int teamNumber) {
		this.setDamages(DEFAULT_PEACEFUL_UNIT_DAMAGE);
		this.setArmor(DEFAULT_PEACEFUL_UNIT_ARMOR);
		this.setMaxHealthPoints(DEFAULT_PEACEFUL_UNIT_HP);
		this.setHealthPoints(DEFAULT_PEACEFUL_UNIT_HP);
		this.setDeplacements(DEFAULT_WORKER_SPEED);
		this.setTeam(teamNumber);
		this.setType(WORKER_TYPE);
	}

	/**
	 * builds a building in front of him the building is defined in parameters
	 */
	public void construire(Building thisBuilding) {
	}

}
