package edu.kh.variable.example1;

public class VariableExample4 {
	public static void main(String[] args) {
		/*
		강제 형변환
		- 기존 자료형을 원하는 자료형으로 강제 변환시키는 것
		1. 값의 범위가 큰 자료형을 작은 것으로 변환 시킬 때 사용
		2. 출력되는 데이터의 표기법을 변화시키고 싶을 때
		
		* 강제 형변환 방법
		-자료형을 변환시키고 싶은 값 또는 변수 앞에 (자료형) 을 작성
		ex) double temp = 3.14;
			int num = (int)temp;
			
		*/
		
		double temp = 3.14;
		int num = (int) temp;
		
		System.out.println("temp: " + temp);
		System.out.println("num: "  + num);
		// 실수 --> 정수형 변환 시 소수점 버림 처리(데이터 손실 때문에)
		
		int a = 123;
		double b = (double) a;
		
		System.out.println(a);
		System.out.println(b);
	}
}