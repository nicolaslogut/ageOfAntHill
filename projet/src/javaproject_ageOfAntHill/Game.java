package javaproject_ageOfAntHill;

import javaproject_ageOfAntHill.map.Map;

// I thought it was starting an instance of the game ?
/**
 * this class allows to launch the game
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 * @version 20150607
 */
public class Game {

	/**
	 * map generate
	 */
	private Map theMap;

	/**
	 * creation of the game
	 */
	public Game() {
		this.theMap = new Map();
	}

	/**
	 * method which allows to play to complete Shouldn't be here though ; will
	 * check later
	 */
	public void play() {
	}

	/**
	 * method which allows to create a new Game with differents specifies :
	 * Number of team Duration Difficulty ?
	 */
	public void createGame() {
	}

	/**
	 * method which init the game with all predefined values and cells state
	 */
	public void initGame() {
	}

	/**
	 * method which allows you to save your current running game
	 */
	public void saveGame() {
	}

	/**
	 * method which allows you to leave your current running game With / without
	 * saving ?
	 */
	public void leaveGame() {
	}

	/**
	 * method which allows you to load a saved game and get into it when you
	 * leave
	 */
	public void loadGame() {
	}
}
