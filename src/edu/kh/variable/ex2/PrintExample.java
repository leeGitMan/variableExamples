package edu.kh.variable.ex2;

public class PrintExample {

	public static void main(String[] args) {
		
		/* 
		System.out.println(); : 한 줄 출력(출력 후 줄 바꿈 처림 == 개행)
		System.out.print(); : 단순 출력(개행 안함)
		두개는 줄 바꿈이라는 차이점이 있지만, 괄호 안에 내용은 그대로 출력된다는 것은 똑같다.
		
		*/
		
		System.out.println("Test");
		System.out.println("Test2");
		System.out.println("Test");
		System.out.println("Test");
		System.out.println("Test");
		System.out.println("Test");
		System.out.println("Test");
		System.out.println("Test");
		System.out.println("Test");
		System.out.println("Test");
		System.out.println();
		
		System.out.print("Test3 ");
		System.out.print("Test4 ");
		System.out.print("Test5");
		System.out.println();
		System.out.println();
		
		// System.out.printf(); : 출력될 문자열 형식을 패턴으로 지정하는 출력 구문
		
		int iNum1 = 10;
		int iNum2 = 5;
		int iNum3 = 2;
		
		
		// 10 + 5 = 15
		System.out.println("10 + 5 = " + (iNum1 + iNum2));
		// 길다
		
		// System.out.printf("패턴", 패턴에 들어갈 값);
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1 + iNum2);
		// printf도 print와 같이 개행이 되지 않기 때문에
		// \n 같은 개행 문자(escape)를 사용하여 다음줄로 개행가능
		// 10 + 10 * 5 / 2 = 35
		System.out.printf("%d + %d * %d / %d = %d\n", iNum1, iNum1, iNum2, iNum3, iNum1 + iNum1 * iNum2 / iNum3);
		// 10 + 10 + 10 + 5 * 5 / 2 = ?
		System.out.printf("%d + %d + %d + %d * %d / %d = %d\n", iNum1, iNum1, iNum1, iNum2, iNum2, iNum3, iNum1 + iNum1 + iNum1 + iNum2 * iNum2 / iNum3);
		System.out.println();
		
		
		int iNum4 = 3;
		System.out.printf("%5d\n", iNum4);
		// 5칸 공간 확보 후 오른쪽 정렬
		System.out.printf("%-5d\n" , iNum4);
		// 왼쪽 정렬은 음수로 표시
		System.out.println();
		
		
		// 소수점 자리 제어
		System.out.printf("%f\n", 2.5); // 2,500000
		System.out.printf("%.2f\n", 2.5); // 소수점 둘째 자리까지만 나타내기
		System.out.printf("%.0f\n", 2.5); // 소수점 표시 하지 않겠다 but 반올림됨
		System.out.println();
		
		// escape (이스케이프 == 탈출) 문자 : 일반 문자가 아닌, 특수 문자 표현 할 때 한다.
		System.out.println("\"Read this\"");
		System.out.println("\\"); // 백슬래시(역슬래시) 출력법
		System.out.println("\"I'm Lee HyunKyung\"");
		System.out.println("a\tb\tc\td"); // tap 키
		System.out.println();
		System.out.println("a\nb\nc");
		System.out.println();
		
		
		// 유니코드 이스케이프
		// 65 => A
		System.out.println("\u0041");
		
		
		
		
	}

}
