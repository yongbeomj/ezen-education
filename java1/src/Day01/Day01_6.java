package Day01;

import java.util.Scanner;

public class Day01_6 {

	public static void main(String[] args) {
		
		// ����3
		/*
		 * ���� �Է¹޾� ����ϱ�
		 * [�Էº���]
		 * �ۼ���, ����, ��¥
		 * [���]
		 * -------------------����---------------
		 * | ���� | �ۼ��� |		����		|  ��¥  |
		 * |  1  | ��ȣ�� |	 �ȳ��ϼ���	| 09-28 |
		 * --------------------------------------
		 */
		
		// 1. �Է°�ü ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ۼ��� : ");	String name = scanner.next();
			scanner.nextLine();
		System.out.print("���� : ");		String text = scanner.nextLine(); // ���� ���� o
		 	// scanner.nextLine(); : next �������� nextLine ��� �� ���� �߻�
				// why? next ���� ������ ������ �Է°����� �ν�
				// �ذ��� : next�� nextLine ���̿� scanner.nextLine(); �߰�
		System.out.print("��¥ : ");		String date = scanner.next();
		
		// 2. ���
		System.out.println("---------------����---------------");
		System.out.println("| ���� | �ۼ��� |\t����\t| ��¥\t|");
		System.out.println("|  1  | " + name + " |\t" + text + "\t| " + date + "\t|");
		System.out.println("-----------------------------------");
	}
}
