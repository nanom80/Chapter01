package com.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
		
		double v01 = 5/4; //1.25 -> 1 -> 1.0 (정수형으로 연산 후 더블형으로 변환)
		System.out.println(v01);
		
		double v02 = (double)5/4;
		System.out.println(v02);
		
		double v03 = 5 / (double)4;
		System.out.println(v03);
		
		double v04 = (double)5 / (double)4;
		System.out.println(v04);
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05);
		
		double v06 = (int)1.3 + 1.8;
		System.out.println(v06);  
		
		
	}

}
