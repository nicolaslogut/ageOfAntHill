package javaproject_ageOfAntHill.entity.buildable;

public class AntHill extends Building {
	/**
	  * Just like a serial name, it's used to identify an anthill's type
	  */
	 private final static String ANTHILL_TYPE = "AHILL";
	 /**
	  * Define the Anthill's HP
	  */
	 private final static int ANTHILL_HP = 1000;
	 /**
	  * Define the Anthill's ARMOR
	  */
	 private final static int DEFAULT_ANTHILL_ARMOR = 10;
	 
	public AntHill(){
		 this.setType(ANTHILL_TYPE);
	 }
}
