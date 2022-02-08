package com.cpmg.day9;

import java.util.*;

interface Serie {
	public void fib(int a);
}

public class Example {
	public static void main(String args[]) {
		Serie F = x -> {
			int a = 1, b = 1, t;
			for (int i = 0; i < x; i++) {
				System.out.println(b);
				t = a;
				a = b;
				b = b + t;
			}
		};
		F.fib(10);
	}
}