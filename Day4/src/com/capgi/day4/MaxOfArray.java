package com.capgi.day4;

import java.util.Scanner;

public class MaxOfArray {
	public static void main(String args[]) {
		int arr[]=new int[5];
		int max=0;
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
	         System.out.println("Enter " +(i+1) +" Location" );

			arr[i]=sc.nextInt();

	    }
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		
        System.out.println("Maximum in array elementt is "+max );
        sc.close();

	}
}
