package pack2;

public class ArrTestEx {

	public static void main(String[] args) {
		int h1 = 0, k1 =1;
		int h = 0 , k = 1;
			if(args.length == 1){
				int a = Integer.parseInt(args[0]);
				while(k <= a){
					h += k;
					k++;
				}
				System.out.println(h);
			}else if(args.length == 2){
				int a = Integer.parseInt(args[0]);
				int b = Integer.parseInt(args[1]);
					if(a < b){
						while(a <= b){
							h1 += a;
							a++;
					}
						System.out.println(h1);
					}else{
					System.out.println("a보다 b가 크잖아!");
					return;
				}
				
			}else{
				System.out.println("1~2개까지만 집어넣어!");
				return;
			}
	
			
		
	
	
	
	}
}
