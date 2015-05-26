package javaproject_ageOfAntHill.map;

import javaproject_ageOfAntHill.entity.Unit;

import javax.swing.text.html.parser.Entity;

/**
 * Class which allows to create cells
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */
public class Cell 
{

	/**
	 * if there is an Entity on this cell
	 */
	private Entity entity;

	/**
	 * cell's state (the state can be grass, sand or water).
	 * 
	 */
	private CellState cellstate;
	
	
	/**
	 * 
	 * default constructor.
	 */
	public Cell() {
		this(null, CellState.GRASS_SQUARE);
	}

	public Cell(Entity entity) {
		this(null, CellState.GRASS_SQUARE);
	}
	
	
	public Cell(CellState cellstate)
	{
		this(null, cellstate);
	}

	public Cell(Entity entity, CellState cellstate) {
		this.entity = entity;
		this.cellstate = cellstate;
	}
	
	public String cellToString(int lineNumber,int colNumber) {
		return this.cellstate.cellStateToString();
	}
}
