package DesignModel.Class01.SimpleFactory;

public class OperationMul extends Operation {

	public OperationMul(double a, double b) {
		this.numberA = a;
		this.numberB = b;
	}
	@Override
	public double GetResult() {
		double result = 0;
		result = numberA * numberB;
		return result;
	}

}
