package com.javalab.collection.pkg02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * LikedList 사용 vs ArrayList 사용 성능비교
 */

public class LinkedListExample {
	public static void main(String[] args) {
		
		//ArrayList 컬렉션 객체 생성
		ArrayList<String> list1 = new ArrayList<String>();
		//List는 인터페이스다
		
		//LikedList 컬렉션 객체 생성
		LinkedList<String> list2 = new LinkedList<String>();
		
		//시작 시간과 끝 시간을 저장할 변수 선언
		long startTime;
		long endTime;
		
		//ArrayList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();	// 내 컴터의 나노타입 시간을 가져온다.
		for (int i = 0; i < 10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간 : ", (endTime-startTime));
		
		
		//LikedList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LikedList 걸린 시간 : ", (endTime-startTime));
	}

}
