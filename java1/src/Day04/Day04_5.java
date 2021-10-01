package Day04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day04_5 {

	// 배열을 이용한 점수관리 프로그램
		// 1. 학생 수를 입력받아 학생 수 만큼 배열의 길이 할당
		// 2. 메뉴 [1.학생수 2.점수입력 3.분석[등수,평균] 4.종료]
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Integer[] list = null; // 배열 선언 후 공백 넣기
		
		while(true) {
			System.out.println("1.학생수 2.점수입력 3.분석 4.종료");
			System.out.print("선택 : "); int ch = scanner.nextInt();
			
			if (ch == 1) {
				System.out.print("학생 수 입력[배열길이] : "); int arraylist = scanner.nextInt();
				// 배열에 메모리 할당
				list = new Integer[arraylist]; // 입력받은 수 만큼 메모리 할당
				System.out.println(arraylist + "만큼 학생목록 생성");
			}
			if (ch == 2) {
				// 학생 수 만큼 점수 입력 받기 [배열명.length : 배열의 길이]
				for (int i = 0; i < list.length; i++) {
					System.out.println((i+1) + "번째 학생 점수 입력 : ");
					list[i] = scanner.nextInt();
				}
			}

			
			if (ch == 3) {
				// 등수
				// 2. 클래스 이용한 정렬  [ 배열 관련 클래스 = Arrays ] 
				Arrays.sort( list ); // 오름차순 / 오름차순 반대는 내림차순 
				Arrays.sort( list, Collections.reverseOrder() );
						// Collections.reverseOrder() : 순서 뒤집기 [ 기본 자료형은 불가 // 객체만 가능 ]
				
				// 2. 출력 
				int sum = 0 ;
				for( int i = 0 ; i<list.length ; i++ ) {
					System.out.println( (i+1) + "등 점수 : " + list[i]);
					sum += list[i];
				}
				System.out.println(" 모든 학생들의 점수 평균 : " +  sum / list.length );
				
			}
			if( ch == 4) break;
		}
		
	}
}
