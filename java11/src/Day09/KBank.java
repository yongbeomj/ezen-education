package Day09;

public class KBank extends Bank {

	final String bankcode = "01";
	
	@Override
	public void createAccount() {
		System.out.println("국민은행 계좌 등록합니다");
	}
	@Override
	public void deposit() {
		System.out.println("국민은행 계좌 입금합니다");
	}
	@Override
	public void withdraw() {
		System.out.println("국민은행 계좌 출금합니다");
	}
	@Override
	public void transfer() {
		System.out.println("국민은행 계좌 이체합니다");
	}
	@Override
	public void currentBalance() {
		System.out.println("국민은행 계좌 잔액확인 합니다");
	}
}
