package co.fx.interfacex.impl;

public class Electricity {
	public double calculation(int units) {
		double amt =units * 4.76;
		return amt;
	}
	public void display(double amt) {
		System.out.println("Amount of Unit of power "+amt);
	}
}
