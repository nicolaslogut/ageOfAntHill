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
	private final static int NBLINE=64;	// 64 seems the most adequate as default value
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
		this.pan1 = new JPanel();
	}
	
	
	@Override
	public void run() {
		initGraphInt();
	}
	
	private void initGraphInt() {
		this.window.setTitle("Age Of AntHill **BETA TEST**");
		this.window.setSize(1200, 1025);
		this.window.setLocationRelativeTo(null);
		this.window.setAlwaysOnTop(true);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		GridLayout gl = new GridLayout(NBLINE, NBCOLUMN);
		this.pan1.setLayout(gl);
		for (int numCell=0;numCell<NBLINE*NBCOLUMN;numCell++){
			LabelCustom cell = new LabelCustom(NBLINE, NBCOLUMN);
			cell.addMouseListener((MouseListener) this.interfHM);
			this.pan1.add(cell);
		}
		
		this.window.setContentPane(pan1);
		this.window.setVisible(true);
	}
}
