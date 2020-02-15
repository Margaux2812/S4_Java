import java.util.regex.*;

public class ex3 {
	/* java.util.regex.Pattern sert à travailler avec des 
	 * expressions régulières
	 * Si on doit faire matcher un text avec un motif d'expression
	 * plus d'une fois, il faut créer unn pattern et utiliser la méthode compile()
	 * 
	 * java.util.regex.Matcher est utilisée pour rechercher dans un texte plusieurs 
	 * occurrences d'une expression régulière. Elle peut également être utilisée 
	 * pour rechercher la même expression régulière dans différents textes.
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
