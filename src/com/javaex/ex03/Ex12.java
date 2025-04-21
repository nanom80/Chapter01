package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		
		int month = sc.nextInt();
		
		switch(month) {
			case 1:
				System.out.println("31일 입니다.");
				break;
			case 2:
				System.out.println("28일 입니다.");
				break;
			case 3:
				System.out.println("31일 입니다.");
				break;
			case 4:
				System.out.println("30일 입니다.");
				break;
			case 5:
				System.out.println("31일 입니다.");
				break;
			case 6:
				System.out.println("30일 입니다.");
				break;
			case 7:
				System.out.println("31일 입니다.");
				break;
			case 8:
				System.out.println("31일 입니다.");
				break;
			case 9:
				System.out.println("30일 입니다.");
				break;
			case 10:
				System.out.println("31일 입니다.");
				break;
			case 11:
				System.out.println("30일 입니다.");
				break;
			case 12:
				System.out.println("31일 입니다.");
				break;
			default:
				System.out.println("1월부터 12월 중에서 입력하세요.");
				break;
				
		}
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일 입니다.");
			break;
		case 2:
			System.out.println("28일 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일 입니다.");
			break;
		default:
			System.out.println("1월부터 12월 중에서 입력하세요.");
			break;
		}
		
		switch(month) {
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.println("31일 입니다.");
				break;
			case 2:
				System.out.println("28일 입니다.");
				break;
			case 4, 6, 9, 11:
				System.out.println("30일 입니다.");
				break;
			default:
				System.out.println("1월부터 12월 중에서 입력하세요.");
				break;
		}
				
		sc.close();
	}

}
