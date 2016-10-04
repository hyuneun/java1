package pack;

import java.util.Scanner;

public class Test8_swich {

	public static void main(String[] args) {
		// switch문
		//Scanner sc = new Scanner(System.in);
		//int nai = sc.nextInt();
		//nai = nai / 10 * 10;
		//System.out.println(nai);
		int nai = 30;
		switch (nai){
		case 30:
			System.out.println("삼십대");
			break;
		case 40:
			System.out.println("사십대");
			break;
		case 50:
			System.out.println("오십대");
			break;
		case 60:
			System.out.println("육십대");
			break;
		default:
			System.out.println("기타");
			break;
		}
		System.out.println();
		int time = (int)(Math.random() * 4) + 8;
		switch(time){
		case 8:
			System.out.println("출근");
			break;
		case 9:
			System.out.println("회의");
			break;
		case 10:
			System.out.println("코딩");
			break;
		default:
			System.out.println("잠");
			break;
		}
		System.out.println();
			
		Scanner sc = new Scanner(System.in);
		System.out.println("년도입력 : ");
		int y = sc.nextInt();
		System.out.println("월 입력 : ");
		int m = sc.nextInt();
		
		
		switch(m){
		case 1:
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
				System.out.println(y + "년 " + m + "월은 31일 윤년");
				}else{
				System.out.println(y + "년 " + m + "월은 31일 평년");	
				}
				break;
		case 2:
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
				System.out.println(y + "년 " + m + "월은 29일 윤년");
				}else{
					System.out.println(y + "년 " + m + "월은 28일 평년");	
				}break;
		case 3:
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
				System.out.println(y + "년 " + m + "월은 31일 윤년");
				}else{
				System.out.println(y + "년 " + m + "월은 31일 평년");	
				}break;
		case 4:
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
				System.out.println(y + "년 " + m + "월은 30일 윤년");
				}else{
				System.out.println(y + "년 " + m + "월은 30일 평년");	
				}break;
		case 5:
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
				System.out.println(y + "년 " + m + "월은 31일 윤년");
				}else{
				System.out.println(y + "년 " + m + "월은 31일 평년");	
				}break;
		case 6:
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
				System.out.println(y + "년 " + m + "월은 30일 윤년");
				}else{
				System.out.println(y + "년 " + m + "월은 30일 평년");	
				}break;
		case 7:
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
				System.out.println(y + "년 " + m + "월은 31일 윤년");
				}else{
				System.out.println(y + "년 " + m + "월은 31일 평년");	
				}break;
		case 8:
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
				System.out.println(y + "년 " + m + "월은 31일 윤년");
				}else{
				System.out.println(y + "년 " + m + "월은 31일 평년");	
				}break;
		case 9:
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
				System.out.println(y + "년 " + m + "월은 30일 윤년");
				}else{
				System.out.println(y + "년 " + m + "월은 30일 평년");	
				}break;
		case 10:
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
				System.out.println(y + "년 " + m + "월은 31일 윤년");
				}else{
				System.out.println(y + "년 " + m + "월은 31일 평년");	
				}break;
		case 11:
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
				System.out.println(y + "년 " + m + "월은 30일 윤년");
				}else{
				System.out.println(y + "년 " + m + "월은 30일 평년");	
				}break;
		case 12:
			if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
				System.out.println(y + "년 " + m + "월은 31일 윤년");
				}else{
				System.out.println(y + "년 " + m + "월은 31일 평년");	
				}break;
		}
		
		String dd;
		int d;
		if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
			dd = "윤년";
		}else{
			dd = "평년";
		}
		
		switch(m){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			d = 31;
			break;
			
		case 2:
			if(dd == "윤년"){
			d = 29;
			}else{
			d = 28;	
			}
			break;
		default:
			d = 30;
			break;
	}

		System.out.println(y + "년" + m + "월" + d + "일" + dd);
}
}