package com.javaex.ex05;

public class Ex11 {
	
	public static void main(String[] args) {
		
		int[] leftArray = new int[] {10,20,30};
		int[] rightArray = new int[] {10,20,30,40};
		
		int minLen;
		if(leftArray.length>=rightArray.length) {
			minLen = rightArray.length;
		}else {
			minLen = leftArray.length;
		}
		
		for(int i = 0; i<minLen; i++) {
			System.out.println("left: "+leftArray[i]);
		}
		
		System.out.println("------------");
		
		for(int i = 0; i<minLen; i++) {
			System.out.println("right: "+rightArray[i]);
		}
		
		
		
	}

}
