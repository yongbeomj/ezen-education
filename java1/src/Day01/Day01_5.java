package Day01;

import java.util.Scanner; // import : 다른 패키지에서 클래스 가져오기

public class Day01_5 {

	public static void main(String[] args) {
		
		// 문제2
		/*
		 * 1명의 회원가입 표 만들기
		 * [입력변수]
		 * 아이디, 비밀번호, 성명, 이메일 입력받아 출력
		 * [출력 예시]
		 * >>>>>>>>>>> 회원가입 완료 아래 정보를 확인해주세요 <<<<<<<<<<<<<<<
		 * 아이디		비밀번호		성명		이메일
		 * qwer		1234		유재석	qwer@naver.com
		 */
		
		// 1. 입력객체 만들기
		Scanner scanner = new Scanner(System.in);
		
		// 2. 입력받은 값을 변수/객체 저장
		System.out.print("ID : ");		String id = scanner.next();
		System.out.print("Password : "); int pw = scanner.nextInt();
		System.out.print("이름 : "); 	String name = scanner.next();
		System.out.print("E-mail : "); 	String email = scanner.next(); 
		
		// 3. 출력
		System.out.println(">>>>>>>>>>> 회원가입 완료 아래 정보를 확인해주세요 <<<<<<<<<<<<<<<");
		System.out.println("아이디\t비밀번호\t성명\t이메일");
		System.out.println(id + "\t" + pw + "\t" + name + "\t" + email);
	}
}
