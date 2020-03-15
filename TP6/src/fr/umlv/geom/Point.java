package fr.umlv.geom;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p) {
		this.x = p.getX();
		this.y = p.getY();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "(" + x + ',' + y + ')';
	}
	
	public void translate(int dx, int dy) {
	  x += dx;
	  y += dy;
	}
	
	/*EXERCICE 1
	 * 1. Point ne compile pas car x et y sont déclarés comme final, 
	 * et ne peuvent donc pas être modifiés une fois qu'ils ont été
	 * instanciés.
	 */
}