package com.capgi.day2;

import java.util.Scanner;

public class Concate {
	public static void main(String args[])
	{
		int a[]=new int[5];
		int b[]=new int[5];
		int j=0;
		
		int length=a.length+b.length;
		int c[]=new int[length];
		Scanner sc=new Scanner(System.in);
	
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
		}

for(int i=0;i<a.length;i++)
{
	c[j]=a[i];
	j++;
}
for(int i=0;i<b.length;i++)
{
	c[j]=b[i];
	j++;
}	

for(int i=0;i<length;i++)
{
	System.out.print(c[i]+" ");
}
sc.close();

}

}
