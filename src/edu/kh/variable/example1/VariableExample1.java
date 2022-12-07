package edu.kh.variable.example1;

public class VariableExample1 {
	public static void main(String[]args){  // main method 꼭 있어야 한다
		
		// notice  문장 끝에 ;(세미클론)  찍어줘야 문장의 끝이라고 인식함.
		System.out.println(2 * 3.141592653589793 * 5);
		System.out.println(3.141592653589793 * 5 * 5);
		System.out.println(3.141592653589793 * 5 * 5 * 20);
		System.out.println(4 * 3.141592653589793 * 5 * 5);
		System.out.println();
		
		
		// 변수 사용 해보자!
		
		double pi = 3.141592653589793;  // 소수점은 double 이라는 자료형을 사용한다 파이썬에서는 float
		int r = 5; // 반지름(radious)
		int h = 20; // 높이(height)
		
		System.out.println(">>>>>>>>>>>>>>>변수 사용>>>>>>>>>>>>>>>>>");
		System.out.println();
		System.out.println(2 * pi * r);       // 원의 둘레
		System.out.println(pi * r * r);       // 원의 넓이
		System.out.println(pi * r * r * h);   // 원기둥의 부피
		System.out.println(4 * pi * r * r);   // 구의 겉 넓이
		
		
		/*
		변수(Variable) - 메모리(RAM)에 값을 기록하는 공간(상자로 생각하면 됨)
		-> 공간에 기록되는 값(Data)이 변할 수 있어서 변수라고 한다.
		변수는 여러 종류가 존재(저장되는 값의 형태, 크기가 다름)
		ex) double, int, char, boolean, short, long , float, byte.... String 은 참조형
		
		Character 문자형 변수 - 문자 하나만 입력가능
		String 문자열 변수 
		
		변수 사용의 장점
		1. 가독성 증가 (읽기 편해짐)
		2. 재사용성 증가 (한 번 만든 변수를 계속 사용)
		3. 코드 길이가 줄어듦
		4. 유지 보수성 증가 (코드 수정이 간단해짐) 
		*/
		
		
		
	}
}
