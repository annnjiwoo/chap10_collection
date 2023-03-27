package com.javalab.collection.pkg07_01;

import java.util.ArrayList;
import java.util.List;

public class HashMapMain {
	public static void main(String[] args) {
		
		//1. 과일 객체 생성
		Fruit Apple = new Fruit("Apple", 3000);
		Fruit Banna = new Fruit( "Banna", 3500);
		Fruit Orange = new Fruit( "Orange", 4000);
		//2. 과일 객체를 담을 박스 객체 생성
		Box <Fruit> box = new Box<>();
		
		box.addItem(Apple);
		box.addItem(Banna);
		box.addItem(Orange);

		//3. 박스의 내용 확인
		for (Fruit fruit : box.getItems()) {
			System.out.println(fruit.getName() + "\t" + fruit.getPrice());
		}System.out.println();
		
		//4. 야채 객체 생성
		Vegitable 시금치 = new Vegitable("시금치", 1500);
		Vegitable 양배추 = new Vegitable("양배추", 1500);
		Vegitable 대파 = new Vegitable("대파", 1500);
		
		//5. 야채담을 박스 객체 생성
		Box<Vegitable> vbox = new Box<Vegitable>();
		
		vbox.addItem(시금치);
		vbox.addItem(양배추);
		vbox.addItem(대파);
		
		for (Vegitable vegitable : vbox.getItems()) {// vbox.getItems() = 어레이 리스트임, 이게 있어야 불러올 수 있음 ㅋ
			System.out.println(vegitable.getName() + "\t" + vegitable.getPrice());
		}
	}

}
