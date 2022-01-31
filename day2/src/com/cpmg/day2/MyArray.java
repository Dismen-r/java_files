package com.cpmg.day2;
import java.util.Scanner;
public class MyArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//integer Array
		int a[]=new int[10];
		for(int i=0;i<4;i++)
			a[i]=s.nextInt();
		for(int i=0;i<4;i++)
			System.out.println(a[i]);
		
		//String Array
		String b[]=new String[10];
		for(int i=0;i<4;i++)
			b[i]=s.next();
		for(int i=0;i<4;i++)
			System.out.println(b[i]);
	}
}
