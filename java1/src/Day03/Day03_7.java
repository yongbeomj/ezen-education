package Day03;

import java.util.Scanner;

public class Day03_7 {

	public static void main(String[] args) {
		
		// p.127 :
			// 1. ���ѷ����� �Է��� ��� �ޱ�
				// 1. 
			// 2. ���� ����
		
		boolean run = true;
			// boolean : true Ȥ�� false�� �����ϴ� �⺻ �ڷ���
		int keycode = 0;
		int speed = 0;
		
		// ���ѷ��� (������ false �϶����� ��� �ݺ�����)
		while(run) { // ������ true ����, false ����x
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("1.���� 2.���� 3.����");
			System.out.print("���� : ");
			keycode = scanner.nextInt();
			
			// 1 �Է� �� [speed ���� 1 ����]
			if (keycode == 1) {
				speed++; System.out.println("=== ����ӵ� : " + speed);
			}
			// 2 �Է� �� [speed ���� 1 ����]
			if (keycode == 2) {
				speed--; System.out.println("=== ����ӵ� : " + speed);
			}
			// 3 �Է� �� ���ѷ��� ����
			if (keycode == 3) {
				run = false; System.out.println("���α׷� ����");
			}
		}
	}
}
