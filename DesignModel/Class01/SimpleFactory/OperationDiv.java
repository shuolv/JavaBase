package DesignModel.Class01.SimpleFactory;

public class OperationDiv extends Operation {

	public OperationDiv(double a, double b) {
		this.numberA = a;
		this.numberB = b;
	}
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
