package com.javaex.ex01;

public class Ex11 {
	
	public static void main(String[] args) {
		
		//논리연산자
		int a = 5;
		int b = 7;
		
		System.out.println("&& 연산자 ---------------");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("|| 연산자 ---------------");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("! 연산자 ---------------");
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println("-----------------------");
		
		boolean result = (a<b)&&(a>b);
		System.out.println(result);
		
		System.out.println(true && false || true);
		System.out.println(true || false || true);
		
		System.out.println("-----------------------");
		System.out.println((a>b));
		System.out.println(!(a>b));

		System.out.println("-----------------------");
		int w=1, x=2, y=3, z=4;
		w=x=y=z; //오른쪽에서 왼쪽으로 
		System.out.println(w);
		
		
		
		
		
	}
}
