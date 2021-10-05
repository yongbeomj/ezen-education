package Day05;

import java.util.Scanner;

public class Day05_2_visitlog {

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
		
		// 0. �Է� ��ü
		Scanner scanner = new Scanner(System.in);
		
		// 1. ȸ�� 100��[id,pw] �����ϴ� ��� ����
		String[][] memberlist = new String[100][2]; // 100�� * 2�� => 200ĭ
		// 1. �湮�� 100��[contents, writer] �����ϴ� ��� ����
		String[][] visitlog = new String[100][2];
		
		// 2. �޴� => �޴��� ��� �ݺ� ���� : ���� ���� [while]
		while(true) {
			System.out.println("\t - ȸ���� �湮�� - ");
			System.out.println("-------------------");
			System.out.print("[[ 1.ȸ������ 2.�α��� ���� : ");
			int ch = scanner.nextInt();
			// ȸ����� :
			for (int i = 0; i < 100; i++) {
				if (memberlist[i][0] != null) {
					System.out.println(memberlist[i][0]);
				}
			}
			
			// �Է¿� ���� �� ����
			switch(ch) {
				case 1 :
					System.out.println("- ȸ������ ������ -");
					System.out.print("ID : "); String id = scanner.next();
					System.out.print("Password : "); String pw = scanner.next();
					
					// id �ߺ�üũ (��� �迭 �� �������� �����ؼ� ������ ���̵� �ִ��� üũ)
					boolean idcheck = true;
					for (int i = 0; i < memberlist.length; i++) { // memberlist.length : �迭�� ���α��� => 100
						if (memberlist[i][0] != null && memberlist[i][0].equals(id)) { // i��° id�� �����ϸ� 
							System.out.println("[[�˸�]] : �ߺ��� ���̵� �����մϴ�");
							idcheck = false;
							break; // �ߺ�ã�� ����
						}
					}
					
					// �ߺ�üũ ������ true�̸� �迭 �� �� ������ ã�Ƽ� ����
					if (idcheck) {
						for (int i = 0; i < memberlist.length; i++) {
							if (memberlist[i][0] == null) { // i��°�� �����̸� 
								memberlist[i][0] = id;
								memberlist[i][1] = pw;
								System.out.println("[[�˸�]] : ȸ�������� �Ǿ����ϴ�");
								break;
							}
						}
					}
					break;
					
				case 2 :
					System.out.println("- �α��� ������ -");
					// 1.�Է� -> ���� 
					System.out.print("ID : "); String logid = scanner.next();
					System.out.print("Password : "); String logpw = scanner.next();
					// 2. �迭 ������ �Է��� ���̵�� �н����尡 �����ϴ��� => �����ϸ� �α��� ����
						// for���� �̿��� ��� �ε����� �����Ͽ� �ϳ��� ��
					boolean logincheck = true;
					for (int i = 0; i < memberlist.length; i++) {
						if (memberlist[i][0] != null &&
								memberlist[i][0].equals(logid) &&
								memberlist[i][1].equals(logpw)) {
							System.out.println("[[�˸�]] �α��� ����");
							////////////////////////////////�α��� ������ �޴�/////////////////////////////////////////
							while(true) { // ȸ���޴� ���ѷ���
								System.out.println("\n\n\t - ȸ�� �޴� - ");
								System.out.print(" [[ 1.�湮�� ���� 2.�湮�� Ȯ�� 3.�α׾ƿ�  ���� : ");
								int ch2 = scanner.nextInt();
									
								if (ch2 == 1) {
									scanner.nextLine(); // nextLine ���� �ذ� 
									System.out.print(">>>> �湮 ���� : "); String contents = scanner.nextLine();
//									System.out.print("�湮�� ���� : "); String contents = scanner.next();
									// �湮�� �迭 �� ������� ã�Ƽ� ����� �α��ε� ���̵� ����
									for (int j = 0; j < visitlog.length; j++) {
										if (visitlog[j][0] == null) {
											visitlog[j][0] = logid;
											visitlog[j][1] = contents;
											System.out.println(">>>> �湮�� ���");
											break;
										}
									}
								} 
								else if (ch2 == 2) {
									System.out.println("---------�湮�� ���---------");
									System.out.printf("%10s \t %s \n", "�ۼ���", "����");
									for (int j = 0; j < visitlog.length; j++) {
										if (visitlog[j][0] == null) { break; }
										System.out.printf("%10s\t%s\n", visitlog[i][0], visitlog[i][1]);
									}
								}
								else if( ch2 == 3 ) {
									System.out.println("[[�˸�]] : �α׾ƿ� �Ǿ����ϴ� ");
									break;
								}
								else System.out.println("[[�˸�]] : �� �� ���� �ൿ�Դϴ� ");
							}
							////////////////////////////////////////////////////////////////////////////////////////
							
							logincheck = false;
							break;
						}
					}
					
					// �α��� ���� ��
					if (logincheck) System.out.println("[[�˸�]] �α��� ����(������ ������ �����ϴ�)");
					
					break;
				default :
					System.out.println("[[�˸�]] �� �� ���� ��ȣ�Դϴ�");
					
			}
		
		}
	}
}
