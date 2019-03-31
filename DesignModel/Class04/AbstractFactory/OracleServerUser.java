package DesignModel.Class04.AbstractFactory;

public class OracleServerUser implements IUser {

	@Override
	public void Insert(User user) {
		System.out.println("在Oracle中插入一条User信息");
	}

	@Override
	public User GetUser(int id) {
		System.out.println("在Oracle中得到根据ID得到一条User信息");
		return null;
	}

}
