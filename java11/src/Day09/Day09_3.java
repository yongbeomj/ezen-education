package Day09;

public class Day09_3 {

	// �������̽� : ��ü�� ������� �����ϴ� Ÿ��
		// ���� : Ŭ�������� �����ؾ� �ϴ� ������ �����ϴµ� ���Ǵ� �߻��ڷ�
		// �߻�
		// �� : ������
			// �������̽�[��ư] = �̵���ư, ���ݹ�ư, ����ư
			// ���ӵ�[���ӵ�] = �������, ��ɰ���, RPG
				// ������ ���� �Ͽ� ���δٸ� Ŭ�������� ���� 
		// �������̽��� ��ü������ ��ü ���� �Ұ�
	
	public static void main(String[] args) {
		
		// p.347 ~ p.354
			// 1. �������̽� ���� : RemoteControl
			// 2. Ŭ���� ���� : Television implements RemoteControl
			// 3. Ŭ���� ���� : Audio implements RemoteControl
		
		// 1. ������ ���� [�޸� �Ҵ� x]
		RemoteControl rc;
		// 2. �������� �ڷ����� Ŭ���� ����
		rc = new Television(); // �ش� �������� �ڷ��������� ���
			// �ڷ����� ������ ���
			rc.turnOn();
			rc.turnOff();
			rc.setVolume(5);
		// 3. �ڷ����� �������� ����� ���������� ����
		rc = new Audio();
			// ����� ������ ���
			rc.turnOn();
			rc.turnOff();
			rc.setVolume(15);
	}
	
	
}
