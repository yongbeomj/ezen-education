
// �ּ� : ���� => ������(���� ��) ����

package Day02; // ���� Ŭ������ ���� ��Ű����

import java.util.Scanner;

// java�� 100% ��ü���� ���!(���� ū Ư¡)

public class Day02_1 { // class start
// public : ����������
	// class : Ŭ���� ���� �� ���Ǵ� Ű����(�̸� ������� �ܾ�)
		// Ŭ������(����) : ù���ڸ� �빮��(����)
			// { : ����, } : ��
	
	// �ڵ��ϼ� ����Ű : ctrl  + �����̽���
	
	public static void main(String[] args) { // main start
		// main �޼ҵ忡�� main ������ ����(������ : �ڵ带 �о��ִ� ����)
			// main �޼ҵ� ��ȣ �ۿ� �ִ� �ڵ�� ���� �Ұ�
		// syso + �ڵ��ϼ� 
		System.out.println("java");
		
		// 1. �Է°�ü ����(Ű����κ��� �Է¹��� ���� �����ϴ� ��ü)
		Scanner scanner = new Scanner(System.in);
		
		// 2. next() �޼ҵ带 �̿��� ��ü �� �Է°� ������ 
		String s1 = scanner.next();
		// 3. ���(+ : ���� ������(����+���� ����))
		System.out.println("�Է� ���� : " + s1);
			// " " ����ó�� : Ű����(�̸� ������� �ܾ�), ��ü, Ŭ������, ����, ���� ��
		
	} // main end
} // class end
