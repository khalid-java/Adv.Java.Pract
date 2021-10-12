package co.fx.interfacex.impl;

import co.fx.interfacex.Bill;

public class WaterBill implements Bill {

	@Override
	public double calcubill(int units) {
		double amt=units*5.75;
		return amt;
	}

	@Override
	public void printBill(double amt) {
		System.out.println("Amount of Water Bill :-"+amt);
	}

}
