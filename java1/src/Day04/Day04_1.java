package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// ���ѷ��� => while �̿��� ���ѹݺ�
			// Ű���带 �̿��� ��������
			// ���ѷ��� ���� ��� : 1. ������ false, 2. break;
			while(true) { 
				System.out.println("���ѷ���");
				int c = scanner.nextInt();
				if (c == 4) break;
			}
		
		// ����[����] ����
			// 1. ���� Ŭ����
				// Random ��ü
					// .nextInt() : int�� ǥ���� �� �ִ� ������ŭ ���� ����
					// .nextInt(����) : 0~���� ������ ���� ����
					// .nextInt(����) + �ʱⰪ
					
			while(true) {
				Random random = new Random();
				System.out.println(random.nextInt(10) + 1);
					// System.out.println(random.nextInt());
					// System.out.println(random.nextDouble());
					// System.out.println(random.nextBoolean());
			}
			
		
			
			// 2. Math Ŭ����
			
	}
}
