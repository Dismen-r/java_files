package com.cpmg.day5;

public class NumberOfWords {
	public static void main(String args[]) {
		String a = "hello world ggggg";
		int j = 1;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				j = j + 1;
			}

		}
		System.out.println(j);
	}
}
