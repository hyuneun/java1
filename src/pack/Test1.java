package pack;

public class Test1 {
	public static void main(String[] ar){
		System.out.println("성공");
		System.out.println("단축키를 연습하자");
		System.out.println();
		System.out.print("자바");
		System.out.print("변수");
		System.out.println("연습");
	
		
		//한줄주석	
		System.out.println("한줄"); //여기서부터 헹의 끝까지 주석
		/*
		여러줄
		주석
		 */
	
		//상수를 기억하고자 기억장소를 확보하고 기억장소에 이름을 부여 : 변수
		//기본형 bcbsilfd - 상수를 기억하는 자료형
		//String : 문자열 기억장소 : 기본형처럼 사용하나, 사실은 객체변수
		//참조형 : 객체변수
	
		
		byte var1; //변수 선언 형식 : 형 , 변수명
		var1 = 10; // -128~127 정수형    1바이트
		var1 = 5;
		
		System.out.println(var1);

		short var2 = 20000; // -32768 ~ 32767까지	2바이트
		System.out.println(var2);
		
		int var3 = 2147483647; //-2147483648 ~ 2147483647까지 4바이트
		System.out.println(var3);
		//2147483647까지는 정수형 int
		long var4 = 2147483647888888L; //long형 8바이트(L붙여야함)
		long var5 = 21L;
		System.out.println(var4);
		
		//promotion: 자동형변환 , cast : 강제형변환
		byte b1 = (byte)128;	//강제로 넣을수있다 결과는 쓰레기지만
		byte b2 = (byte)12;		//<--이게맞지만 자동으로 해줌
		byte b3 = b2;
		System.out.println(b1);
		System.out.println(b3);
		
		short s1 = 10; // (short)10 
		int i1 = s1;
		System.out.println(i1);
		short s2 = (short)i1;/* 변수를 지정할때 안맞는타입의
								변수를 넣기위해 casting한다*/
		System.out.println(s1);
		
		System.out.println("실수처리----------");
		double d1 = 10.0;
		d1 = 5; //정수는 실수형기억장소에 들어갈수있다
		System.out.println(d1);
		d1 = 56.7;
		
		float f1 = 3.5F;
		f1 = (float)3.5;
		System.out.println(f1);
	
		int i2 = (int)3.5;//버림
		System.out.println(i2);
		System.out.println();
		
		//연산 시 큰타입으로 자동변환이 이루어진다
		//double result = 4.5 * 10;
		//int result = (int)4.5 * 10;
		double dd = 5.5;
		int result = (int)4.5 * (int)dd;
		System.out.println("result :" + result);
		
		boolean bu1 = true;
		bu1 = false;
		System.out.println(bu1);
		System.out.println();
		
		char c1 = 'a';
		//c1 = 'abc'
		//c1 = "a";//큰따옴표는 문자열
		System.out.println(c1 + " " + (int)c1 + " " + (char)97);
		
		System.out.println("문자열처리 : String 객체 - 참조형");
		String irum = "홍길동";
		System.out.println(irum);
		
	}
														
	
}
