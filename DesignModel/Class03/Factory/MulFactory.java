package DesignModel.Class03.Factory;

public class MulFactory implements FactoryInterface {

	@Override
	public Operation getOperation() {
		// TODO Auto-generated method stub
		return new OperationMul();
	}

}
