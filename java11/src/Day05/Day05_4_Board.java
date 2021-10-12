package Day05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_4_Board {

	// 문제1 : 게시판 프로그램
		// 0. 2차원 배열 사용
		// 1. 게시판 [ 제목, 내용, 작성자, 작성일[Date], 조회수 ]
		// 2. 예시 메뉴
		// 1.
		/*
		 * 		[게시판]
		 * 순번	제목	작성자	작성일	조회수
		 * 1    안녕	김현수	10-05	3
		 * 2    안녕	김현수	10-05	3
		 * 선택 : 1.글쓰기 2. 글 상세페이지
		 */
		// [글쓰기 했을 때]
			// 1. 제목, 내용, 작성자, 작성일 입력받아 배열에 저장
		// [글 상세페이지 눌렀을 때]
			// 1. 상세페이지를 볼 게시물 번호 선택
			// 2. 선택한 게시물의 상세페이지 출력
		
		// 상세페이지 예시
		/*
		 * >> 제목 : 안녕
		 * >> 작성자 :	작성일 :	조회수 : 
		 * >> 내용
		 * 
		 * >> 선택 : 1. 뒤로가기
		 */
	public static void main(String[] args) {
		// 입력 객체
		Scanner scanner = new Scanner(System.in);
		
		// 게시판 배열
		String[][] board = new String[100][5];
		
		// 메인 메뉴
		while(true) {
			System.out.println("\n===============커뮤니티==================");
			System.out.printf(" %s \t %s \t %s \t %s \t %s\n","순번","제목","작성자","작성일","조회수");
			// 배열내 모든 인덱스 출력
			for( int i = 0 ; i<board.length; i++ ) {
				if( board[i][0] != null ) {
					System.out.printf(" %d \t %s \t %s \t %s \t %s\n" ,
							i , board[i][0] , board[i][2],board[i][3],board[i][4]);
				}
			}
			System.out.println("======================================");
			System.out.print(" 1.글쓰기 2.글상세보기  >>선택 : ");
			int ch1 = scanner.nextInt();
			
			if( ch1 == 1 ) {
				System.out.println(" >>>>>> 게시물 쓰기 >>>>>>");
					scanner.nextLine(); // 문제 보완
				System.out.print(" 제목 : ");	String title = scanner.nextLine();
				System.out.print(" 내용 : ");	String contents = scanner.nextLine();
				System.out.print(" 작성자 : ");	String writer = scanner.nextLine();
				// 현재 날짜 클래스
				Date now = new Date();
					// 날짜 형식 클래스
					SimpleDateFormat dateFormat = new SimpleDateFormat( "MM-dd" );
					String date = dateFormat.format(now);
					
				// 조회수
				String count = "1";
				// 모든 변수를 빈공간 배열에 저장 
				for( int i = 0 ; i<board.length ;i++ ) {
					if( board[i][0] == null) {
						board[i][0] = title; board[i][1] = contents; board[i][2] = writer; 
						board[i][3] = date; board[i][4] = count; break;
					}
				}				
			} else if (ch1 == 2) {
				System.out.print("글 번호 선택 > "); int num = scanner.nextInt();
				int count = Integer.parseInt(board[num][4]); // 조회수(String) -> int 변환
				board[num][4] = Integer.toString(++count); // 조회수 증가 후 -> String 변환
				
				for(int i = 0; i < board.length; i++) {
					if (board[i][0] == null) { break; }
					
					System.out.println("\n>>>>>>>>>>>>>>>>>상세페이지<<<<<<<<<<<<<<<<<");
					System.out.printf(">> 제목 : %s \n",board[num][0]);
					System.out.printf(">> 작성자 : %s , 작성일 : %s , 조회수 %s \n", board[num][2], board[num][3], board[num][4]);
					System.out.printf(">> 내용 : %s \n",board[num][1]);
					System.out.println(">>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<");
					break;
				}
				
				
				/*
				 * >> 제목 : 안녕
				 * >> 작성자 :	작성일 :	조회수 : 
				 * >> 내용
				 * 
				 * >> 선택 : 1. 뒤로가기
				 */
				
			} else {
				System.out.println("[[알림]] : 알 수 없는 행동입니다 ");
			}
		}
			
		
		
	}
	
}
