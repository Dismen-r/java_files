package com.cpmg.day2;
import java.util.Scanner;
public class ConcatinateTwoArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		int b[]=new int[10];
		int c[]=new int[10];
		int t=0;
		for(int i=0;i<5;i++)
			a[i]=s.nextInt();
		for(int i=0;i<5;i++)
			b[i]=s.nextInt();
		for(int i=0;i<5;i++)
		{
			c[i]=a[i];
			t++;
		}
		for(int i=0;i<5;i++)
		{
			c[t]=b[i];
			t++;
		}

		for(int i=0;i<10;i++)
		{
			System.out.println(c[i]);
		}
		s.close();
	}
		
}
