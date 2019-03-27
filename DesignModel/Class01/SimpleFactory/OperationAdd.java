package DesignModel.Class01.SimpleFactory;

public class OperationAdd extends Operation {

	public OperationAdd(double a, double b) {
		this.numberA = a;
		this.numberB = b;
	}

	@Override
	public double GetResult() {
		double result = 0;
		result = numberA + numberB;
		return result;
	}

}
