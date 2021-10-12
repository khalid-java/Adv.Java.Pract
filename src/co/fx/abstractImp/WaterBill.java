package co.fx.abstractImp;

public class WaterBill extends AbstractBill{

	@Override
	public double calcubill(int units) {
		double amt=units*1.30;
		return amt;
	}

}
