package co.fx.interfacex.impl;

import co.fx.interfacex.Bill;

public class ElectricBill implements Bill{

	@Override
	public double calcubill(int units) {
		double amt=units*6.95;
		return amt;
	}

	@Override
	public void printBill(double amt) {
		System.out.println("Amount of Electric Bill "+amt);
	}

}
