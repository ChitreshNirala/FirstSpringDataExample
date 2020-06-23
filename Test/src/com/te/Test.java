package com.te;

class A{
	public static void m1() {
		System.out.println("A.M1");
	}
}

class B extends A{
	public static void m1() {
		System.out.println("B.M1");
	}
}

public class Test {

	public static void main(String[] args) {
		A obj= new B();
		obj.m1();
	}

}
