package co.fx.polymorphism;
/** Look the program execution */
class One {
	 void show() {
		System.out.println(" One class show method ");
		this.show2();
	}
	 void show2() {
		System.out.println("ONE CLASS SHOW2 METHOD ");
	}
}
class Two extends One{
	 void show2() {
		System.out.println("Two class show2 method ");
	}
}
public class OverrideExample {

	public static void main(String[] args) {
		One c=new Two();
		c.show();
	}
}
