package pack;

public class test2 {

	public static void main(String[] args) {
		// 연산자
		int a = 5; // = 치환연산자
		int b = 3;
		int c = a + b;
		System.out.println(a + b);
		System.out.println(a * b);
		System.out.println(a - b);
		System.out.println(a / b); //몫
		System.out.println(a % b); //나머지
		System.out.println(a / (double)b); //몫과 나머지
		
		System.out.println(a / 0.0);//INFINITY무한대값
		System.out.println(a % 0.0); //NaN
	
		System.out.println(3 + 4 * 5);  // (*,/) > (+,-) 같을때는 왼쪽부터
		System.out.println((3 + 4) * 5); // 괄호는 최우선순위가됨
		
		String ss1 = "대한";
		String ss2 = "민국";
		String ss3 = ss1 + ss2; //문자열더하기
		System.out.println(ss3);
		System.out.println(ss3 + " " + 82); //숫자는 문자가된다
		System.out.println(ss3 + " " + (80 + 2));
		String ss4 = "5" + 6;
		System.out.println(ss4);
		int ia = Integer.parseInt("5") + 6; //숫자화
		System.out.println(ia);
		String ss5 = Integer.toString(5) + 6; //문자화
		System.out.println(ss5);
		
		//누적
		System.out.println();
		int no = 1;
		no = no + 1;
		no += 1;
		no++; // 증감연산자 ++,--
		++no;
		System.out.println(no);
		
		//증감연산자에 관하여
		int imsi = 5;
		int result = ++imsi + 1;//먼저 늘어나고연산
		System.out.println(imsi);
		System.out.println(result);
		
		System.out.println();
		
		int imsi2 = 5;
		int result2 = imsi2++ + 1;//연산하고 증가
		System.out.println(imsi2);
		System.out.println(result2);
		
		//부호에관하여
		System.out.println();
		int imsi3 = 3;
		System.out.println(imsi3);
		System.out.println(-imsi3);//변수에 부호를붙이면 부호가바뀐다
		System.out.println(imsi3 * -1);
	
	}

}
