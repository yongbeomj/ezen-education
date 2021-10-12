package Day03;

public class Day03_6 {

	public static void main(String[] args) {
		
		// for (초기값; 조건문; 증감식) { 실행문 }
		// while (조건문) {
		// 		실행문
		//		증감식
		// }
		
		// p.125 예제1
		
		int i = 1; // 1. 초기값
		while (i <= 10) { // 2. 조건문
			System.out.print(i + " "); // 3. 실행문
			i++; // 4. 증감식
		}
		System.out.println();
		
		// for 차이
		for (int j = 1; j <= 10; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		// p.125 예제2
		int sum = 0;
		int k = 1; // 초기값;
		while (k <= 100) {
			sum += k;
			k++;
		}
		System.out.print("1~100 누적합계 : " + sum);
		System.out.println();
		
		// for 차이
		int sum2 = 0;
		for (int m = 1; m <= 100; m++) {
			sum += m;
		}
		System.out.print("1~100 누적합계 : " + sum2);
		
		// 무한루프 => while(true)
		while(true) {
			System.out.println("계속실행 중");
		}
		
	}
}
