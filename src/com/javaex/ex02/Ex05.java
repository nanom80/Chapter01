package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		//키보드 연결
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		int age = sc.nextInt();
		
		sc.nextLine(); //숫자를 먼저 입력받는 경우 nextLine() 메소드를 사용
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.println("당신의 나이는 "+age+" 이름은 "+name+" 입니다");
		
		//키보드 해제
		sc.close();
		
	}
}
