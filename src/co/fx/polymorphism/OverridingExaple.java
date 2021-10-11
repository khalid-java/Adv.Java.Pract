package co.fx.polymorphism;
/**
 * B. Dynamic polymorpism/latebinding/ Overriding process
 * The Process of the two or more method having method name is same
 * argument is same,order of the type is same but two class
 * between IS-A relationship.
 * means one class is parent class and other class is the 
 * child class that process is called is overriding
 * method overriding can implement only instance method
 * method overriding the method execution based on the object created */
class Parent {
	public void pMethod(int x) {
		int reverse=0;
		while(x!=0) {
			int rem=x%10;
			reverse=reverse*10+rem;
			x=x/10;
		}
		System.out.println(reverse);
	}
}
class Child extends Parent{
	public void PMethod(int x) {
		int square=0;
		for(int i=0;i<5;i++) {
			if(i==x) {
			square=square+i*i;	
			}
		}
		System.out.println(square);
	}
}
public class OverridingExaple {
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		parent.pMethod(445);
		
		Child child = new Child();
		child.PMethod(3);
		child.pMethod(23);
		
		Parent both=new Child();
		both.pMethod(56);
	}
}
