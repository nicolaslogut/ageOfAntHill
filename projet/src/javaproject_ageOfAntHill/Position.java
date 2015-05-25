package javaproject_ageOfAntHill;

// gotta change this description later on :/ kinda sucks
/**
 * represent a case which a given abscissa and ordered
 * @author joris
 *
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
	 * construct a new position ?
	 */
	public Position(int positionX, int positionY){
		this.posX = positionX;
		this.posY = positionY;
	}
	
	/**
	 * return false if there is an entity at the given cooridnates (positionX,positionY) ; true otherwise
	 */
	public boolean isEmptyOrNot(int positionX, int positionY){
		return true;
	}
	
}
