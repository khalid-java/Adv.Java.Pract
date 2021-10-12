package co.fx.abstractImp;

public class MobileBill extends AbstractBill {

	@Override
	public double calcubill(int units) {
		double amt=2.2*units;
		return amt;
	}

}
