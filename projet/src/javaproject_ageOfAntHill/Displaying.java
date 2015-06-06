package javaproject_ageOfAntHill;

import java.awt.GridLayout;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


/**
 * used to (temporarily) display the graphic interface
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */
public class Displaying implements Runnable {
	/**
	 * A constant integer which contain the total number of lines
	 */
	private final static int NBLINE=64;	// 64 seems the most adequate as default value
	/**
	 * A constant integer which contain the total number of column
	 */
	private final static int NBCOLUMN=64; // 64 seems the most adequate as default value
	
	private InterfaceHM interfHM;
	
	/**
	 * window of the game
	 */
	private JFrame window;
	
	/**
	 * grid of the game
	 */
	private JPanel pan1;
	
	public Displaying(InterfaceHM interfHM){
		this.interfHM = interfHM;
		this.window = new JFrame();
		this.setPan1(new JPanel());
		
		this.initGraphInt();
	}
	
	
	@Override
	public void run() {
		// will be used later
	}
	
	/**
	 * The main frame of the game, contain the size and a bunch of parameters
	 */
	private void initGraphInt() {
		this.window.setTitle("Age Of AntHill **BETA TEST**");
		this.window.setSize(1200, 1025);
		this.window.setLocationRelativeTo(null);
		this.window.setAlwaysOnTop(true);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		GridLayout gl = new GridLayout(NBLINE, NBCOLUMN);
		this.getPan1().setLayout(gl);
		for (int numCell=0;numCell<NBLINE*NBCOLUMN;numCell++){
			LabelCustom cell = new LabelCustom(NBLINE, NBCOLUMN);
			cell.addMouseListener((MouseListener) this.interfHM);
			this.getPan1().add(cell);
			this.getPan1().setComponentZOrder(cell,numCell);
		}
		
		this.window.setContentPane(getPan1());
		this.window.setVisible(true);
	}


	public JPanel getPan1() {
		return pan1;
	}


	public void setPan1(JPanel pan1) {
		this.pan1 = pan1;
	}
}
