package Day03;

import java.util.Scanner;

public class Day03_8 {

	public static void main(String[] args) {
		
		// p.135 ATM ���α׷�
			// �����ư ������ ������ ���ѽ��� ���α׷� => while(true)
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (run) { // ���ຯ�� true ���ѷ��� ����, ���ຯ�� false�̸� ���ѷ��� ����
			System.out.println("--------------------------------");
			System.out.println("| 1.���� | 2.��� | 3.�ܰ� | 4.���� |");
			System.out.println("--------------------------------");
			System.out.print("����> "); int choice = scanner.nextInt();

			if (choice == 1) {
				System.out.print("���ݾ�> "); balance += scanner.nextInt();
			} else if (choice == 2) {
				System.out.print("��ݾ�> "); int money = scanner.nextInt();
				if (balance < money) {
					System.out.println("[[�˸�]] �ܰ� �����մϴ�.");
				} else {
					balance -= money; System.out.println("[[�˸�]] ��� �Ϸ�");
				}
			} else if (choice == 3) {
				System.out.println("�ܰ�> " + balance);
			} else if (choice == 4) { // ���� 4�� �Է����� ��
				run = false; // ���ຯ���� false �־ ���ѷ���(while) ����
				System.out.println("[�̿��� �ּż� �����մϴ�]");
			} else {
				System.out.println("[[���]] �� �� ���� ��ȣ�Դϴ�.");
			}
			
			for (int x = 1; x <= 10; x++) {
				for (int y = 1; y <= 10; y++) {
					if (4*x + 5*y == 60) {
						System.out.printf("(%d, %d)\n", x, y);
					}
				}
			}
			
		}
		
	}
}
