package DesignModel.Class04.AbstractFactory;

public class Main {

	public static void main(String[] args) {
		Ifactory fc = new OracleServerFactory(); 
		IUser test = fc.CreateUser();
		test.GetUser(0);
		test.Insert(null);
		IDepartment dept = fc.CreateDepartment();
		dept.insert(null);
		dept.get(0);
	}

}
