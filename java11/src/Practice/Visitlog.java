package Practice;

import java.util.Scanner;

public class Visitlog {

	//2. 회원제 방문록 프로그램
		// [조건1] : 최대 100명을 저장할수 있는 회원 배열[ 아이디 , 비밀번호 ]
		// [조건2] : 초기 메뉴
			// 1. 로그인 
			// 2. 회원가입 
		// [ 회원가입을 선택했을때 ]
			// 1.아이디와 비밀번호를 입력받아 배열에 저장 
			// 2.아이디 중복불가 [ 배열에 기존 아이디가 존재하면 회원가입 실패 ] 
		// [ 로그인을 선택했을때 ]
			// 1. 아이디와 비밀번호를 입력받아 배열내 존재하면 로그인 성공 // 아니면 실패 
		// [ 로그인 성공시 메뉴 ] 
			// 1.방문록 남기기
			// 2. 로그아웃 
		// [ 방문록 남기기 선택했을때 ] 
			// 내용을 입력받아 배열에 저장 [ 내용과 작성자 아이디 저장 ]
			// 기존 방문록 목록 출력 
		// [ 로그아웃 ] 
			// 초기메뉴로 돌아가기
	
	public static void main(String[] args) {
		
		// 입력객체
		Scanner scanner = new Scanner(System.in);
		// 배열
		String[][] members = new String[100][2]; // 회원 배열
		
		// 메인 메뉴
		while(true) {
			System.out.println("1.로그인 2.회원가입");
			System.out.print(">>> 선택 : "); int ch = scanner.nextInt();
			
			if (ch == 1) { // 로그인
				System.out.println("로그인 메뉴");
				System.out.print("ID : "); String id = scanner.next();
				System.out.print("Password : "); String pw = scanner.next();
				
				// 중복 체크
				boolean logincheck = true;
				for (int i = 0; i < members.length; i++) {
					if (members[i][0] != null &&
							members[i][0].equals(id) &&
							members[i][1].equals(pw)) {
						System.out.println("로그인 되었습니다");
					//////////// 로그인 성공 시 ///////////////
						while(true) {
							System.out.println("1.방문록남기기 2.로그아웃");
						}
					}
				}
				break;
			} else if (ch == 2) { // 회원가입
				System.out.println("회원가입 메뉴");
				System.out.print("ID : "); String id = scanner.next();
				System.out.print("Password : "); String pw = scanner.next();
				
				// 중복 체크
				boolean idcheck = true;
				for (int i = 0; i < members.length; i++) { // 멤버 배열 인덱스 0번부터 체크
					if (members[i][0] != null && members[i][0].equals(id)) { // 멤버 배열 (i,0)이 null이 아니고 id 입력값과 같다면
						System.out.println("ID 중복");
						idcheck = false;
						break; // for 종료(중복찾기 종료)
					}
				}
				if (idcheck) { // 중복체크 true라면
					for (int i = 0; i < members.length; i++) {
						if (members[i][0] == null) { // 빈 공간이라면
							members[i][0] = id; // 인덱스 0번 id 대입
							members[i][1] = pw; // 인덱스 1번 pw 대입
							System.out.println("회원가입 완료");
							break; // for 종료
						}
					}
				}
				break; // while 종료
			} else {
				System.out.println("알 수 없는 번호입니다");
				// break x => 다시 메뉴 선택하도록
			}
		}
		
	}
}
