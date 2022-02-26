package com.cpmg.day9;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*; 
// Class name should be "Source",
// otherwise solution won't be accepted
public class HighestFeedback {
	static int ind(int[] a,int i){
		for(int j=0; j<a.length; j++){
		if(a[j]==i)
		return j;
		}
		return -1;
		}
	static void highestFeedBack(int b[], int c[], int size) {
		int[] z=new int[size*2];
		int f=0;
		for(int i=0;i<size; i+=2) {
		if(ind(c,b[i])!=-1){ 
			int j=ind(c,b[i]);
			if(b[i+1]>c[j+1]){
				z[f]=b[i]; 
				z[f+1]=b[i+1];
				f+=2;
			}
			else {
				z[f]=c[j];
				z[f+1]=c[j+1];
				f+=2;	
			}
		}
		else {
			z[f]=b[i];
			z[f+1]=b[i+1];
			f+=2;
		}
}
		for(int i=0;i<f;i++) {
			System.out.println(z[i]);
		}
		for(int i=0;i<size;i+=2) {
			if(ind(z,c[i])==-1) {
				System.out.println(c[i]);
				System.out.println(c[i+1]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		try {
			int a=in.nextInt(),d=0;
			int[] b=new int[a];
			int[] c=new int[a];
			for(int i=0;i<a;i++) {
				b[i]=in.nextInt();
				if(b[i]<0) {
					d++;
					System.out.println("Invalid Input");
					break;
				}
			}
			if(d==0){
				for(int i=0;i<a;i++) {
					c[i]=in.nextInt();
					if(c[i]<0) {
						System.out.println("Invalid Input");
						break;
					}
				}
			}
			if(a>0 && d==0) {
				highestFeedBack(b,c,a);
			}
			}
		catch(Exception e){
			System.out.println("Invalid array size");
			
		}
	}
	}
