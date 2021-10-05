package Day05;

import java.util.Scanner;

public class Day05_2_visitlog {

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
		
		// 0. 입력 객체
		Scanner scanner = new Scanner(System.in);
		
		// 1. 회원 100명[id,pw] 저장하는 방법 선언
		String[][] memberlist = new String[100][2]; // 100행 * 2열 => 200칸
		// 1. 방문록 100개[contents, writer] 저장하는 방법 선언
		String[][] visitlog = new String[100][2];
		
		// 2. 메뉴 => 메뉴는 계속 반복 실행 : 무한 루프 [while]
		while(true) {
			System.out.println("\t - 회원제 방문록 - ");
			System.out.println("-------------------");
			System.out.print("[[ 1.회원가입 2.로그인 선택 : ");
			int ch = scanner.nextInt();
			// 회원목록 :
			for (int i = 0; i < 100; i++) {
				if (memberlist[i][0] != null) {
					System.out.println(memberlist[i][0]);
				}
			}
			
			// 입력에 따른 값 제어
			switch(ch) {
				case 1 :
					System.out.println("- 회원가입 페이지 -");
					System.out.print("ID : "); String id = scanner.next();
					System.out.print("Password : "); String pw = scanner.next();
					
					// id 중복체크 (모든 배열 내 엔덱스에 접근해서 동일한 아이디가 있는지 체크)
					boolean idcheck = true;
					for (int i = 0; i < memberlist.length; i++) { // memberlist.length : 배열의 가로길이 => 100
						if (memberlist[i][0] != null && memberlist[i][0].equals(id)) { // i번째 id와 동일하면 
							System.out.println("[[알림]] : 중복된 아이디가 존재합니다");
							idcheck = false;
							break; // 중복찾기 종료
						}
					}
					
					// 중복체크 변수가 true이면 배열 내 빈 공간을 찾아서 저장
					if (idcheck) {
						for (int i = 0; i < memberlist.length; i++) {
							if (memberlist[i][0] == null) { // i번째가 공백이면 
								memberlist[i][0] = id;
								memberlist[i][1] = pw;
								System.out.println("[[알림]] : 회원가입이 되었습니다");
								break;
							}
						}
					}
					break;
					
				case 2 :
					System.out.println("- 로그인 페이지 -");
					// 1.입력 -> 저장 
					System.out.print("ID : "); String logid = scanner.next();
					System.out.print("Password : "); String logpw = scanner.next();
					// 2. 배열 내에서 입력한 아이디와 패스워드가 존재하는지 => 존재하면 로그인 성공
						// for문을 이용한 모든 인덱스에 접근하여 하나씩 비교
					boolean logincheck = true;
					for (int i = 0; i < memberlist.length; i++) {
						if (memberlist[i][0] != null &&
								memberlist[i][0].equals(logid) &&
								memberlist[i][1].equals(logpw)) {
							System.out.println("[[알림]] 로그인 성공");
							////////////////////////////////로그인 성공시 메뉴/////////////////////////////////////////
							while(true) { // 회원메뉴 무한루프
								System.out.println("\n\n\t - 회원 메뉴 - ");
								System.out.print(" [[ 1.방문록 쓰기 2.방문록 확인 3.로그아웃  선택 : ");
								int ch2 = scanner.nextInt();
									
								if (ch2 == 1) {
									scanner.nextLine(); // nextLine 오류 해결 
									System.out.print(">>>> 방문 내용 : "); String contents = scanner.nextLine();
//									System.out.print("방문록 내용 : "); String contents = scanner.next();
									// 방문록 배열 내 빈공간을 찾아서 내용과 로그인된 아이디를 저장
									for (int j = 0; j < visitlog.length; j++) {
										if (visitlog[j][0] == null) {
											visitlog[j][0] = logid;
											visitlog[j][1] = contents;
											System.out.println(">>>> 방문록 등록");
											break;
										}
									}
								} 
								else if (ch2 == 2) {
									System.out.println("---------방문록 목록---------");
									System.out.printf("%10s \t %s \n", "작성자", "내용");
									for (int j = 0; j < visitlog.length; j++) {
										if (visitlog[j][0] == null) { break; }
										System.out.printf("%10s\t%s\n", visitlog[i][0], visitlog[i][1]);
									}
								}
								else if( ch2 == 3 ) {
									System.out.println("[[알림]] : 로그아웃 되었습니다 ");
									break;
								}
								else System.out.println("[[알림]] : 알 수 없는 행동입니다 ");
							}
							////////////////////////////////////////////////////////////////////////////////////////
							
							logincheck = false;
							break;
						}
					}
					
					// 로그인 실패 시
					if (logincheck) System.out.println("[[알림]] 로그인 실패(동일한 정보가 없습니다)");
					
					break;
				default :
					System.out.println("[[알림]] 알 수 없는 번호입니다");
					
			}
		
		}
	}
}
