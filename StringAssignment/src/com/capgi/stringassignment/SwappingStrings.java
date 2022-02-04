package com.capgi.stringassignment;

//swap two strings without using the third variable
public class SwappingStrings {
	public static void main(String args[]) {
	String str="Akshata";
    String str1="Divya";
    
    
     str=str+str1;  
     str1=str.substring(0,str.length()-str1.length());
     str=str.substring(str1.length());
     
     System.out.println(str);
     System.out.println(str1);

	}


}
