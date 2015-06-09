package javaproject_ageOfAntHill.entity.buildable;


public class PostGuard extends Building{
	/**
	  * Just like a serial name, it's used to identify an PostGuard's type
	  */
	 private final static String POSTGUARD_TYPE = "POSTG";
	 
	 private final static int POSTGUARD_HP = 500;
	 
	public PostGuard(){
		 this.setType(POSTGUARD_TYPE);
	 }
}
