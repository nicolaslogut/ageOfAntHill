package javaproject_ageOfAntHill;


import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javaproject_ageOfAntHill.map.CellState;

/**
 * Used (temporarily) to customize the JButton Class
 * We can then use customized buttons
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */
@SuppressWarnings("serial")
public class LabelCustom extends JLabel {	
	/**
	 * TOUT DOUX
	 * @param nbLine
	 * @param nbCol
	 */
	public LabelCustom(int nbLine, int nbCol) {
		this.setIcon(new ImageIcon("./img/GRASS_SQUARE.png"));
			// sets grass as default picture
	}
	
//	/**
//	 * This set all the tiles available for the map
//	 */
//	public void addPicture() {
//		Random random = new Random();
//		int randInt = random.nextInt(10);
//		switch (randInt) {
//		case 0: case 1: case 2:
//			this.setIcon(new ImageIcon("./img/SAND_SQUARE.png"));
//			break;
//		case 3: case 4:
//			this.setIcon(new ImageIcon("./img/WATER_SQUARE.png"));
//			break;
//		case 5: case 6: case 7: case 8: case 9:
//		default:
//			this.setIcon(new ImageIcon("./img/GRASS_SQUARE.png"));
//		}
//	}
	
	public void switchPictureLabel(CellState color){
		switch (color){
		case SAND_SQUARE:
			this.setIcon(new ImageIcon("./img/SAND_SQUARE.png"));
			break;
		case WATER_SQUARE:
			this.setIcon(new ImageIcon("./img/WATER_SQUARE.png"));
			break;
		case TREE_SQUARE:
			this.setIcon(new ImageIcon("./img/TREE_SQUARE.png"));
			break;
		case GRASS_SQUARE: default:
			this.setIcon(new ImageIcon("./img/GRASS_SQUARE.png"));
			break;
		}
	}
	
}
