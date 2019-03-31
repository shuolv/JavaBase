package DesignModel.Class03.Factory;

public class OperationSub extends Operation {
	@Override
	public double GetResult() {
		double result = 0;
		result = numberA - numberB;
		return result;
	}

}
