package Day04;

import java.util.Scanner;

public class Day04_8_visitlog {

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
		
		Scanner scanner = new Scanner(System.in); // 입력 객체
		
		// 1. 입력 값을 받을 회원 배열 생성
			// 2차원 배열을 이용하여 1개 인덱스에 1개 회원의 아이디, 비밀번호 저장
		String[][] member = new String[100][2];	// 회원 배열
		
		// 2. 초기 메뉴

		while(true) { // 로그인 될 때까지 무한루프	
			System.out.println(">>>메뉴<<<");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("---------");
			System.out.print("메뉴를 입력하세요 > ");	int menu1 = scanner.nextInt(); // 메뉴 입력
			
			if (menu1 == 1) { // 1번(로그인)을 입력했을 경우
				// 아이디, 비밀번호 변수 입력
				System.out.println(">>>로그인 페이지<<<");
				System.out.print("사용자 ID > ");			String id = scanner.next();
				System.out.print("사용자 Password > ");	String pw = scanner.next();
				// 중복체크
				boolean check = false;
				for (int i = 0; i < member.length; i++) {
					// 회원 배열의 아이디가 null이 아니면서 아이디 입력값(id), 비밀번호 입력값(pw)과 동일하면 로그인
					if (member[i][0] != null && member[i][0].equals(id) && member[i][1].equals(pw)) {
						System.out.println("로그인 되었습니다");
						check = true;
						while(true) { // 하위 메뉴로 전환
							System.out.println(">>>메뉴<<<");
							System.out.println("1. 방명록 남기기");
							System.out.println("2. 로그아웃");
							System.out.print("메뉴를 입력하세요 > ");	int menu2 = scanner.nextInt(); // 메뉴 입력
							
							// 1. 방명록 남기기 선택한 경우 // member[1][0]
							String[] list = new String[100];
							if (menu2 == 1) {
								System.out.print("내용을 입력하세요 > "); String content = scanner.next();
								for (int j = 0; j < list.length; j++) {
									if (list[j] == null) {
										list[j] = content;
										// 출력
										System.out.println(">>>방명록 페이지<<<");
										System.out.println("ID\t작성내용");
										for (int k = 0; k < member.length; k++) {
											if (list[j] != null) {
												System.out.println(member[i][0] + "\t" + list[j]);
												break;
											}
										}
										break;
									}
								}
								
							} else if (menu2 == 2) { // 2번(로그아웃) 입력한 경우
								System.out.println("로그아웃 되었습니다");
								break; // 반복문 탈출
							} else { // 1,2 외 다른 값 입력한 경우 
								System.out.println("알 수 없는 번호입니다."); 
							}
						}
					} 
				} 
				if (check == false) { // 만약 위 조건에 부합하지 않는다면(입력값이 회원 배열값과 일치하지 않는다면) 
					System.out.println("다시 입력해주시기 바랍니다\n");
				}
			} else if (menu1 == 2) { // 2번(회원가입)을 입력했을 경우
				// 아이디, 비밀번호 변수 입력
				System.out.println("[[회원가입 페이지]]");
				System.out.print("사용자 ID > ");			String id = scanner.next();
				System.out.print("사용자 Password > ");	String pw = scanner.next();
				// 중복체크
				boolean check = true;
				for (int i = 0; i < member.length; i++) {
					// 행렬 아이디값이 null이 아니면서 입력값(id)과 동일하면 중복
					if (member[i][0] != null && member[i][0].equals(id)) {
						System.out.println("중복된 아이디가 존재합니다");
						check = false;
						break; // 반복문 탈출
					}
				}
				if (check == true) { // 위 조건 모두 통과하면 회원가입 처리
					for (int i = 0; i < member.length; i++) {
						if (member[i][0] == null) { // 배열의 빈 공간 찾기
							member[i][0] = id;
							member[i][1] = pw;
							System.out.println("회원가입이 완료되었습니다\n");
							break;
						}
					}
				}
			}
		}
		
	}
}
