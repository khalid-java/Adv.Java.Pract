package co.fx.interfacex.impl;

import co.fx.interfacex.Bill;

public class MobileBill implements Bill{

	@Override
	public double calcubill(int units) {
		double amt=units*2.24;
		return amt;
	}

	@Override
	public void printBill(double amt) {
		System.out.println("Amount of Mobile Bill "+amt);
	}

}
