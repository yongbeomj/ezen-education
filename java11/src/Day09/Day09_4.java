package Day09;

public class Day09_4 {
	
	// ���� ���α׷� [���, �������̽�]
		// ATM �������̽�
			// �߻�޼ҵ� : ���µ��, ����, ���, ��ü, �ܰ�
		// 1. ���� [����Ŭ����]
			// �ʵ�(�Ӽ�) : ���¹�ȣ, ���ݾ�
		// 2. �������� [����Ŭ����]
		// 3. �������� [����Ŭ����]
	public static Bank[] bankList = new Bank[100];
	
	public static void main(String[] args) {
		
		// 1. �������̽� ����
		ATM atm;
		// 2. �������̽� Ŭ���� ����
		atm = new KBank();
		
		// 3. �������̽��κ��� Ŭ���� ����
		atm.createAccount();
		atm.deposit();
		atm.withdraw();
		atm.transfer();
		atm.currentBalance();
		
		// 4. �������̽� �� Ŭ���� ����
		atm = new SBank();
		atm.createAccount();
		atm.deposit();
		atm.withdraw();
		atm.transfer();
		atm.currentBalance();
	
		// 5. ������ ����Ŭ�����κ��� ���� �ٸ� ����Ŭ������ �迭�� ���
			// ����Ŭ������ �迭 ����
		Bank account1 = new Bank();
		bankList[0] = account1;
		
		Bank account2 = new KBank();
		bankList[1] = account2;
		
		Bank account3 = new SBank();
		bankList[2] = account3;
		
		
	}
	
	
}
