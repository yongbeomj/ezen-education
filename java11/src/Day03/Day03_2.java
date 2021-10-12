package Day03;

import java.util.Scanner;

public class Day03_2 {

	// 문제1 : 2개의 정수를 입력받아 더 큰수 출력
	// 문제2 : 3개의 정수를 입력받아 가장 큰수 출력
	// 문제3 : 4개의 정수를 입력받아 가장 큰수 출력
	// 문제4 : 4개의 정수를 입력받아 오름차순 출력
	// 문제5 : 4개의 정수를 입력받아 내림차순 출력
	
	public static void main(String[] args) {
		
		// 문제1 : 2개의 정수를 입력받아 더 큰수 출력
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Q1-정수1 : "); int a1 = scanner.nextInt();
		System.out.print("Q1-정수2 : "); int a2 = scanner.nextInt();
		
		if (a1 > a2) {
			System.out.println("2개 정수 중 큰 수는 : " + a1);
		} else {
			System.out.println("2개 정수 중 큰 수는 : " + a2);
		}
		
		// 문제2 : 3개의 정수를 입력받아 가장 큰수 출력
		
		System.out.print("Q2-정수1 : "); int b1 = scanner.nextInt();
		System.out.print("Q2-정수2 : "); int b2 = scanner.nextInt();
		System.out.print("Q2-정수3 : "); int b3 = scanner.nextInt();
		
		int result = b1;
		
		if (result < b2) { result = b2;	} 
		if (result < b3) { result = b3;	}
		System.out.println("가장 큰 수는 : " + result);
		
		// 문제3 : 4개의 정수를 입력받아 가장 큰수 출력
		
		System.out.print("Q3-정수1 : "); int c1 = scanner.nextInt();
		System.out.print("Q3-정수2 : "); int c2 = scanner.nextInt();
		System.out.print("Q3-정수3 : "); int c3 = scanner.nextInt();
		System.out.print("Q3-정수4 : "); int c4 = scanner.nextInt();
		
		int result1 = c1; // max변수에 첫번째 값 대입
		
		if (result1 < c2) {	result1 = c2; } // 만약 max 변수에 있는 값보다 크면 변경 
		if (result1 < c3) {	result1 = c3; } 
		if (result1 < c4) {	result1 = c4; }
		System.out.println("가장 큰 수는 : " + result1);
		
		// 문제4 : 4개의 정수를 입력받아 오름차순 출력
		
		System.out.print("Q4-정수1 : "); int d1 = scanner.nextInt();
		System.out.print("Q4-정수2 : "); int d2 = scanner.nextInt();
		System.out.print("Q4-정수3 : "); int d3 = scanner.nextInt();
		System.out.print("Q4-정수4 : "); int d4 = scanner.nextInt();
		
		int temp; // 교환 시 사용되는 임시변수
		// 1. 1번째 변수와 2,3,4번째 변수 비교 => 3번
		if (d1 > d2) { temp = d1; d1 = d2; d2 = temp; } 
		if (d1 > d3) { temp = d1; d1 = d3; d3 = temp; } 
		if (d1 > d4) { temp = d1; d1 = d4; d4 = temp; } 
		// 2. 2번째 변수와 3,4번째 변수 비교 => 2번
		if (d2 > d3) { temp = d2; d2 = d3; d3 = temp; } 
		if (d2 > d4) { temp = d2; d2 = d4; d4 = temp; } 
		// 3. 3번째 변수와 4번째 변수 비교 => 1번
		if (d3 > d4) { temp = d3; d3 = d4; d4 = temp; }
		// 4. 4번째 변수는 비교를 3번 당했기때문에 비교x
		
		System.out.printf("오름차순 : %d %d %d %d\n", d1, d2, d3, d4);
		
		// 문제5 : 4개의 정수를 입력받아 내림차순 출력
		
		if (d1 < d2) { temp = d1; d1 = d2; d2 = temp; } 
		if (d1 < d3) { temp = d1; d1 = d3; d3 = temp; } 
		if (d1 < d4) { temp = d1; d1 = d4; d4 = temp; } 

		if (d2 < d3) { temp = d2; d2 = d3; d3 = temp; } 
		if (d2 < d4) { temp = d2; d2 = d4; d4 = temp; } 
		
		if (d3 < d4) { temp = d3; d3 = d4; d4 = temp; }
		
		System.out.printf("내림차순 : %d %d %d %d\n", d1, d2, d3, d4);
		
		// 문제6 : 로그인페이지
			// [ 입력 ] : 아이디와 비밀번호를 입력받기 
			// [ 조건 ] : 회원아이디가 admin 이고 비밀번호가 1234 일 경우에는 로그인 성공 아니면 로그인 실패 출력
		
		System.out.print("Q6-ID : "); 		String id = scanner.next();
		System.out.print("Q6-Password : "); int pw = scanner.nextInt();
		
		if (id.equals("admin")) { // String 비교 시 equals 메소드 사용
			if (pw == 1234) {
				System.out.println("[로그인 성공]");
			} else {
			System.out.println("[로그인 실패] 패스워드가 다릅니다.");
			}
		} else {
			System.out.println("[로그인 실패] 존재하지 않는 아이디입니다.");
		}
	}
	
}
