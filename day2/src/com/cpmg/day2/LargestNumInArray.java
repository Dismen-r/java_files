package com.cpmg.day2;
import java.util.Scanner;
public class LargestNumInArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		int t=0;
		for(int i=0;i<10;i++)
			a[i]=s.nextInt();
		for(int i=0;i<10;i++)
		{
			if(a[i]>t)
			{
				t=a[i];
			}
		}
		System.out.println(t);
		
	}
}
