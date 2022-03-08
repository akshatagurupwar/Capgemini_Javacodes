package com.capgi.day12;


import java.io.File;
import java.util.Scanner;

public class MyFileReading {

	public static void main(String args[])
	{
		try
		{
		File file=new File("G://abc.txt");
	    System.out.println("File Name "+file.getName());
	    System.out.println("Path "+file.getPath());
	    System.out.println("getAbsolutePath "+file.getAbsolutePath());
	    System.out.println("getParent "+file.getParent());
	    System.out.println("canExecute" +file.canExecute());
	    System.out.println("canRead "+file.canRead());
	    System.out.println("Can Write "+file.canWrite());
	    
	    
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine())
		{
			String data=sc.nextLine();
			System.out.println(data);
		}
		
		sc.close();

		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	   
	}
	
}
