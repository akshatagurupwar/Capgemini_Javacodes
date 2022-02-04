package com.capgi.capday3;

//it can take any form at runtime
//Need to implement abstraction class or interface
//Concept of inheritance(implement )
class Shape
{
	public void drawshape() {
		System.out.println("Draw shape");
	}
}
class Line extends Shape
{
	public void drawshape() {
		System.out.println("Draw Line");
	}
}
class Circle extends Shape
{
	public void drawshape() {
		System.out.println("Draw Circle");
	}
}







public class MyPolymorphism {
	public static void main(String args[])
	{
		Shape s=new Circle();
		s.drawshape();
	}

}
