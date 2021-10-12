package Day09;

public interface ATM {

	// ATM 인터페이스
		// 추상메소드 : 계좌등록, 예금, 출금, 이체, 잔고
	
	// 1. 상수 필드
	
	// 2. 추상 메소드
	public void createAccount(); // 계좌등록
	public void deposit(); // 예금
	public void withdraw(); // 출금
	public void transfer(); // 이체
	public void currentBalance(); // 잔액
	
	// 3. 디폴트 메소드
	default void action() {
		System.out.println();
	}
	// 4. 정적 메소드
	
	
}
