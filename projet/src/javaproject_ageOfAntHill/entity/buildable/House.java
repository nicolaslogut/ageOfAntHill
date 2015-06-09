package javaproject_ageOfAntHill.entity.buildable;

public class House extends Building {
	/**
	  * Just like a serial name, it's used to identify an House's type
	  */
	 private final static String HOUSE_TYPE = "HOUSE";
	 /**
	  * Define the House's HP
	  */
	 private final static int DEFAULT_HOUSE_HP = 250;
	 /**
	  * Define the House's ARMOR
	  */
	 private final static int DEFAULT_HOUSE_ARMOR = 20;
	 
	public House(){
		 this.setType(HOUSE_TYPE);
	 }
}
