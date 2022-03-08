package com.capgi.capday3;


class Employee{
	 private int empid;
	private String name;
	private float salary;
	
	Employee(int empid,String name,float salary){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	
	
	public void setempid(int empid) {
		this.empid=empid;
		
	}
	public void setname(String name) {
		this.name=name;
		
	}
	public void setsalary(float salary) {
		this.salary=salary;
		
	}
	public int getempid(){
		return this.empid;
		
	}
	public String getname(){
		return this.name;
		
	}
	public float getsalary(){
		return this.salary;
		
	}


}
public class MyEncapsulation {
	public static void main(String args[])
	{
		Employee e=new Employee(1,"Akshata",3000);
		System.out.println(e.getsalary());
		System.out.println(e.getname());

		//System.out.println(e.empid); WE cannot access id directly bcz it is private
	}

}
