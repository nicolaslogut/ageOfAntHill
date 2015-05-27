package javaproject_ageOfAntHill;

import java.awt.GridLayout;

import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JSplitPane;
//import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


/**
 * used to (temporarily) display the graphic interface
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */
public class Displaying implements Runnable {
	private final static int NBLINE=30;
	private final static int NBCOLUMN=30;
	
	/**
	 * window of the game
	 */
	private JFrame window;
	
	/**
	 * grid of the game
	 */
	private JPanel pan1;
	
	public Displaying(){
		this.window = new JFrame();
		this.pan1 = new JPanel();
	}
	
	
	@Override
	public void run() {
		this.window.setTitle("Age Of AntHill **BETA TEST**");
		this.window.setSize(1200, 1025);
		this.window.setLocationRelativeTo(null);
		this.window.setAlwaysOnTop(true);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		//JPanel pan2 = new JPanel();
		//JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		
		// pan1 => the grid (for the P4 game)
		GridLayout gl = new GridLayout(64,64);
		this.pan1.setLayout(gl);
		for (int numButton=0;numButton<4096;numButton++){
			ButtonCustom button = new ButtonCustom(); 
			this.pan1.add(button);
		    button.addPicture(NBLINE, NBCOLUMN);
		    			// adds a picture (a square of grass, water, sand...)
		    //button.addActionListener(null);
		}
		/*
		// pan2 => the console
		JLabel lab = new JLabel("Console :\n");
		lab.setHorizontalTextPosition(SwingConstants.LEFT);
		lab.setHorizontalAlignment(SwingConstants.LEFT);
		pan2.add(lab);
		
		// splitPane
		splitPane.add(pan1);
		splitPane.add(pan2);
		splitPane.setDividerLocation(588);
		splitPane.setEnabled(false);
		splitPane.setDividerSize(0);
		*/
		// adding JSplitPane (both pan1 and pan2) in JFrame
		this.window.setContentPane(pan1);
		//CellState.voidToken(window)
		// displays the window
		this.window.setVisible(true);
	}
}
