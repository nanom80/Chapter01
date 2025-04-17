package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		System.out.println("안녕");
		System.out.println("하세요!");
		
		System.out.print("안녕");
		System.out.println("하세요!");
		
		System.out.println("");
		System.out.println("\\");
		System.out.println("\"");
		System.out.println("--------------------");
		
		int i = 2345;
		double d = 3.14;
		char c = '한';
		String s = "한";
		String str = "문자열";
		System.out.println("--------------------");
		System.out.println(i);
		System.out.println(d);
		System.out.println(c);
		System.out.println(s);
		System.out.println(str);
		System.out.println("한글"+"문자열");
		System.out.println(s+str);
		System.out.println("한글"+str);
		System.out.println("--------------------");
		System.out.println("한글"+i);
		System.out.println("한글"+i+str);
		System.out.println("한글"+d+c);
		System.out.println("--------------------");
		System.out.println(i+i);
		System.out.println(i+d); //정수+실수==>실수(자동형변환)+실수
		System.out.println(str+i);
		System.out.println(str+d);
		
		String result = str + d; //문자열과 다른 데이타 타입이 더해지면 문자열이 된다
		System.out.println(result);
		System.out.println("--------------------");
		System.out.println(s+"test"+str);
		System.out.println(s+" test "+str);
		System.out.println(s+" "+str);
		System.out.println("이것은 "+str+"입니다.");
		System.out.println("--------------------");
		System.out.println(s+s);
		System.out.println(c+s);
		System.out.println(c+c); //char형은 코드값을 가지고 있다
		System.out.println("--------------------");
		System.out.println("이것은 \""+str+"\"입니다.");
		System.out.println("이것은 '"+str+"'입니다.");
		System.out.println("이것은 \\"+str+"\\입니다.");
		System.out.println("이것은\t"+str+"\t입니다.");
		System.out.println("이것은\n"+str+"입니다.");
		
		
	}
}
