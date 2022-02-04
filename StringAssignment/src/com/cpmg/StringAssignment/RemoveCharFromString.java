package com.cpmg.StringAssignment;

import java.util.Scanner;

//write a program to remove given characters from the given string
public class RemoveCharFromString {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = "";

		char c = s.next().charAt(0);
		int j = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == c) {
				b += a.substring(j, i);
				j = i + 1;
			}
			if (i == a.length() - 1) {
				b += a.substring(j, i+1);

			}

		}
		System.out.println(b);
	}

}
