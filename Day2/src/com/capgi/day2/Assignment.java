package com.capgi.day2;


class Student1{
	private int id;
	private String name;
	private String address;
	
	public String toString()
	{
		return "Student [rollno="+id+" name="+name + " address="+address+ "]";
	}
	
	public Student1(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}

}


class Car{
	private int carno;
	private String color;
	
	
	public void setcarno(int carno) {
		this.carno=carno;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	
	public int getcarno(){
		return this.carno;
	}
	public String getcolor(){
		return this.color;
	}

}



class Computer{
	private String brandName;
	static String processor;
	
	Computer(){}
	Computer(String brand){
		brandName = brand;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brand) {
		brandName = brand;
	}
	
	public static void Processor() {
		System.out.println("------------------------------------------------------");
		System.out.println("Processor Is: " + processor);
	}
	public void print() {
		System.out.println("Brand Name: " + brandName);
		System.out.println("Processor: " + processor);
	}
}

class Employee {
	private int eId;
	private String eName;
	private String eDepartment;
	Employee(){}
	public Employee(int eId, String eName, String eDepartment) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDepartment = eDepartment;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDepartment() {
		return eDepartment;
	}
	public void seteDepartment(String eDepartment) {
		this.eDepartment = eDepartment;
	}
	
	public String toString() {
		return "Employee [Employee Id: " +eId+ ", Employee Name: " +eName+ ", Employee Department: " +eDepartment+ "]";
	}
}











public class Assignment {
	public static void main(String args[]) {
		Student1 s1=new Student1(101,"Akshata","Nanded");
		System.out.println(s1);
		
		Student1 s2=new Student1(102,"Ram","Aurangabad");
		System.out.println(s2);
		
		Student1 s3=new Student1(103,"sham","pune");
		System.out.println(s3);

		
		Car c1=new Car();
		c1.setcarno(202);
		c1.setcolor("white");
		System.out.println(c1.getcarno());
		System.out.println(c1.getcolor());
		
		Car c2=new Car();
		c2.setcarno(206);
		c2.setcolor("red");
		System.out.println(c2.getcarno());
		System.out.println(c2.getcolor());

		Car c3=new Car();
		c3.setcarno(208);
		c3.setcolor("yellow");
		System.out.println(c3.getcarno());
		System.out.println(c3.getcolor());
		
		
		
		Computer.processor = "Intel";
		Computer com1 = new Computer("HP");
		Computer com2 = new Computer("Dell");
		Computer com3 = new Computer("Asus");
		com1.print();
		com2.print();
		com3.print();
		Computer.Processor();
		
		Employee e1 = new Employee(101, "ABC", "Sales");
		Employee e2 = new Employee(102, "XYZ", "Testing");
		Employee e3 = new Employee(103, "MNO", "Development");
		System.out.println("------------------------------------------------------");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println("------------------------------------------------------");



	}
}
