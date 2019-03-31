package DesignModel.Class04.AbstractFactory;

public class MysqlServerDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("Mysql插入department");
	}

	@Override
	public Department get(int id) {
		// TODO Auto-generated method stub
		System.out.println("Mysql得到department");
		return null;
	}

}
