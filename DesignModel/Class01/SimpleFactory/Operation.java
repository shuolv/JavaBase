package DesignModel.Class01.SimpleFactory;

public abstract class Operation {
	protected double numberA=0;
	protected double numberB=0;
	
	public Operation() {
		super();
	}

	public Operation(double numberA, double numberB) {
		this.numberA = numberA;
		this.numberB = numberB;
	}

	public abstract double GetResult();

}