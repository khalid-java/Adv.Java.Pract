package co.fx.abstractImp;

import co.fx.interfacex.Bill;

public abstract class AbstractBill implements Bill {
	@Override
	public void printBill(double amt) {
		System.out.println("Bill :-" + amt);
	}
	
}
