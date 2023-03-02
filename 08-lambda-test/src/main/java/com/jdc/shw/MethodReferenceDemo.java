package com.jdc.shw;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		
		//using constructor ref
		Data d1=MethodRefTestTwo::new;
		d1.show(1);
		
		//using static method ref
		d1=MethodRefTestTwo::staticMethodTest;
		d1.show(2);
		
		MethodRefTestTwo mf=new MethodRefTestTwo(23);
		d1=mf::instanceMethodTest;
		d1.show(3);
	}

}
