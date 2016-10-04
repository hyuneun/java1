package pack;

import java.math.BigDecimal;

public class Test6bigdecimal {

	public static void main(String[] args) {
		// 컴의 double 연산처리오류
		//double a = 1.5;
		//double b = 1.2;
		double a = 2.0;
		double b = 1.1;
		
		System.out.println(a + b);
		System.out.println(a - b);
		
		System.out.println();
		BigDecimal d1 = new BigDecimal("2.0");
		BigDecimal d2 = new BigDecimal("1.1");
		System.out.println(d1.subtract(d2));
		
		System.out.println();
		// 큰정수값처리
		BigDecimal no1 = new BigDecimal("123456789123456789123456789");
		BigDecimal no2 = new BigDecimal("123456789123456789123456780");
		System.out.println(no1.add(no2));//+
		System.out.println(no1.subtract(no2));//-
		System.out.println(no1.multiply(no2));//*
		System.out.println(no1.divide(no2, 10, BigDecimal.ROUND_UP));// /
														  //└반올림
	}

}
