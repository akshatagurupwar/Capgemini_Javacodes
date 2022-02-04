package com.capgi.stringassignment;
//count the occurrence of the given character in a string
public class CountCharacterFromString {
	public static void main(String rgs[])
	{
		String str="akshata gurupwar ";
		char c='a';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(c==str.charAt(i)) {
				count++;
			}
		}
		
		System.out.println(count);

		}

}
