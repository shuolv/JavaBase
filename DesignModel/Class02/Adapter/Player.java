package DesignModel.Class02.Adapter;

public abstract class Player {
	protected String name;
	public Player() {};
	public Player(String name) {
		this.name = name;
	}
	public abstract void Attack();
	public abstract void Defense();
}
