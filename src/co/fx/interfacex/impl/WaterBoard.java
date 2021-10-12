package co.fx.interfacex.impl;

public class WaterBoard {
	public double calculation(int units) {
		double amt=units* 2.50;
		return amt;
	}
	public void print(double amt) {
		System.out.println("Amount of waterbill "+amt);
	}

}
