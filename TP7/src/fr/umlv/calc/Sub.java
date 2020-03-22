package fr.umlv.calc;

public class Sub extends Operation{

	public Sub(Value left, Value right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}
	
	public String getOperation() {
		return "-";
	}
	
	public int eval() {
		return getLeft().eval()-getRight().eval();
	}

}
