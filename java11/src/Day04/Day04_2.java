package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_2 {

	public static void main(String[] args) {
		
		// ����������
			// 1. ����ڷκ��� ���������� �� �ϳ��� �Է¹ޱ�
			// 2. ��ǻ�ʹ� �������� ���������� �� �ϳ� ����
			// 3. �¸��� �÷��̾� ȣ��
				// + : ���࿡ ����[3]�� �Է��ϸ� ��������
				// + : �������� �� ���Ӽ��� �����¸� (���� ���� �̱� �÷��̾� ȣ��)
		
		Scanner scanner = new Scanner(System.in);
		int player;
		int com;
		int game = 0;
		int playercount = 0;
		int comcount = 0;
		int winner = 0;
		
		while(true) {
			// 1. ����
			
			
			// 2. �Է�
			System.out.print("����[0]����[1]��[2]����[3] �Է� > ");
			player = scanner.nextInt();
			
				// 3 �Է� �� Ż��
				if (player == 3) {
					System.out.println("[��������] ����Ƚ�� : " + game);
					if (playercount > comcount) {
						System.out.println("�����¸��� : �÷��̾�" + playercount);
					} else if (playercount < comcount) {
						System.out.println("�����¸��� : ��ǻ��" + comcount);
					} else {
						System.out.println("���º�");
					}
					break;
				}
				
				// 0~3 �� �Է� ��
				if (player < 0 || player > 3) {
					System.out.println("�� �� ���� ��ȣ�Դϴ�. �ٽ� �Է�");
					continue; // ���� ����� �ݺ��� �̵�
				}
				
			Random random = new Random();
			com = random.nextInt(3);
			System.out.println("��ǻ�� ���� > " + com);
			
			// 0 ���� 1 ���� 2 ��
			if ((player == 0 && com == 2) || (player == 1 && com == 0) || (player == 2 && com == 1)) { 
				System.out.println("�÷��̾� �¸�");
				playercount++;
			} else if ((player == 0 && com == 0) || (player == 1 && com == 1) || (player == 2 && com == 2)) {
				System.out.println("���º�");
			} else {
				System.out.println("��ǻ�� �¸�");
				comcount++;
			}
			game++;
			
		}
	}
}
