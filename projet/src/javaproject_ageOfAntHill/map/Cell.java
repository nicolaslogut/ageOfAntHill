package javaproject_ageOfAntHill.map;

import javaproject_ageOfAntHill.entity.Unit;

import javax.swing.text.html.parser.Entity;

public class Cell {

	/**
	 * if there is an unit on this cell
	 */
	private Unit unit;
	/**
	 * if there is an Entity on this cell
	 */
	private Entity entity;

	/**
	 * cell's state( the state can be grass or sand or water.
	 * 
	 */
	private CellState cellstate;
	
	
	public Cell( Unit unit, CellState cellstate){
		
	}
	
	public Cell ( ){
		
	}
	
}