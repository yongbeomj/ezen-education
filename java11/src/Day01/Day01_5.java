package Day01;

import java.util.Scanner; // import : �ٸ� ��Ű������ Ŭ���� ��������

public class Day01_5 {

	public static void main(String[] args) {
		
		// ����2
		/*
		 * 1���� ȸ������ ǥ �����
		 * [�Էº���]
		 * ���̵�, ��й�ȣ, ����, �̸��� �Է¹޾� ���
		 * [��� ����]
		 * >>>>>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� <<<<<<<<<<<<<<<
		 * ���̵�		��й�ȣ		����		�̸���
		 * qwer		1234		���缮	qwer@naver.com
		 */
		
		// 1. �Է°�ü �����
		Scanner scanner = new Scanner(System.in);
		
		// 2. �Է¹��� ���� ����/��ü ����
		System.out.print("ID : ");		String id = scanner.next();
		System.out.print("Password : "); int pw = scanner.nextInt();
		System.out.print("�̸� : "); 	String name = scanner.next();
		System.out.print("E-mail : "); 	String email = scanner.next(); 
		
		// 3. ���
		System.out.println(">>>>>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� <<<<<<<<<<<<<<<");
		System.out.println("���̵�\t��й�ȣ\t����\t�̸���");
		System.out.println(id + "\t" + pw + "\t" + name + "\t" + email);
	}
}
