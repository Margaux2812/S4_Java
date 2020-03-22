package fr.umlv.calc;

public class Add extends Operation{
	
	public Add(Value left, Value right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public String getOperation() {
		return "+";
	}
	
	public int eval() {
		return getLeft().eval()+getRight().eval();
	}
}
