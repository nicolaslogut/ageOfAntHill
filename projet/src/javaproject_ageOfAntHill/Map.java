package javaproject_ageOfAntHill;
/**
 * représente la carte de la partie (l'ensemble de la 'map' du jeu)
 * 
 * @author joris
 *
 */
class Map extends Interface {
	/**
	 * grille de jeu representant toute la carte d'une partie c'est un tableau
	 * de Position à deux dimmentions. Cette solution à été privilégiée car les cases
	 * seront toujours occupées au moins par du décor.
	 * Il n'y a aucun intérêt à stocker des
	 * positions dans un tableau à deux dimmentions, la case grille[i][j]
	 * possède déja une coordonée unique (i, j). Je propose donc de mettre un
	 * objet de type case (comme spécifié dans le diagramme de classes à mon
	 * souvenir) contenant un type de case (forêt, plaine, etc), et
	 * éventuellement une unité.
	 */
	private Case[][] grille;

	/**
	 * crée nouvelle carte sous la forme d'une grille (un tableau de cases
	 * ('Position') à 2 dimensions)
	 */
	public Map(){
		grille = new Case[][];
		for (int positionX=0;positionX<;positionX++){
			for (int positionY=0;positionY;positionY++){
				// assigne à chaque case de la grille une 'Position' où sont enregistrées les coordonées posX et posY
				this.grille[positionY][positionX]=new Position(positionX, positionY);
			}
		}
	}

	/**
	 * affiche une représentation graphique de la carte (sous forme de grille)
	 */
	public void afficherCarte() {

	}
}
