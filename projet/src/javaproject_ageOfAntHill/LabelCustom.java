package javaproject_ageOfAntHill;

import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

import javaproject_ageOfAntHill.map.CellState;

/**
 * Used (temporarily) to customize the JButton Class. Then we can use customized
 * buttons.
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 */
@SuppressWarnings("serial")
public class LabelCustom extends JPanel {

	private JLabel jlground;
	private JLabel jlguard;

	/**
	 * @TODO 
	 * 
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
		jlground = new JLabel(new ImageIcon("./img/tiles/GRASS_SQUARE.png"));
		jlguard = new JLabel();
		add(jlguard, 0);
		add(jlground, 1);
	}

	public JLabel getJlguard() {
		return jlguard;
	}

	public void switchGroundPicture(CellState color) {
		switch (color) {
		case SAND_SQUARE:
			jlground.setIcon(new ImageIcon("./img/tiles/SAND_SQUARE.png"));
			break;
		case WATER_SQUARE:
			jlground.setIcon(new ImageIcon("./img/tiles/WATER_SQUARE.png"));
			break;
		case TREE_SQUARE:
			jlground.setIcon(new ImageIcon("./img/tiles/TREE_SQUARE.png"));
			break;
		case GRASS_SQUARE:
		default:
			jlground.setIcon(new ImageIcon("./img/tiles/GRASS_SQUARE.png"));
			break;
		}
	}

}
