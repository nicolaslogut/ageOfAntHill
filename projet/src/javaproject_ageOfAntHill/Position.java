package javaproject_ageOfAntHill;
/**
 * repr�sente une 'case' � une position d'abscisse posX et d'ordonn�e posY
 * @author joris
 *
 */
class Position {
	/**
	 * abscisse de la position de la case
	 */
	private int posX;
	/**
	 * ordonn�e de la position de la case
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
	public boolean estVideOuNon(int positionX, int positionY){
		return true;
	}
	
}