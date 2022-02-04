package com.cpmg.StringAssignment;
//write a program to print duplicate characters from the string
import java.util.Scanner;
public class DuplicateCharInString {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		char[] d = a.toCharArray();
		for (int i =  0; i < a.length(); i++) {
			for (int j =  i+1; j < a.length(); j++) {
				if(d[i]==d[j]) {
					System.out.println(d[i]);
				}
			}	
		}
		s.close();
	}
}
