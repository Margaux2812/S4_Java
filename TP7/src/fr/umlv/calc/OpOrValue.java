package fr.umlv.calc;

import java.util.Scanner;

public class OpOrValue {
  public static final int OP_NONE = 0;
  public static final int OP_ADD = 1;
  public static final int OP_SUB = 2;
  
  private final int operator;
  private final int value;
  private final OpOrValue left;
  private final OpOrValue right;
  
  private OpOrValue(int operator, int value, OpOrValue left, OpOrValue right) {
    this.operator = operator;
    this.value = value;
    this.left = left;
    this.right = right;
  }
  /*On appelle ainsi d'abord le constructeur public ci-dessous, qui instanciera
   * seul les valeurs de operator, left et right*/
  public OpOrValue(int value) {
    this(OP_NONE, value, null, null);
  }
  
  /*Il faut que operator soit égal à 0(OP_NONE), 1 (OP_ADD)
   * ou 2(OP_SUB). On doit donc vérifier sa valeur avant de construire
   * avec le constructeur privé
   */
  public OpOrValue(int operator, OpOrValue left, OpOrValue right) throws NumberFormatException {
    // a bug lies here
	  this(operator, 0, left, right); 
	  if(!(operator == OP_NONE || operator == OP_ADD || operator == OP_SUB)) {
		  throw new NumberFormatException("Operator has not been correctly initialized");
	  }
  }
  
  public int eval() {
    switch(operator) {
    case OP_ADD:
      return left.eval() + right.eval();
    case OP_SUB:
      return left.eval() - right.eval();
    default: // case OP_NONE:
      return value;
    }
  }
  
  public static OpOrValue parse(Scanner scanner) {
	  String elt = scanner.next();
	  OpOrValue expression;
	  
	  switch(elt) {
	  	case ("+") : 
	        expression = new OpOrValue(OpOrValue.OP_ADD, parse(scanner), parse(scanner));
	        return expression;
	    case ("-") : 
	        expression = new OpOrValue(OpOrValue.OP_SUB, parse(scanner), parse(scanner));
	        return expression;
	    default :
	        expression = new OpOrValue(Integer.parseInt(elt));
	        return expression;
	  }
  }
@Override
public String toString() {
	if (operator != OP_NONE) {
		if (operator == OP_ADD)
			return left.toString() + " + " + right.toString();
		else
			return left.toString() + " - " + right.toString();
	} else {
		return (Integer.toString(value));
	}
}
  
  
}