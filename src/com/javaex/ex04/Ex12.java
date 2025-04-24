package com.javaex.ex04;

public class Ex12 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i%2==0 && i%3==0) {
				
				continue;
			}
			
			System.out.print(i);
			
		}
		
		System.out.println("");
		System.out.println("************");
		
		for(int i=1; i<=10; i++) {
			
			if(i==6) {
				//;
			}else {
				System.out.print(i);
			}
			
		}
		
		System.out.println("");
		System.out.println("************");
		
		for(int i=1; i<=10; i++) {
			
			if(!(i==6)) {
				System.out.print(i);
			}
			
		}
		
		System.out.println("");
		System.out.println("************");
		
		for(int i=1; i<=10; i++) {
			
			if(i!=6) {
				System.out.print(i);
			}
			
		}
		
		
	}
}
