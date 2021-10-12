package Day01;

import java.util.Scanner;

public class Day01_4 {

	public static void main(String[] args) {
		
		// 1. 입력객체 선언 : 키보드로부터 입력값을 저장하는 객체 
		Scanner scanner = new Scanner(System.in);
			// 객체선언 : 클래스명, 객체명 (임의) = new 생성자( );
		
		// 2. 입력받은 값 꺼내와서 변수에 저장
			// 변수는 값을 저장할 수 있는 메모리(기억장치)
		System.out.print("첫번째 입력 : ");
		String input1 = scanner.next();
			// String : 문자열 클래스 : 문자열을 저장하는 객체 선언

		System.out.print("두번째 입력 : ");
		int input2 = scanner.nextInt();
		// int : 정수형(숫자) 자료형 : 정수를 저장하는 변수 선언
		
		// 3. 변수 출력
		System.out.println("첫번째 입력값은 : " + input1);
		System.out.println("두번째 입력값은 : " + input2);
		
		// 문제1
		/*
		 * 학생 한명의 이름과 1~3교시의 출석 여부를 입력받아 아래와 같이 출력
		 *  			[[ 출석부 ]]
		 * ------------------------------------
		 * 이름		1교시	2교시	3교시	비고
		 * 강호동		출석		출석		출석
		 * ------------------------------------
		 */
		
		System.out.print("학생의 이름 : ");	 String name = scanner.next();
		System.out.print("1교시 출석여부 : ");	 String class1 = scanner.next();
		System.out.print("2교시 출석여부 : ");	 String class2 = scanner.next();
		System.out.print("3교시 출석여부 : ");	 String class3 = scanner.next();
		
		System.out.println("\t\t[[ 출석부 ]]");
		System.out.println("------------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		System.out.println(name + "\t" + class1 + "\t" + class2 + "\t" + class3);
			// 변수나 객체명은 문자처리 생략
		System.out.println("------------------------------------");
	}
}
