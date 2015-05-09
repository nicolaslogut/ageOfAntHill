package javaproject_ageOfAntHill;

// gotta change this description later on :/ kinda sucks
/**
 * represente une 'case'  une position d'abscisse posX et d'ordonnée posY
 * @author joris
 *
 */
class Position {
	/**
	 * abscisse de la position de la case
	 */
	private int posX;
	/**
	 * ordonnee de la position de la case
	 */
	private int posY;
	
	/**
	 * 
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
