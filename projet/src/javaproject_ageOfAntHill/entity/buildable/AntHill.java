package javaproject_ageOfAntHill.entity.buildable;

public class AntHill extends Building {
	/**
	  * Just like a serial name, it's used to identify an anthill's type
	  */
	 private final static String ANTHILL_TYPE = "AHILL";
	 
	 private final static int ANTHILL_HP = 1000;
	 
	public AntHill(){
		 this.setType(ANTHILL_TYPE);
	 }
}
