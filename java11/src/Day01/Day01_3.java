package Day01;

import java.util.Scanner;

public class Day01_3 {

	public static void main(String[] args) { // main �޼ҵ�(�Լ�)
		
		// ��� Ŭ���� : System
		System.out.println("�Է� : "); // ��� �޼ҵ� ȣ��
		
		// �Է� Ŭ���� : Scanner
			// 1. Ű����κ��� �Է¹��� ���� �޸�(������ġ)�� ��ü ���� (System.in)
			// 2. �ٸ� ������ �Է°� �ű�� (next)
			// 3. ���ο� �Է°� �ޱ�
		Scanner scanner = new Scanner(System.in);
			// ��ü : Ŭ���� ������� ������ �޸� ����
				// ��ü ���� : Ŭ������, ��ü��(����) = new ������( )
					// new : �޸� �Ҵ� ������
					// System.out : ���
					// System.in : �Է�
				// ��ü���� ��������
					// .next() : ��ü �� ����� ���ڿ� ȣ�� (���� x)
					// .nextInt() : ��ü �� ����� ���� ȣ��
					// .nextLine() : ��ü �� ����� ���ڿ� ȣ�� (���� o)
					// ��Ÿ ��
		
		// ��ü���� ��������
		String string1 = scanner.next();
			// ��ü �� ����� �Է°��� ������ ����
		System.out.println("�Էµ� ���ڿ��� : " + string1);
		
		System.out.println("�Է�2 : ");
		// �ι�° �Է°� ��������
		String string2 = scanner.next();
		System.out.println("�Էµ� �ι�° ���ڿ��� : " + string2);
		
	}
}
