package javaproject_ageOfAntHill.map;

//import java.util.Random;

import java.util.Random;

import javaproject_ageOfAntHill.entity.Unit;

/**
 * represents the map of the game
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 * @version 20150526
 */
public class Map {
	/*
	 * note: oui, on va faire comme �a alors mais du coup, on fait un autre
	 * objet enum pour faire une enumeration de tous les differents objets qu'on
	 * peut mettre dans une case ? Ou c'est ta classe Case ?
	 */

	private final static int NBLINE = 30;
	private final static int NBCOLUMN = 30;

	private final static int MAX_WATER_LAKE = 10;

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
	// to check soon
	public Map() {
		this.grid = new Cell[NBCOLUMN][NBLINE];
		for (int xPos = 0; xPos < NBLINE; xPos++) {
			for (int yPos = 0; yPos < NBCOLUMN; yPos++) {
				// assigne à chaque case de la grille une 'Position' où sont
				// enregistrées les coordonées posX et posY
				Random random = new Random();
				int randInt = random.nextInt(3);
				this.setElem(new Position(xPos, yPos), randInt);
				// to check later on
			}
		}
	}

	private void setElem(Position position, int value) {
		if (this.grid[position.getX()][position.getY()].getCellState() == CellState.WATER_SQUARE
				|| this.grid[position.getX()][position.getY()].getCellState() == CellState.WATER_SQUARE)
			return;
		switch (value) {
		case 0:
			this.grid[position.getX()][position.getY()] = new Cell(CellState.SAND_SQUARE);
			break;
		case 1:
			this.grid[position.getX()][position.getY()] = new Cell(CellState.GRASS_SQUARE);
			break;
		case 2:
			this.setWater(position, 0);
		default:
			this.grid[position.getX()][position.getY()] = new Cell(CellState.SAND_SQUARE);

		}

	}

	private void setElem(Position position, CellState state) {
		this.grid[position.getX()][position.getY()] = new Cell(state);
	}

	private void setWater(Position position, int waterSet) {
		this.grid[position.getX()][position.getY()] = new Cell(CellState.WATER_SQUARE);
		Position[] positions = new Position[] {
				new Position(position.getX()+1, position.getY()),
				new Position(position.getX()-1, position.getY()),
				new Position(position.getX(), position.getY()+1),
				new Position(position.getX(), position.getY()-1) };

		Random random = new Random();

		for (Position currentPos : positions) {
			if (this.grid[currentPos.getX()][currentPos.getY()].getCellState() != CellState.WATER_SQUARE) {
				int randInt = random.nextInt(MAX_WATER_LAKE - waterSet);
				if (randInt == 0) {
					this.setElem(currentPos, CellState.SAND_SQUARE);
				} else {
					setWater(currentPos, waterSet + 1);
				}
			}
		}
	}

	/**
	 * this method allow you to get the position of a unit TOUT DOUX :3
	 */
	/*
	 * public Unit getUnit(){
	 * 
	 * }
	 */

	/**
	 * displays a visual representaion of the map (as a grid)
	 */
	public String displayMap() {
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
