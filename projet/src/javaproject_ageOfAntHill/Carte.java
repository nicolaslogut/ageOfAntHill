/**
 * repr�sente la carte de la partie (l'ensemble de la 'map' du jeu)
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
	 * cr�e nouvelle carte sous la forme d'une grille (un tableau de cases ('Position') � 2 dimensions)
	 */
	public Carte(){
		for (int positionX=0;positionX<;positionX++){
			for (int positionY=0;positionY;positionY++){
				// assigne � chaque case de la grille une 'Position' o� il enregistre les coord posX et posY
				this.grille[positionY][positionX]=new Position(positionX, positionY);
			}
		}
	}
	
	/**
	 * affiche une repr�sentation graphique de la carte (sous forme de grille)
	 */
	public void afficherCarte(){
		
	}
}
