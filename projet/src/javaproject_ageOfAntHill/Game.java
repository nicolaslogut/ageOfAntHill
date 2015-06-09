package javaproject_ageOfAntHill;

import javaproject_ageOfAntHill.map.Map;

// I thought it was starting an instance of the game ?
/**
 * This class allows the user to launch the game.
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 * @version 20150607
 */
public class Game {

	/**
	 * Map generation.
	 */
	private Map theMap;

	/**
	 * The game creation. 
	 */
	public Game() {
		this.theMap = new Map();
	}

	/**
	 * Method which allows to play (To complete ; Shouldn't be here though).
	 */
	public void play() {
	}

	/**
	 * Method which allows to create a new Game with different specifies :
	 * Number of team Duration Difficulty ?
	 */
	public void createGame() {
	}

	/**
	 * method which initialize the game with all predefined values and cells state.
	 */
	public void initGame() {
	}

	/**
	 * Method which allows the user to save your current running game.
	 */
	public void saveGame() {
	}

	/**
	 * Method which allows you to leave your current running game with saving.
	 */
	public void leaveGame() {
	}

	/**
	 * Method which allows you to load a saved game and get into it when you
	 * leave.
	 */
	public void loadGame() {
	}
}
