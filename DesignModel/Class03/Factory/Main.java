package DesignModel.Class03.Factory;

public class Main { 
	public static void main(String[] args) {
		FactoryInterface add = new addFactory();
		Operation add1 = add.getOperation();
		add1.numberA = 3.14;
		add1.numberB = 5.21;
		System.out.println(add1.GetResult());
		
	}
}
