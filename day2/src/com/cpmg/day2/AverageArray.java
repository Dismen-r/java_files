package com.cpmg.day2;
import java.util.Scanner;
public class AverageArray {public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a[]=new int[10];
	float t=0f;
	for(int i=0;i<10;i++)
		a[i]=s.nextInt();
	for(int i=0;i<10;i++)
	{
		t+=a[i];
	}
	System.out.println(t/10);
	s.close();
}
}
