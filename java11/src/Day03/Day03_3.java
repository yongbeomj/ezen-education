package Day03;

import java.util.Scanner;

public class Day03_3 {

	// if(논리제어), switch(데이터제어)
		// 경우의 수가 정해져 있는 경우 => switch(속도빠름)
		// 경우의 수가 정해져 있지 않는 경우 => if
			/* 형태 : switch (key : 검사대상) { 
			  		case 검사 : 실행문;
			  		case 검사 : 실행문;
			  		case 검사 : 실행문;
			  		default : 실행문;
			 */
			// break : switch 혹은 반복문을 탈출 시 사용되는 키워드 (가장 가까운 중괄호 탈출)
	public static void main(String[] args) {
		
		// 예1)
		int score = 80;
		switch (score) { // score는 검사
			// score가 90이면
			case 90 : System.out.println("A등급 입니다"); break;
			// score가 80이면
			case 80 : System.out.println("B등급 입니다"); break;
			// score가 70이면
			case 70 : System.out.println("C등급 입니다"); break;
			// 그 외
			default : System.out.println("탈락 입니다"); 
		}
		
		// 예2 ) 
		int b = 3; 
		switch( b ) {
			case 1 : System.out.println(" 1층으로 이동 "); break;
			case 2 : System.out.println(" 2층으로 이동 "); break;
			case 3 : System.out.println(" 3층으로 이동 "); break;
			default : System.out.println(" 정지 ");
		}	
		
		// p.118 char switch
		char grade = 'B';
		switch (grade) {
			case 'A' :
			case 'a' :
				System.out.println("우수 회원입니다."); break;
			case 'B' :
			case 'b' :
				System.out.println("일반 회원입니다."); break;
			default :
				System.out.println("손님입니다.");
		}
		
		// p.119 String switch
		String position = "과장";
		switch (position) {
			case "부장" :
				System.out.println("700만원"); break;
			case "과장" :
				System.out.println("500만원"); break;
			default :
				System.out.println("300만원");
		}
		
		// 문제1 : 국영수 점수를 입력받아 평균이 90점 이상이면 "A등급", 80점 이상이면 "B등급" 나머지 탈락
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 : "); int kor = scanner.nextInt();
		System.out.print("영어 : "); int eng = scanner.nextInt();
		System.out.print("수학 : "); int mat = scanner.nextInt();
		
		int average = (kor + eng + mat) / 3;
		
		switch (average / 10) { // 1의 자리 생략
			case 10 :
			case 9 :
				System.out.println("A등급"); break;
			case 8 :
				System.out.println("B등급"); break;
			default :
				System.out.println("탈락");
		}
	}
}
