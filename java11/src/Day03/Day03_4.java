package Day03;

public class Day03_4 {

	// �ݺ��� : for, while
		// 1. for : ��𼭺��� ������ ��� �����ϸ鼭 �ݺ�����
	
	public static void main(String[] args) {
		// p.121 ���� // 1���� 10���� 1�� �߰��ϸ鼭 �ݺ� ���
		for (int i = 1; i <= 10; i++) {
			// 1. �ʱⰪ : �ݺ������� ���۰� i�� 1����
			// 2. ���ǹ� : �ݺ������� ������ (true ���� �ƴϸ� ����x)
			// 3. ������ : �ݺ������� ��������
			System.out.print(i + " ");
				// i = 1 �� �� i <= 10 true �ݺ����� o
				// [������] i = 2 �� �� i <= 10 true �ݺ����� o
				// [������] i = 3 �� �� i <= 10 true �ݺ����� o
				// ~~~~~~~~~~
				// [������] i = 11 �� �� i <= 10 false �ݺ����� x
		}
		System.out.println("\n---------------------------------");
		
		// ��2) 1~50���� ���
		for (int i = 1; i <= 50; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n---------------------------------");
		
		// ��3) 1~50���� 3�� ���� ���
		for (int i = 1; i <= 50; i+=3) {
			System.out.print(i + " ");
		}
		System.out.println("\n---------------------------------");

		// ��4) 1~100���� �� ���
		int sum = 0; // ���� <> 0
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100 �����հ� : " + sum);
		
		// ��5) 1~100���� 7�� ��� �����հ�
		int sum7 = 0;
		for (int i = 0; i <= 100; i+=7) {
			sum7 += i;
		}
		System.out.println("1~100 7�ǹ�� �����հ� : " + sum7);
		
		// ��5-2) 1~100���� 7�� ��� �����հ�
		int sum8 = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 7 == 0) {
				sum8 += i;
			}
		}
		System.out.println("1~100 7�ǹ�� �����հ� : " + sum8);
		
		// ��6) 2�� ������
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", 2, i, 2*i);
		}
		System.out.println("\n---------------------------------");
		
		// p.124 ������ (2~15��)
			// �ܼ� : 2~15(����), �� : 1~9(����)
				// �ϳ��� �� ���� ���� 9�� ����
		for (int i = 2; i <= 15; i++) {
			System.out.println(">>> " + i + "�� <<<");
			// ���� �� �� ������ �� ���� 9�� ����
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d \n", i, j, i*j);
			}
		}
	}
}
