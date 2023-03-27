package com.javalab.collection.pkg04;

public class Member {
	private String name;
	private int age;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String name, int age) {
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
	
	@Override
	public int hashCode(){
		System.out.println("여기는 HashCode : " + name.hashCode() + age);
		return name.hashCode() + age;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return name.equals(other.name) && age == other.age;
	}

}
