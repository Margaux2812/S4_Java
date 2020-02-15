
public class ex1 {
	
	public static void main(String[] args) {
		print2();
	}
	
    private static void print2() {
    	/*1. Le compilateur devine de quel type est la variable 
    	 * en regardant le contexte. Par exemple ici,
    	 * on l'instancie � un string, qui a une m�thode length().
    	*/
    	System.out.println("Question 1");
    	var s = "toto";
        System.out.println(s.length());
        
        System.out.println("Question 2");
    	var s1 = "toto";
        var s2 = s1;
        var s3 = new String(s1);

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        /*2. Ce code affiche "true" puis "false"
         * En effet, s1 et s2 ont la m�me r�f�rence, tandis que s3 est un nouveau string
         * et a donc sa propre r�f�rence
         * 3. Il faut utiliser la m�thode equals()
         */
        
        System.out.println("Question 3");
        var s4 = "toto";
        var s5 = new String(s4);

        System.out.println(s4.equals(s5));
        
        System.out.println("Question 4");
        var s6 = "toto";
        var s7 = "toto";

        System.out.println(s6 == s7);
        /*4. Ce code affiche true car le programme cherche en premier si ce string existe
         * et s'il existe d�j�, alors les 2 objets auront la m�me r�f�rence
         * 5. Comme vu pr�d�cemment, deux objets string ayant le m�me mot ont donc la m�me r�f�rence.
         * Si un string est mutable, on aurait alors pu modifier le contenu de s6 sans se rendre compte
         * qu'on change alors aussi celui de s7. C'est pour cela que java.lang.String est immutable.
         */
        
        System.out.println("Question 6");
        var s8 = "hello";
        s8.toUpperCase();
        System.out.println(s8);
        /* 6. toUpperCase() est une m�thode qui retourne le string en majuscule,
         * il faut donc soit print avec la m�thode, soit associer � la variable s8 sa valeur en
         * majuscule. Afficher s8 l'affichera donc en minuscule puisque la variable n'a pas
         * chang�.
         */
    }
}
