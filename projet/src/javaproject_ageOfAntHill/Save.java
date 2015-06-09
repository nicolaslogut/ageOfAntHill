package javaproject_ageOfAntHill;

import javaproject_ageOfAntHill.entity.Entity;
import javaproject_ageOfAntHill.map.Cell;
import javaproject_ageOfAntHill.map.CellState;
import javaproject_ageOfAntHill.map.Map;

public class Save {

	private String name;
	private Cell[][] grid;

	/**
	 * 
	 * @param string
	 *            A save file like string
	 */
	public Save(String string) {
		this.grid = new Cell[Map.NBCOLUMN][Map.NBLINE];
		int nbElem = 0;

		this.name = string.split("#####")[0];
		for (String line : string.split("#####")[1].split("####")) {
			for (String elem : line.split("###")) {
				this.grid[nbElem / Map.NBCOLUMN][nbElem % Map.NBLINE] = new Cell(
						this.entityFromStr(elem.split("##")[0]),
						this.cellStateFromStr(elem.split("##")[1]));
			}
		}
	}

	private CellState cellStateFromStr(String string) {
		switch (string) {
		case "S":
			return CellState.SAND_SQUARE;
		case "G":
			return CellState.GRASS_SQUARE;
		case "W":
			return CellState.WATER_SQUARE;
		case "T":
			return CellState.TREE_SQUARE;

		default:
			return CellState.GRASS_SQUARE;
		}
	}

	private Entity entityFromStr(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return this.name;
	}
}
