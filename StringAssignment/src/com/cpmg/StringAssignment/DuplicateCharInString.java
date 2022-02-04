package com.cpmg.StringAssignment;
//write a program to print duplicate characters from the string
import java.util.Scanner;
public class DuplicateCharInString {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		char d[]= {'0','0','0','0','0'};
		for(int i=0;i<5;i++) {
			 d[i] = s.next().charAt(0);
		}
		
		for (int i =  0; i < 5; i++) {
			for (int j =  i+1; j < 5; j++) {
				if(d[i]==d[j]) {
					System.out.println(d[i]);
				}
			}
		}
		s.close();
	}
}
