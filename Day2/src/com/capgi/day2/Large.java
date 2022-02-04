package com.capgi.day2;

import java.util.Scanner;

public class Large {
	
	public static void main(String args[])
	{
		int a[]=new int[5];
		int max=0;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			if(max<a[i])
				max=a[i];
		}
		System.out.println(max);
		sc.close();
	}

}
