package co.fx.inheritance;
/**
 * Inheritance- It is process of acquring the members one class to another 
 * class is called inheritance.using inheritance we can achive reusability
 * and reduce the code and reduce the development time
 * The concept of the inheritance will be represent IS-A Relationship.
 * in java two type of the inheritance.
 * a.Single level inheritance.
 * b. Multi Level inheritance.
 * */
public class Ctwo extends Cone{
	public void twoMethod() {
		String str="khalid";
		char[] charArray = str.toCharArray();
		for(char x :charArray) {
			if(x=='m' ) {
				String fist = str.replaceFirst("d","t");
				System.out.println(fist);
				break;
			}else {
				System.out.println(str.compareTo(str));
				System.out.println(str.equals(str));
			}
		}
		
	}
	public static void main(String[] args) {
		Ctwo ctwo = new Ctwo();
		ctwo.oneMethod();
		ctwo.twoMethod();
		
		Cone cone = new Cone();
		cone.oneMethod();
//		cone.twoMethod();
		
		Cone tt=new Ctwo();
		tt.oneMethod();
		((Ctwo) tt).twoMethod();
		
		
	}
}
