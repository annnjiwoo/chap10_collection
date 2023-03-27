package com.javalab.collection.pkg07_01;
/**
 * 사용 시점에 파라미터가 전달되고 그 시점에 재ㅎ편된다,,>?
 */

import java.util.ArrayList;
import java.util.List;

public class Box <T>{
	private List<T> items;
	
	public Box() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(T item) {
		this.items.add(item);
	}
	
	public List<T> getItems (){
		return this.items;
	}

}
