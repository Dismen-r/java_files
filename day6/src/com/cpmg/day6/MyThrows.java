package com.cpmg.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
class MyException1 {
	public void myNewException() throws FileNotFoundException
	{
		FileInputStream inputStream = new FileInputStream("c:\\file.txt");
	}
}

public class MyThrows {

	public static void main(String args)  {

		try
		{
		MyException1 exception=new MyException1();
		
		exception.myNewException();
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("FileNotFoundException");
		}
		catch(FileSystemNotFoundException e)
		{
			System.out.println("FileSystemNotFoundException");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException");
		}
		catch(Exception e)
		{
			System.out.println("Exception e");
			
		}
		
	}
	
	
	
}