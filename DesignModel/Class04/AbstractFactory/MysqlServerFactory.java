package DesignModel.Class04.AbstractFactory;

public class MysqlServerFactory implements Ifactory {

	@Override
	public IUser CreateUser() {
		return new MysqlServerUser();
	}

	@Override
	public IDepartment CreateDepartment() {
		// TODO Auto-generated method stub
		return new MysqlServerDepartment();
	}

}
