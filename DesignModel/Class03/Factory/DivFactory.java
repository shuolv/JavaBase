package DesignModel.Class03.Factory;

public class DivFactory implements FactoryInterface {

	@Override
	public Operation getOperation() {
		// TODO Auto-generated method stub
		return new OperationDiv();
	}

}
