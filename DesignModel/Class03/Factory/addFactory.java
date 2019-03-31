package DesignModel.Class03.Factory;

public class addFactory implements FactoryInterface {

	@Override
	public Operation getOperation() {
		return new OperationAdd();
	}

}
