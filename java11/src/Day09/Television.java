package Day09;

public class Television implements RemoteControl {
	// extends : ���赵 ����(���)
	// implements : (�߻�޼ҵ� ����) ����

	// 1. �ʵ�
	public int volume;
	// 2. ������
	
	// 3. �޼ҵ�
	// ����� �������̽��� �߻�޼ҵ� ����
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}
	@Override // @Override ���� ����
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}
	@Override
	public void setVolume(int volume) {
		// ���� ������ �ִ� �������� ũ��
		if (volume > RemoteControl.MAX_VOLUME) {
			// �ִ� ���� ���� (�ִ� �������� Ŀ�� �� ����)
			this.volume = RemoteControl.MAX_VOLUME;
		// ���� ������ ���� ����(0)���� ������
		} else if (volume < RemoteControl.MIN_VOLUME) {
			// ���� ���� ���� (���� �������� �۾��� �� ����)
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);
	}
	
}
