package Day06;

public class Calculator {

	// �ʵ�
	
	// ������
	
	// �޼ҵ�
		// �μ�x ��ȯx[void]
	void powerOn() {
		System.out.println("������ �մϴ�");
	}
		// �μ�o[int, int] ��ȯo[int]
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
		// �μ�o[byte, byte] ��ȯo[double]
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
		// �μ�x ��ȯx[void]
	void powerOff() {
		System.out.println("������ ���ϴ�");
	}
}
