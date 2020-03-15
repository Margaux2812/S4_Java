package fr.umlv.geom;

public class Ring extends Circle {
	
	private int rayon_interne;

	public Ring(Point p, int rayon) {
		super(p, rayon);
		// TODO Auto-generated constructor stub
	}
	
	public Ring(Point p, int rayon,int rayon_interne) throws Exception {
		this(p, rayon);
		
		if(rayon_interne > rayon) {
			throw new Exception("Le rayon interne doit être inférieur au rayon externe");
		}
		
		this.rayon_interne = rayon_interne;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + " rayon_interne=" + rayon_interne;
	}
	
	public boolean contains(Point p) {
		Circle inner = new Circle(getCenter(), rayon_interne);
		return ( (!inner.contains(p)) && super.contains(p));
	}
	
	public boolean contains(Point p, Ring... rings) {
		
		for(Circle ring : rings) {
			return ring.contains(p);
		}
		
		return false;
	}
	

}
