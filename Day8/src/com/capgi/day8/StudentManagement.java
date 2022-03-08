package com.capgi.day8;


import java.util.*;


class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int age;
    private String address;
    private String gender;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", gender=" + gender
				+ "]";
	}
	public Student(int id, String name, int age, String address, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		if(this.id>s1.getId())
			return 1;
		else if(this.id<s1.getId())
			return -1;
		else
			return 0;
		
	}

}

public class StudentManagement {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	
	Set<Student> studentset=new HashSet<Student>();
	
	while(true) {
		System.out.println("Print 1 for insert");
		System.out.println("Press 2 for delete");
		System.out.println("Print 3 for update");
		System.out.println("Print 4 for sort AESC");
		System.out.println("Print 5 for sort DESC");
		System.out.println("Print 6 for size");
		System.out.println("Print 7 for exit");

        int choice=sc.nextInt();
        
        if(choice==1) {
			System.out.println("Enter the Number of Employee you want to enter");
			int size = sc.nextInt();
			for (int i = 0; i < size; i++) {
				
				System.out.println("Enter id Student "+i);
				int id=sc.nextInt();
				System.out.println("Enter name Student "+i);
				String name=sc.next();

				System.out.println("Enter Age Student "+i);
				int age=sc.nextInt();
				System.out.println("Enter Address Student "+i);
				String address=sc.next();
				System.out.println("Enter Gender Student "+i);
				String gender=sc.next();

				
				studentset.add(new Student(id,name,age,address,gender));
			}

			studentset.forEach(System.out::println);

        }
        if(choice==2) {
			System.out.println("Enter id of student you want to remove");
			int id=sc.nextInt();
		    boolean found=true;
            for(Student st:studentset) {
            	
            	if(st.getId()==id) {
            		studentset.remove(st);
            		found=false;
            	}
	
            }
            if(found)
            	System.out.println("No matching Found");
            else
            	System.out.println("Record deleted Successfully");



        }
        if(choice==3) {
			System.out.println("Enter id of student you want to update");
			int id=sc.nextInt();
        	ArrayList <Student> al=new ArrayList<Student>(studentset);

            for(Student st:studentset) {
            	
            	if(st.getId()==id) {
            		
            	}
            	}
	


        }
        
        
       // Collections.sort
        
        if(choice==4) {
        	// Collections.sort cannot used with Set
        	ArrayList <Student> al=new ArrayList<Student>(studentset);
        	Collections.sort(al);
			al.forEach(System.out::println);

        }
        if(choice==5) {
        	ArrayList <Student> al=new ArrayList<Student>(studentset);

        	Collections.sort(al,Collections.reverseOrder());
			al.forEach(System.out::println);
         }
        
        if(choice==6) {
        	System.out.println("No Of Student In System Are:"+studentset.size());
        }
       if(choice==7) {
	     break;
}
}
sc.close();
}
}