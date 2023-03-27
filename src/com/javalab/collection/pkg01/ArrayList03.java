package com.javalab.collection.pkg01;

import java.util.ArrayList;

public class ArrayList03 {
	public static void main(String[] args) {
		
		ArrayList<Person> people = new ArrayList<>();
		
		Person person1 = new Person("john", 25);
		Person person2 = new Person("sarah", 30);
	
		
		people.add(person1);
		people.add(person2);
		people.add(new Person("Mike", 27));
		people.add(new Person("jane", 18));
		
		for (Person person : people) {
			System.out.println(person.getName() + " is " + person.getAge() + " years old.");
		}
		System.out.println();
		
		System.out.println("향상된 for문");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i).getName()+ " is " + people.get(i).getAge()+ " years old.");
		}
		
		
	}

}
/**
 * Person 클래스
 */

class Person {// 한개의 파일에 퍼블릭 두개를 사용하려면 동일한 클래스명이어야함 (해당클래스는 퍼블릭 x)
	
	private String name;
	private int age;
	
	public Person() {
		super();
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
}