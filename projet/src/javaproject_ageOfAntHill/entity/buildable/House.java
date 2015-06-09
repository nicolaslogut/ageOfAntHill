package javaproject_ageOfAntHill.entity.buildable;

public class House extends Building {
	/**
	  * Just like a serial name, it's used to identify an House's type
	  */
	 private final static String HOUSE_TYPE = "HOUSE";
	 
	 private final static int HOUSE_HP = 250;
	 
	public House(){
		 this.setType(HOUSE_TYPE);
	 }
}
