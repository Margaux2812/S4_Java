
public class ex1 {
	
	public static void main(String[] args) {
		printToto();
		print2();
	}
    
    
    static void printToto() {
    	/*Le compilateur devine de quel type est la variable 
    	 * en regardant le contexte. Par exemple ici,
    	 * on l'instancie à un string.
    	*/
    	var s = "toto";
        System.out.println(s.length());
    }
    
    static void print2() {
    	var s1 = "toto";
        var s2 = s1;
        var s3 = new String(s1);

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
