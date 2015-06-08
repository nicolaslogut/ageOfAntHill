package javaproject_ageOfAntHill.entity;

/**
 * represents an entity, an object in the game
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 * 
 * @version 20150526
 */
public abstract class Entity {
	/**
	 * defined the healPoints of a unity
	 */
	protected int healthPoints;
	/**
	 * defined the Maximum Health Points of a unity
	 */
	protected int maxHealthPoints;
	/**
	 * defined the Team of an entity
	 */
	protected int team;
	/**
	 * defines the Entity's type (Warrior, Fly, AntHill, ...)
	 */
	private String type;
	
	/**
	 * creates a new Entity corresponding to a new in-game object (unit,
	 * building...)
	 */
	public Entity() {

	}
	
	public String getType(){
		return this.type;
	}
	
	public void setType(String type){
		this.type=type;
	}
	
	/**
	 * open the menu with the different available options for this entity
	 */
	public void openMenu() {

	}

}
