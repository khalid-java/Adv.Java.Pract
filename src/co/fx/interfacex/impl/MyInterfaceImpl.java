package co.fx.interfacex.impl;

import co.fx.interfacex.FirstMyInter;
import co.fx.interfacex.SecondInterf;

public class MyInterfaceImpl implements FirstMyInter,SecondInterf  {

	@Override
	public void todo() {
		String str="khalid";
		String reverse="";
		for(int i=str.length()-1;i>=0;i-- ) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}

	@Override
	public void display() {
		String str="khalid hussain";
		String[] words = str.split(" ");
		String reverse=" ";
		for(String word:words) {
			for(int i=word.length()-1;i>=0;i--) {
				reverse=reverse + word.charAt(i);
			}
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		MyInterfaceImpl obj = new MyInterfaceImpl();
		obj.todo();
		obj.display();
	}

}
