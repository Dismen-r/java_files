package com.cpmg.day9;

import java.util.*;

//lambda expression to combine two string
//lambda take a string array and return string array start with A
//lambda to print series of 1 to 100
//Lamdba for convert Char to Number(ASCI)
//Lamdba for FInd the max number;
//Lamdba for Min Value
//Lamdba for Sum of Value
//Lamdba for FInd the Avg of Number
interface Combine {
	public String Comb(String a, String b);
}

interface StartWithA {
	public String[] StartA(String[] a);

}

interface Series {
	public int[] Sers();
}

interface CharToInt {
	public int CharInt(char a);
}

interface MaxNum {
	public int Max(int a, int b);
}

interface MinNum {

	public int Min(int a, int b);
}

interface Sum {
	public int add(int a, int b);
}

interface Avg {
	public int average(int[] a);
}

public class LambdaExample {
	public static void main(String args[]) {
		int i1 = 5, i2 = 10;
		String s1 = "Hello ", s2 = "world";
		int[] a1 = { 1, 2, 3, 4, 5 };
		char f = 'A';
		String[] s3 = { s1, s2, "Dis", "Abc", "hhh", "Adf" };
		Combine c = (a, b) -> a + b;
		StartWithA SA = a -> {
			String[] sa = new String[a.length];
			int j = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i].charAt(0) == 'A') {
					sa[j] = a[i];
					j++;
				}

			}
			String[] sa1 = new String[j + 1];
			for (int i = 0; i < j + 1; i++)
				sa1[i] = sa[i];
			return sa1;
		};
		Series Se = () -> {
			int[] a = new int[100];
			for (int i = 0; i < 100; i++)
				a[i] = i;
			return a;

		};
		CharToInt CI = a -> a;
		MaxNum Ma = (a, b) -> Math.max(a, b);
		MinNum Mi = (a, b) -> Math.min(a, b);
		Sum Summ = (a, b) -> Math.addExact(a, b);
		Avg avg = a -> {
			int av = 0;
			for (int i : a)
				av += i;
			return av / a.length;
		};
		System.out.println(c.Comb(s1, s2));
		String[] g = SA.StartA(s3);
		for (String i : g)
			System.out.println(i);
		int[] h = Se.Sers();
		for (int i : h)
			System.out.print(i + "\t");
		System.out.println(CI.CharInt(f));
		System.out.println(Ma.Max(i1, i2));
		System.out.println(Mi.Min(i1, i2));
		System.out.println(Summ.add(i1, i2));
		System.out.println(avg.average(a1));
	}
}
