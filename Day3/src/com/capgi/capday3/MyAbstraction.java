package com.capgi.capday3;


abstract class Mobile {
	final int price = 1000;

	// abstract method
	abstract public void calling();

	abstract public void sendSMS();


//	non abstract method
	public void chargingUSB() {
		System.out.println("USB charging");

	}

}

class Google extends Mobile {
	@Override
	public void calling() {
		System.out.println("Google 4g calling");

	}

	public void sendSMS() {
		System.out.println("send sms using internet");
	}

	public void Android() {
		System.out.println("Android Phone");
	}

}

public class MyAbstraction {
	public static void main(String[] args) {
		Google g = new Google();
		g.calling();
		g.Android();
		g.chargingUSB();
		g.sendSMS();
		g.chargingUSB();
		System.out.println(g.price);

	}

}