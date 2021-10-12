package Practice;

import java.util.Scanner;

public class BankApplication {

	// 100개 객체 저장할 수 있는 배열
	static Account[] accountArray = new Account[100];
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택 > ");
			int selectNo = scanner.nextInt();
			// 메소드 미리 입력하지 말 것
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				System.out.println("종료");
				run = false;
			}
		}
	}
	// 계좌생성
	static void createAccount() {
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		// 1. 입력
		System.out.print(">> 계좌번호"); String ano = scanner.next();
		System.out.print(">> 계좌주"); String owner = scanner.next();
		System.out.print(">> 초기입금액"); int balance = scanner.nextInt();
		// 2. 객체 생성
			// 변수 입력 받아서 Account 클래스 안에서 코드 진행
			// 결과값을 account라는 객체명으로 받음
		Account account = new Account(ano, owner, balance);
		
		// 3. 배열 저장
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) { // 만약 i번째가 공백일 때
				accountArray[i] = account; // Account 결과값 i번째에 대입
				System.out.println("계좌 생성 완료");
				break;
			}
		}
	}
	// 계좌목록
	static void accountList() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) { break; } // i번째가 공백이면 반복문 탈출
			System.out.printf("%s \t %s \t %s \n", // 아니면 대입 (Account 메소드 호출) 
					accountArray[i].getAno(),accountArray[i].getOwner(),accountArray[i].getBalance());
		}
	}
	
	// 계좌 중복체크
	// 입력값과 배열값을 하나씩 비교하여 같은 값 찾기
	static Account findAccount(String ano) {
		Account account = null; // 리턴할 변수 하나 지정
		for (int i = 0; i < accountArray.length; i++) {
			// 만약 i번째 배열이 비어있지않고 입력값과 동일하면
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				account = accountArray[i]; // i번째 값 대입
				break;
			}
		}
		return account; // 결과값 리턴
	}
	
	// 예금
	static void deposit() {
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		// 입력
		System.out.print(">> 계좌번호"); String ano = scanner.next();
		System.out.print(">> 예금액"); int balance = scanner.nextInt();
		
		// 중복 체크 후 account에 입력
		Account account = findAccount(ano);
		
		// 중복값이 없으면
		if (account == null) {
			System.out.println("계좌 없음");
			return;
		}
		// 중복값이 있으면
		account.setBalance(account.getBalance() + balance);
		System.out.println("예금 성공");
	}
	// 출금
	static void withdraw() {
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");
		
		System.out.print(">> 계좌번호"); String ano = scanner.next();
		System.out.print(">> 예금액"); int balance = scanner.nextInt();
		
		// 객체 생성
		Account account = findAccount(ano);
		
		// 중복값이 없으면
		if (account == null) {
			System.out.println("계좌 없음");
			return;
		}
		// 중복값이 있으면
		account.setBalance(account.getBalance() - balance);
		System.out.println("출금 성공");
		
	}
	
	
}
