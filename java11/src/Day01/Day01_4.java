package Day01;

import java.util.Scanner;

public class Day01_4 {

	public static void main(String[] args) {
		
		// 1. �Է°�ü ���� : Ű����κ��� �Է°��� �����ϴ� ��ü 
		Scanner scanner = new Scanner(System.in);
			// ��ü���� : Ŭ������, ��ü�� (����) = new ������( );
		
		// 2. �Է¹��� �� �����ͼ� ������ ����
			// ������ ���� ������ �� �ִ� �޸�(�����ġ)
		System.out.print("ù��° �Է� : ");
		String input1 = scanner.next();
			// String : ���ڿ� Ŭ���� : ���ڿ��� �����ϴ� ��ü ����

		System.out.print("�ι�° �Է� : ");
		int input2 = scanner.nextInt();
		// int : ������(����) �ڷ��� : ������ �����ϴ� ���� ����
		
		// 3. ���� ���
		System.out.println("ù��° �Է°��� : " + input1);
		System.out.println("�ι�° �Է°��� : " + input2);
		
		// ����1
		/*
		 * �л� �Ѹ��� �̸��� 1~3������ �⼮ ���θ� �Է¹޾� �Ʒ��� ���� ���
		 *  			[[ �⼮�� ]]
		 * ------------------------------------
		 * �̸�		1����	2����	3����	���
		 * ��ȣ��		�⼮		�⼮		�⼮
		 * ------------------------------------
		 */
		
		System.out.print("�л��� �̸� : ");	 String name = scanner.next();
		System.out.print("1���� �⼮���� : ");	 String class1 = scanner.next();
		System.out.print("2���� �⼮���� : ");	 String class2 = scanner.next();
		System.out.print("3���� �⼮���� : ");	 String class3 = scanner.next();
		
		System.out.println("\t\t[[ �⼮�� ]]");
		System.out.println("------------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����\t���");
		System.out.println(name + "\t" + class1 + "\t" + class2 + "\t" + class3);
			// ������ ��ü���� ����ó�� ����
		System.out.println("------------------------------------");
	}
}
