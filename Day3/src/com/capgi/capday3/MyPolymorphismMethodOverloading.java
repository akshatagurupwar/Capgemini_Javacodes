package com.capgi.capday3;

class MyShape{
	public void draw(int a,int b) {
		System.out.println("Line Drawing");
	}
	public void draw(int a,int b,int c) {
		System.out.println("circle Drawing");
	}
	public void draw(int a,int b,int c,int d) {
		System.out.println("Square Drawing");
	}

}

public class MyPolymorphismMethodOverloading {
	public static void main(String args[]) {

	MyShape m=new MyShape();
	m.draw(1,1);
	m.draw(1,1,1);
	m.draw(1,1,1,1);

   }
}
