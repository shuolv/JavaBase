package DesignModel.Class01.SimpleFactory;

public class SimpleFactory {
	public static Operation createOperation(String operation,double a,double b) {
		Operation oper = null;
		switch (operation) {
			case "+":
				oper = new OperationAdd(a,b);
				break;
			case "-":
				oper = new OperationSub(a,b);
				break;
			case "*":
				oper = new OperationMul(a,b);
				break;
			case "/":
				oper = new OperationDiv(a,b);
				break;
		}
		return oper;
	}
}
