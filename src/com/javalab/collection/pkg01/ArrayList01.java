package com.javalab.collection.pkg01;

import java.util.ArrayList;

public class ArrayList01 {// ArrayList 라이브러리 위치
	
	public static void main(String[] args) {
		
		//ArrayList 생성
		ArrayList<String> fruits = new ArrayList<>();	// 기본적으로 10칸 스트링 공간 확
		
		//값저장
		fruits.add("apple");	// 값 넣을 땐 add 함수 활용
		fruits.add("banana");
		fruits.add("orange");
		
		//크기 조회
		int size = fruits.size();
		System.out.println("ArrayList 사이즈 : " + size);
		
		//인덱스를 이용한 값 조회
		String fruit = fruits.get(1);
		System.out.println("인덱스 1 : " + fruit);
		
		//반복(iterate)  for-each loop
		System.out.println("요소 조회");
		for (String f : fruits) {
			System.out.println(f);
		}
		
		//바나나 삭제
		fruits.remove("banana");
		System.out.println("Elements of the ArrayList after removel");
		for (String f : fruits) {
			System.out.println(f);
		}
	}

}
