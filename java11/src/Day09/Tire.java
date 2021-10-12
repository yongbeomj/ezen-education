package Day09;

public class Tire {

	// �ʵ�
	public int maxRotation; // �ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotation; // ���� ȸ����
	public String location; // Ÿ�̾� ��ġ

	// ������
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}

	// �޼ҵ�
	public boolean roll() {
		++accumulatedRotation; // ���� ȸ���� 1 ����
		if (accumulatedRotation < maxRotation) { // �ִ�ȸ������ �� ũ��
			System.out.println(location + " Tire ���� : " + (maxRotation-accumulatedRotation) + "ȸ"); // ���� ���� ���
			return true; // true : ������ ������ ǥ���ϴ� ��ȯ
		} else { // �ִ�ȸ������ �� ������
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false; // false : ������ ������ ǥ���ϴ� ��ȯ
		}
	}
	
	
}
