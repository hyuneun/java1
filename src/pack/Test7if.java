package pack;

import java.util.Scanner;

public class Test7if {

	public static void main(String[] args) {
		// 조건판단문
		int num = 5;
		
		if(num >= 3)
			System.out.println("크군요");
		
		System.out.println("다음작업계속");
		
		num = 5;
		if(num < 3){
			
			System.out.println("작군요");
			System.out.println("난참");
		}else{
			System.out.println("작지않음");
		}
	
		//문제 키보드로부터 상품명,수량,단가를 각각 입력받아 금액(수량*단가)
		//을구하시오 조건 - 5만원이상이면 10%를  아니면 5%
		//상품명 : *** 금액 : ***  세금 : *** 
	
		Scanner sc = new Scanner(System.in);
		System.out.println("상품입력:");
		String sang = sc.next();
		System.out.println("수량입력:");
		int su = sc.nextInt();
		System.out.println("단가입력:");
		int dan = sc.nextInt();
		int sa = su * dan;
		
		if(sa >= 50000){
			double sa1 = sa * 0.1;
			System.out.println("상품명 : " + sang + " 금액 : " + sa + " 세금 : " + sa1);
		}else{
			double sa1 = sa * 0.05;
			System.out.println("상품명 : " + sang + " 금액 : " + sa + " 세금 : " + sa1);
		}	
	
		System.out.println("상품명 : " + sang + " 금액 : " + sa + " 세금 : ");
	
	}
	

} 
