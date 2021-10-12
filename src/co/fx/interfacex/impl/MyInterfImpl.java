package co.fx.interfacex.impl;

import co.fx.interfacex.MyInterf3;

public class MyInterfImpl implements MyInterf3{
	@Override
	public void mesg() {
		int count=0;
		int number=2345;
		while(number!=0) {
			int remender=number%10;
			count=count+remender;
			number=number/10;
		}
		System.out.println(count);
	}

	@Override
	public void msg() {
		int num=7;
		boolean flag=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if(num<1) {
			flag=false;
		}
		if(!flag) {
			System.out.println("prime ");
		} else {
			System.out.println( "not prime");
		}
	}

	@Override
	public void msgd() {
		
		for(int i=1;i<10;i++) {
			int temp=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.println("prime "+i);
			}else {
				System.out.println("not prime "+i);
			}

		}
	}
	public static void main(String[] args) {
		MyInterfImpl obj1 = new MyInterfImpl();
		obj1.mesg();
		obj1.msg();
		obj1.msgd();
	}

}
