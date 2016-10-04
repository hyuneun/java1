package pack;

import java.util.Scanner;

public class Test12_while {

	public static void main(String[] args) {
		// while
		int w = 1;
		while(w <= 5){
		System.out.print("w : " + w + " ");
		w++;//반복문을 벗어날수 있는 명령문꼭 필요!!!
		}
		System.out.println("\n y는" + w);
		int su = 0 ,tot = 0;
		while(su < 11){
			//System.out.println(su);
			tot += su;
			su++;
		}
			System.out.println(tot);
		while(true){
			w++;
			if(w ==5) continue;
			System.out.println("w=" + w);
			if(w == 10) break;
		}
		
		w =6;
		do{
			System.out.println(w);
			w++;
		}while(w <= 5);
		System.out.println();
		int i = 0;
		int	hap = 0;
		int	su1 = 0;
		
		while(true){
			i++;
			if(i % 3 == 0 && i % 2 != 0){
				System.out.println(i);
				hap += i;
				su1++;
			}else if(i > 101){
				break;
			}
			
		}
		
		System.out.println("합" + hap);
		System.out.println("갯수" + su1);
		
		System.out.println();
		int i1=3;
		int hap1 = 0;
		while(true){
			i1 -= 4;
			hap1 += i1;
			
			if(i1 == -97){
				break;
			}
		}
		int i2 =-1;
		int hap2 =0;
		while(true){
			i2 += 4;
			hap2 += i2;
			System.out.println(i2);
			if(i2 == 99){
				break;
			}
		}	
		
		System.out.println(hap1 + hap2);
		
		System.out.println();
		
		int count = 0;
		int i3 = 0;
		int i4 = 0;
		int i5 = 0;
		while(i3 <= 1000){
			i3++;
	
			while(i4 <= i3){
				i4++;
				if(i3 % i4 == 0){
						count++;
						
				}
				
			}
			if(count == 2){
				i5 += 1;
				System.out.println(i3);		
			}
			count = 1; 
			i4 = 1;
		}	
			
			System.out.println(i5);
			System.out.println();
			int k = 0;
			Scanner sc = new Scanner(System.in);
			
			
			/*while(true){
				System.out.println("숫자:");
				int suu = sc.nextInt();
				int h = 0 , k1 = 1;
				while(k1 <= suu){
					h += k1;
					k1++;
					
				}
				
				System.out.println(h);
				System.out.println("계속할까요 (y/n)");
				String m = sc.next();
				if(m != "y") {
					System.out.println("반복작업종료");
					break;
					
					
				}
			}*/
				System.out.println();
			
				int a = 0 , m = 0 , e = 0;
			
				while(a == 4){
				 a++;
				 for(int j = 0; j < m; j++){
						System.out.print(" ");
					}
				 for(int f = 1; f <= e; f++){
						System.out.print("o");
					}
				 m++;
			}
				
				
				
			
				
}
}
