package javaproject_ageOfAntHill;

import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Used (temporarily) to customize the JButton Class
 * We can then use customized buttons
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */
@SuppressWarnings("serial")
public class ButtonCustom extends JButton {
	
	public ButtonCustom(){
		this.setBorder(BorderFactory.createEmptyBorder());
	}
	
	
	public void addPicture(int nb_line, int nb_col) {
		for (int yPos=0;yPos<nb_line;yPos++){
			for (int xPos=0;xPos<nb_col;xPos++){
				// assigne à chaque case de la grille une 'Position' où sont enregistrées les coordonées posX et posY
				Random random = new Random();
				int randInt = random.nextInt(3);
				switch (randInt) {
				case 0:
					this.setIcon(new ImageIcon("./img/GRASS_SQUARE.png"));
					break;
				case 1:
					this.setIcon(new ImageIcon("./img/SAND_SQUARE.png"));
					break;
				case 2:
					this.setIcon(new ImageIcon("./img/WATER_SQUARE.png"));
					break;
				default:
					this.setIcon(new ImageIcon("./img/GRASS_SQUARE.png"));
				}
			}
		}
	}
}
