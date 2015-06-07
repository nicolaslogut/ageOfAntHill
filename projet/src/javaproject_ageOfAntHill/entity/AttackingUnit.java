package javaproject_ageOfAntHill.entity;

import javaproject_ageOfAntHill.map.InterfaceMap;
import javaproject_ageOfAntHill.map.Position;

public class AttackingUnit extends Unit implements InterfaceAttack {

	
	public void attack(Position unitPos, Position enemyPos, InterfaceMap map) {
		Unit enemy = map.getCell(enemyPos).getUnit();
		  Unit unit = map.getCell(unitPos).getUnit();
		  
		  if (enemy.armor<unit.damages)
		   enemy.healthPoints=enemy.healthPoints-(unit.damages-enemy.armor);
		  else
		   enemy.healthPoints--;
	}

	@Override
	public void attack(Position unitPos, Position enemyPos) {
		// TODO Auto-generated method stub
		
	}
	
}
