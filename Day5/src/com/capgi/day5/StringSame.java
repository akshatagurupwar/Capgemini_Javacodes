package com.capgi.day5;

public class StringSame {
	public static void main(String rgs[])
	{
		String str1="India Is My Country";
		String str2="india is my country";
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Two strings are equal");
		}
		else {
			System.out.println("Two strings are not equal");
	
		}
	}
}
