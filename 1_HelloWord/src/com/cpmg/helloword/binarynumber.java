package com.cpmg.helloword;

public class binarynumber {
	public static void main(String[] args)
	   { 
		long b1=1011, b2=0011;
		int i = 0, c = 0;
		int[] sum = new int[10];

		while (b1 != 0 || b2 != 0) 
		{
			sum[i++] = (int)((b1 % 10 + b2 % 10 + c) % 2);
			c = (int)((b1 % 10 + b2 % 10 + c) / 2);
			b1 = b1 / 10;
			b2 = b2 / 10;
		}
		if (c != 0) {
			sum[i++] = c;
		}
		--i;
		while (i >= 0) {
			System.out.print(sum[i--]);
		}
		System.out.print("\n");  
	   }

}
