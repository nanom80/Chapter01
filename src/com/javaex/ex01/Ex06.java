package com.javaex.ex01;

public class Ex06 {
	public static void main(String[] args) {
		//자동 형변환
		int var01 = 2;
		double var02 = 3.5;
		double result01 = var01 + var02; //2가 2.0으로 자동 형변환(암묵적 형번환)됨
		System.out.println(result01);
		
		double result02 = 3.0 + 5; //5가 5.0으로 자동 형변환(암묵적 형번환)됨
		System.out.println(result02);
		
		long var03 = 12345L;
		float var04 = 1.5F;
		float result03 = var03 + var04;
		System.out.println(result03);
		
		//강제 형변환
		float var05 = 123.4567F;
		int var06 = (int)var05; //123.4567F -> 123
		System.out.println(var06);
		
		//강제 형변환 -> 확대 byte(1) => int(4)
		byte var07 = 10;
		System.out.println(var07);
		int result04 = (int)var07;
		System.out.println(result04);
		
		//강제 형변환 -> 축소 int(4) => byte(1)
		int var08 = 10;
		System.out.println(var08);
		byte result05 = (byte)var08;
		System.out.println(result05);
		
		int var09 = 203029770;
		System.out.println(var09);
		byte result06 = (byte)var09;
		System.out.println(result06);
		
		//강제 형변환 (실수->정수)
		double var10 = 5.57;
		System.out.println(var10);
		int result07 = (int)var10;
		System.out.println(result07); //소수점 없어짐
		
		//강제 형변환 (정수->실수)
		int var11 = 7;
		System.out.println(var11);
		double result08 = (double)var11;
		System.out.println(result08);
		
		
		
	}
}
