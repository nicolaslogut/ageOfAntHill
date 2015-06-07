package javaproject_ageOfAntHill;

import javaproject_ageOfAntHill.map.Map;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;

/**
 * used to (temporarily) display the graphic interface
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 * @version 20150607
 */
public class Displaying implements Runnable, ActionListener {
	/**
	 * default value of the window's width
	 */
	private final static int DEFAULT_WINDOW_WIDTH = 900;
	/**
	 * default value of the window's height
	 */
	private final static int DEFAULT_WINDOW_HEIGHT = 800;
	/**
	 * 
	 */
	private InterfaceHM interfHM;

	/**
	 * window of the game
	 */
	private JFrame window;
	/**
	 * item close in the menu bar
	 */
	private JMenuItem itemAbout;
	/**
	 * item about in the menu bar
	 */
	private JMenuItem itemClose;
	/**
	 * grid of the game
	 */
	private JPanel gridOfTheGame;

	/**
	 * console of the game
	 */
	private JLabel cons;
	/**
	 * part of the window with the game and the menu bar
	 */
	private JSplitPane splitGame;
	/**
	 * menu bar of the window
	 */
	private JMenuBar menuBar;
	/**
	 * used to change the window's layout (especially the panel of the game)
	 */
	private JLayeredPane layeredPan;

	public Displaying(InterfaceHM interfHM) {

		this.interfHM = interfHM;

		this.splitGame = new JSplitPane(JSplitPane.VERTICAL_SPLIT);

		this.window = new JFrame();
		this.menuBar = new JMenuBar();
		this.layeredPan = new JLayeredPane();
		this.window.setLayeredPane(this.layeredPan);
		this.window.setJMenuBar(this.menuBar);
		this.gridOfTheGame = new JPanel();
		
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
		this.window.setSize(DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT);
		this.window.setMinimumSize(new Dimension(DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT));
		this.window.setLocationRelativeTo(null);
		this.window.setAlwaysOnTop(true);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		// creation of the MenuBar
		JMenu menu = new JMenu("Menu");
		this.itemAbout = new JMenuItem("About");
		this.itemClose = new JMenuItem("Close");
		menu.add(this.itemAbout);
		menu.add(this.itemClose);
		this.itemAbout.addActionListener(this);
		this.itemClose.addActionListener(this);
		this.menuBar.add(menu);
		
		// creation of the console
		JPanel console = new JPanel();
		this.cons = new JLabel("Console :");
		console.add(cons);
		
		this.layeredPan.setBounds(0, 0, DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT - console.getHeight() - this.menuBar.getHeight());
		this.gridOfTheGame.setBounds(0, 0, DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT);
		GridLayout gl = new GridLayout(Map.NBLINE, Map.NBCOLUMN);
		this.gridOfTheGame.setLayout(gl);
		
		// LabelCustom[][] tab = new LabelCustom[10][20];
		
		// creation of the cells of the game grid
		for (int numCell = 0; numCell < Map.NBLINE * Map.NBCOLUMN; numCell++) {
			LabelCustom cell = new LabelCustom(Map.NBLINE, Map.NBCOLUMN);
			System.out.println(cell.getX()+" et "+cell.getY());
			if (numCell == 0)
				cell.getJlguard().setIcon(new ImageIcon("./img/mobs/guardian/guardian-bd.png"));
			cell.addMouseListener((MouseListener) this.interfHM);
			this.getGridOfTheGame().add(cell);
			this.getGridOfTheGame().setComponentZOrder(cell, numCell);
		}

		// tab[0][1].getJlguard().setIcon(icon);
		

		// JPanel panGame = new JPanel();
		// panGame.add(this.gridOfTheGame);

		splitGame.add(this.gridOfTheGame);
		splitGame.add(console);
		splitGame.setDividerLocation(600);
		splitGame.setDividerSize(0);

		this.window.setContentPane(this.splitGame);
		this.window.setVisible(true);

	}

	public JPanel getGridOfTheGame() {
		return gridOfTheGame;

	}

	public void setGridOfTheGame(JPanel gridOfTheGame) {
		this.gridOfTheGame = gridOfTheGame;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JMenuItem selectedItem = (JMenuItem) event.getSource();

		String instructions = "Instructions :\n"; // TODO => add helping instructions

		if (selectedItem == this.itemAbout) {
			JOptionPane.showMessageDialog(this.window, instructions, "About",
					JOptionPane.INFORMATION_MESSAGE);
		}
		if (selectedItem == this.itemClose) {
			this.window.dispose();
		}
	}
}
