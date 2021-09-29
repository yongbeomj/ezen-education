package Day02;

public class Day02_2 {
	
	// 변수 : 하나의 값을 저장할 수 있는 메모리 공간
		// 메모리[주기억장치=RAM] : 현재 실행 중인 프로그램 기억
			// 프로그램 <--- 프로세스(스레드) <--- 명령어(코드)
		// 변수 개수 증가 ---> 용량 증가 ---> 속도 감소
		// 변수 효율성 => 자료형
	
	// 변수 선언
		// 자료형 변수명(임의)
		// int age;
	
	// 변수명 규칙
		// 숫자로 시작 x	// 대소문자 구분 ....
	
	// 변수값 저장(오른쪽 값이 왼쪽에 대입 : 대입연산자 =)
		// int score; // 변수 선언
		// score = 90 // 변수에 90값 대입
	
	// 변수는 선언된 블록 내에서만 사용이 가능하다.(괄호 안으로 이동 가능 / 괄호 밖으로 이동 불가)(=지역변수)
	
	public static void main(String[] args) {
		
		// p.35 예
		int value = 10; // int형 자료의 value 변수명을 갖는 변수 선언과 동시에 10 대입
		int result = value + 10; // 변수는 연산이 가능
		
		System.out.println("결과 : " + result);
		
		// p.38 자료형
			// 자료형 사용 목적 : 메모리 효율성(적절한 사용)
			// 컴퓨터는 기계어 사용(0, 1) / 단위 : bit => 0 or 1
				// bit => 8bit => 1byte [01010101 = 1byte (8칸)]
				// 컴퓨터 표현 기본단위 : byte
		/*
		 *	[논리]
		 *	boolean	1비트		true, false
		 *	[문자]
		 *	char	2바이트		문자
		 *	[정수]
		 *	byte	1바이트		+-127
		 * 	short	2바이트		+-3만정도
		 *	int		4바이트		+-20억정도
		 *	long	8바이트		+-20억이상
		 * 	[실수]
		 * 	float	4바이트		소수점 8자리 표현
		 * 	double	8바이트		소수점 18자리 표현
		 */
		
		// p.40 byte [-128 ~ +127]
		byte var1 = -128; 		System.out.println(var1);
		byte var2 = -30; 		System.out.println(var2);
		byte var3 = 30; 		System.out.println(var3);
		// byte var4 = 128; 	System.out.println(var4);	// 오류
		
		// p.43 char [한글자] : 유니코드
		char c1 = 'A';			System.out.println(c1);
		char c2 = 65;			System.out.println(c2);
		char c3 = '\u0041';		System.out.println(c3);
		
		char c4 = '가';			System.out.println(c4);
		char c5 = 44032;		System.out.println(c5);
		char c6 = '\uac00';		System.out.println(c6);
		// 컴퓨터[0,1]는 문자를 어떻게 처리??
			// 아스키코드 : 미국[기계어 ---> 영어 ---> 기계어]
			// 유니코드(java) : 전세계 모든 문자 표현
		
		// p.44~45 short [2byte], int [*기본 정수 자료형 / 4byte] 타입
		short num1 = 30000;		System.out.println(num1);
		// short num2 = 40000;		System.out.println(num2);	// 오류	
		int num3 = 10;			System.out.println(num3);
		int num4 = 012;			System.out.println(num4);	// 8진수
		int num5 = 0xA;			System.out.println(num5);	// 16진수
			// 진수 목적 : 컴퓨터가 표현할 수 있는 단위 한계 해결
			// 2진수 [0, 1] : 기계어
			// 8진수	[0 ~ 1] :
			// 10진수 [0 ~ 9] : 사람 사용
			// 16진수 [0 ~ 9 A B C D E F] : 다양한 표현 단위
		
		// p.46 long [8byte] : 20억 이상
		// long a1 = 20000000000;	System.out.println(a1);		// 오류
		long a1 = 20000000000L;	System.out.println(a1);			// 숫자 마지막에 L 입력
		
		// p.47~48 : float [4byte], double [*기본 실수 자료형 / 8byte]
		// float val1 = 3.14; System.out.println(val1);		// 오류
		float val1 = 3.14f; System.out.println(val1);		// 숫자 마지막에 f 입력
		double val2 = 3.14; System.out.println(val2);
		
		float val3 = 0.1234567890123456789f; System.out.println(val3);
		double val4 = 0.1234567890123456789; System.out.println(val4);
		
		// p.48 boolean : bit [0(false), 1(true)]
		boolean bol = true;		System.out.println(bol);
		// boolean bol2 = 10;	// 값 대입 x		
		
		// p.49 : 타입변환
			// 1. 자동 타입변환 (크기순 : 작은 상자에서 큰 상자로 이동 가능)
			// p.51
				// byte -> short -> int -> long -> float -> double
				// short와 char 호환 불가(크기는 같지만 타입이 다름)
				// 반대로 불가
			byte bytevalue = 10;
			int intvalue = bytevalue; // 자동 형변환(가능) byte -> int
		// byte bytevalue2 = intvalue; // 불가 int -> byte
		
			// 2. 강제 타입변환(메모리 손실 => 데이터 손실)
				// 자료형 변수명 = (자료형)변수명;
			// p.54
			byte bytevalue2 = (byte)intvalue;
			
			// 연습문제
				// 1 : 4
				// 2 : 1 4 5
				// 3 : byte			short		int		long
				//					char
				//								float	double
				//		boolean
			
				// 4 :	타입 : int , double
				//		변수이름 : age , price 
				//		리터럴 : 10 , 3.14
				// 5 : 3
				// 6 : 4
				// 7 : 3
				// 8 : 1 [ 연산시 기본타입 : int ]
					//1. byte + byte => int => byte [x]
					//2. int + byte => int => int
					//3. int + float => int => float
					//4. int + double => int => double	
	}
}
