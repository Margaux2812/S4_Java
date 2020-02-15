import java.util.regex.*;

public class ex3 {
	/* java.util.regex.Pattern sert � travailler avec des 
	 * expressions r�guli�res
	 * Si on doit faire matcher un text avec un motif d'expression
	 * plus d'une fois, il faut cr�er unn pattern et utiliser la m�thode compile()
	 * 
	 * java.util.regex.Matcher est utilis�e pour rechercher dans un texte plusieurs 
	 * occurrences d'une expression r�guli�re. Elle peut �galement �tre utilis�e 
	 * pour rechercher la m�me expression r�guli�re dans diff�rents textes.
	 */
	
	public static Pattern pattern = Pattern.compile("\\d");
	public static StringBuilder nombres = new StringBuilder();
	
	public static boolean isNumber(String argument) {
		boolean is = true;
		for(int i=0; i<argument.length(); i++){
			Matcher matcher = pattern.matcher(argument.subSequence(i, i+1));
			if(!matcher.find()) {
				is = false;
			}
		}
		
		return is;
	}
	
	public static void displayNumbers(String argument) {
		for(int i=0; i<argument.length(); i++){
			Matcher matcher = pattern.matcher(argument.subSequence(i, i+1));
			if(matcher.find()) {
				nombres.append(argument.subSequence(i, i+1));
			}
		}
	}
	
	public static void main(String[] args) {
		
		for(String argument: args) {
			if(isNumber(argument)) {
				System.out.println(argument);
			}
			displayNumbers(argument);
		}
		
		System.out.println("EX2");
		System.out.println(nombres);
		
		
	}
}
