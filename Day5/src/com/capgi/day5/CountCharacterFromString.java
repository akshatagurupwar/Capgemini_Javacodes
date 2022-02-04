package com.capgi.day5;

public class CountCharacterFromString {
	public static void main(String rgs[])
	{
		String str="Hello world";
		char c='o';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(c==str.charAt(i)) {
				count++;
			}
		}
		
		System.out.println(count);

		}

}
