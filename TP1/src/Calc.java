package TP1.src;

import java.util.Scanner; 
/*Cette ligne sert � importer le scanner impl�ment� dans Java, dans le package java.util*/

public class Calc { 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre : ");
		
		/*On utilise la m�thode nextInt()*/
		
		int value = scanner.nextInt();
		System.out.println("Veuillez saisir un autre nombre : ");
		int value2 = scanner.nextInt();
		
		System.out.println("La somme de vos nombres est " + (value+value2));
		System.out.println("La diff�rence de vos nombres est " + (value-value2));
		System.out.println("Le produit de vos nombres est " + (value*value2));
		System.out.println("Le quotient de vos nombres est " + (value/value2));
		System.out.println("Le reste de vos nombres est " + (value%value2));
		
	}
}