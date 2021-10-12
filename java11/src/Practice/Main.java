package Practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[9]; // 자연수 저장 배열
		// 입력 받기 + 배열에 저장
		for (int i = 0; i <= 8; i++) {
			array[i] = scanner.nextInt();
		}
		
		int max = 0;
		for (int i = 0; i <= 8; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println(max); // 최대값
		for (int i = 0; i <= 8; i++) { // 몇 번째인지
			if (max == array[i]) {
				System.out.println(i+1);
			}
		}
	}
}
