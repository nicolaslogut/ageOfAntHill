package javaproject_ageOfAntHill.map;

import javaproject_ageOfAntHill.entity.Unit;

import javax.swing.text.html.parser.Entity;

/**
 * Class which allows to create cells
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 * @version 20150526
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
	private CellState cellState;
	
	
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
	
	/**
	 * constructor with the CellState chosen
	 * @param cellstate
	 */
	public Cell(CellState cellstate)
	{
		this(null, cellstate);
	}
	/**
	 * allow to create a cell with an entity and a CellState chosen
	 * @param entity
	 * @param cellstate
	 */
	public Cell(Entity entity, CellState cellstate) {
		this.entity = entity;
		this.cellState = cellstate;
	}
	/**
	 * 
	 * @param lineNumber
	 * @param colNumber
	 * @return
	 */
	public String cellToString(int lineNumber,int colNumber) {
		return this.cellState.cellStateToString();
	}
	public CellState getCellState(){
		return this.cellState;
	}

}


