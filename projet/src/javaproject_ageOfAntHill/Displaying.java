package javaproject_ageOfAntHill;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;


/**
 * used to (temporarily) display the graphic interface
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */
public class Displaying implements Runnable, ActionListener {
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
	/*
	 * 
	 */
	private JMenuItem ItemAbout;
	/*
	 * 
	 */
	private JMenuItem ItemClose;
	/**
	 * grid of the game
	 */
	private JPanel gridOfTheGame;
	
	private JPanel menu;
	
	private JPanel console;
	
	private JLabel cons;
	
	private JSplitPane splitWindow;
	private JSplitPane splitGame;
	
	
	
	public Displaying(InterfaceHM interfHM){
		
		this.interfHM = interfHM;
		
		this.splitWindow = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		this.splitGame = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
				
		this.window = new JFrame();
		
		this.setGridOfTheGame(new JPanel());
		
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
		
		
		this.setMenu(new JPanel());
		
		JMenu menu = new JMenu("Menu");
		this.ItemAbout = new JMenuItem("About");
		this.ItemClose = new JMenuItem("Close");
		menu.add(this.ItemAbout);
		menu.add(this.ItemClose);
		this.ItemAbout.addActionListener(this);
		this.ItemClose.addActionListener(this);
		GridLayout gl = new GridLayout(NBLINE, NBCOLUMN);
		this.getGridOfTheGame().setLayout(gl);
		
		for (int numCell=0;numCell<NBLINE*NBCOLUMN;numCell++){
			LabelCustom cell = new LabelCustom(NBLINE, NBCOLUMN);
			cell.addMouseListener((MouseListener) this.interfHM);
			this.getGridOfTheGame().add(cell);
			this.getGridOfTheGame().setComponentZOrder(cell,numCell);
			
		this.cons = new JLabel("Console :");
		this.console.add(cons);	
	
		splitGame.add(this.gridOfTheGame);
		splitGame.add(this.console);
	
		splitWindow.add(this.menu);
		splitWindow.add(this.splitGame);
		
		this.window.setContentPane(getGridOfTheGame());
		this.window.setVisible(true);
		}
	}


	public JPanel getGridOfTheGame() {
		return gridOfTheGame;
		
	}


	public void setGridOfTheGame(JPanel gridOfTheGame) {
		this.gridOfTheGame = gridOfTheGame;
	}
	
	public JPanel getMenu() {
		  return menu;
		 }


		 public void setMenu(JPanel menu) {
		  this.menu = menu;
		 }


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}
