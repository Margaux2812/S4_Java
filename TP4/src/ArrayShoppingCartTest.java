import java.util.Arrays;

public class ArrayShoppingCartTest {

	public static int maxBook = 10;
	public Book[] books;

	public ArrayShoppingCartTest() {
		super();
		this.books = new Book[0];
	}
	
	public void add(Book book) {
		if(books.length < maxBook) {
			books = Arrays.copyOf(books, books.length+1);
			books[books.length-1] = book;
		}else {
			System.out.println("Shopping Cart full");
		}
	}
	
	public String displayBooks() {
		String books = "";
		for(int i=0; i<this.books.length; i++) {
			books += this.books[i].toString()+"\n";
		}
		return books;
	}
	
	public String toString() {
		return "**************\n"
				+ "Vous avez " + books.length + " livre(s)\n"
				+ "**************\n"
				+ displayBooks();
	}
	
	public Book longestTitle() {
		if(this.books.length > 1) {
			Book longestTitle = this.books[0];
			for(int i=1; i<this.books.length; i++) {
				if(this.books[i].getTitle().length() > longestTitle.getTitle().length()) {
					longestTitle = this.books[i];
				}
			}
			
			return longestTitle;
		}else {
			return null;
		}
	}
	
	/* Exercice 2
	 * 1. Il est intéressant de garder le nombre maximum sous un static int
	 * car il ne dépend pas de l'instance de la classe
	 * 2. On a une ArrayIndexOutOfBoundsException, on doit modifier la taille du tableau
	 *
	 */
}
