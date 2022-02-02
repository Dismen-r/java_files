package com.cpmg.day5;

import java.util.Scanner;

public class DuplicateCharInString {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		char[] d = a.toCharArray();
		for (int i = a.length() - 1; i >= 0; i--) {
			if (a.contains(Character.toString(d[i])))
			System.out.println(i);
		}
		s.close();
	}
}
