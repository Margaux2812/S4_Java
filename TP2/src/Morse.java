
public class Morse {
	public static void main(String[] args) {
		
		System.out.println("Avec +");
		for(String argument: args) {
			System.out.println(argument + " Stop. ");
		}
		/*StringBuilder est une classe
		 * permettant de cr�er des string mutables
		 * Sa m�thode append() sert � ajouter une chaine de charact�re
		 * apr�s a chaine d�j� existante. Elle retourne sur l'objet lui-m�me
		 * afin de le modifier directement.
		 */
		
		System.out.println("Avec append()");
		
		StringBuilder arguments = new StringBuilder();
		for(String argument: args) {
			arguments.append(argument);
			arguments.append(" Stop. ");
		}
		System.out.println(arguments); //On a ainsi qu'un seul affichage � faire
		
		/*Append permet de rester avec des string builder plut�t que des string
		 * du coup on �vite de faire des conversions
		 * mettre un + reviendrait � tt de m�me cr�er un string*/
	}
}
