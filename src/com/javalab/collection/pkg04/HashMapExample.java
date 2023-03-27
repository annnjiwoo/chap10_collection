package com.javalab.collection.pkg04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		//Map은 키 : 밸류 형식으로 들어감
		//키는 중복 불가, 키값으로 밸류를 찾아오기 때문
		
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 90);
		map.put("홍길동", 95);	// 중복값은 나중에 들어간 애로 적용됨~!
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		
		//키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + " : " + map.get("홍길동"));
		System.out.println();
		
		//키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();	// keySet() = 모든 키를 Set 컬렉션에 담아서 반환
		//keySet.iterator() 반복자 리턴
		Iterator<String> ketIterator = keySet.iterator();
		System.out.println("ketIterator.getclass().getSimpleName() : " + key);
		while (ketIterator.hasNext()) {
			String k = ketIterator.next();	//k 타입은 String(이름)
			Integer v = map.get(key);	//점수
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		//엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<Entry<String, Integer>> entrysSet = map.entrySet();
		Iterator<Entry<String,Integer>> entryIterator = entrysSet.iterator();
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();	//k 타입은 String(이름)
			Integer v = entry.getValue(); 	// 점수
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		//키로 엔트리 삭제, 삭제 후 지운 정수를 리턴함
		//map.remove("홍길동");
		Integer score = map.remove("홍길동");	// 삭제된 키와 매핑되는 값을 반환
		System.out.println("score : " + score);
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
	}

}
