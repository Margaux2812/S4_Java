
public class Morse {
	public static void main(String[] args) {
		
		System.out.println("Avec +");
		for(String argument: args) {
			System.out.println(argument + " Stop. ");
		}
		/*StringBuilder est une classe
		 * permettant de créer des string mutables
		 * Sa méthode append() sert à ajouter une chaine de charactère
		 * après a chaine déjà existante. Elle retourne sur l'objet lui-même
		 * afin de le modifier directement.
		 */
		
		System.out.println("Avec append()");
		
		StringBuilder arguments = new StringBuilder();
		for(String argument: args) {
			arguments.append(argument);
			arguments.append(" Stop. ");
		}
		System.out.println(arguments); //On a ainsi qu'un seul affichage à faire
		
		/*Append permet de rester avec des string builder plutôt que des string
		 * du coup on évite de faire des conversions
		 * mettre un + reviendrait à tt de même créer un string*/
	}
}
