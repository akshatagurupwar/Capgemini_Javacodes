package com.capgi.arrayassignment;
//find the min number from array element

import java.util.Scanner;

public class MinOfArray {
	public static void main(String args[]) {
		int arr[]=new int[5];

		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
	         System.out.println("Enter " +(i+1) +" Location" );

			arr[i]=sc.nextInt();

	    }
		int min=arr[0];

		for(int i=0;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
		}

        System.out.println("Minimum in array elementt is "+min );
        sc.close();

	}


}
