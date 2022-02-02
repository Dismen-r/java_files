package com.cpmg.day4;

//Insert
//print
//Duplicate value in array
//delete a element in array
//find the value in array
//sort the array element
//find the max number from array element
//find the minimum number from array element
//find the maximum of three number
//find the three of three number
//Sum of three number
//Avg of three number
//Percentage of marks
import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// getting array from user Array
		int a[] = new int[10];
		int b[] = new int[10];
		for (int i = 0; i < 5; i++)
			a[i] = s.nextInt();
		// insert element in array (position-3)
		for (int i = 0; i < 6; i++) {
			if (i < 2) {
				b[i] = a[i];
			} else if (i == 3) {
				b[i] = 3;
			} else {
				b[i] = a[i - 1];
			}
		}
		// print elements in array
		for (int i = 0; i < 4; i++) {
			System.out.println(b[i]);
		}
//delete element in array (position-3)
		for (int i = 0; i < 5; i++) {
			if (i < 2) {
				b[i] = a[i];
			}

			else {
				b[i] = a[i + 1];
			}
		}
		//sort array 
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length;) {
				int temp;
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		//maximun element in array
			int ma = 0;
			for (i = 0; i < a.length; i++) {
				if (a[i] > ma) {
					ma = a[i];
				}
			}
			System.out.println(ma);
			//minimum element in array
			for (i = 0; i < a.length; i++) {
				if (a[i] < ma) {
					ma = a[i];
				}
			}
			System.out.println(ma);
		
		
		s.close();
	}
}
