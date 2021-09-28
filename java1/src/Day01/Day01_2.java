package Day01;

public class Day01_2 { // c s

	// System.out.println(); // main 없이 실행 불가
	
	public static void main(String[] args) { // m s
	
		// 1. 출력
			// print(출력내용);	: 출력
			// println(출력내용);	: 출력 후 줄바꿈
			// printf(형식문자, 출력내용);	: 형식문자 맞는 출력
				// f : format (모양)
				// 형식문자
					// %d : 정수
					// %f : 실수
					// %s : 문자열
					// %c : 문자
				// 제어문자 [p.34]
					// \ : 엔터위에 원화기호 \
					// \n : 줄바꿈
					// \t : 탭(들여쓰기 => 5칸)
					// \r : 리턴(맨앞으로 이동)
					// \\ : \ 출력
		
		// 예1 : syso + ctrl + 스페이스바
		System.out.print("java");
		System.out.print(1234); // 기계어이기때문에 숫자는 문자처리 x
		System.out.print("java123"); // 문자+숫자 => 문자
		
			// System : 미리 만들어진 시스템이라는 클래스
				// out : 출력 스트림
					// print(인수:출력내용) : 출력 함수
			// . : 클래스 내 멤버(함수, 변수) 접근 연산자[특수문자]
			// " " : 키워드(미리 작성된 단어), 변수 등 제외한 모든 문자에 처리
			// ; : 한 줄의 실행코드 끝 (일처리)
		// ctrl + F11 : 컴파일 
		
		// 예2
		System.out.println("java");
		System.out.println(1234);
		System.out.println("java123");
		
		// 예3
		System.out.printf("%s", "java");
		System.out.printf("%d", 1234);
		System.out.printf("%s", "java123");
		
		// printf 장점
		System.out.printf("나이는 %d 입니다", 20);
		System.out.println("나이는 " + 20 + " 입니다");
		
		// 제어문자
		System.out.println("\njava\n");
		System.out.println("\t 12345");
		System.out.println("\rjava10");
		System.out.println("\rjava10");
		
		// 문제1
		/* 출력결과
		 * 				[[ 출석부 ]]
		 * ------------------------------------
		 * 이름		1교시	2교시	3교시	비고
		 * 강호동		출석		출석		출석
		 * 유재석		출석		출석		출석
		 * ------------------------------------
		 */
		
		System.out.println("[[ 출석부 ]]");
		System.out.println("------------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		System.out.println("강호동\t출석\t출석\t출석");
		System.out.println("유재석\t출석\t출석\t출석");
		System.out.println("------------------------------------");
		
		// 문제2
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
		System.out.println();
		// 문제3
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\"); // 문자처리 연산자 => \" : " 출력 
		System.out.println("|\"`\"`    |");
		System.out.println("||_/=\\\\__|");
		
		
	} // m e
} // c e
