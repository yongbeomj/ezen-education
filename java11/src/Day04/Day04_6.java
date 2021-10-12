package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_6 {
	
	// �迭�� �̿��� ƽ���� ����
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 1. ������ ���� [�迭�� 9ĭ ����]
		// String ��ü 9���� �����ϴ� �迭 ����
		String[] game = {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"};
		String winner = ""; // �¸� ���� ���� ����
		int count = 0; 
		
		while(true) {
			// 2. ������ ���
			for (int i = 0; i < game.length; i++) {
				System.out.print(game[i]);
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			// 6. �¸��� ������ �� ���� ����
			if (winner.equals("[O]")) {
				System.out.println("�÷��̾� �¸�");
				break;
			} else if (winner.equals("[X]")) {
				System.out.println("��ǻ�� �¸�");
				break;
			}
			
			
			while(true) {
				// 3. �÷��̾ ��ġ�� �����Ͽ� �� �α�
				System.out.print(">>>>> �÷��̾� ��ġ ���� :"); int index = scanner.nextInt();
				
				// ������ ��ġ�� �̹� ���� ���� ���
				if (game[index].equals("[ ]")) {
					game[index] = "[O]";
					count++;
					break;
				} else {
					System.out.println("�ߺ��Դϴ�. �ٽ� �����ϼ���");
				}
			}
				// 7. 9ĭ ���� ��� �������� ��
				if (count == 9) {
					System.out.println("���º�");
					break;
				}
				
			while(true) {
				// 4. ��ǻ�� (���� �����ؼ� �� �α�)
				System.out.println(">>>>> ��ǻ�� ��ġ ���� ��");
				Random random = new Random();
				int com = random.nextInt(9);
				
				if (game[com].equals("[ ]")) {
					game[com] = "[X]";
					count++;
					break;
				}
			}
			
			// 5. �¸��� �Ǵ�
			// ����
			for (int i = 0; i <= 6; i++) {
				if (game[i].equals(game[i+1]) && game[i+1].equals(game[i+2])) {
					if (!game[i].equals("[ ]")) {
						winner = game[i];
					}
				}
			}
			// ����
			for (int i = 0; i <= 2; i++) {
				if (game[i].equals(game[i+3]) && game[i+3].equals(game[i+6])) {
					if (!game[i].equals("[ ]")) {
						winner = game[i];
					}
				}
			}
			// �밢��
			if (game[0].equals(game[4]) && game[4].equals(game[8])) {
				if (!game[0].equals("[ ]")) {
					winner = game[0];
				}
			}
			if (game[2].equals(game[4]) && game[4].equals(game[6])) {
				if (!game[2].equals("[ ]")) {
					winner = game[2];
				}
			}
			
		}
		
		
		
	}
}
