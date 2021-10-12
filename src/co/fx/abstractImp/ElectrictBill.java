package co.fx.abstractImp;

public class ElectrictBill extends AbstractBill{

	@Override
	public double calcubill(int units) {
		double amt=units*6.75;
		return amt;
	}

}
