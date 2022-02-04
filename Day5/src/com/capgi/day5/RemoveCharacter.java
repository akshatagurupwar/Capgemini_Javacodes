package com.capgi.day5;

public class RemoveCharacter {

	public static void main(String args[]) {
		String str="India is my country";
		String str2="";
		char c='n';
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=c) {
				str2=str2+str.charAt(i);
			}
		}
		System.out.println(str2);
	}
}
