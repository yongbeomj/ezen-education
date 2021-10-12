package Day03;

public class Day03_4 {

	// 반복문 : for, while
		// 1. for : 어디서부터 어디까지 어떻게 증가하면서 반복실행
	
	public static void main(String[] args) {
		// p.121 예제 // 1부터 10까지 1씩 중가하면서 반복 출력
		for (int i = 1; i <= 10; i++) {
			// 1. 초기값 : 반복변수의 시작값 i는 1부터
			// 2. 조건문 : 반복변수의 논리제어 (true 실행 아니면 실행x)
			// 3. 증감식 : 반복변수의 증감단위
			System.out.print(i + " ");
				// i = 1 일 때 i <= 10 true 반복실행 o
				// [증감식] i = 2 일 때 i <= 10 true 반복실행 o
				// [증감식] i = 3 일 때 i <= 10 true 반복실행 o
				// ~~~~~~~~~~
				// [증감식] i = 11 일 때 i <= 10 false 반복실행 x
		}
		System.out.println("\n---------------------------------");
		
		// 예2) 1~50까지 출력
		for (int i = 1; i <= 50; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n---------------------------------");
		
		// 예3) 1~50까지 3씩 증가 출력
		for (int i = 1; i <= 50; i+=3) {
			System.out.print(i + " ");
		}
		System.out.println("\n---------------------------------");

		// 예4) 1~100까지 합 출력
		int sum = 0; // 공백 <> 0
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100 누적합계 : " + sum);
		
		// 예5) 1~100까지 7의 배수 누적합계
		int sum7 = 0;
		for (int i = 0; i <= 100; i+=7) {
			sum7 += i;
		}
		System.out.println("1~100 7의배수 누적합계 : " + sum7);
		
		// 예5-2) 1~100까지 7의 배수 누적합계
		int sum8 = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 7 == 0) {
				sum8 += i;
			}
		}
		System.out.println("1~100 7의배수 누적합계 : " + sum8);
		
		// 예6) 2단 구구단
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", 2, i, 2*i);
		}
		System.out.println("\n---------------------------------");
		
		// p.124 구구단 (2~15단)
			// 단수 : 2~15(변수), 곱 : 1~9(변수)
				// 하나의 단 마다 곱을 9번 실행
		for (int i = 2; i <= 15; i++) {
			System.out.println(">>> " + i + "단 <<<");
			// 단이 한 번 실행할 때 곱은 9번 실행
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d \n", i, j, i*j);
			}
		}
	}
}
