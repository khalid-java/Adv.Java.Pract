package co.fx.abstractImp;
/**
 * Abstract Class --
 * if a class contains some abstract method then the class should be 
 * called as abstract class 
 * an abstract class can be combination of the abstract method and 
 * non-abstract an abstract class can contain zero or more abstract method
 * an abstract class cannot be instantiated we cannot create object 
 * we cannot access the member of the class In order to access the member
 * of the abstract class we need to inherit the abstract class into another
 * class and override all the abstract method available in abstract class*/

abstract class OneAbs {
	public void display() {
		System.out.println("Print OneAbs display");
	}
	abstract void disp();
}
class TwoAbs extends OneAbs{

	@Override
	void disp() {
		System.out.println("Child implementation");
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		TwoAbs twoAbs = new TwoAbs();
		twoAbs.disp();
		twoAbs.display();
		
	}
}
