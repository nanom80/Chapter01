package com.javaex.ex01;

public class Ex09 {
	
	public static void main(String[] args) {
		
		System.out.println("--------대입연산자--------");
		int a = 7;
		int b = 2;
		System.out.print("a = ");
		System.out.println(a);
		System.out.print("b = ");
		System.out.println(b);
		
		
		System.out.println("--------산술연산자--------");
		int sum = a + b;
		System.out.print("7 + 2 = ");
		System.out.println(sum);
		
		System.out.print("7 + 2 = ");
		System.out.println(a+b);
		
		System.out.print("7 - 2 = ");
		System.out.println(a-b);
		
		System.out.print("7 * 2 = ");
		System.out.println(a*b);
		
		System.out.print("7 / 2 = ");
		System.out.println(a/b);
		
		System.out.print("7 * 2 = ");
		System.out.println(a%b);
		
		System.out.print("7 / 2 = ");
		System.out.println(7/2);
		
		System.out.print("7.0 / 2 = ");
		System.out.println(7.0/2);
		
		System.out.println("--------부호연산자--------");
		int var = -3;
		int pVar = -var;
		System.out.println(var);
		System.out.println(pVar);
		
		
		System.out.println("--------증감연산자--------");
		System.out.println(a); //7
		System.out.println(++a); //8 prefix 증가 후 출력
		System.out.println(a); //8
		System.out.println(--a); //7 prefix 감소 후 출력
		System.out.println(a); //7
		System.out.println(b); //2
		System.out.println(b++); //2 postfix 출력 후 증가
		System.out.println(b); //3
		System.out.println(b--); //3 postfix 출력 후 감소
		System.out.println(b); //2
		
		
		int num1 = 7;
		int num2 = 0;
		num2 = ++num1;
		System.out.println(num1);
		System.out.println(num2);
		
		num1 = 7;
		num2 = 0;
		num2 = num1++;
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println("--------------------------");
		int c = 5;
		System.out.println(c);
		System.out.println(++c+2);
		System.out.println(c);
		
		System.out.println("--------------------------");
		int d = 5;
		System.out.println(d);
		System.out.println(d+++2);
		System.out.println(d);
		
		
		
		
		
		
		
		
		
	}

}
