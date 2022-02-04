package com.capgi.stringassignment;
//check if two strings are anagrams of each other

import java.util.Arrays;

public class AnagramString {
	public static void main(String args[])
	{
		String str1="peek";
		String str2="keep";
		
		str1=str1.replaceAll("\\s", "");
		str2=str2.replaceAll("\\s", "");
		
		boolean flag;
		
		
		
		char string1[]=str1.toLowerCase().toCharArray();
		char string2[]=str2.toLowerCase().toCharArray();
		
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		
		flag=Arrays.equals(string1, string2);
		
		
		if(flag) {
			System.out.println("anagrams");
		}
		else
			System.out.println("not anagrams");

	}

}
