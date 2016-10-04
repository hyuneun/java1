package pack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test5inout{

	public static void main(String[] args) throws Exception{
		// 프로그램 진행도중 외부에서 값얻기	  └키보드에서 값을받을때 써줘야한다
		if(args.length == 0){
			System.out.println("외부에서 값얻기 실패!");
			System.exit(0); // 응용 프로그램 무조건 종료
		}
		System.out.println("외부에서 얻은값 : " + args[0]);
		
		System.out.println("/n 프로그램 진행도중 키보드로부터 값얻기");
		System.out.println("문자입력:");
		int ch = System.in.read(); // Ascii 코드값 입력
		System.out.println("ch:" + ch + " " + (char)ch);
		
		System.in.read(); //enter 키 처리용
		System.in.read();
		
		//키보드에서 문자열 얻기
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("이름입력:");
		String irum = buf.readLine();
		System.out.println("나이입력:");
		String nai = buf.readLine();
		System.out.println("이름은 " + irum + "나이는 " + nai);
		
		//키보드에서 문자열얻기2
		System.out.println("\n 스캐너 클래스사용");
		Scanner sc = new Scanner(System.in);
		System.out.println("상품입력:");
		String product = sc.next();
		System.out.println("가격입력:");
		int price = sc.nextInt();
		System.out.println("상품명 " + product + "가격은" + price);
		
		
		
		
		
		System.out.println("처리완료");
		
	}

}
