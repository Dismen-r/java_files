package com.cpmg.StringAssignment;

import java.util.Scanner;

//write a program to Count number of words in a given string
public class NumberOfWords {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String a =s.next();
		int j = 1;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				j = j + 1;
			}

		}
		System.out.println(j);
	}
}
