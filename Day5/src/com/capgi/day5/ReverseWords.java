package com.capgi.day5;

public class ReverseWords {
	   public static void main(String[] args) {
		      String str = "the sky is blue";
		      System.out.println("The original string is: " + str);
		      String[] temp = str.split("\\s");
		      String rev = "";
		      for (int i = 0; i < temp.length; i++) {
		         if (i == temp.length - 1)
		         rev = temp[i] + rev;
		         else
		         rev = " " + temp[i] + rev;
		      }
		      System.out.println("The reversed string is: " + rev);


}
}