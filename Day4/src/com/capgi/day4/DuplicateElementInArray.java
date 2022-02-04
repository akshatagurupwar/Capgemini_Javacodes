package com.capgi.day4;

import java.util.Scanner;

public class DuplicateElementInArray {
	public static void main(String args[]) {
		int arr[]=new int[5];

		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
	         System.out.println("Enter " +(i+1) +" Location" );

			arr[i]=sc.nextInt();

	    }
        System.out.println("Duplicate elements are:");

        for(int i=0;i<5;i++)
        {
        	for(int j=i+1;j<5;j++) {
        		if(arr[i]==arr[j])
        		{
        	        System.out.println(arr[i]);
        		}

        	}
        }
        sc.close();

	}



}
