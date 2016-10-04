package pack2;

import java.util.ArrayList;

public class Enfor {

	public static void main(String[] args) {
		// 향상된 for
		int[] arr = {5,4,7,1,8,0,3,2,6};
		
		for(int a = 0; a < arr.length; a++){
			System.out.print(arr[a] + " ");
		}

		System.out.println();
		for(int kbs:arr){
			System.out.print(kbs + " ");
		}
		System.out.println();
		String[] name = {"tom", "james", "oscar"};
		for(String s:name){
			System.out.println(s + " ");
		}
		
		System.out.println();
	
		int[][] arr2 = {{3,4,5}, {7,8,9}, {1,2,3}};
		for(int[] a:arr2){
			for(int b:a){
				System.out.print(b + " ");
				
			}
			System.out.println();
		}
	
		System.out.println("--------------------");
		//컬렉션 : 객체를 기억하기 위한 기억장소
	ArrayList<String> list = new ArrayList<>();
	list.add("vaja");
	list.add("oracle");
	list.add("pytohn");
	System.out.println(list.size());//컬렉션은 size
	
	for(String s:list){
		System.out.println(s);
	}
	
	System.out.println();
	System.out.println(Flower.rose);
	Flower f = Flower.rose;
	for(Flower flo : Flower.values()){
		System.out.println(flo);
	}
	
	System.out.println("\n동적인자");
	printData(arr);
	System.out.println();
	printData(10);
	System.out.println();
	printData(10, 20);
	printData("h");
	printData("hh");
	printData("hhh");
	printData(Flower.values());
	
	
	
	}
	
	public static void printData(int ... p){ //...타입은 일치하나 인자수 다양
		for(int a:p){
			System.out.print(a + " ");
		}
	}
	
	public static void printData(String ... p){ //...타입은 일치하나 인자수 다양
		for(String a:p){
			System.out.print(a + " ");
		}
	}

	public static void printData(Flower ... p){ //...타입은 일치하나 인자수 다양
		for(Flower a:p){
			System.out.print(a + " ");
		}
	}
}