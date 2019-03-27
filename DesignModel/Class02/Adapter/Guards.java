package DesignModel.Class02.Adapter;

public class Guards extends Player {

	public Guards(String name) {
		super(name);
	}
	@Override
	public void Attack() {
		System.out.println("后文  " + this.name + " 进攻");
	}

	@Override
	public void Defense() {
		System.out.println("后卫 " + this.name + " 防守");
	}

}
