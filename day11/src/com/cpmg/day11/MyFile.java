package com.cpmg.day11;
import java.io.*;
import java.util.*;
public class MyFile {
	public static void main(String args[]) throws Exception{
		//create a file
	File f = new File("file.txt");
	f.createNewFile();
	
	//write in a file
	 FileWriter w= new FileWriter("file.txt");
    w.write("hello world\n");
    w.write("hello java");
    w.close();
    
    
    //read a file line by line
	Scanner sc=new Scanner(f);
	
	while(sc.hasNextLine()) {
		System.out.println(sc.nextLine());
	}
	sc.close();
}
}