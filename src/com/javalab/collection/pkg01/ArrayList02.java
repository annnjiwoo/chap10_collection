package com.javalab.collection.pkg01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList02 {// start main
	public static void main(String[] args) {

		// ArrayList 컬렉션 객체 생성 10칸짜리
		ArrayList<Integer> list1 = new ArrayList<>(10);
		list1.add(new Integer(5));	// list1.add(5)라고 하면 옆처럼 자동 박싱해준다......boxing
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		ArrayList<Integer> list2 = new ArrayList<>(list1.subList(1, 4));
		print(list1, list2);
		System.out.println();

		// 정렬 (String)
		Collections.sort(list1); // list1과 list2를 정렬한다.
		//sort는 static이다 (객체생성하지 않고 사용)
		Collections.sort(list2); // Collections.sort(List1)
		print(list1, list2);

	}// end main

	private static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();

	}

}// class
