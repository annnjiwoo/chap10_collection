package com.javalab.collection.pkg11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * 주말과제
 */


public class BoardMain {
	public static void main(String[] args) {// start main
		ArrayList<Board> printAll = new ArrayList<>();

		printAll.add(new Board(100, "객체 배열을 통하여 학생명단 평균점수 최고점수 최고점 학생을 출력하세요", "김정희", "2023.03.03", 84));
		printAll.add(new Board(101, "객체지향 프로그래밍 - 인스턴스 멤버와 정적멤버", "최윤희", "2021.07.21", 99));
		printAll.add(new Board(102, "클래스와 객체지향 프로그래밍(Object Oriented Programming)", "우성민", "2020.06.10", 264));
		printAll.add(new Board(103, "[정렬] 선택 정렬(Selection Sort)", "정민태", "2023.01.02", 77));
		printAll.add(new Board(104, "Math.random() 메소드를 통한 난수 발생시키기", "김갑철", "2022.10.12", 94));
		printAll.add(new Board(105, "배열을 통한 사원 정보 관리 #2", "이수영", "2021.07.25", 70));
		printAll.add(new Board(106, "배열을 통한 학생 정보 관리 #1", "박영준", "2023.02.01", 80));
		printAll.add(new Board(107, "문자열(장문) 처리하기", "성수정", "2019.12.30", 56));
		printAll.add(new Board(108, "[과제] 주말과제 - 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2020.05.17", 84));
		printAll.add(new Board(109, "[모듈화] 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2023.03.03", 64));
		printAll.add(new Board(110, "다차원 배열 자료 저장 구조와 인덱스", "서동욱", "2022.07.010", 94));
		printAll.add(new Board(111, "제어문 반복문", "정연남", "2022.08.03", 84));
		printAll.add(new Board(112, "연산자(Operator)", "최정빈", "2020.01.01", 64));
		printAll.add(new Board(113, "키보드를 통해서 데이터 읽어들이기", "오민희", "2022.09.12", 984));
		printAll.add(new Board(114, "변수와 자료형 #1", "이의정", "2022.09.03", 164));



		// 1. 기본데이터를 Board 객체로 생성한 후에 ArrayList에 추가(add)하고 출력해주는 메소드를 만드세요.
		printAllBoard(printAll);


		// 2. 게시물 중에서 우성민, 홍세나가 작성한 게시물을 찾아서 반환해주는 메소드를 만드세요.
		getBoardByName(printAll);
		for (int i = 0; i < getBoardByName(printAll).size(); i++) {
			System.out.println(
					printAll.get(i).getId() + "\t" + printAll.get(i).getTitle() + "\t" + printAll.get(i).getWriter()
							+ "\t" + printAll.get(i).getGdate() + "\t" + printAll.get(i).getHitcount());

		}System.out.println();

		// 3. 배열과 관련된 게시물을 출력해주는 메소드를 만드세요.
		printBoard(printAll);
		for (Board board : printBoard(printAll)) {
			System.out.println(board.getId() + "\t" + board.getTitle() + "\t" + board.getWriter() + "\t"
					+ board.getGdate() + "\t" + board.getHitcount());
		}System.out.println();



		// 4. 조회수가 가장 큰 게시물을 출력해주는 메소드를 만드세요.
		printHitCountBoard(printAll);
		System.out.println(printHitCountBoard(printAll) + "\n");

		// 5. 게시물 객체를 Set 컬렉션에 저장하고 출력해주는 메소드를 만드세요.
		printSetBoard(printAll);

	      // HashMap에 게시물 객체 저장(Key-게시물id, Value-게시물 객체)
	      Map<Integer, Board> boardMap = new HashMap<Integer, Board>();
	      
	      boardMap.put(100, new Board(100,"객체 배열을 통하여 학생명단 평균점수 최고점수 최고점 학생을 출력하세요", "김정희", "2023.03.03", 84));
	      boardMap.put(101, new Board(101,"객체지향 프로그래밍 - 인스턴스 멤버와 정적멤버", "최윤희", "2021.07.21", 99));                          
	      boardMap.put(102, new Board(102,"클래스와 객체지향 프로그래밍(Object Oriented Programming)", "우성민", "2020.06.10", 264));       
	      boardMap.put(103, new Board(103,"[정렬] 선택 정렬(Selection Sort)", "정민태", "2023.01.02", 77));                      
	      boardMap.put(104, new Board(104,"Math.random() 메소드를 통한 난수 발생시키기", "김갑철", "2022.10.12", 94));                    
	      boardMap.put(105, new Board(105,"배열을 통한 사원 정보 관리 #2", "이수영", "2021.07.25", 70));                                
	      boardMap.put(106, new Board(106,"배열을 통한 학생 정보 관리 #1", "박영준", "2023.02.01", 80));                                
	      boardMap.put(107, new Board(107,"문자열(장문) 처리하기", "성수정", "2019.12.30", 56));                                      
	      boardMap.put(108, new Board(108,"[과제] 주말과제 - 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2020.05.17", 84));                 
	      boardMap.put(109, new Board(109,"[모듈화] 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2023.03.03", 64));                     
	      boardMap.put(110, new Board(110,"다차원 배열 자료 저장 구조와 인덱스", "서동욱", "2022.07.010", 94));                          
	      boardMap.put(111, new Board(111,"제어문 반복문", "정연남", "2022.08.03", 84));                                        
	      boardMap.put(112, new Board(112,"연산자(Operator)", "최정빈", "2020.01.01", 64));                                      
	      boardMap.put(113, new Board(113,"키보드를 통해서 데이터 읽어들이기", "오민희", "2022.09.12", 984));                                 
	      boardMap.put(114, new Board(114,"변수와 자료형 #1", "이의정", "2022.09.03", 164));     
	      
	      // 6. HashMap을 통하여 게시물 출력해주는 메소드 호출
	      System.out.println("6. HashMap을 통하여 전체 게시물 출력");
	      printMapBoard(boardMap);
	      System.out.println();
	      System.out.println();     
		
		 
	}// end main
	
	   // 6. HashMap을 통하여 게시물 출력해주는 메소드
	   private static void printMapBoard(Map<Integer, Board> boardMap) {

	      for(Integer id : boardMap.keySet()) {   // boardMap.keySet() : key가 든 Set반환
	         System.out.printf("%d \t  %s \t %s \t %d \n", boardMap.get(id).getId(), 
	                        boardMap.get(id).getTitle(), boardMap.get(id).getWriter(), 
	                        boardMap.get(id).getHitcount());         
	      }
	      
	      Set<Integer> keySet = boardMap.keySet();
	      Iterator<Integer> iter = keySet.iterator();
	      while(iter.hasNext()) {
	         Integer key = iter.next();
	         Board board = boardMap.get(key);
	         System.out.printf("%d \t  %s \t %s \t %d \n", board.getId(), board.getTitle(), board.getWriter(), board.getHitcount());         
	      }
	      
	   }


	// 5. 게시물 객체를 Set 컬렉션에 저장하고 출력해주는 메소드를 만드세요.

	private static void printSetBoard(ArrayList<Board> printAll) {//Set은 중복 불가
		Set<Board> set = new HashSet<>();
		System.out.println("Set 컬렉션에 저장");
		for (Board board : printAll) {
			set.add(board);
		}

		for (Board board : set) {
			System.out.println(board.getId() + "\t" + board.getTitle() + "\t" + board.getWriter() + "\t"
					+ board.getGdate() + "\t" + board.getHitcount());
		}

	}



	// 4. 조회수가 가장 큰 게시물을 출력해주는 메소드를 만드세요.
	private static ArrayList<Board> printHitCountBoard(ArrayList<Board> printAll) {
		int max = 0;
		ArrayList<Board> best = new ArrayList<>();
		ArrayList<Board> array = new ArrayList<>();
		for (Board board : printAll) {
			if (board.getHitcount() > max) {
				max = board.getHitcount();
			}
		}
		
		for (Board board : printAll) {
			if (max == board.getHitcount()) {
				best.add(board);
			}
		}
		return best;
	}



	// 3. 배열과 관련된 게시물을 출력해주는 메소드를 만드세요.
	private static ArrayList<Board> printBoard(ArrayList<Board> printAll) {
		ArrayList<Board> array = new ArrayList<>();
		for (Board board : printAll) {
			if (board.getTitle().contains("배열")) {
				array.add(board);
			}
		}
		return array;
	}



	// 2. 게시물 중에서 우성민, 홍세나가 작성한 게시물을 찾아서 반환해주는 메소드를 만드세요.
	private static ArrayList<Board> getBoardByName(ArrayList<Board> printAll) {
		System.out.println(" 우성민, 홍세나가 작성한 게시물을 찾아");
		ArrayList<Board> student = new ArrayList<>();
		for (Board board : printAll) {
			if (board.getWriter().equals("우성민") || board.getWriter().equals("홍세나")) {
				student.add(board);
			}
		}
		return student;
	}

	// 1. 기본데이터를 Board 객체로 생성한 후에 ArrayList에 추가(add)하고 출력해주는 메소드를 만드세요.
	private static void printAllBoard(ArrayList<Board> printAll) {
		for (Board board : printAll) {
			System.out.println(board.toString());
		} System.out.println();

		for (int i = 0; i < printAll.size(); i++) {
			System.out.println(
					printAll.get(i).getId() + "\t" + printAll.get(i).getTitle() + "\t" + printAll.get(i).getWriter()
							+ "\t" + printAll.get(i).getGdate() + "\t" + printAll.get(i).getHitcount());

		}
		System.out.println();
	}
}