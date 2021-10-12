package co.fx.interfacex.impl;

import co.fx.abstractImp.ElectrictBill;
import co.fx.abstractImp.MobileBill;
import co.fx.interfacex.Bill;

public class ESeva {

	public static void main(String[] args) {
		
		Bill b;
		b=new ElectrictBill();
		double amt = b.calcubill(200);
		b.printBill(amt);
		
		b=new MobileBill();
		double amt1 = b.calcubill(300);
		b.printBill(amt1);
		
		b=new WaterBill();
		double amt2 = b.calcubill(200);
		b.printBill(amt2);
		
	}

}
