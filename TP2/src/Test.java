
public class Test {
	 public static void main(String[] args) {
         var first = args[0];
         var second = args[1];
         var last = args[2];
         System.out.println(first + ' ' + second + ' ' + last);
       }
	 
	/*On peut �crire ' ' car espace est un charact�re unique, donc il peut �tre
	 * d�fini comme un char
	 * 
	 * Java semble utiliser des stringbuilder, et les convertis � la fin en string
	 */
}
