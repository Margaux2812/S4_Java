import java.util.ArrayList;
import java.util.Iterator;

public class FreeShoppingCart {
	public ArrayList<Book> books;

	public FreeShoppingCart() {
		super();
		this.books = new ArrayList<Book>();
	}
	
	public void add(Book book) {
		books.add(book);
	}
	
	public Book longestTitle() {
		if(this.books.size() > 1) {
			Book longestTitle = this.books.get(0);
			for(int i=1; i<this.books.size(); i++) {
				if(this.books.get(i).getTitle().length() > longestTitle.getTitle().length()) {
					longestTitle = this.books.get(i);
				}
			}
			
			return longestTitle;
		}else {
			return null;
		}
	}
	
	public Book longestTitleIterator() {
		if(this.books.size() > 1) {
			Iterator<Book> iter = books.iterator();
			Book longestTitle = iter.next();
			
			while(iter.hasNext()) {
				Book tmp = iter.next();
				if(tmp.getTitle().length() > longestTitle.getTitle().length()) {
					longestTitle = tmp;
				}
			}
			
			return longestTitle;
		}else {
			return null;
		}
	}
	
	public Book longestTitleFor() {
		if(this.books.size() > 1) {
			Book longestTitle = this.books.get(0);
			for(Book book : books) {
				if(book.getTitle().length() > longestTitle.getTitle().length()) {
					longestTitle = book;
				}
			}
			
			return longestTitle;
		}else {
			return null;
		}
	}
	
	public void removeFirstOccurence() {
		if(this.books.size() > 1) {
			books.remove(0);
		}
	}

	
	/* Exercice 3
	 * 1. Je n'ai pas eu de Warning
	 * 7. Si on veut modifier une instance, iterator sera plus adéquate
	 */
	
	
}
