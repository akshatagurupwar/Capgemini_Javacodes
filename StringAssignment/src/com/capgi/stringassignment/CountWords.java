package com.capgi.stringassignment;
//Count the number of words in a given string sentence

public class CountWords {
	public static void main(String args[]) {
		String str1="Sun IS Bright";
		int count=1;
		for(int i=0;i<str1.length();i++)
		{
			if((str1.charAt(i)==' ') && (str1.charAt(i+1)!=' ')) {
            count++;			
            }
		}
		System.out.println("Number of words in string are:"+count);
	}


}
