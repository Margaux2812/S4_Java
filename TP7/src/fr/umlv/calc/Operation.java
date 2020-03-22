package fr.umlv.calc;

public abstract class Operation {
	private final Value left;
	private final Value right;
	
	public Operation(Value left, Value right) {
		this.left = left;
		this.right = right;
	}
	
	public Value getLeft() {
		return left;
	}
	
	public Value getRight() {
		return right;
	}
	
	public abstract String getOperation();
	
	public abstract int eval();
}
