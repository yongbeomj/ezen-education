package Day03;

import java.util.Scanner;

public class Day03_5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 반복으로 별 모양 찍기
		// 문제1) 입력받은 정수만큼 별 출력 (i는 1부터 입력받은 정수까지 1씩 증가)
		System.out.print("문제1) 별 개수 : "); int s = scanner.nextInt();
		for (int i = 1; i <= s; i++) {
			System.out.print("* ");
		}
		System.out.println("\n---------------------------------");
		
		// 문제2) 입력받은 정수만큼 별 출력 // 5개마다 줄 바꿈
		System.out.print("문제2) 별 개수 : "); int s2 = scanner.nextInt();
		for (int i = 1; i <= s2; i++) {
			System.out.print("* ");
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n---------------------------------");
		
//		별문제3 : 입력받은 줄 만큼 출력
//		*
//		**
//		***
//		****
//		***** 
		System.out.print("문제3) 라인 수 : "); int s3 = scanner.nextInt();
		for (int i = 1; i <= s3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------");
		
//		별문제4 : 입력받은 줄 만큼 출력
//		*****
//		****
//		***
//		**
//		*
		System.out.print("문제4) 라인 수 : "); int s4 = scanner.nextInt();
		for (int i = s4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------");
		
//		별문제5 : 입력받은 줄 만큼 출력
//	        *
//	       **
//	      ***
//	     ****
//		*****
		System.out.print("문제5) 라인 수 : "); int s5 = scanner.nextInt();
		for (int i = 1; i <= s5; i++) {
			for (int j = s5-1; j >= 0; j--) {
				if (i <= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");	
				}
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------");
		
//		별문제6 : 입력받은 줄 만큼 출력
//		*****
//		 ****
//		  ***
//		   **
//		    *
		System.out.print("문제6) 라인 수 : "); int s6 = scanner.nextInt();
		for (int i = 1; i <= s6; i++) {
			// 공백
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			// 별찍기
			for (int k = 1; k <= s6-i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------");
		
//		별문제7 : 입력받은 줄 만큼 출력
//	        *
//	       ***
//	      *****
//	     *******
//		*********
		System.out.print("문제7) 라인 수 : "); int s7 = scanner.nextInt();
		for (int i = 1; i <= s7; i++) {
			// 공백
			for (int j = 1; j <= s7 - i; j++) {
				System.out.print(" ");
			}
			// 별찍기
			for (int k = 1; k <= i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------");
		
//		별문제8 : 입력받은 줄만큼 출력 
//		    1
//	       222
//	      33333
//	     4444444
//		555555555
		System.out.print("문제8) 라인 수 : "); int s8 = scanner.nextInt();
		for (int i = 1; i <= s8; i++) {
			// 공백
			for (int j = 1; j <= s8 - i; j++) {
				System.out.print(" ");
			}
			// 별찍기
			for (int k = 1; k <= i*2-1; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------");
		
//		별문제9 : 입력받은 줄만큼 출력
//		*********	
//		 *******	
//		  *****		
//		   ***		
//		    *		
		System.out.print("문제9) 라인 수 : "); int s9 = scanner.nextInt();
		for (int i = 1; i <= s9; i++) {
			// 공백
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			// 별찍기
			for (int k = 1; k <= (s9*2-(i*2-1)); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------");
		
//		별문제11 : 입력받은 줄만큼 출력 [ 입력받은 행/열 동일 ] 
//				
//				*     *		i = 1		j = 1 2		k = 5	7-i*2				
//				 *   *		i = 2		j = 1 2		k = 3
//				  * *		i = 3		j = 1 2		k = 1
//				   *		i = 4		j = 1		k = 0
//			      * *		i = 5		j = 1 2		k = 1
//			     *   *		i = 6		j = 1 2		k = 3
//			    *     *		i = 7		j = 1 2		k = 5
//							line		별			공백
		System.out.print("문제11) 라인 수 : "); int s11 = scanner.nextInt();
		for (int i = 1; i <= s11; i++) {
			// 공백
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			// 별찍기
			System.out.println("*");
			// 사이 공백
			for (int j = (s11-i*2); j >= 0; j--) {
				System.out.print(" ");
			}
			// 별찍기

		}
		System.out.println("\n---------------------------------");
		
		
	}
}
