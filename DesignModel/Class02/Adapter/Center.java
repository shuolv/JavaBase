package DesignModel.Class02.Adapter;

public class Center extends Player {

	public Center(String name) {
		super(name);
	}
	@Override
	public void Attack() {
		System.out.println("中锋  " + this.name + " 进攻");
	}

	@Override
	public void Defense() {
		System.out.println("中锋 " + this.name + " 防守");
	}

}
