package fr.umlv.calc;

public class Main {
	public static void main(String[] args) {
	    OpOrValue expression = new OpOrValue(OpOrValue.OP_ADD,
	        new OpOrValue(2),
	        new OpOrValue(3)
	        );

	    System.out.println(expression);
	    System.out.println(expression.eval());
	  }
}
