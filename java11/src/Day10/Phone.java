package Day10;

public abstract class Phone {
	// abstract : �߻�Ŭ���� ����
	
	// 1. �ʵ�
	public String owner;

	// 2. ������
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 3. �޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�");
	}
	
}
