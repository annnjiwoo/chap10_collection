package com.javalab.collection.pkg07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentMain {
	public static void main(String[] args) {

		// Data 생성
		Student stu1 = new Student(1, "John", 87);
		Student stu2 = new Student(2, "Mary", 90);
		Student stu3 = new Student(3, "Bob", 85);

		// ArrayList
		ArrayList<Student> list = new ArrayList<>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);

		for (Student student : list) {
			System.out.println(student.toString());
		}System.out.println();

		// HashSet (출력순서 없음)
		Set<Student> set = new HashSet<>();// 중복 (무시)
		// Set 제네릭 받을 수 있는 인터페이스임
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);

		for (Student student : set) {
			System.out.println(student.toString());
		}System.out.println();
		
		Iterator<Student> iter = set.iterator();
		while (iter.hasNext()) {
			Student stu = iter.next();
			System.out.println("key를 set형태로 받아오기 " + stu.getId()  + "\t" + stu.getName() + "\t" + stu.getScore());
		}
		//HashMap
		HashMap<Integer, Student> map = new HashMap<>();
		//Map에 학생 객체 저장(추가)
		map.put(stu1.getId(), stu1);
		map.put(stu2.getId(), stu2);
		map.put(stu3.getId(), stu3);

		for (Integer key : map.keySet()) {
			System.out.println(map.get(key).getId()+ "\t" +
								map.get(key).getName()+ "\t" +
									map.get(key).getScore());
		}System.out.println();
		
		Set<Integer> key = map.keySet();	//1. 키만 선별해서 Set<k> 반환
		Iterator<Integer> sIter = key.iterator();	//반복자 얻음
		while (sIter.hasNext()) {
			Integer k = sIter.next();	//key
			System.out.println(k + "-" + map.get(key).getId()+ "\t" +
										map.get(key).getName()+ "\t" +
										map.get(key).getScore());
		}

	}

}
