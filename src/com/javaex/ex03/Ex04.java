package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		int workTime = sc.nextInt();
		int salary = 0;
		
		if (workTime <= 8) {
			salary = workTime*10000;
		} else {
			salary = (workTime-8)*12000+8*10000;
		}
		
		System.out.println("입금은 "+salary+"원 입니다.");
		
		sc.close();
		
	}
}
