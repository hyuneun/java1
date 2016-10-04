package pack;

public class Test3 {

	public static void main(String[] args) {
		// 관계연산자 논리연산자 기타
		int a = 5;
		System.out.println(a > 3);
		System.out.println(a <= 3);
		System.out.println(a == 3);
		System.out.println(a != 3);
		
		System.out.println();
		int b = 10;
		System.out.println(a > 3 && b <= 10);
		System.out.println(a >= 3 && b == 5);
		System.out.println(a > 6 || b < 10);//      	우선순위
		System.out.println(a > 6 || b < 5);//산술연산 > 관계연산자 > 논리연산자
		System.out.println(a > 3 || b < 5 + 2);
		
		System.out.println();
		// 시프트연산자
		int ii = 5, ij;
		//System.out.println(ii + " " + ij); 지역변수는 초기화 필요
		System.out.println("ii" + " " + ii + " " + Integer.toBinaryString(ii));
		
		ij = ii << 1; //왼쪽으로 1비트이동 남은 오른쪽비트는 0 으로채움
		System.out.println("ij" + " " + ij + " " + Integer.toBinaryString(ij));
		
		ij = ii >> 2; //오른쪽으로 2비트이동 남은 왼쪽 2비트 는
					//부호와 같은값으로채움 +면"0" -면"1"
		System.out.println("ij" + " " + ij + " " + Integer.toBinaryString(ij));		
		
		
		ij = ii >>> 2; //오른쪽으로 2비트이동 남은 왼쪽비트는 0 으로채움
		//System.out.println("ij" + " " + ij + " " + Integer.
		//System.out.println();
		//삼항연산자
		int result = (ii >= 6)?100 : 100 + 50; //(조건)? 참인값:거짓인값
		System.out.println(result);
		
		int x,y,z;
		x=y=z=5;
		System.out.println(x +" "+ y +" "+ z);
	
		aa(); //메소드호출
		System.out.println();
		bb(54);
	
	}
	
	//메소드 정의   ┌메소드의 반환형(void는 아무것도 반환하지 않는다)
	public static void aa(){
		System.out.println("aa메소드수행");
	}				 
	public static void bb(int arg){
					//       └ (인수,인자,argument,parameter) 
		System.out.println("bb메소드수행");
		System.out.println(arg);
	}
}
