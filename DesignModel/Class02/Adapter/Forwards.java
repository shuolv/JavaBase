package DesignModel.Class02.Adapter;

public class Forwards extends Player {
	public Forwards(String name) {
		super(name);
	}
	@Override
	public void Attack() {
		System.out.println("前锋  " + this.name + " 进攻");
	}

	@Override
	public void Defense() {
		System.out.println("前锋 " + this.name + " 防守");
	}

}
