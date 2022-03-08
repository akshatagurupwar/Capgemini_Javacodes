package com.capgi.practice;


class Laptop{
	int price;
	String details;
	Laptop(String details,int price){
		this.details=details;
		this.price=price;
	}
	
}

class Afford{

	public String checkConfiguration(Laptop laptop) throws LaptopException{
		String[] str=laptop.details.split("/");

		int a=Integer.parseInt(str[0]);
		
		
		if(laptop.price>70000) {
			throw new LaptopException("Price too high");
		}
		else if(a<8) {
			throw new LaptopException("Minimum 8");
		}
		else 
		{
			return "can be purchased";
		}

	}
	public String error(Laptop laptop) {
		try {
			checkConfiguration(laptop);
		}
		catch(LaptopException e){
			return "change configuration";
		}
		return "Perfect configuration";
	}
}

class LaptopException extends Exception{
	public LaptopException(String msg) {
		super(msg);
	}
}

public class Specifications {
	
	public static void main(String[] args) throws Exception{
		int p=90000;
		String s="12/3/hdd";
		Laptop l=new Laptop(s,p);
		Afford a=new Afford();
		try {
		System.out.println(a.checkConfiguration(l));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(a.error(l));
		
	}

}
