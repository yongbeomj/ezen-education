package Practice;

import java.util.Random;
import java.util.Scanner;

public class ���������� {

	// ����������
		// 1. ����ڷκ��� ����[0]����[1]��[2] �� �ϳ��� �Է¹ޱ�
		// 2. ��ǻ�ʹ� �������� ���������� �� �ϳ� ����
		// 3. �¸��� �÷��̾� ȣ��
			// + : ���࿡ ����[3]�� �Է��ϸ� ��������
			// + : �������� �� ���Ӽ��� �����¸� (���� ���� �̱� �÷��̾� ȣ��)
	
	public static void main(String[] args) {
		
		int player;
		int com;
		int player_count = 0;
		int com_count = 0;
		int game = 0;
		
		// �Է°�ü
		Scanner scanner = new Scanner(System.in);
		while(true) {
			// ����� �Է�
			System.out.print("����[0]����[1]��[2]����[3] > ");
			player = scanner.nextInt();
			
			// 3�� ������?
			if (player == 3) {
				System.out.println("���� �� : " + game);
				if (player_count > com_count) {
					System.out.println("���� �¸��� : �÷��̾� / �̱� Ƚ�� : " + player_count);
				} else if (player_count < com_count) {
					System.out.println("���� �¸��� : ��ǻ�� / �̱� Ƚ�� : " + com_count);
				} else {
					System.out.println("���º�");
				}
				break;
			}
			// 0~3 �� ���� ������?
			if (player < 0 || player > 3) {System.out.println("�߸��� ��ȣ �Դϴ�. �ٽ� �Է��ϼ���."); continue;}
			
			// ��ǻ�� �Է�
			Random random = new Random();
			com = random.nextInt(3);
			System.out.println("��ǻ�� �Է� > " + com);
			
			if ((player == 0 && com == 2)||(player == 1 && com == 0)||(player == 2 && com == 1)) {
				System.out.println("�÷��̾� �¸�"); // �÷��̾� �¸��ϴ� ���
				player_count++;
			} else if ((player == 0 && com == 0)||(player == 1 && com == 1)||(player == 2 && com == 2)) {
				System.out.println("���º�"); // ���º��ϴ� ���
			} else {
				System.out.println("��ǻ�� �¸�"); // �� �� ��ǻ�� �¸�
				com_count++;
			}
			game++;
		}
		
		
	}
	
	
	
	
	
}
