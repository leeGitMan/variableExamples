package edu.kh.variable.example1;

public class VariableExample2 {
	public static void main(String[] args) {
		/*
		자바 기본 자료형 8가지
		논리형: boolean(1바이트)
		정수형: byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
		실수형: float(4바이트, 소수점 8개 가능), double(8바이트, 소수점 16개 가능)
		문자형: char(2바이트, 유니코드)
		참조형: String
		*/
		
		// 변수 선언: 메모리에 값(Data)을 저장할 공간을 할당하는 것.
		// 변수 값 대입: 변수에 값을 집어 넣는 것.
		
		boolean booleanData;
		// 메모리에 논리 값(T,F)을 저장할 공간 1바이트 할당 하고
		// 할당 된 공간을 booleanData라고 부르겠다 라는 뜻.
		
		booleanData = true;
		// =: 대입 연산자 => 오른쪽에 있는 값을 왼쪽에 대입하겠다 라는 뜻.
		System.out.println("booleanData: " + booleanData);
		

		//정수형 예)
		byte byteNumber;
		byteNumber = 127;
		System.out.println("byteNumber: " + byteNumber);
		/*
		메모리에 정수값을 할당 할 공간 1바이트 할당하고 
		할당 된 공간을 byteNumber라고 부르겠다.
		그리고 선언된 byteNumber 변수에 처음으로 127을 넣음.
		초기화: 처음 변수에 값을 넣은 것
		*/
		
		short shortNumber = 32767; // 변수 선언 및 초기화 한 것
		
		// 정수 자료형의 기본형
		int intNumber = 1022341347; // 변수 선언 및 초기화 한 것
		// 대입 되는 값들을 리터럴이라 부름
		// 프로그래밍에서는 대입되는 데이터를 리터럴이라는 단어로도 표현
		// **리터럴: 변수에 대입되거나 작성되는 값 자체
		// + 자료형에 따라 리터럴 표기법이 다르다.
		
		long longNumber = 1000000000000000000L; // float과 마찬가지로 L,l 을 표시해줘야한다.
		
		// 실수 자료형
		float floatNumber = 1.223456f; // f를 안붙이면 더블로 인식한다
		double doubleNumber = 3.1415926535793; // d를 쓸 수는 있다. but 실수형은 float, double 두개뿐이라서 안쓰면 더블로 인식
		
		
		System.out.println(shortNumber);
		System.out.println(intNumber);
		System.out.println(longNumber);
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		System.out.println();
		
		// 문자형 리터럴 표기법: ' ' (홀따옴표)
		// -> 문자 하나 표시
		char ch= 65; // == char ch= 'A';
		char ch2 = 66;
		String str = "Hello Java!"; // String은 무조건 " " 이걸 서야함.
		
		System.out.println("ch: " + ch);
		System.out.println("ch2: " + ch2);
		System.out.println();
		
		
		/*
		char 자료형에 숫자가 대입 될 수 있는 이유
		컴퓨터에는 문자표가 존재하는데, 숫자에 따라 지정된 문자 모양이 매칭되어 있고,
		예를 들어 'B' 라는 문자 그대로가 대입되면 변수에 숫자 66으로 변환돼서 저장이 됨
		--> 반대로 생각하면 변수에 66을 대입해도 문자 B라는 값이 출력된다.
	    */
		
		
		/*
		------------------------------------------------------------------------------
		1. 대소문자 구분 한다, 길이 제한 없다.
		int asdfasdklfjasdklfjaslkdfjalskdfjaslkdfjalksdfjklasdf;
		int asdfasdklfjasdklfjaslkdfjalskdfjaslkdfjalksdfjklasdF;
		
		2. 예약어 사용 안됨.
		float double; --> X
		
		3. 숫자 시작 불가능
		char 1abc; --> X
		char abc1; --> O
		
		4. 특수 문자 '_','$'만 사용 가능(하지만 쓰지 않는다)
		int $intNumber --> 문제는 없지만 사용 하지 않는다.
		int int_number; --> 자바는 카멜표기법을 쓰기에 '_' 작성 안함
		대신 '_'은 DB에서 사용 왜냐하면 DB에서는 대문자만 표기하기 때문에
		
		5. 카멜 표기법
		변수명 작성 시 여러 단어를 이어서 작성하는 경우
		띄어쓰기를 쓰지 않고 후속단어의 첫 글자를 대문자로 사용
		ex) int studentOfNumber;
		
		6. 변수명은 언어를 가리지 않는다.(하지만 사용 하지는 않는다)
		
		---------------------------------------------------------------------------------
		*/
		
		int number = 10;
		System.out.println("number: " + number); // 10
		
		number = 20;
		System.out.println("number: " + number); // 20
		
		/*
		상수(항상 같은수 --> 변하지 않는 수)
		변수의 한 종류임
		한 번 값이 대입되면 다른값으로 대입 불가능
		자료형 앞에 final 키워드를 작성(마지막 대입되는 값)
		
		상수 명령 규칙 --> 모두 대문자로 사용, 여러 단어 작성 시에는 '_'붙이기
		
		상수를 사용 하는 경우
		1. 변하면 안되는 고정된 값을 저장할 때
		2. 특정한 값 의미 부여할 때에도 사용
		*/
		
		final double PI_VALUE = 3.14;
		// PI_VALUE = 2.3; error! 대입 불가
		System.out.println(PI_VALUE);
		
	}

}
