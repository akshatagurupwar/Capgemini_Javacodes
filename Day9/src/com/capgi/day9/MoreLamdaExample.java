package com.capgi.day9;



interface StringConcat{
	public String combine(String str1,String str2);
}


interface PrintNumber{
	public void print();
}

interface CharToAScii{
	public void conversion(char c);
}

interface MaxNumber{
	public int max(int num1,int num2);
}

interface MinNumber{
	public int min(int num3,int num4);

}


interface SumOfNumber{
	public int summation(int num5,int num6);
}

interface AvgOfNumber{
	public Double avg(int num7,int num8);
}

interface StringArray{
	public void printstring(); 
}

public class MoreLamdaExample {
	
	
	public static void main(String args[]) {
		
		
		StringConcat stringconcat=(str1,str2)->str1.concat(str2);
		
		System.out.println(stringconcat.combine("hello","world"));
		
		PrintNumber print=()->{
			int a=0,b=1,c;
			while(a<100){
				System.out.println(a);

				c=a+b;
				a=b;
				b=c;

			}
		};
		print.print();
		
		
		CharToAScii conversion=c->System.out.println((int)c);
		conversion.conversion('A');
		
		
		MaxNumber maximum=(num1,num2)->{if(num1>num2) return num1; else return num2;};
		
		System.out.println(maximum.max(7, 5));
		
		
		MinNumber minimum=(num3,num4)->{if(num3>num4) return num4; else return num3;};
		
		System.out.println(minimum.min(7, 5));
		
		
		
		SumOfNumber sum=(num5,num6)-> num5+num6;
		
		
		System.out.println(sum.summation(7, 5));

		
		AvgOfNumber avg=(num7,num8)-> (double)(num7+num8)/2;
		
		
		System.out.println(avg.avg(7, 5));

		
		
		StringArray string=()->{
			String[] str= {"Akshata", "Aakash", "Ram", "Priya"};
			for(int i=0;i<str.length;i++) {
				if(str[i].startsWith("A"))
				     System.out.println(str[i]);
			}
			
		};
		
		string.printstring();
		

	}
	
	
}
