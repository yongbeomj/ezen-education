package Day05;

public class Day05_6 {

	// ���θ��� ȸ�� ����
		// 1. �ʵ� : �Ӽ�
			// 1. Id, Password, Name, Phone ��
	
		// 2. �޼ҵ� : ����
			// 1. ȸ������, �α���, ȸ��Ż��, ȸ������
	
	// ��ü �����
	public static void main(String[] args) {
		// 1. ��ü ����
		Member obj1 = new Member();
		// Member : ����� ���� Ŭ����
			// obj1 : Ŭ������(����)
				// new : ��ü�� �޸� �Ҵ�(�޸� �Ҵ� �� ������)
				// ���� : �⺻�ڷ���(�̸� ������ �ֱ� ������)
					// int ���� = 10;
					// String ���ڿ� = "���缮"; (���� 1����Ʈ, �ѱ� 2����Ʈ)
						// Member() : ��ü ���� �� �ʱⰪ
		
		// 2. ��ü ���빰 �ֱ� [. : ���ٿ�����]
			// ��ü �� �ʵ忡 �����ؼ� �ش� �ʵ忡 �� �ֱ�
		obj1.id = "q";
		obj1.pw = "q";
		obj1.name = "q";
		obj1.phone = 123;
		
		// 3. ��ü ���빰 ȣ��
		System.out.println("��ü : " + obj1);
		System.out.println("��ü �� �ʵ� => ���̵� : " + obj1.id);
		System.out.println("��ü �� �ʵ� => ��й�ȣ : " + obj1.pw);
		System.out.println("��ü �� �ʵ� => �̸� : " + obj1.name);
		System.out.println("��ü �� �ʵ� => ����ó : " + obj1.phone);
		
	}
	
}
