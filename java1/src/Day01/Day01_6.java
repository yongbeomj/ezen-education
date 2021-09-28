package Day01;

import java.util.Scanner;

public class Day01_6 {

	public static void main(String[] args) {
		
		// 문제3
		/*
		 * 방명록 입력받아 출력하기
		 * [입력변수]
		 * 작성자, 내용, 날짜
		 * [출력]
		 * -------------------방명록---------------
		 * | 순번 | 작성자 |		내용		|  날짜  |
		 * |  1  | 강호동 |	 안녕하세요	| 09-28 |
		 * --------------------------------------
		 */
		
		// 1. 입력객체 선언
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("작성자 : ");	String name = scanner.next();
			scanner.nextLine();
		System.out.print("내용 : ");		String text = scanner.nextLine(); // 공백 포함 o
		 	// scanner.nextLine(); : next 다음으로 nextLine 사용 시 문제 발생
				// why? next 이후 나오는 공백을 입력값으로 인식
				// 해결방법 : next와 nextLine 사이에 scanner.nextLine(); 추가
		System.out.print("날짜 : ");		String date = scanner.next();
		
		// 2. 출력
		System.out.println("---------------방명록---------------");
		System.out.println("| 순번 | 작성자 |\t내용\t| 날짜\t|");
		System.out.println("|  1  | " + name + " |\t" + text + "\t| " + date + "\t|");
		System.out.println("-----------------------------------");
	}
}
