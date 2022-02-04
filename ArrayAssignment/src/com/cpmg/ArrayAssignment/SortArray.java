package com.cpmg.ArrayAssignment;
import java.util.Scanner;
public class SortArray {
	public static void main(String[] args) {
		int a[] = {5,6,7,4,3};
	for (int i = 0; i < a.length; i++) {
		for (int j = i + 1; j < a.length;j++) {
			int temp;
			if (a[i] > a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
}
	for (int i = 0; i < 5; i++) {
		System.out.println(a[i]);
	}
}
	}