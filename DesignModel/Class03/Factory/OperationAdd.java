package DesignModel.Class03.Factory;

public class OperationAdd extends Operation {


	@Override
	public double GetResult() {
		double result = 0;
		result = numberA + numberB;
		return result;
	}

}
