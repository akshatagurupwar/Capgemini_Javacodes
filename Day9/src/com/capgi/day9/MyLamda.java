package com.capgi.day9;


interface PositiveOrNegative{
	public String print(int num);
}
interface SquareOfNumber{
	public int square(int num2);
}

interface StringInUppercase{
	public String upper(String Str);
}
interface StringLength{
	public int length(String Str2);
}

public class MyLamda {
	public static void main(String args[])
	{
		PositiveOrNegative positiveornegative=num->{
			if(num>0)
				return "Positive"+num;
			else
				return "Negative "+num;
		};
		System.out.println(positiveornegative.print(-4));
		
		
		
		SquareOfNumber square=num2->{
			return num2*num2;
		};
		System.out.println(square.square(7));
		
		
		StringInUppercase upper=str->{
			return str.toUpperCase();
		};
		System.out.println(upper.upper("akshata"));
		
		
		StringLength length=str2->{
			return str2.length();
		};
		System.out.println(length.length("Gurupwar"));


	}
	
	
	

}
