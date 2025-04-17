package com.javaex.ex02;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
	    final double dtow = 1230.95;
	    
		//키보드 연결
		Scanner sc = new Scanner(System.in);
		
		System.out.print("환전할 원화를 입력하세요: ");
		
		long num = sc.nextLong();	//입력대기
		
		System.out.println("받으실 달러는 "+num/dtow);
		
		//키보드 해제
		sc.close();
	    
	}
}
