package javaproject_ageOfAntHill;

import java.awt.Color;
import java.awt.Component;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

import javaproject_ageOfAntHill.entity.Entity;
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

	private Entity entity;
	private JLabel jlground;
	private JLabel jlentity;

	/**
	 * @param nbLine
	 * @param nbCol
	 */
	public LabelCustom(int nbLine, int nbCol) {

		// sets grass as default picture
		setLayout(new OverlayLayout(this));
		jlground = new JLabel(new ImageIcon("./img/GRASS_SQUARE.png"));
		// jlguard = new JLabel(new
		// ImageIcon("./img/mobs/guardian/guardian-bd.png"));
		jlentity = new JLabel();
		add(jlentity, 0);
		add(jlground, 1);
		
		// this.setIcon(new ImageIcon("./img/GRASS_SQUARE.png"));
		// setOpaque(true);
		// setIcon(new ImageIcon("./img/mobs/guardian/guardian-bd.png"));
	}
	
	/**
	 * returns the label containing the entity's picture
	 * @return
	 */
	public JLabel getJlentity() {
		return jlentity;
	}
	
	public void addEntityMap(Entity entity){
		this.entity=entity;
		switch (this.entity.getType()){
		case "FLY":
			//jlentity.setIcon(new ImageIcon("./img/mobs/guardian/guardian-hd.png"));
			break;
		case "GUARD":
			jlentity.setIcon(new ImageIcon("./img/mobs/guardian/guardian-hd.png"));
			break;
		case "LIZ":
			jlentity.setIcon(new ImageIcon("./img/mobs/lizard/lizard-hd.png"));
			break;
		case "QUEEN":
			jlentity.setIcon(new ImageIcon("./img/mobs/queen/queen-h.png"));
			break;
		case "SCAR":
			jlentity.setIcon(new ImageIcon("./img/mobs/scarab/scarab-hd.png"));
			break;
		case "SCOUT":
			jlentity.setIcon(new ImageIcon("./img/mobs/scout/scout-hd.png"));
			break;
		case "SHOOT":
			jlentity.setIcon(new ImageIcon("./img/mobs/shooter/shooter-hd.png"));
			break;
		case "WARR":
			jlentity.setIcon(new ImageIcon("./img/mobs/warrior/warrior-hd.png"));
			break;
		case "WORK":
			jlentity.setIcon(new ImageIcon("./img/mobs/worker/worker-hd.png"));
			break;
		case "AHILL":
			jlentity.setIcon(new ImageIcon("./img/ANTHILL_SQUARE.png"));
			break;
		default:
		}
	}
	
	
	public void switchGroundPicture(CellState color) {
		switch (color) {
		case SAND_SQUARE:
			jlground.setIcon(new ImageIcon("./img/SAND_SQUARE.png"));
			break;
		case WATER_SQUARE:
			jlground.setIcon(new ImageIcon("./img/WATER_SQUARE.png"));
			break;
		case TREE_SQUARE:
			jlground.setIcon(new ImageIcon("./img/TREE_SQUARE.png"));
			break;
		case GRASS_SQUARE:
		default:
			jlground.setIcon(new ImageIcon("./img/GRASS_SQUARE.png"));
			break;
		}
	}

}
