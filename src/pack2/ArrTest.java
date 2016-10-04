package pack2;

import java.net.StandardSocketOptions;

public class ArrTest {

	public static void main(String[] args) {
		//성격과 크기가 일치하는 복수계의 기억장소를 
		//대표명 하나를 주고 첨자로 각 기억장소를 구분 반복처리효과적
		//int[] ar;
		//int ar[];
		//ar = new int[5]; //기억장소를 확보
		int[] ar = new int[5];
		System.out.println("배열" + ar.length);
		ar[0] = 10; ar[1] = 20; ar[4] = ar[0] + ar[1];
		System.out.println(ar[4]);
		//ar[5] = 50; 실행에러
		//System.out.println(ar[5]);
		int a = 4, b = 4;
		System.out.println(ar[4] + " " + ar[a] + " " + ar[b] + " " + ar[3+1]);
		
		//선언과동시에 값부여
		int[] ar1 = {1,2,3,4,5};
		System.out.println(ar1[1] + " " + ar[1]);
		System.out.println(ar1[0]);
	
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}
	
		System.out.println();
		for (int i:ar1) { //향상된 for - 배열,컬렉션에서 쓴다
			System.out.println(i + " ");
		}
	
		System.out.println();
		String[] city = {"서울","대구","부산","광주"};
		for(String i:city){
			System.out.println("도시명" + i);
		}
			System.out.println();
		int[] ar2 = new int[5];
		for (int i = 0; i < ar2.length; i++){
				ar2[i] = i + 1;
		}
		for (int j = 0; j < ar2.length; j++) {
			System.out.println(ar2[j] + " ");	
		}
	
		int tot = 0;
		for (int j = 0; j < ar2.length; j++){
			tot += ar2[j];
		}
	System.out.println("합은" + tot);
	
	//다차원 배열
	int su[][] = new int [3][4];
	System.out.println(su.length);
	int num = 10; 
	for(int i = 1; i < su.length; i++){
		for (int j = 0; j < su.length; j++) {
			System.out.println(su[i][j] + " ");
			su[i][j] = num++;
		}
	}
	
	int[][] scores = new int[2][]; //가변배열
	scores[0] = new int[2];
	scores[1] = new int[3];	
	System.out.println(scores.length + " " + scores[0].length + " " + scores[1].length);	
		System.out.println();
		int[][] jum = {{90, 96},{89, 87}}; //선언과 함계 초기치 부여
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
