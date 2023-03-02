package com.jdc.shw;

public class DDDTest {
public static void main(String[]args) {
	
}
}
interface One{
	default void doSomething() {
		
	}
}
interface Two extends One{
	@Override
	default void doSomething() {
		One.super.doSomething();
	}
}
interface Three extends One{
	@Override
	default void doSomething() {
		One.super.doSomething();
	}
}
