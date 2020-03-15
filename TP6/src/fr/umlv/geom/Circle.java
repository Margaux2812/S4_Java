package fr.umlv.geom;

public class Circle {
	private Point center;
	private int rayon;
	
	public Circle(Point p, int rayon) {
		super();
		this.center = new Point(p);
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Centre=" + center + ", rayon=" + rayon + ", surface=" + this.surface();
	}
	
	public void translate(int dx, int dy) {
		this.center.translate(dx, dy);
	}
	
	public Point getCenter() {
       return center;
     }
	
	public int getRayon() {
		return rayon;
	}
	
	public double surface() {
		return Math.PI*rayon*rayon;
	}
	
	public boolean contains(Point p) {
		var distance = Math.sqrt( Math.pow((p.getX()-center.getX()), 2) + Math.pow((p.getY()-center.getY()), 2));
		
		if(distance <= rayon) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean contains(Point p, Circle... circles) {
		
		for(Circle circle : circles) {
			return circle.contains(p);
		}
		
		return false;
	}
	
	/*2. Il faut que les deux champs soient privés
	 * 6. Les deux points sont translatés
	 * Il faut qu'on ajoute un constructeur par copie
	 * afin que les deux points n'aient pas la meme réference
	 * 7. Le centre ici ne sera pas translaté. La variable p2
	 * est un nouveau point et sera donc translaté, sans tenir
	 * compte du fait qu'un point identique est le centre d'un cercle
	 * On doit translater le centre du cercle directement
	 * 10. Cela signifie qu'aucun cercle ne peut etre passé en argument,
	 * tout comme un array de cercles ou plusieurs cercles peuvent l'être
	 * également
	 */
}
