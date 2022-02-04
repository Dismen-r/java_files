package com.cpmg.ArrayAssignment;

public class MinimumElement {
	public static void main(String[] args) {
		int a[] = { 5, 6, 7, 4, 3 };
		int ma = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < ma) {
				ma = a[i];
			}
		}
		System.out.println(ma);
}
}
