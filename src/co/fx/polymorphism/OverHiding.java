package co.fx.polymorphism;

import java.util.Scanner;

/**
 * Method Overhiding--
 * it is a process of the specifing two or more method having method 
 * name is same and argument is same and method order type is same
 * in two different class and both class have IS-A relationship
 * and both method is declerad as the static keyword
 * that is called. method overhiding.
 * method overhiding execution of the method is based on the reference
 * that is declered. 
 *  */
class ParentHide {
	public static void display()
	{
	String str="Hello";
	long count = str.chars().sorted().count();
	System.out.println(count);
	}
 }
class ChildHide extends Parent {
	public static void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Lucky no to get prize");
		int num = sc.nextInt();
		if(num==121) {
			System.out.println("win $100");
		}else if(num==203) {
			System.out.println("win $400");
		} else if(num==500) {
			System.out.println("win $200");
		} else if(num==402) {
			System.out.println("win $30");
		} else if(num==900) {
			System.out.println("get book only");
		} else if(num==800) {
			System.out.println("send you  $300");
		} else {
			System.out.println("Try again");
		}
		sc.close();
	}
}
public class OverHiding {

	public static void main(String[] args) {
		ParentHide pt = new ParentHide();
		pt.display();
		ParentHide.display();
		
		ChildHide cc = new ChildHide();
		cc.display();
//		ChildHide.display();
		
//		ParentHide pc = new ChildHide();
//		pc.display();
	}

}
