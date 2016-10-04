package pack;

public class Test9_switch {

	public static void main(String[] args) {
		//switch
		//문자비교도가능
		double su1 = 10.5, su2 = 5, result = 0.0;
		char op = '+';
		switch (op){
		case '+':
			result = su1 + su2;
			break;
		case '-':
			result = su1 - su2;
			break;
		case '/':
			result = su1 / su2;
			if(su2 == 0.0)
				System.out.println("0으로나눌수없다");
			result = 0.0;
			break;
		case '*':
			result = su1 * su2;
			break;
		default:
			System.out.println("연산자 오류");
			
		}
		System.out.println("연산결과: " + result);
		
		System.out.println("\n 문자열비교도가능");
		String jik = "사원";
		switch(jik){
		case "사원":
			System.out.println("열심히해");
			break;
		case "대리":
			System.out.println("열심히해2");
			break;
		case "과장":
			System.out.println("열심히해3");
			break;
		case "사장":
			System.out.println("열심히해4");
			break;
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

}
