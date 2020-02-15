
public class ex1 {
	
	public static void main(String[] args) {
		print2();
	}
	
    private static void print2() {
    	/*1. Le compilateur devine de quel type est la variable 
    	 * en regardant le contexte. Par exemple ici,
    	 * on l'instancie à un string, qui a une méthode length().
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
         * En effet, s1 et s2 ont la même référence, tandis que s3 est un nouveau string
         * et a donc sa propre référence
         * 3. Il faut utiliser la méthode equals()
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
         * et s'il existe déjà, alors les 2 objets auront la même référence
         * 5. Comme vu prédécemment, deux objets string ayant le même mot ont donc la même référence.
         * Si un string est mutable, on aurait alors pu modifier le contenu de s6 sans se rendre compte
         * qu'on change alors aussi celui de s7. C'est pour cela que java.lang.String est immutable.
         */
        
        System.out.println("Question 6");
        var s8 = "hello";
        s8.toUpperCase();
        System.out.println(s8);
        /* 6. toUpperCase() est une méthode qui retourne le string en majuscule,
         * il faut donc soit print avec la méthode, soit associer à la variable s8 sa valeur en
         * majuscule. Afficher s8 l'affichera donc en minuscule puisque la variable n'a pas
         * changé.
         */
    }
}
