package Test;

import java.util.Scanner;

public class BankApplication {

	// 100개 계좌 저장할 배열
	static Account[] accountArray = new Account[100];
	// 입력객체
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택 > ");
			int choiceNo = scanner.nextInt();
			
			if (choiceNo == 1) { // 1번 선택 시
				createAccount();
			} else if (choiceNo == 2) { // 2번 선택 시 
				accountList();
			} else if (choiceNo == 3) { // 3번 선택 시
				deposit();
			} else if (choiceNo == 4) { // 4번 선택 시
				withdraw();
			} else if (choiceNo == 5) { // 5번 선택 시
				System.out.println("프로그램 종료");
				run = false;
			}
		}
	}
	
	// 메소드 생성
	// 계좌생성
	static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		// 입력
		System.out.print(">> 계좌번호 : "); String ano = scanner.next();
		System.out.print(">> 계좌주 : "); String owner = scanner.next();
		System.out.print(">> 초기예금액 : "); int balance = scanner.nextInt();
		
		// 객체 생성
		Account account = new Account(ano, owner, balance);
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) { // i번째가 빈 공간이면
				accountArray[i] = account; // i번째에 대입
				break; // 반복문 종료
			}
		}
	}
	// 계좌목록
	static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) { break; } // 배열이 빈 공간이면 반복문 종료
			System.out.printf("%s \t %s \t %s \n",
					accountArray[i].getAno(),accountArray[i].getOwner(),accountArray[i].getBalance());
		}
	}
	
	// 계좌 중복체크
	static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			// 배열이 비어있지 않으면서 입력값과 같다면
			if (accountArray[i] != null && accountArray[i].equals(ano)) {
				account = accountArray[i]; // i번째 값 대입
				break;
			}
		}
		return account;
	}
	
	// 입금
	static void deposit() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		// 입력
		System.out.print(">> 계좌번호 : "); String ano = scanner.next();
		System.out.print(">> 입금액 : "); int balance = scanner.nextInt();
		
		// 중복 체크
		Account account = findAccount(ano);
		
		// 객체 생성
		// 입금액을 입금 받으면? => 기존 입금액 + 입금액
		// 중복값이 없으면 (계좌가 없으면)
		if (account == null) {
			System.out.println("계좌 없음");
			return;
		}
		account.setBalance(account.getBalance() + balance);
		System.out.println("입금 완료");
		//
		
	}
	
	// 출금
	static void withdraw() {
		
	}
	
}
