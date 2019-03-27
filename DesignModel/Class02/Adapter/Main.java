package DesignModel.Class02.Adapter;

public class Main {
	public static void main(String[] args) {
		Player b = new Forwards("巴蒂尔");
		b.Attack();
		
		Player m = new Guards("麦迪");
		m.Attack();
	
		Player y = new Translator("姚明");
		y.Attack();
		y.Defense();
	}
}
