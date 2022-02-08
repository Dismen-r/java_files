package com.cpmg.day9;
//Create Lamda for Find Given Number is positive or Negative
//Create Lamda to return sequre of given number
//create Lamda to pass String and return in Upper case
//Create Lamda to pass string and return the lenght of String
@FunctionalInterface
interface POrN {
	public String PN(int a);
}

@FunctionalInterface
interface Square {
	public double S(int a);
}

@FunctionalInterface
interface Upper {
	public String U(String a);
}

@FunctionalInterface
interface LengthS {
	public int L(String a);
}

public class MyLambda {
	public static void main(String[] args) {
		POrN PN1 = (int a) -> {
			if (a >= 0)
				return "Positive";
			else
				return "Negative";
		};
		Square S1 = (int a) -> {
			return (double) a * a;
		};
		Upper U1 = (String a) -> {
			return a.toUpperCase();
		};
		LengthS L1 = (String a) -> {
			return a.length();
		};

		System.out.println(PN1.PN(-3));
		System.out.println(S1.S(3));
		System.out.println(U1.U("hello"));
		System.out.println(L1.L("hello"));

	}

}
