package DesignModel.Class03.Factory;

public class OperationMul extends Operation {

	@Override
	public double GetResult() {
		double result = 0;
		result = numberA * numberB;
		return result;
	}

}
