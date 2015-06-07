package javaproject_ageOfAntHill;


import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

import javaproject_ageOfAntHill.map.CellState;

/**
 * Used (temporarily) to customize the JButton Class
 * We can then use customized buttons
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */
@SuppressWarnings("serial")
public class LabelCustom extends JPanel {
	
	private JLabel jlground;
	private JLabel jlguard;
	
	/**
	 * TOUT DOUX
	 * @param nbLine
	 * @param nbCol
	 */
	/**
	 * @param nbLine
	 * @param nbCol
	 */
	public LabelCustom(int nbLine, int nbCol) {
		
			// sets grass as default picture
		setLayout(new OverlayLayout(this));
		jlground = new JLabel(new ImageIcon("./img/GRASS_SQUARE.png"));
//		jlguard = new JLabel(new ImageIcon("./img/mobs/guardian/guardian-bd.png"));
		jlguard = new JLabel();
		add(jlguard,0);
		add(jlground,1);
		
		
//		this.setIcon(new ImageIcon("./img/GRASS_SQUARE.png"));
//		setBackground(Color.GREEN);
//		setOpaque(true);
//		setIcon(new ImageIcon("./img/mobs/guardian/guardian-bd.png"));
	}
	
	public JLabel getJlguard() {
		return jlguard;
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
			jlground.setIcon(new ImageIcon("./img/SAND_SQUARE.png"));
			break;
		case WATER_SQUARE:
			jlground.setIcon(new ImageIcon("./img/WATER_SQUARE.png"));
			break;
		case TREE_SQUARE:
			jlground.setIcon(new ImageIcon("./img/TREE_SQUARE.png"));
			break;
		case GRASS_SQUARE: default:
			jlground.setIcon(new ImageIcon("./img/GRASS_SQUARE.png"));
			break;
		}
	}
	
}
