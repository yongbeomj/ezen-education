package Day09;

public class SBank extends Bank {
	
	final String bankcode = "02";
	
	@Override
	public void createAccount() {
		System.out.println("�������� ���� ����մϴ�");
	}
	@Override
	public void deposit() {
		System.out.println("�������� ���� �Ա��մϴ�");
	}
	@Override
	public void withdraw() {
		System.out.println("�������� ���� ����մϴ�");
	}
	@Override
	public void transfer() {
		System.out.println("�������� ���� ��ü�մϴ�");
	}
	@Override
	public void currentBalance() {
		System.out.println("�������� ���� �ܾ�Ȯ�� �մϴ�");
	}
	
}
