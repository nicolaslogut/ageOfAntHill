package javaproject_ageOfAntHill;

import javaproject_ageOfAntHill.entity.Entity;
import javaproject_ageOfAntHill.map.Map;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

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

import java.awt.BorderLayout;

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
	private final static int DEFAULT_WINDOW_WIDTH = 950;
	/**
	 * default value of the window's height
	 */
	private final static int DEFAULT_WINDOW_HEIGHT = 950;
	/**
	 * 
	 */
	private InterfaceHM interfHM;

	/**
	 * window of the game
	 */
	private JFrame window;
	
	/**
	 * items in the JMenu bar
	 */
	private JMenuItem itemAbout;
	private JMenuItem itemClose;
	private JMenuItem itemNewGame;
	private JMenuItem itemSaveGame;
	private JMenuItem itemLoadGame;
	
	/**
	 * grid of the game
	 */
	private JPanel gridOfTheGame;
	private JPanel ressourcesOfThePlayer;

	/**
	 * part of the window with the game and the menu bar
	 */
	private JSplitPane splitGame;
	/**
	 * part of the window with the ressources of the player
	 */
	private JSplitPane splitRessources;
	/**
	 * menu bar of the window
	 */
	private JMenuBar menuBar;
	/**
	 * used to place units images (they're stored inside this grid of the game)
	 */
	private LabelCustom[][] tab;
	/**
	 * used to change the window's layout (especially the panel of the game)
	 */
	private JPanelLeft jpanelLeft;
	private JSplitPane splitWindow;
	private JPanel banner;
	
	
	public Displaying(InterfaceHM interfHM) {

		this.interfHM = interfHM;

		this.splitGame = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		this.splitRessources = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		
		this.window = new JFrame();
		this.menuBar = new JMenuBar();
		this.tab = new LabelCustom[Map.NBLINE][Map.NBCOLUMN];
	
		this.window.setJMenuBar(this.menuBar);
		this.gridOfTheGame = new JPanel();
		this.ressourcesOfThePlayer = new JPanel();
		this.splitWindow = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		this.banner = new JPanel();
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
		this.window.setTitle("Age Of AntHill **ALPHA INDEV 0.0000001**");
		
		this.window.setSize(DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT);
		this.window.setMinimumSize(new Dimension(DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT));
		this.window.setMaximumSize(new Dimension(DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT));
		
		this.window.setLocationRelativeTo(null);
		this.window.setAlwaysOnTop(true);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		this.window.setResizable(false);
		
		// creation of the MenuBar
			JMenu menu = new JMenu("Menu");
			this.itemAbout = new JMenuItem("About");
			this.itemClose = new JMenuItem("Close");

			menu.add(this.itemAbout);
			menu.add(this.itemClose);
		//add action listener
			this.itemAbout.addActionListener(this);
			this.itemClose.addActionListener(this);
			this.menuBar.add(menu);
		
		//creation of the game Menu
			JMenu game = new JMenu("Game");
			this.itemNewGame = new JMenuItem("New game");
			this.itemSaveGame = new JMenuItem("Save game");
			this.itemLoadGame = new JMenuItem("load a game");
			
		// add item on the bar menu
			game.add(this.itemNewGame);
			game.add(this.itemSaveGame);
			game.add(this.itemLoadGame);
			
		// add action listener on the items	
			this.itemNewGame.addActionListener(this);
			this.itemSaveGame.addActionListener(this);
			this.itemLoadGame.addActionListener(this);
			
		//add a menu option	
			this.menuBar.add(game);

			
		this.gridOfTheGame.setBounds(0, 0, DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT);
		GridLayout gl = new GridLayout(Map.NBLINE, Map.NBCOLUMN);
		this.gridOfTheGame.setLayout(gl);
		this.jpanelLeft = new JPanelLeft();
		
		//add on the JPanel ressourcesOfThePlayer the JPanel jpanelLeft
		ressourcesOfThePlayer.add(this.jpanelLeft);
		
		// creation of the cells of the game grid
		for (int numCell = 0; numCell < Map.NBLINE * Map.NBCOLUMN; numCell++) {
			LabelCustom cell = new LabelCustom(Map.NBLINE, Map.NBCOLUMN);
			if (numCell == 0)
			cell.getJlentity().setIcon(new ImageIcon("./img/mobs/guardian/guardian-bd.png"));
			cell.addMouseListener((MouseListener) this.interfHM);
			cell.addMouseMotionListener((MouseMotionListener) this.interfHM);
			this.getGridOfTheGame().add(cell);
			this.addCellTab(numCell, tab, cell);
			this.getGridOfTheGame().setComponentZOrder(cell, numCell);
		}
		
		//add on the JSplitpane SplitGame,the gridOfTheGame( map)
		splitGame.add(this.gridOfTheGame);
		splitGame.setDividerLocation(900);
		splitGame.setDividerSize(0);
		
		//add on the JSplitpane splitRessource, the jpanelLeft              
		splitRessources.add(this.jpanelLeft);
		splitRessources.setSize(100, DEFAULT_WINDOW_HEIGHT);
		splitRessources.setDividerLocation(100);
		splitRessources.setDividerSize(0);
		
		//creation label with an image(it's the banner on the top of the window) 
		JLabel JBanner = new JLabel();
		ImageIcon imgBanner = new ImageIcon("./img/BANNER.png");
		JBanner.setSize(imgBanner.getIconWidth(),imgBanner.getIconHeight());
		JBanner.setIcon(imgBanner);
		banner.add(JBanner);
		
		
		splitWindow.setLayout(new BorderLayout());
		splitWindow.add(splitRessources, BorderLayout.WEST);
		splitWindow.add(splitGame, BorderLayout.CENTER);
		splitWindow.add(banner, BorderLayout.NORTH);
		splitWindow.setBorder(null);
		splitWindow.setDividerSize(0);
		splitWindow.setEnabled(false);
		
		// add in the JFrame "window", the splitWindow 
		this.window.setContentPane(this.splitWindow);
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

		String instructions = "Instructions :\n";
		instructions+="Left click to select one unit or one building\n";
		instructions+="Middle click on a cell then middle click again to\n"
					+ " select all thein the selected area\n";
		instructions+="Right click to move the selected units to the targetted area\n";
		instructions+="note : some units might not be able to move if there isn't enough room";
		
		String newGame = "Fonction non implémentée";
		String saveGame = "Fonction non implémentée";
		String loadGame = "Fonction non implémentée";
		
		if (selectedItem == this.itemAbout) {
			JOptionPane.showMessageDialog(this.window, instructions, "About",JOptionPane.INFORMATION_MESSAGE);
		}else if (selectedItem == this.itemNewGame) {
			JOptionPane.showMessageDialog(this.window, newGame, "Nouvelle Partie",JOptionPane.INFORMATION_MESSAGE);
		}else if (selectedItem == this.itemSaveGame) {
			JOptionPane.showMessageDialog(this.window, saveGame, "Sauvegarder Partie",JOptionPane.INFORMATION_MESSAGE);
		}else if (selectedItem == this.itemLoadGame) {
			JOptionPane.showMessageDialog(this.window, loadGame, "Charger Partie",JOptionPane.INFORMATION_MESSAGE);
		}else if (selectedItem == this.itemClose) {
			this.window.dispose();
		}
	}
	
	public void addCellTab(int numCell, LabelCustom[][] tabEntity, LabelCustom cell){
		int col=numCell%Map.NBCOLUMN;
		int line=numCell/Map.NBLINE;
		tabEntity[line][col]=cell;
	}
	
	public LabelCustom getLabelTab(int line, int col){
		return this.tab[line][col];
	}
}
