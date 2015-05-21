package javaproject_ageOfAntHill.map;


/**
 * represents the map of the game
 * 
 * @author joris
 *
 */
public class Map {
	/* note: oui, on va faire comme �a alors
    mais du coup, on fait un autre objet enum pour faire une
    enumeration de tous les differents objets qu'on peut mettre
    dans une case ? Ou c'est ta classe Case ?
    */
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
	private Cell[][] grille;

	/**
	 * creates a new map as a grid (it's a table of Cases with 2dimensions)
	 */
	                    //  to check soon
	/*public Map(){
		grille = new Cell[][];
		for (int positionX=0;positionX<20;positionX++){
			for (int positionY=0;positionY<20;positionY++){
				// assigne à chaque case de la grille une 'Position' où sont enregistrées les coordonées posX et posY
				this.grille[positionY][positionX]=new Position(positionX, positionY);
			}
		}
	}*/

	/**
	 * displays a visual representaion of the map (as a grid)
	 */
	public void afficherCarte() {
		
	}
}
