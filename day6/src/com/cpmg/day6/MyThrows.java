package com.cpmg.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
//there are two way to handle the exception

//try catch block

//Throws Keyword


//throw the exception at class level
class MyException1 {

	// Exception is catch at method level
	//Who will call this method need to handle the exception
	//chained exception
	//Exception needs to handle at some point 
	public void myNewException() throws FileNotFoundException
	{
		FileInputStream inputStream = new FileInputStream("c:\\file.txt");
	}
}

public class MyThrows {

	// method level it will throw the exception
	public static void main(String args)  {

		try
		{
		MyException1 exception=new MyException1();
		
		exception.myNewException();
		}
		
		//you can have multiple catch block
		//child should come before parent class
	
		catch(FileNotFoundException e)
		{
			
		}
		catch(FileSystemNotFoundException e)
		{
			
		}
		catch(NullPointerException e)
		{
			
		}
		catch(Exception e)
		{
			
		}
		
		//MyThrows.main(args);
	}
	
	
	
}