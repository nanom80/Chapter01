package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		/* 키보드 연결 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		
		String name = sc.nextLine(); //대기, 입력하면 이어서 진행
		
		System.out.println("당신의 이름은 "+name+"입니다");
		
		/* 키보드 해제 */
		sc.close();
		
	}
}
