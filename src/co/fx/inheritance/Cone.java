package co.fx.inheritance;

public class Cone {
	public void oneMethod() {
		int []arr= {1,2,3,4,5,7};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
