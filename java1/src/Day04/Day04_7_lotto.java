package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_7_lotto {

	// 1. �ζ� �Ǻ���
		// [���� 1] : 1~45 ������ ���� 6�� �Է¹޾� �迭�� ����
			// ��, �ߺ��Ұ� // 1~45 ���̸� ����
		// [���� 2] : ��÷��ȣ�� ���� ���� 1~45 ������ ���� 6�� �����Ͽ� �迭�� ����
		// [���� 3] : �� �迭 �� ������ ���ڰ� �� �� �ִ��� üũ�Ͽ� ��� �Է�
		// [���] : �� ���� ��������, ��� ���
			// 6�� ���� : 1��, 5�� ���� : 2��, 4�� ���� : 3��, 3�� ���� : 4��, �� �� : ��
	
	public static void main(String[] args) {
	
		// 0. �Է°�ü
		Scanner scanner = new Scanner(System.in);
		
		// 0. �迭 (�迭���� : �ڷ���[] �迭�� = new �ڷ���[����])
		int[] number = new int[6]; // int�� 6�� ������ ������ �� �ִ� �迭 (�����)
		int[] lotto = new int[6]; // int�� 6�� ������ ������ �� �ִ� �迭 (��÷��ȣ)
		
		// [���� 1] : 1~45 ������ ���� 6�� �Է¹޾� �迭�� ����
		// 1. ����ڷκ��� 6�� ���� �Է¹޾� �迭�� ����
		for (int i = 0; i < 6; i++) {
			System.out.print((i+1) + "��° ��ȣ[1~45] ���� : ");
			int num = scanner.nextInt(); // �Է¹��� ���� i��° �ε��� �迭�� �� ����
			if (num < 1 || num > 45) {
				System.out.println("0~45�� �Է� ���� �մϴ�. �ٽ� �Է��ϼ���.");
				i--; // �������� �Է��� �ƴϱ� ������ i ����
				continue;
			}
			
			boolean check = true; // �ߺ��� ���� ��� true, �ߺ��� ���� ��� false
			// �ߺ�üũ : ���� �Է��� ���� �迭 �� ������ ���� �����ϸ� �ٽ� �Է�
			for (int j = 0; j < 6; j++) {
				if (num == number[j]) { // �ߺ�ã�� ����
					System.out.println("������ ���� �̹� �����մϴ�. �ٽ� �Է��ϼ���");
					i--; // �������� �Է��� �ƴϱ� ������ i ����
					check = false; // �ߺ��� �ִ� ���
					break;
				}
			}
			// ���� ��� ����ϸ� �迭 ����
			if (check) { number[i] = num; }
		}
		
		// 2. ���
		System.out.println("����ڰ� ������ �� : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		
		// [���� 2] : ��÷��ȣ�� ���� ���� 1~45 ������ ���� 6�� �����Ͽ� �迭�� ����
		
		for (int i = 0; i < 6; i++) {
			Random random = new Random();
			int num2 = random.nextInt(45)+1; // 1~45 ���� ���� (0~44 ���� + 1)
			
			boolean check = true; // �ߺ��� ���� ��� true, �ߺ��� ���� ��� false
			// �ߺ�üũ : ���� �Է��� ���� �迭 �� ������ ���� �����ϸ� �ٽ� �Է�
			for (int j = 0; j < 6; j++) {
				if (num2 == lotto[j]) { // �ߺ�ã�� ����
					i--; // �������� �Է��� �ƴϱ� ������ i ����
					check = false; // �ߺ��� �ִ� ���
					break;
				}
			}
			// ���� ��� ����ϸ� �迭 ����
			if (check) { lotto[i] = num2; }
		}
		
		// 2. ���
		System.out.println("����ڰ� ������ �� : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
		int count = 0;
		// [���� 3] : �� �迭 �� ������ ���ڰ� �� �� �ִ��� üũ�Ͽ� ��� �Է�
		for (int i = 0; i < 6; i++) { // i => number �迭�� �ε���
			for (int j = 0; j < 6; j++) { // j => lotto �迭�� �ε��� (�� 36�� ��)
				if (number[i] == lotto[j]) { // ���� �����ϸ�
					count++; // ���� Ƚ���� 1 ����
				}
			}
		}
		System.out.println("��÷ ��� : " + count);
		
		
	}
}
