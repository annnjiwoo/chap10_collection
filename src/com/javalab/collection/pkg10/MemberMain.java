package com.javalab.collection.pkg10;

import java.util.ArrayList;

public class MemberMain {
	
	public static void main(String[] args) {

		String[] member = new String[10];
		member[0]="임재,20190509,20190510,8,남,30대후반";
		member[1]="성열,20190509,20190510,1,남,30대중반";
		member[2]="천재,20190509,20190510,3,남,30대초반";
		member[3]="현수,20190509,20190509,1,남,20대후반";
		member[4]="진우,20190509,20190510,2,남,30대초반";
		member[5]="영수,20190509,20190510,2,여,40대후반";
		member[6]="종화,20190509,20190509,0,남,20대후반";
		member[7]="윤정,20190509,20190510,3,여,40대후반";
		member[8]="종호,20190509,20190510,3,남,20대중반";
		member[9]="동현,20190509,20190510,5,남,20대중반";
		
		// 1. 기본 데이터를 가공하여 Member 객체로 만들고 저정할 ArrayList 생성
		ArrayList<Member> members = new ArrayList<>();
		
		// 기본 데이터를 반복문을 통해 Member 객체로 생성
		for (String string : member) {
			String[] str = string.split(",");
			members.add(new Member(str[0],str[1],str[2],Integer.parseInt(str[3]), str[4].charAt(0),str[5]));
			
		}

		//2. 이름이 "천재"인 회원을 찾고 별도의 메소드를 통해서 해당 회원을 출력하세요.
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).name.equals("천재")) {
				System.out.println("이름이 천재인 회원 \n" + members.get(i).toString());
			}
		}System.out.println();
		
		//3. 전체 회원을 출력해주는 메소드를 만드세요.
		System.out.println("전체회원 출력");
		printall(members);
		for (int i = 0; i < members.size(); i++) {
			System.out.println(printall(members).get(i));
		}System.out.println();
		
		//4. 30대인 회원들을 찾아주는 메소드를 만들고 ArrayList에 담아서 반환하세요. 반환받은 리스트를 main 메소드에서 출력하세요.
		System.out.println("30대인 회원 출력");
		printof30(members);
		for (int i = 0; i < printof30(members).size(); i++) {
			System.out.println(printof30(members).get(i));
		}System.out.println();

		//5. 20대 후반들의 방문 회수를 구해주는 메소드를 만들어서 값을 반환받고 출력하세요.
		int count = printof20(members);
		System.out.println("20대 후반들의 방문 회수 : " + count);

	}
	
	//3. 전체 회원을 출력해주는 메소드를 만드세요.
	private static ArrayList<Member> printall(ArrayList<Member> member) {
		ArrayList<Member> all = new ArrayList<>();
		for (int i = 0; i < member.size(); i++) {
			all.add(member.get(i));
		}
		return all;
		
	}
	
	//5. 20대 후반들의 방문 회수를 구해주는 메소드를 만들어서 값을 반환받고 출력하세요.
	private static int printof20(ArrayList<Member> member) {
		int count = 0;
		for (int i = 0; i < member.size(); i++) {
			if (member.get(i).age.contains("20대후반")) {
				count += member.get(i).numVisit;
			}
		}
		return count;
		
	}
	//4. 30대인 회원들을 찾아주는 메소드를 만들고 ArrayList에 담아서 반환하세요. 반환받은 리스트를 main 메소드에서 출력하세요.
	public static ArrayList<Member> printof30 (ArrayList<Member> member) {
		ArrayList<Member> age30 = new ArrayList<>();
		for (int i = 0; i < member.size(); i++) {
			if (member.get(i).age.contains("30대")) {
				age30.add(member.get(i));
			}
		}return age30;
	}
	

}

