package co.fx.classload;

public class Sample {
	static {
		System.out.println("Sample class static block");
	}
	{
		System.out.println("Sample class instance block");
	}
	Sample() {
		System.out.println("Sample constrctor ");
	}
}
