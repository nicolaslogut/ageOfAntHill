/**
 * représente la carte de la partie (l'ensemble de la 'map' du jeu)
 * @author joris
 *
 */
class Carte extends Interface {
	/**
	 * grille de jeu representant toute la carte d'une partie
	 * c'est un tableau de Position
	 */
	private Position[][] grille;
	
	/**
	 * crée nouvelle carte sous la forme d'une grille (un tableau de cases ('Position') à 2 dimensions)
	 */
	public Carte(){
		for (int positionX=0;positionX<;positionX++){
			for (int positionY=0;positionY;positionY++){
				// assigne à chaque case de la grille une 'Position' où il enregistre les coord posX et posY
				this.grille[positionY][positionX]=new Position(positionX, positionY);
			}
		}
	}
	
	/**
	 * affiche une représentation graphique de la carte (sous forme de grille)
	 */
	public void afficherCarte(){
		
	}
}
