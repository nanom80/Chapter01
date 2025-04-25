package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		double[] doubleArr = new double[3];
		
		doubleArr[0] = 3.4;
		doubleArr[1] = 6.2;
		doubleArr[2] = 9; //자동형변환해서 9.0이 됨
		
		for(int i=0; i<doubleArr.length; i++) {
			System.out.println(doubleArr[i]);
		}
		
		System.out.println("--------------------");
		
		char[] charArr = new char[3];
		
		charArr[0] = 'a';
		charArr[1] = 'b';
		charArr[2] = 99;
		
		for(int i=0; i<charArr.length; i++) {
			System.out.println(charArr[i]);
		}
		
		System.out.println("--------------------");
		
		String[] stringArr = new String[3];
		
		stringArr[0] = "정우성";
		stringArr[1] = "유재석";
		stringArr[2] = "이효리";
		
		for(int i=0; i<stringArr.length; i++) {
			System.out.println(stringArr[i]);
		}
		
		System.out.println("반장: "+stringArr[1]);
		
	}

}
