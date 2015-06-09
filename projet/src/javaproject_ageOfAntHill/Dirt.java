package javaproject_ageOfAntHill;


public class Dirt extends Ressource {
	/**
	 * initial amount of dirt
	 */
	private final static int DEFAULT_DIRT=150;
	
	
	public Dirt(){
		this.setType("DIRT");
		this.setQuantity(DEFAULT_DIRT);
	}
	
	
}
