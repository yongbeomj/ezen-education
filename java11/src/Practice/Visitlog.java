package Practice;

import java.util.Scanner;

public class Visitlog {

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
		
		// �Է°�ü
		Scanner scanner = new Scanner(System.in);
		// �迭
		String[][] members = new String[100][2]; // ȸ�� �迭
		
		// ���� �޴�
		while(true) {
			System.out.println("1.�α��� 2.ȸ������");
			System.out.print(">>> ���� : "); int ch = scanner.nextInt();
			
			if (ch == 1) { // �α���
				System.out.println("�α��� �޴�");
				System.out.print("ID : "); String id = scanner.next();
				System.out.print("Password : "); String pw = scanner.next();
				
				// �ߺ� üũ
				boolean logincheck = true;
				for (int i = 0; i < members.length; i++) {
					if (members[i][0] != null &&
							members[i][0].equals(id) &&
							members[i][1].equals(pw)) {
						System.out.println("�α��� �Ǿ����ϴ�");
					//////////// �α��� ���� �� ///////////////
						while(true) {
							System.out.println("1.�湮�ϳ���� 2.�α׾ƿ�");
						}
					}
				}
				break;
			} else if (ch == 2) { // ȸ������
				System.out.println("ȸ������ �޴�");
				System.out.print("ID : "); String id = scanner.next();
				System.out.print("Password : "); String pw = scanner.next();
				
				// �ߺ� üũ
				boolean idcheck = true;
				for (int i = 0; i < members.length; i++) { // ��� �迭 �ε��� 0������ üũ
					if (members[i][0] != null && members[i][0].equals(id)) { // ��� �迭 (i,0)�� null�� �ƴϰ� id �Է°��� ���ٸ�
						System.out.println("ID �ߺ�");
						idcheck = false;
						break; // for ����(�ߺ�ã�� ����)
					}
				}
				if (idcheck) { // �ߺ�üũ true���
					for (int i = 0; i < members.length; i++) {
						if (members[i][0] == null) { // �� �����̶��
							members[i][0] = id; // �ε��� 0�� id ����
							members[i][1] = pw; // �ε��� 1�� pw ����
							System.out.println("ȸ������ �Ϸ�");
							break; // for ����
						}
					}
				}
				break; // while ����
			} else {
				System.out.println("�� �� ���� ��ȣ�Դϴ�");
				// break x => �ٽ� �޴� �����ϵ���
			}
		}
		
	}
}
