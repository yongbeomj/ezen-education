package Day04;

import java.util.Scanner;

public class Day04_8_visitlog {

	//2. ȸ���� �湮�� ���α׷�
		// [����1] : �ִ� 100���� �����Ҽ� �ִ� ȸ�� �迭[ ���̵� , ��й�ȣ ]
		// [����2] : �ʱ� �޴�
			// 1. �α��� 
			// 2. ȸ������ 
		// [ ȸ�������� ���������� ]
			// 1.���̵�� ��й�ȣ�� �Է¹޾� �迭�� ���� 
			// 2.���̵� �ߺ��Ұ� [ �迭�� ���� ���̵� �����ϸ� ȸ������ ���� ] 
		// [ �α����� ���������� ]
			// 1. ���̵�� ��й�ȣ�� �Է¹޾� �迭�� �����ϸ� �α��� ���� // �ƴϸ� ���� 
		// [ �α��� ������ �޴� ] 
			// 1.�湮�� �����
			// 2. �α׾ƿ� 
		// [ �湮�� ����� ���������� ] 
			// ������ �Է¹޾� �迭�� ���� [ ����� �ۼ��� ���̵� ���� ]
			// ���� �湮�� ��� ��� 
		// [ �α׾ƿ� ] 
			// �ʱ�޴��� ���ư���
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // �Է� ��ü
		
		// 1. �Է� ���� ���� ȸ�� �迭 ����
			// 2���� �迭�� �̿��Ͽ� 1�� �ε����� 1�� ȸ���� ���̵�, ��й�ȣ ����
		String[][] member = new String[100][2];	// ȸ�� �迭
		
		// 2. �ʱ� �޴�

		while(true) { // �α��� �� ������ ���ѷ���	
			System.out.println(">>>�޴�<<<");
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("---------");
			System.out.print("�޴��� �Է��ϼ��� > ");	int menu1 = scanner.nextInt(); // �޴� �Է�
			
			if (menu1 == 1) { // 1��(�α���)�� �Է����� ���
				// ���̵�, ��й�ȣ ���� �Է�
				System.out.println(">>>�α��� ������<<<");
				System.out.print("����� ID > ");			String id = scanner.next();
				System.out.print("����� Password > ");	String pw = scanner.next();
				// �ߺ�üũ
				boolean check = false;
				for (int i = 0; i < member.length; i++) {
					// ȸ�� �迭�� ���̵� null�� �ƴϸ鼭 ���̵� �Է°�(id), ��й�ȣ �Է°�(pw)�� �����ϸ� �α���
					if (member[i][0] != null && member[i][0].equals(id) && member[i][1].equals(pw)) {
						System.out.println("�α��� �Ǿ����ϴ�");
						check = true;
						while(true) { // ���� �޴��� ��ȯ
							System.out.println(">>>�޴�<<<");
							System.out.println("1. ���� �����");
							System.out.println("2. �α׾ƿ�");
							System.out.print("�޴��� �Է��ϼ��� > ");	int menu2 = scanner.nextInt(); // �޴� �Է�
							
							// 1. ���� ����� ������ ��� // member[1][0]
							String[] list = new String[100];
							if (menu2 == 1) {
								System.out.print("������ �Է��ϼ��� > "); String content = scanner.next();
								for (int j = 0; j < list.length; j++) {
									if (list[j] == null) {
										list[j] = content;
										// ���
										System.out.println(">>>���� ������<<<");
										System.out.println("ID\t�ۼ�����");
										for (int k = 0; k < member.length; k++) {
											if (list[j] != null) {
												System.out.println(member[i][0] + "\t" + list[j]);
												break;
											}
										}
										break;
									}
								}
								
							} else if (menu2 == 2) { // 2��(�α׾ƿ�) �Է��� ���
								System.out.println("�α׾ƿ� �Ǿ����ϴ�");
								break; // �ݺ��� Ż��
							} else { // 1,2 �� �ٸ� �� �Է��� ��� 
								System.out.println("�� �� ���� ��ȣ�Դϴ�."); 
							}
						}
					} 
				} 
				if (check == false) { // ���� �� ���ǿ� �������� �ʴ´ٸ�(�Է°��� ȸ�� �迭���� ��ġ���� �ʴ´ٸ�) 
					System.out.println("�ٽ� �Է����ֽñ� �ٶ��ϴ�\n");
				}
			} else if (menu1 == 2) { // 2��(ȸ������)�� �Է����� ���
				// ���̵�, ��й�ȣ ���� �Է�
				System.out.println("[[ȸ������ ������]]");
				System.out.print("����� ID > ");			String id = scanner.next();
				System.out.print("����� Password > ");	String pw = scanner.next();
				// �ߺ�üũ
				boolean check = true;
				for (int i = 0; i < member.length; i++) {
					// ��� ���̵��� null�� �ƴϸ鼭 �Է°�(id)�� �����ϸ� �ߺ�
					if (member[i][0] != null && member[i][0].equals(id)) {
						System.out.println("�ߺ��� ���̵� �����մϴ�");
						check = false;
						break; // �ݺ��� Ż��
					}
				}
				if (check == true) { // �� ���� ��� ����ϸ� ȸ������ ó��
					for (int i = 0; i < member.length; i++) {
						if (member[i][0] == null) { // �迭�� �� ���� ã��
							member[i][0] = id;
							member[i][1] = pw;
							System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�\n");
							break;
						}
					}
				}
			}
		}
		
	}
}
