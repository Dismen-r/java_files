package com.cpmg.day5;

public class CharMethods {
	public static void main(String args[]) {
		char a = 'A';
		//toLowerCase()
		char d = Character.toLowerCase(a);
		System.out.println(d);
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toUpperCase(97));
		System.out.println(Character.toUpperCase('*'));
		char b = 'b';
		//toUpperCase()
		char c = Character.toUpperCase(b);
		System.out.println(c);
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toLowerCase(65));
		System.out.println(Character.toLowerCase('*'));
	}
}
