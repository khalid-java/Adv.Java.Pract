package co.fx.interfacex;
/**
 * Interface --
 * An interface is a collection of only abstract methods
 * The variable of an interface are declared as public static final whether
 * we specify or not the method of the interface all public and abstract
 * whether specify or not specify
 * interface is 100% absract and there fore interface cannot be instantiated
 * if a class implementing  an interface then class must provide implementation to all
 * abstract method available in the interface*/
interface Example {
	public void display();
}
public class InterfaceExample  implements Example{

	public static void main(String[] args) {
		InterfaceExample interfaceExample = new InterfaceExample();
		interfaceExample.display();
	}

	@Override
	public void display() {
		System.out.println("print");
	}

}
