package com.cpmg.day5;

public class PalindromeCheck {
	public static void main(String args[]) {
		String a = "hello olleh";
		String b = "";
		int j = 0;
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
