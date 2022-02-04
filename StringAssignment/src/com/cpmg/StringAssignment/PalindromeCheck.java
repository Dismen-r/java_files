package com.cpmg.StringAssignment;
//write a program to check if a string is palindrome
public class PalindromeCheck {
	public static void main(String args[]) {
		String a = "hello olleh";
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			b = a.charAt(i) + b;
		}
		if (a.equals(b)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
