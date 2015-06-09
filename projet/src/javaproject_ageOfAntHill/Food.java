package javaproject_ageOfAntHill;


public class Food extends Ressource {
	/**
	 * initial amount of food
	 */
	private final static int DEFAULT_FOOD=200;
	
	public Food(){
		this.setType("FOOD");
		this.setQuantity(DEFAULT_FOOD);
	}
	
	
}
