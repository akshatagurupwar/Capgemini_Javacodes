package com.capgi.day5;

public class SwappingStrings {
	
	public static void main(String args[]) {
	String str="hello";
    String str1="world";
    
    
     str=str+str1;  
     str1=str.substring(0,str.length()-str1.length());
     str=str.substring(str1.length());
     
     System.out.println(str);
     System.out.println(str1);

	}
}
