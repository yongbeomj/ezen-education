package Day09;

public class Bank implements ATM {

	// 1. 필드
	String ano;
	int balance;
	
	
	// 2. 생성자
	
	// 3. 메소드
	@Override
	public void createAccount() {
		System.out.println("----계좌 등록 합니다----");
	}
	@Override
	public void deposit() {
		System.out.println("----입금 합니다----");
	}
	@Override
	public void withdraw() {
		System.out.println("----출금 합니다----");
	}
	@Override
	public void transfer() {
		System.out.println("----계좌 이체 합니다----");
	}
	@Override
	public void currentBalance() {
		System.out.println("----잔액 확인 합니다----");
	}
	
}
