package javaproject_ageOfAntHill.map;

import javaproject_ageOfAntHill.entity.Unit;

import javax.swing.text.html.parser.Entity;

/**
 * Class which allows to create cells
 * @author Maxime Augst, Jorris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */
public class Cell 
{

	/**
	 * if there is an unit on this cell
	 */
	private Unit unit;
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
	 * construct a cell
	 * @param unit the unit on the case if we have one
	 * @param cellstate the state of the cell
	 */
	public Cell( Unit unit, CellState cellstate)
	{
		
	}
	
	
	/**
	 * default constructor for cell
	 */
	public Cell ()
	{
		
	}
	
}
