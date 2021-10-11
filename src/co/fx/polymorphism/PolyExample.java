package co.fx.polymorphism;

public class PolyExample {
	/**
	 * @apiNote 
	 * polymorphism - If single entity show multiple behaviour it is called
	 * polymorphism.we can achive for reuseability. if single entity perform
	   different operation according to the requirement.
	   there are two type of the polymorphism.
	 * a.static polymorphism/compile time polymorphism
	 * early binding 
	 * b.Dynamic polymorphism/Runtime polymorphism/late binding
	 * A.--the process of overloading that is called compile time polymorphism
	 * Overloading--it is a process of the specifiying  multiple 
	 * method having name is same but different method argument,
	 * method type order having the one class or more class it is called
	 * method overloading 
	 * In method overloading the execution of method will be based on 
	 * method signature.*/
	public static void main(String[] args) {
		PolyExample polyExample = new PolyExample();
		polyExample.msg(1);
		polyExample.msg(2d);
		
	}
	public void msg(int a) {
		System.out.println("this is integer ");
	}
	public void msg(char c) {
		System.out.println("character message ");
	}
	public double msg(double d) {
		System.out.println("doble message");
		return 0;
		
	}
}
