package com.cpmg.day10;

interface TestInterface {
	abstract public void test();

	default public void show() {
		System.out.println("Default method show");
	}

	default public void print() {
		System.out.println("Default method print");
	}
}

class TestClass implements TestInterface {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.err.println("abstract method");

	}

}


public class MyMethod {
	public static void main(String args[]) {
		TestClass tc = new TestClass();
		tc.test();
		tc.print();
		tc.show();
		TestInterface ti = new TestInterface() {
			public void test() {
				// TODO Auto-generated method stub
				System.err.println("class");

			}
		};
		ti.test();
		ti.print();
		ti.show();
	}
}
