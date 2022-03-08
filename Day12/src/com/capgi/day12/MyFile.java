package com.capgi.day12;
import java.io.FileWriter;

public class MyFile {
	//File IO--File Input and Output
	//Reading the File
	//Writing in the file

	//FileWriter
	//It is class 
	//Which is used to write the string in file
	//import the FileWriter Class
	//Create the Object of File Writer Class





		public static void main(String args[])
		{
			
		    try
		    {
			//It is writing in the RAM
			String str="Hello Java";
			
			//Step 1
			//Checked Exception 
			//open A file
			FileWriter fileWriter=new FileWriter("G://abc.txt");
			
			//reading of writing into file
			//fileWriter.write(65);
			//fileWriter.write(str);

			char[] c= {'a','b','c'};
			fileWriter.write(c);
			//close the file
			fileWriter.close();
			
		    }
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    }
			//Reading and print on the console
			
		}
		
	}



