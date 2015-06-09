package javaproject_ageOfAntHill.entity.buildable;


public class PostGuard extends Building{
	/**
	  * Just like a serial name, it's used to identify an PostGuard's type
	  */
	 private final static String POSTGUARD_TYPE = "POSTG";
	 /**
	  * Define the postguard's HP
	  */
	 private final static int DEFAULT_POSTGUARD_HP = 500;
	 /**
	  * Define the postguard's ARMOR
	  */
	 private final static int DEFAULT_POSTGUARD_ARMOR = 10;
	 
	public PostGuard(){
		 this.setType(POSTGUARD_TYPE);
	 }
}
