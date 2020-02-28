public class Main {
	int fii;
	
	public int getFii() {
		return fii;
	}


	public void setFii(int foo) {
		this.fii = foo;
	}


	public void hello() {
		
	}
	
//	public String toString() {
//		super.toString().
//	}
	
	/*
     * 1. sysout + Ctrl + Space �crit :System.out.println();
     * 2. toStr + Ctrl + Space nous propose toString();
     * 3. get + Ctrl + Space, et set + Ctrl + Space nous cr�e
     * getFoo() et setFoo()
     * 4. Dans "Source", "Generate Getters and Setters...", on peut cocher les attributs
     * pour lesquels on veut cr�er les getters et setters
     * 5. Alt+Shitf+R nous permet de renommer une classe ou un attribut
     * tout en renommant toutes ses occurences
     * 6. Ce raccourci permet de cr�er une variable interm�diaire
     * 7. On nous propose de cr�er une variable locale ou une variable static
     * 8. Cela nous ouvre la classe String de java
     * 9. On nous ouvre la classe Object de java, � l'endroit o� est d�clar�e toString()
     * 10. Eclipse cherche toutes les r�f�rences de Main.foo
     * 11. Cela nous permet de supprimer les imports non utilis�s et d'ajouter ceux manquants
     * 12. Cela nous permet de commenter la selection
     *
     *EXERCICE 2
     */
	
	public static void main(String[] args) {
        System.out.println("Hello Eclipse");
        
        Book book = new Book("Les Mis�rables", "Victor Hugo");
        Book book2 = new Book("Les Mis�rables IMAC");
        ArrayShoppingCartTest cart = new ArrayShoppingCartTest();
        FreeShoppingCart freeCart = new FreeShoppingCart();
        
        cart.add(book);
        cart.add(book2);
        System.out.println(cart.toString());
        System.out.println(cart.longestTitle());
        
        System.out.println("\nFree Cart \n\n");
        
        freeCart.add(book);
        freeCart.add(book2);
        //System.out.println(freeCart.toString());
        System.out.println(freeCart.longestTitle());
        System.out.println(freeCart.longestTitleIterator());
        System.out.println(freeCart.longestTitleFor());
    }
}
