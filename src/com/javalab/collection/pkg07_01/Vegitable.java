package com.javalab.collection.pkg07_01;
/**
 * 야채 클래스
 */

public class Vegitable {
	
	private String name;
	private int price;
	
	public Vegitable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vegitable(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vegitable [name=" + name + ", price=" + price + "]";
	}
	


}