package Day09;

public interface ATM {

	// ATM �������̽�
		// �߻�޼ҵ� : ���µ��, ����, ���, ��ü, �ܰ�
	
	// 1. ��� �ʵ�
	
	// 2. �߻� �޼ҵ�
	public void createAccount(); // ���µ��
	public void deposit(); // ����
	public void withdraw(); // ���
	public void transfer(); // ��ü
	public void currentBalance(); // �ܾ�
	
	// 3. ����Ʈ �޼ҵ�
	default void action() {
		System.out.println();
	}
	// 4. ���� �޼ҵ�
	
	
}
