package javaproject_ageOfAntHill;

import javaproject_ageOfAntHill.map.CellState;
import javaproject_ageOfAntHill.map.InterfaceMap;
import javaproject_ageOfAntHill.map.Position;

public abstract class Ressource {
	/**
	 * quantity of this ressource
	 */
	private int quantity;
	/**
	 * the type of ressource (dirt or food)
	 */
	private String type;
	
	public Ressource(){
		
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return this.type; 
	}
	
	/**
	 * use to pick up ressources(food and dirt)
	 * @return
	 */
	public Ressource pickUpRessources(Position pos, InterfaceMap map) {
//		if (map.notOutOfTheMap(pos)){
//			if (map.getCell(pos).getEntity() == null 
//			  && map.getCell(pos).getCellState() == CellState.GRASS_SQUARE){
//				if (map.getCell(pos).getRessource()!=null){
//					if (map.getCell(pos).getRessource().getType()=="FOOD"){
//						map.getCell(pos).getRessource().setQuantity(getQuantity);
//						map.getCell(pos).getRessource()==null;
//					}
//					else{
//						(Food) map.getCell(pos).getRessource().setQuantity(getQuantity);
//						map.getCell(pos).getRessource()==null;
//					}
//				}
//				
//			}
//		}
		return null;
	}
	
}
