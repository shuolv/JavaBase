package DesignModel.Class03.Factory;

public class SubFactory implements FactoryInterface {

	@Override
	public Operation getOperation() {
		return new OperationAdd();
	}

}
