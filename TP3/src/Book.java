import java.util.Objects;

public class Book {
	private final String title;
	private final String author;
	private boolean onlyTitle;
	
	/* EXERCICE 1
	 * 
	 * Question 2: Sans instanciation, on affiche null et null
	 * 
	 * Question 3: il faut des accesseurs car les champs sont priv�s
	 * 
	 * Question 4: on a private : toujours visible � l'int�rieur de son paquetage seulement
	 * 		protected :  Un champ prot�g� d'une classe A est toujours visible � l'int�rieur de son paquetage. A l'ext�rieur de son paquetage, un champ prot�g� est h�rit� par une sous-classe B mais non visible au travers d'une instance de A ou de B
	 * 		public : visible de partout
	 * 		par defaut : qui est alors visible seulement dans son package
	 * Il faut des accesseurs afin que des conditions soient v�rifi�es avant de modifier les attributs d'un objet
	 *
	 *Question 5: Un accesseur permet d'acc�der � un attribut de l'objet.
	 *On fait donc l'accesseur de title et author
	 *
	 *Question 6: On met final, ainsi un livre est immutable
	 *
	 *Question 7: Il faut alors dans le main donner des attributs lorsqu'on cr�e un livre
	 *
	 *Question 8: Il y a confusion. Il faut alors utiliser "this" afin de pr�ciser de quelle variable on parle
	 *
	 *Question 10: le compilateur prend le constructeur avec seulement le titre s'il ne recoit q'un string en param�tre
	 *
	 */
	
	public Book(String title, String author) {
		title = Objects.requireNonNull(title);
		author = Objects.requireNonNull(author);
		
		this.title = title;
		this.author = author;
		onlyTitle = false;
	}

	public Book(String title) {
		/*this.title = title;
		this.author = "<no author>";*/
		
		this(title, "<no author>");
		onlyTitle = true;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public boolean equals(Book other) {
		if(author.contentEquals(other.author) && title.equals(other.title)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	 /*EXERCICE 2
	 *
	 *Question 1: Le code ci-dessus affiche true puis false, car le fait d'appeler new, cr�e un nouvel objet et donc une nouvelle r�f�rence diff�rente
	 *Or == compare les r�f�rences, donc b1 et b3 sont deux objets diff�rents
	 *
	 *Question 3: Cette m�thode renvoie la premiere occurence de l'objet recherch� dans le tableau, et -1 s'il n'existe pas
	 *
	 *Question 4: Ici encore, indexOf cherche la r�f�rence et croit donc que b3 n'existe pas puisqu'il n'a pas la m�me r�f�rence
	 *
	 *Question 5 : Java a une librairie qui permet de comparer deux objets du m�me type, mais celle-ci va juste comparer les r�f�rences
	 *	 *
	 *Question 7 : @Override permet d'appeler la seconde m�thode plutot que la premiere (celle par d�faut de Java)
	 *
	 *Question 9 : On a une NullPointerException, car les valeurs sont nulles
	 *Il vaut mieux donner d'autres valeurs ou utiliser assert
	 *
	 *Question 11: cette methode permet de v�rifier que la r�f�rence � un objet n'est pas nulle
	 */
	
	@Override
	public boolean equals(Object other){
		return (other instanceof Book &&
				title.equals(((Book) other).getTitle()) &&
				author.equals(((Book) other).getAuthor()));
		
	}
	
	/*EXERCICE 3
	 * 
	 * Question 2 : Nous n'avons pas besoin d'override alors on ne va pas l'utiliser
	 */
	
	public String toString() {
		return (onlyTitle ? title : title + " by " + author);
	}
	
	
}
