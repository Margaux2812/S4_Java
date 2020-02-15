package TP1.src;

import java.util.ArrayList;
import java.util.Arrays;

public class Conversion {
	/*static signifie que la méthode n'est pas associée avec une instance de la classe*/
	public static void main(String[] args) {
		Integer[] entiers = fromStringToInt(args);
		System.out.println("Les arguments sont " + Arrays.toString(entiers));
		Integer sum = Sum(entiers);
		System.out.println("La somme des arguments est " + sum);
		
	}
	public static Integer[] fromStringToInt(String[] args) {
		ArrayList<Integer> entiers = new ArrayList<Integer>(args.length);
		
		for(String argument: args) {
			entiers.add(Integer.parseInt(argument));
		}
		
		/*Si on met un string dans nos arguments, on a une erreur*/
		return entiers.toArray(new Integer[args.length]);
	}
	
	public static Integer Sum(Integer[] args) {
		ArrayList<Integer> entiers = new ArrayList<Integer>(args.length);
		
		for(Integer argument: args) {
			entiers.add(argument);
		}
		
		int sum = 0;
		for(Integer number : entiers) {
			sum += number;
		}
		/*Si on met un string dans nos arguments, on a une erreur*/
		return sum;
	}
}
