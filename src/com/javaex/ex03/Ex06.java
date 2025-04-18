package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요:");
		int score = sc.nextInt();
		
		if (score >= 90 || score < 0) {
			System.out.println("0부터 100 사이의 수를 입력하세요");
		} else if (score >= 90) {
			System.out.println("A등급");
		} else if (score >= 80) {
			System.out.println("B등급");
		} else if (score >= 70) {
			System.out.println("C등급");
		} else if (score >= 60) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
		
		sc.close();
		
	}
}
