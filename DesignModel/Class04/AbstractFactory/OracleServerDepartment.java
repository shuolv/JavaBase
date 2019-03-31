package DesignModel.Class04.AbstractFactory;

public class OracleServerDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("Oracle插入department");
	}

	@Override
	public Department get(int id) {
		// TODO Auto-generated method stub
		System.out.println("Oracle得到department");

		return null;
	}

}
