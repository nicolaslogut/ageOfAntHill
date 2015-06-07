package javaproject_ageOfAntHill;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javaproject_ageOfAntHill.map.Map;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

	public Displaying(InterfaceHM interfHM) {

		this.interfHM = interfHM;

		this.splitGame = new JSplitPane(JSplitPane.VERTICAL_SPLIT);

		this.window = new JFrame();
		this.menuBar = new JMenuBar();
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
		this.window.setSize(900, 800);
		this.window.setMinimumSize(new Dimension(900, 800));
		this.window.setLocationRelativeTo(null);
		this.window.setAlwaysOnTop(true);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		JMenu menu = new JMenu("Menu");
		this.itemAbout = new JMenuItem("About");
		this.itemClose = new JMenuItem("Close");
		menu.add(this.itemAbout);
		menu.add(this.itemClose);
		this.itemAbout.addActionListener(this);
		this.itemClose.addActionListener(this);
		this.menuBar.add(menu);
		
		this.gridOfTheGame.setBounds(0, 0, 900, 800);
		GridLayout gl = new GridLayout(Map.NBLINE, Map.NBCOLUMN);
		this.gridOfTheGame.setLayout(gl);

		// LabelCustom[][] tab = new LabelCustom[10][20];

		for (int numCell = 0; numCell < Map.NBLINE * Map.NBCOLUMN; numCell++) {
			LabelCustom cell = new LabelCustom(Map.NBLINE, Map.NBCOLUMN);
			cell.setSize(new Dimension(5, 5));
			if (numCell == 0)
				cell.getJlguard().setIcon(
						new ImageIcon("./img/mobs/guardian/guardian-bd.png"));
			cell.addMouseListener((MouseListener) this.interfHM);
			this.getGridOfTheGame().add(cell);
			this.getGridOfTheGame().setComponentZOrder(cell, numCell);
		}

		// tab[0][1].getJlguard().setIcon(icon);
		JPanel console = new JPanel();
		this.cons = new JLabel("Console :");
		console.add(cons);

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
