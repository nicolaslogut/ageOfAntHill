package javaproject_ageOfAntHill;

// gotta change this description later on :/ kinda sucks
/**
 * represents a case at given (x,y) coordinates
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 * @version 20150526
 */
public class Position {
	/**
	 * abscissa of the case
	 */
	private int posX;
	/**
	 * ordered of the case
	 */
	private int posY;
	
	/**
	 * constructs a new case at given coordinates
	 */
	public Position(int positionX, int positionY){
		this.posX = positionX;
		this.posY = positionY;
	}
	
	/**
	 * returns false if there is an entity at the given cooridnates (positionX,positionY) ; true otherwise
	 */
	public boolean moveAvailable(int positionX, int positionY){
		return true;
	}
	
}
