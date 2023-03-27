package com.javalab.collection.pkg10;

import java.util.ArrayList;

public class ExamMain {
	public static void main(String[] args) {
		
		//[문제.1] 1,2,3,4,5,6,7,8,9,10 을 갖는 ArrayList를 생성하고 값을 출력하세요.
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}System.out.println();
		
		//[문제.2] 다음 값을 갖는 ArrayList를 생성하고 값을 출력하세요.
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Volvo");
		list2.add("Benz");
		list2.add("Benz");
		list2.add("Hyundai");
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		//[문제.3] 다음 raw data를 담을 수 있는 Student 클래스를 설계하고 
		//       객체를 생성하여 ArrayList에 담고 출력하세요.
		ArrayList<Student> students= new ArrayList<>();
		students.add(new Student("1234", "123456-1234567", "홍길동", 3, "천안", 210));
		students.add(new Student("5678", "987456-2334567", "김길동", 4, "대전", 220));
		students.add(new Student("8970", "357556-2334789", "이길동", 1, "서울", 230));
		
		for (Student student : students) {
			System.out.println(student.toString());
		}

		
	}

}
