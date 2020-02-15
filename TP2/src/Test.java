
public class Test {
	 public static void main(String[] args) {
         var first = args[0];
         var second = args[1];
         var last = args[2];
         System.out.println(first + ' ' + second + ' ' + last);
       }
	 
	/*On peut écrire ' ' car espace est un charactère unique, donc il peut être
	 * défini comme un char
	 * 
	 * Java semble utiliser des stringbuilder, et les convertis à la fin en string
	 */
}
