package javaproject_ageOfAntHill.map;

//import java.util.Random;

import java.util.Random;

/**
 * represents the map of the game
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 * @version 20150526
 */
public class Map implements InterfaceMap {

	private final static int NBLINE = 30;
	private final static int NBCOLUMN = 30;

	private final static int MAX_WATER_LAKE = 4;

	/**
	 * grille de jeu representant toute la carte d'une partie c'est un tableau
	 * de Position à deux dimmentions. Cette solution à été privilégiée car les
	 * cases seront toujours occupées au moins par du décor. Il n'y a aucun
	 * intérêt à stocker des positions dans un tableau à deux dimmentions, la
	 * case grille[i][j] possède déja une coordonée unique (i, j). Je propose
	 * donc de mettre un objet de type case (comme spécifié dans le diagramme de
	 * classes à mon souvenir) contenant un type de case (forêt, plaine, etc),
	 * et éventuellement une unité.
	 */
	private Cell[][] grid;

	/**
	 * creates a new map as a grid (it's a table of Cases with 2dimensions)
	 */
	public Map() {
		this.grid = new Cell[NBCOLUMN][NBLINE];
		for (int numLine=0;numLine<NBLINE;numLine++){
			for (int numCol=0;numCol<NBCOLUMN;numCol++){
				this.grid[numLine][numCol] = new Cell();    // Grass square by default
			}
		}
		
		for (int numWaterBlock=0;numWaterBlock<MAX_WATER_LAKE;numWaterBlock++)
			this.generateSandWater();
	}
	
	/**
	 * adds a water block randomly on the map, and fill its surroundings with sand
	 */
	public void generateSandWater(){
		Random rand = new Random();
		int randLine=0;
		int randCol=0;
		boolean randValues = false;
		
		// Checks if it is a good idea to place a water area there
		while (!randValues){
			randCol = rand.nextInt(NBCOLUMN-7) + 2;
			randLine = rand.nextInt(NBLINE-8) + 2;
			randValues=true;
			for (int numLine=randLine;numLine<=randLine+4;numLine++){
				for (int numCol=randCol;numCol<=randCol+4;numCol++){
					if (this.grid[numLine][numCol].cellState!=CellState.GRASS_SQUARE){
						randValues = false;
					}
				}
			}
		}
		
		int randNbCol = rand.nextInt(6);
		int randNbLine = rand.nextInt(7);
		
		// adds a water area
		for (int numLine=randLine;numLine<=randLine+randNbLine;numLine++){
			for (int numCol=randCol;numCol<=randCol+randNbCol;numCol++){
				this.grid[numLine][numCol]=null;
				this.grid[numLine][numCol]= new Cell(CellState.WATER_SQUARE);
			}
		}
		
		// adds Sand area around water
		for (int numLine=randLine-2;numLine<=randLine+randNbLine+2;numLine++){
			for (int numCol=randCol-2;numCol<=randCol+randNbCol+2;numCol++){
				if (this.grid[numLine][numCol].cellState!=CellState.WATER_SQUARE){
					this.grid[numLine][numCol]=null;
					this.grid[numLine][numCol]= new Cell(CellState.SAND_SQUARE);
				}
			}
		}
	}
	
	
	
	
	/**
	 * returns true if the cell is out of the Map ; false otherwise
	 * @param position
	 * @return
	 */
	public boolean notOutOfTheMap(Position position) {
		if (position.getY() < 0 || position.getY() >= NBLINE 
				|| position.getX() < 0 || position.getX() >= NBCOLUMN)
			return true;
		return false;
	}

	/**
	 * displays a visual representaion of the map (as a grid)
	 */
	public String mapToString() {
		String mapAsciiArt = "-----------------------------------------------------------------------"
				+ "--------------------------------------------------\n";
		for (int lineNumber = 0; lineNumber < NBLINE; lineNumber++) {
			mapAsciiArt += "| ";
			for (int columnNumber = 0; columnNumber < NBCOLUMN; columnNumber++) {
				mapAsciiArt += this.grid[columnNumber][lineNumber]
						.cellToString(lineNumber, columnNumber);
				mapAsciiArt += " | ";
			}

			mapAsciiArt += "\n";
			mapAsciiArt += "-----------------------------------------------------------------------"
				+ "--------------------------------------------------\n";
		}
		return mapAsciiArt;
	}
}
