package pack;

import java.util.Scanner;

public class Test10_for {

	public static void main(String[] args) {
		// for문(반복문) 연습
		System.out.println("뭔가를 진행하다가?");
		{
			int kbs = 9;
			{
				int sbs = 6;
				System.out.println(kbs + " " + sbs);
			}
			System.out.println(kbs + " ");
		}
		/*
		int a;
		int hap = 0;  //누적기억장소 = 초기화필수!!
		for(a = 1; a <= 100900; a++){
			//System.out.print(a + "\t");
			hap += a;
		}
		System.out.println("탈출후 a:" + a);
		System.out.println("합은?" + hap);
		
		for(int i = 65; i <= 90; i++){
			//System.out.println((char)i + " ");
		}
		System.out.println(); //초기치를 복수로 줄수도있다, 초기치를 for바깥에서 쓸수도있다(권장하지않음)
		for (int i = 10; i <= i; i++) {
			//System.out.print(i + " ");
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단입력");
		int g = sc.nextInt();
		
		if(g >= 2 && g <= 9){
		for(int count = 1; count < 10; count++){
			System.out.println(g +" * "+ count + " = " + (g * count));	
		}
	}
		System.out.println();
		/*for (char i = 65; i<=90; i++){
			System.out.print(i + " : ");
			for(char j = i; j <= 'Z'; j++){
				System.out.print(j);
				
			}
			System.out.println();
			
		}
		*/
		
		for(int a = 2; a < 10; a++){
			System.out.println(a + "단");
		for(int count = 1; count < 10; count++){
			System.out.println(a +" * "+ count + " = " + (a * count));
			
		}
	}
			int su1=0;
			int su2=0;
		
		for(int su = 1; su <= 100; su++){
			if(su % 3 == 0 && su % 5 == 0){
				su1++;
				su2 += su;
			}	
		}
			System.out.println("3의배수와5의배수갯수 = " + su1);
			System.out.println("3의배수와5의배수의합 = " + su2);
		
			
			for(int e = 1; e <= 10; e++){
				if(e % 2 != 0){
					switch(e){
					case 1:
						System.out.print("    ");
					for(int f = 1; f <= e; f++){
						System.out.print("o");}	
					break;
					case 3:
						System.out.print("   ");
					for(int f = 1; f <= e; f++){
						System.out.print("o");}
					break;
					case 5:
						System.out.print("  ");
					for(int f = 1; f <= e; f++){
						System.out.print("o");}
					break;
					case 7:
						System.out.print(" ");
					for(int f = 1; f <= e; f++){
						System.out.print("o");}
					break;
					case 9:
						System.out.print("");
					for(int f = 1; f <= e; f++){
						System.out.print("o");}
					break;
					}
					System.out.println();
				}
					
			}
		
			for(int e = 10; e >= 1; e--){
				if(e % 2 != 0){
					switch(e){
					case 1:
						System.out.print("    ");
					for(int f = 1; f <= e; f++){
						System.out.print("o");}	
					break;
					case 3:
						System.out.print("   ");
					for(int f = 1; f <= e; f++){
						System.out.print("o");}
					break;
					case 5:
						System.out.print("  ");
					for(int f = 1; f <= e; f++){
						System.out.print("o");}
					break;
					case 7:
						System.out.print(" ");
					for(int f = 1; f <= e; f++){
						System.out.print("o");}
					break;
					case 9:
						System.out.print("");
					for(int f = 1; f <= e; f++){
						System.out.print("o");}
					break;
					}
					System.out.println();
				}
					
			}
			
				System.out.println();
			int l = 4;
			for(int e = 1; e <= 8; e++){
				if(e % 2 == 0){
					for(int j = 0; j < l; j++){
						System.out.print(" ");
					}
					
					for(int f = 1; f <= e; f++){
						System.out.print("o");
					}
					l--;
					System.out.println();
				}
			}
			
			int x = 5;
			while(x >= -5){
				if(x != 0){
					System.out.println();
					int temp;
					if(x < 0)
						temp = x * -1;
					else
						temp = x;
					
					int y = 1;
					while (y <= temp) {
						System.out.print(" ");
						y++;
					}
					
					int z1 = 1;
					while (z1 <= 6 - temp){
						char ch = 'A';
						System.out.print((char)(ch + z1 - 1));
						z1++;
					}
					
					int z2 = temp;
					while(z2 <= 5){
						char ch = 'E';
						System.out.print((char)(ch - (z2 - 1)));
						z2++;
					}
				}
				x--;
			}
			
			System.out.println("계속");
	}

}
