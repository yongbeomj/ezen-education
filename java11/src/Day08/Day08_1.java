package Day08;

public class Day08_1 {
		// ����Ŭ���� => main�޼ҵ�[ ������ ]
		
		
	//	��� : ���赵 ����
	//	* ������Ʈ���� Ŭ���� ���� ????? �ð� ����
	//	* ��� : �̸� ������� Ŭ�����κ��� ���赵 
	//		�����޾� �̾ ���ο� Ŭ���� ����
	//		�θ�Ŭ����[����Ŭ����]
	//		�ڽ�Ŭ����[����Ŭ����]
	// Ű���� 
		// 1. extends : �����ϴ� [ ���赵 ���� ] 
			// public class �ڽ�Ŭ������ extends �θ�Ŭ������{  } 
			// ���� Ŭ���� �Ұ� 
		// 2. super : �θ�Ŭ������ ��� ���� 
			// 1. super() : �θ�Ŭ������ ������ ȣ�� 
			// 2. super.�ʵ��/�޼ҵ�� : �θ�Ŭ������ �ʵ�,�޼ҵ� ȣ��
	
		// 3. @Override : �θ�Ŭ������ �޼ҵ� ������ 
		
		// 4. final
			// final class CellPhone : �θ�Ŭ������ ��� �Ұ�
			// final void powerOn() : �������̵� �Ұ� 
	
	//* �������̵� : ������ �̸��� ���� �޼ҵ带 ������ 
	//* �����ε� : ������ �������� �̸��� ���� ������ ����
	
	public static void main(String[] args) {
		
		// ���� Ŭ������ �̿��� ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		System.out.println("�� : " + dmbCellPhone.model); // private ������ �ƴҰ�� ��� ���� ����
		System.out.println("���� : " + dmbCellPhone.color);
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn(); // �θ� �޼ҵ� ����
		dmbCellPhone.bell(); // �θ� �޼ҵ� ����
		dmbCellPhone.sendVoice("��������"); // �θ� �޼ҵ� ����
		dmbCellPhone.receiveVoice("�ȳ��ϼ���"); // �θ� �޼ҵ� ����
		dmbCellPhone.sendVoice("�ݰ����ϴ�"); // �θ� �޼ҵ� ����
		dmbCellPhone.hangUp(); // �θ� �޼ҵ� ����
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		
		
	}
	
}
