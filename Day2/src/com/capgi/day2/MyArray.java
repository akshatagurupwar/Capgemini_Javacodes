package com.capgi.day2;
import java.util.Scanner;

public class MyArray {
	
	public static void main(String args[])
	{
		int a[]=new int[5];
		
		float []b=new float[5];
		
		double []d=new double[5];
		String str[]=new String[3];
		
		/*a[0]=15;
		a[1]=23;
		a[2]=3;
		a[3]=40;
		a[4]=5;

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);*/
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter value for"+i);

			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}

		for(int i=0;i<3;i++)
		{
			System.out.println("Enter string value for"+i);

			str[i]=sc.nextLine();
		}
		for(int i=0;i<3;i++)
		{
			System.out.println(str[i]);
		}

		
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter float value for"+i);

			b[i]=sc.nextFloat();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(b[i]);
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter double value for"+i);

			d[i]=sc.nextDouble();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(d[i]);
		}

		sc.close();

	}

}
