package javaproject_ageOfAntHill;

import javax.swing.SwingUtilities;

/**
 * Used (temporarily) as a class with method Main
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian Amaglio, Adrien Arsac
 *
 */
public class Application {
	
	/**
	 * Main de l'application 
	 * @param args (n/a)
	 */
	public static void main(String[] args) {
		// Exécution de la tâche de gestion de l'IHM dans le thread "event dispatch" de Swing
				SwingUtilities.invokeLater(new Displaying());
				System.out.println("fin du main !");
	}
}
