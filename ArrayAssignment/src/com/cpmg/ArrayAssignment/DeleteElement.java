package com.cpmg.ArrayAssignment;

public class DeleteElement {
	public static void main(String[] args) {
		int a[] = { 5, 6, 7, 4, 3 };
		int b[] = { 0, 0, 0, 0, 0 };

		int c = 2;// position to be deleted

		for (int i = 0; i < 4; i++) {
			if (i < c) {
				b[i] = a[i];
			}

			else {
				b[i] = a[i + 1];
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.println(b[i]);
		}
	}
}
