package com.javalab.collection.pkg13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MartMain {
	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<>();
		//위의 타입은 Product타입 ArrayList
		products.add(new Product(1, "자전거", 250000));  
		products.add(new Product(2, "노트북", 1250000)); 
		products.add(new Product(3, "쌀", 150000));    
		products.add(new Product(4, "세탁기", 800000));  
		products.add(new Product(5, "시금치", 2500));    
		products.add(new Product(6, "대파", 10000));    
		products.add(new Product(7, "에어컨", 3500000)); 
		products.add(new Product(8, "쇼파", 3000000));  
		products.add(new Product(9, "우유", 2500));     
		products.add(new Product(10, "운동화", 600000)); 
		
		//[문제.1] 전체 상품 목록 출력 메소드 호출(수동으로 메소드 시그너처 생성)
		printAllProduct(products);
	
		//[문제.2] 원하는 상품을 파라미터로 전달받아서 검색해주는 메소드를 만들고 main메소드에서 출력
		Scanner scanner = new Scanner(System.in);
		String find = scanner.nextLine();
		getProductPrice(products, find);
		System.out.println(find + "의 가격은? : " + getProductPrice(products, find));
		
		
		System.out.println();
		
		//[문제.3] 구매한 제품의 평균 구매 가격을 조회해서 main 메소드에서 출력
		double avg = 0.0;
		getAverage(products,avg);
		System.out.println("평균 : " + getAverage(products,avg));
		System.out.println();
		
		//[문제.4] 제품 중에서 100만원이 넘는 제품들을 찾아서 ArrayList로 반환해주는 메소드 만들고, main에서 출력
		print100List(products);
		System.out.println("제품 중 100만원이 넘는 제품은?");
		for (Product product : print100List(products)) {
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
		}System.out.println();
		
		//[문제.5] HashMap을 통한 제품 출력
		Map <Integer,Product> hashData = new HashMap();
		hashData.put(1, new Product(1, "자전거", 250000));
		//원래는 아래와 같은 타입이 정석이나 위처럼 써도 오토 박싱 해줌
		//(new Integer (1), new Product(1, "자전거", 250000)
		hashData.put(2,new Product(2, "노트북", 1250000));
		hashData.put(3, new Product(3, "쌀", 150000));
		hashData.put(4,new Product(4, "세탁기", 800000) );
		hashData.put(5,new Product(5, "시금치", 2500) );
		hashData.put(6,new Product(6, "대파", 10000) );
		hashData.put(7,new Product(7, "에어컨", 3500000) );
		hashData.put(8,new Product(8, "쇼파", 3000000) );
		hashData.put(9,new Product(9, "우유", 2500) );
		hashData.put(10,new Product(10, "운동화", 600000) );
		
		System.out.println("HashMap을 통한 제품 출력");
		printProductMap(hashData);

		
	}
	/**
	 * [문제.5] HashMap을 통한 제품 출력
	 * @param hashData
	 */
	private static void  printProductMap (Map <Integer,Product> hashData){

		Set<Integer> keyset = hashData.keySet();
		Iterator<Integer> iter = keyset.iterator();
		while (iter.hasNext()) {
			Integer id = iter.next();
			Product product = hashData.get(id);
			System.out.println(hashData.get(id).toString());
			
		}
	}
	/**
	 * [문제.4] 제품 중에서 100만원이 넘는 제품들을 찾아서 ArrayList로 반환해주는 메소드 만들고, main에서 출력
	 * @param products
	 * @return
	 */
	private static ArrayList<Product> print100List (ArrayList<Product> products) {
		ArrayList<Product> list100 = new ArrayList<>();
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getPrice() > 1000000) {
				list100.add(products.get(i));
			}
		}
		return list100;
	}
	
	/**
	 * [문제.3] 구매한 제품의평균 구매 가격을 조회해서 main 메소드에서 출력
	 * @param products
	 * @param avg
	 * @return
	 */
	private static double getAverage (ArrayList<Product> products,double avg) {
		int sum = 0;
		for (Product product : products) {
			sum += product.getPrice();
		}
		avg = (double)sum/products.size();
		return avg; 
	}
	
	/**
	 * //[문제.2] 원하는 상품을 파라미터로 전달받아서 검색해주는 메소드를 만들고 main메소드에서 출력
	 * @param products
	 * @param find
	 * @return
	 */
	private static int getProductPrice(ArrayList<Product> products, String find) {
		int price = 0;
		for (int i = 0; i < products.size(); i++) {
			if (find.equals(products.get(i).getName())) {
				price = products.get(i).getPrice();
			}
		}
		return price;
	}
	/**
	 * [문제.1] 전체 상품 목록 출력 메소드 호출(수동으로 메소드 시그너처 생성)
	 * @param products
	 */
	private static void printAllProduct(ArrayList<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}System.out.println();

	}
	
	
}
