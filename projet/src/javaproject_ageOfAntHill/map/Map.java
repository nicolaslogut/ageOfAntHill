package javaproject_ageOfAntHill.map;

import java.util.Random;

import javaproject_ageOfAntHill.Displaying;
import javaproject_ageOfAntHill.LabelCustom;
import javaproject_ageOfAntHill.entity.Entity;

/**
 * represents the map of the game
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 * @version 20150607
 */
public class Map implements InterfaceMap {

	private final static int NBLINE = 48;
	private final static int NBCOLUMN = 48;

	private final static int MAX_WATER_LAKE = 8;
	private final static int MAX_TREE_FOREST = 4;

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
		for (int numLine = 0; numLine < NBLINE; numLine++) {
			for (int numCol = 0; numCol < NBCOLUMN; numCol++) {
				this.grid[numLine][numCol] = new Cell(); // Grass square by
															// default
			}
		}
	}

	/**
	 * adds a water block randomly on the map, and fill its surroundings with
	 * sand
	 */
	public void generateSandWater(Displaying disp) {
		for (int numWaterBlock = 0; numWaterBlock < MAX_WATER_LAKE; numWaterBlock++) {
			Random rand = new Random();
			int randNumLine = 0;
			int randNumCol = 0;
			int randNbCols = rand.nextInt(8) + 2;
			int randNbLines = rand.nextInt(9) + 2;
			boolean randValues = false;

			/*
			 * Picks a random location and checks if it is a good idea to place
			 * a water area there
			 */
			while (!randValues) {
				randNumCol = rand.nextInt(NBCOLUMN - randNbCols) + 1;
				randNumLine = rand.nextInt(NBLINE - randNbLines) + 1;
				randValues = true;
				for (int numLine = randNumLine; numLine < randNumLine
						+ randNbLines; numLine++) {
					for (int numCol = randNumCol; numCol < randNumCol
							+ randNbCols; numCol++) {
						if (this.grid[numLine][numCol].cellState != CellState.GRASS_SQUARE) {
							randValues = false;
						}
					}
				}
			}

			// adds a water area
			for (int numLine = randNumLine; numLine < randNumLine + randNbLines; numLine++) {
				for (int numCol = randNumCol; numCol < randNumCol + randNbCols; numCol++) {
					this.grid[numLine][numCol] = null;
					this.grid[numLine][numCol] = new Cell(
							CellState.WATER_SQUARE);
					LabelCustom labelFieldColor = (LabelCustom) disp
							.getGridOfTheGame().getComponent(
									getNumLabel(numLine, numCol));
					labelFieldColor.switchPictureLabel(CellState.WATER_SQUARE);
				}
			}

			int maxLine = 0;
			int maxCol = 0;
			if (randNumLine + randNbLines == NBLINE)
				maxLine = randNumLine + randNbLines;
			else
				maxLine = randNumLine + randNbLines + 1;

			if (randNumCol + randNbCols == NBCOLUMN)
				maxCol = randNumCol + randNbCols;
			else
				maxCol = randNumCol + randNbCols + 1;

			// adds Sand area around water
			for (int numLine = randNumLine - 1; numLine < maxLine; numLine++) {
				for (int numCol = randNumCol - 1; numCol < maxCol; numCol++) {
					if (this.grid[numLine][numCol].cellState != CellState.WATER_SQUARE) {
						this.grid[numLine][numCol] = null;
						this.grid[numLine][numCol] = new Cell(
								CellState.SAND_SQUARE);
						LabelCustom labelFieldColor = (LabelCustom) disp
								.getGridOfTheGame().getComponent(
										getNumLabel(numLine, numCol));
						labelFieldColor
								.switchPictureLabel(CellState.SAND_SQUARE);
					}
				}
			}
		}
	}

	/**
	 * This method add random generatly trees on the map TOUT DOUX (je la
	 * finirais : Adrien)
	 */
	public void generateTree(Displaying disp) {
		for (int nbBlockForest = 0; nbBlockForest < MAX_TREE_FOREST; nbBlockForest++) {
			Random rand = new Random();
			int randNumLine = 0;
			int randNumCol = 0;
			int randNbCols = rand.nextInt(8) + 2;
			int randNbLines = rand.nextInt(9) + 2;
			boolean randValues = false;

			/*
			 * Picks a random location and checks if it is a good idea to place
			 * a tree there
			 */
			while (!randValues) {
				randNumCol = rand.nextInt(NBCOLUMN - randNbCols);
				randNumLine = rand.nextInt(NBLINE - randNbLines);
				randValues = true;
				for (int numLine = randNumLine; numLine < randNumLine
						+ randNbLines; numLine++) {
					for (int numCol = randNumCol; numCol < randNumCol
							+ randNbCols; numCol++) {
						if (this.grid[numLine][numCol].cellState != CellState.GRASS_SQUARE) {
							randValues = false;
						}
					}
				}
			}

			// add a tree
			for (int numLine = randNumLine; numLine < randNumLine + randNbLines; numLine++) {
				for (int numCol = randNumCol; numCol < randNumCol + randNbCols; numCol++) {
					if (this.grid[numLine][numCol].cellState != CellState.GRASS_SQUARE) {
						this.grid[numLine][numCol] = new Cell(
								CellState.TREE_SQUARE);
					}
				}
			}

			for (int numLine = randNumLine; numLine < randNumLine + randNbLines; numLine++) {
				for (int numCol = randNumCol; numCol < randNumCol + randNbCols; numCol++) {
					this.grid[numLine][numCol] = null;
					this.grid[numLine][numCol] = new Cell(CellState.TREE_SQUARE);
					LabelCustom labelFieldColor = (LabelCustom) disp
							.getGridOfTheGame().getComponent(
									getNumLabel(numLine, numCol));
					labelFieldColor.switchPictureLabel(CellState.TREE_SQUARE);
				}
			}
		}
	}

	/**
	 * converts a Position (x,y) into the number of a Label
	 * 
	 * @param numLine
	 * @param numCol
	 * @return the number of a Label
	 */
	public int getNumLabel(int numLine, int numCol) {
		int numLabel = 0;
		for (int lineNumber = 0; lineNumber < NBLINE; lineNumber++) {
			for (int colNumber = 0; colNumber < NBCOLUMN; colNumber++) {
				if (lineNumber == numLine && colNumber == numCol)
					return numLabel;
				numLabel++;
			}
		}
		return 0;
	}

	/**
	 * returns true if the cell is not out of the Map ; false otherwise
	 * 
	 * @param position
	 * @return
	 */
	@Override
	public boolean notOutOfTheMap(Position position) {
		if (position.getY() < 0 || position.getY() >= NBLINE
				|| position.getX() < 0 || position.getX() >= NBCOLUMN)
			return false;
		return true;
	}
	
	/**
	 * 
	 */
	@Override
	public Cell getCell(Position pos){
		return this.grid[pos.getX()][pos.getY()];
	}
	
	
	/**
	 * displays a visual representaion of the map (as a grid)
	 */
	@Override
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