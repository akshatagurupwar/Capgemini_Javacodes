package com.capgi.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class People{
	public enum Gender{
		MAN,WOMAN;
	}
	private String name;
	private int age;
	private Gender gender;
	
	
	public People(String name,int age,Gender gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
		
	}


	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", gender=" + gender + "]";
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


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
}
class Implementation{
	public List<People> countpotentialPerson(List<People> list){
		//List<People> li=list.stream().filter(p->p.getGender()==People.Gender.MAN).filter(p->p.getAge()>18).
			//	collect(Collectors.toList());
		List<People> arr=new ArrayList<People>();
		for(People p:list) {
			if(p.getGender()==People.Gender.MAN) {
				arr.add(p);
			}
		}
		return arr;
		
	}
}
public class PeopleSpecifications {

}
