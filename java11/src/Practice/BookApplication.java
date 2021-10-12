package Practice;

import java.util.Scanner;

public class BookApplication {
//	------------------- 회원제 도서관 프로그램 ---------------------
//	// [조건1] : 객체지향 [ 회원 클래스 , 도서 클래스  ]
//		설계 : 필드 , 생성자 , 메소드
//	// [조건2] : 객체는 배열에 저장
//	// [조건3] : 회원만 프로그램 이용
//		[ 로그인전 ] : 로그인 , 회원가입 , 아이디/비밀번호 찾기   
//		[ 로그인시 ] : 1.도서목록 ,2. 대여 , 3.반납  , 4.로그아웃
//	// [조건4] : 관리자[ ID:admin ] 만 도서 등록 가능 
//		[ 관리자 로그인시 ] : 1.도서등록 ,2.도서목록 3. 로그아웃 
	
	public static Member[] members = new Member[100]; // 회원 배열 
	
	public static Scanner scanner = new Scanner(System.in);
	
	
}
