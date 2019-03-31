package DesignModel.Class04.AbstractFactory;


public class OracleServerFactory implements Ifactory {

	@Override
	public IUser CreateUser() {
		return new OracleServerUser();
	}

	@Override
	public IDepartment CreateDepartment() {
		// TODO Auto-generated method stub
		return new OracleServerDepartment();
	}
	
	

}
