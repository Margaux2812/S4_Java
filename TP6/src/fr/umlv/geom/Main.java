package fr.umlv.geom;

public class Main {
	public static void main(String[] args) throws Exception {
	
		/*var point = new Point(1, 2);
       var circle = new Circle(point, 1);

       var circle2 = new Circle(point, 2);
       circle2.translate(1, 1);

       System.out.println(circle + " " + circle2);
       
       circle.getCenter().translate(1,1);
       System.out.println(circle);
       
       System.out.println(circle.contains(new Point(2, 2)));
       
       try {
			var ring = new Ring(point, 2, 1);
		       System.out.println(ring);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       */
       
       var point = new Point(0, 0);
       var circle = new Circle(point, 2);
       System.out.println(circle);
       var ring = new Ring(point, 2, 1);
       System.out.println(ring);
       
       System.out.println(circle.contains(new Point(0, 1)));
       System.out.println(ring.contains(new Point(0, 1)));
       
	}
	
	/*1. L'heritage est judicieux lorsque les classes
	 * partagent des attributs et méthodes similaires. On évitera
	 * ainsi une recopie
	 * 4. Soit on met throw exception pour le main,
	 * soit on met un try catch autour de la construction du Ring
	 * 3. On peut en conclure que l'héritage permet d'éviter unr recopie
	 * de code
	 */
}
