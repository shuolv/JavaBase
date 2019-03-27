package DesignModel.Class01.SimpleFactory;

public class Main {
	public static void main(String[] args) {
		Operation add = SimpleFactory.createOperation("+",3.1415926,1.123456);
		System.out.println(add.GetResult());
		Operation sub = SimpleFactory.createOperation("-",3.1415926,1.123456);
		System.out.println(sub.GetResult());
		Operation mul = SimpleFactory.createOperation("*",3.1415926,1.123456);
		System.out.println(mul.GetResult());
		Operation div = SimpleFactory.createOperation("/",3.1415926,1.123456);
		System.out.println(div.GetResult());
	}
}
