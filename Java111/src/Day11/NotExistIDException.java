package Day11;

public class NotExistIDException extends Exception {

	// ���� Ŭ���� ����� extends
	
	// �ʵ�
	
	// ������ : Ŭ������� ������ �޼ҵ�
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message); // ����Ŭ�������� �޼��� ������
		// super() : �θ������
		// super.�ʵ� : // super.�޼ҵ�
	}
	
	// �޼ҵ�
}
