package pack;

public class Test4 {

	public static void main(String[] args) {
		//논리연산자 처리시 주의사항
		boolean a = false, b = true, c;
		c = a || b;
		System.out.println(c);
		c = a && b;
		System.out.println(c);
		
		System.out.println();
		boolean b1, b2;
		b1 = aa();
		System.out.println(b1);   // aa의 값을 b1에 저장해서 출력
		System.out.println(bb()); // bb를 수행한반환값 출력
		
		System.out.println("\n-----------주의할점-----------");
		// \n 라인스킵 \t 탭키
		b2 = aa() || bb();  //aa()가 true를 만족했으므로 bb()를 실행x
						   // 뒤에것도 실행하고싶으면 |사용
		System.out.println(b2);
		
		System.out.println();
		
		b2 = bb() && aa();
		System.out.println(b2);	//bb()가 false이므로 aa()를 실행x
  	}
	public static boolean aa() {
		System.out.println("aa출력");
		return true;
	}
	
	public static boolean bb() {
		System.out.println("bb처리");
		return false;
	}
}
