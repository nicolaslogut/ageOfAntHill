package javaproject_ageOfAntHill.map;
/**
 * Define a cell state for the map's cells. There is 3 types of cells :
 * the yellow type : represent sand
 * the green type : represent grass
 * the blue type : represent water
 *  
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */

public enum CellState {	
	/**
	 * This define the Yellow color of the cellState
	 */
	SAND_SQUARE("S", "SAND_SQUARE.png"),
	
	/**
	 * This define the Green color of the cellState
	 */
	GRASS_SQUARE("G", "GRASS_SQUARE.png"),
	
	/**
	 * This define the Blue color of the cellState
	 */
	WATER_SQUARE("W", "WATER_SQUARE.png");
	
	/**
	 * Name of the file (picture)
	 */
	private String fileName;
	/**
	 * state of the cell (the state can be water, grass or sand) 
	 */
	private String state;
	/**
	 * true if the state is water.
	 */
	private boolean unreachable;  

	/**
	 * 
	 * @param desc
	 * @param fileName
	 */
	private CellState(String desc , String fileName)
	{
	this.state = desc; 
	this.fileName = fileName; 
	this.unreachable = (desc=="W"); 
	}

	/**
	 * 
	 * @return the file name 
	 */
	
		public String getFileName()
	{
			return this.fileName;
	}
		
	/**
	 * 
	 * @return true if the cell is unreachable
	 */
	private boolean unreachable(){
		return this.unreachable;
	}
}
