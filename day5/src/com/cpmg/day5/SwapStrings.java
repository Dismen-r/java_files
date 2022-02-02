package com.cpmg.day5;

//without third variable 
public class SwapStrings {
	public static void main(String args[]) {
		String a = "hello ";
		String b = "world";
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a=a.substring(b.length());
		System.out.println(b + a);

	}
}
