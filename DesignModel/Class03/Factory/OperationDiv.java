package DesignModel.Class03.Factory;

public class OperationDiv extends Operation {

	@Override
	public double GetResult() {
		double result = 0;
		if(numberB == 0) {
			System.out.println("除数不能为零");
			return 0;
		}
		result = numberA/numberB;
		return result;
	}

}
