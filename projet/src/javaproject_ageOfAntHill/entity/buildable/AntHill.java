package javaproject_ageOfAntHill.entity.buildable;

public class AntHill extends Building {
	/**
	  * Just like a serial name, it's used to identify an anthill's type
	  */
	 private final static String ANTHILL_TYPE = "AHILL";
	 
	public AntHill(){
		 this.setType(ANTHILL_TYPE);
	 }
}
