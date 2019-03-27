package DesignModel.Class02.Adapter;

public class Translator extends Player {
	private ForeignCenter wjzf = new ForeignCenter();
	public Translator(String name) {
		wjzf.setName(name);
	}
	@Override
	public void Attack() {
		wjzf.进攻();
	}

	@Override
	public void Defense() {
		wjzf.防守();
	}

}
