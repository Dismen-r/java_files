package com.cpmg.StringAssignment;
//write a program to Count number of words in a given string
public class NumberOfWords {
	public static void main(String args[]) {
		String a = "hello world ggggg java";
		int j = 1;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				j = j + 1;
			}

		}
		System.out.println(j);
	}
}
