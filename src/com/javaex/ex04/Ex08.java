package com.javaex.ex04;

public class Ex08 {
	
	public static void main(String[] args) {
		
		for(int dan=1; dan<=6; dan++) {
			
			for(int li = 1; li<=6; li++) {
			
				System.out.print("*");
				
			}
			
			System.out.println("");
			
		}
		
		System.out.println("");
		
		for(int i=1; i<=6; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println("");
			
		}
		
	}
}
