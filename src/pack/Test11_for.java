package pack;

public class Test11_for {

	public static void main(String[] args) {
		//for contiune break
		for (int i = 1; i <= 10; i++) {
			//if(i == 5) continue;//블럭의 끝을만나기전에 반복문 시작지점으로 돌아간다
			//if(i == 7) break;	//반복문 무조건탈출
			//if(i == 7) return;  // 메소드의 무조건 탈출
			//if(i == 7) System.exit(0); //프로그램의 무조건 종료
			System.out.println(i);
		}

		System.out.println("ff");
		
		int kk = 0;
		for(;;){
			kk++;
			System.out.println("sdf" + kk);
			break;
		}
		
		for (int i = 1; i <= 3; i++) {
			bb:for (int j = 1; j <= 5; j++) {
				aa:if(j == 3) continue; //for문에 라벨을달아서 지정할수잇다
				System.out.print(i + " " + j + " ");
			}
				System.out.println("------------");
		}
}
}
