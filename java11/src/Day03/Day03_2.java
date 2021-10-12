package Day03;

import java.util.Scanner;

public class Day03_2 {

	// ����1 : 2���� ������ �Է¹޾� �� ū�� ���
	// ����2 : 3���� ������ �Է¹޾� ���� ū�� ���
	// ����3 : 4���� ������ �Է¹޾� ���� ū�� ���
	// ����4 : 4���� ������ �Է¹޾� �������� ���
	// ����5 : 4���� ������ �Է¹޾� �������� ���
	
	public static void main(String[] args) {
		
		// ����1 : 2���� ������ �Է¹޾� �� ū�� ���
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Q1-����1 : "); int a1 = scanner.nextInt();
		System.out.print("Q1-����2 : "); int a2 = scanner.nextInt();
		
		if (a1 > a2) {
			System.out.println("2�� ���� �� ū ���� : " + a1);
		} else {
			System.out.println("2�� ���� �� ū ���� : " + a2);
		}
		
		// ����2 : 3���� ������ �Է¹޾� ���� ū�� ���
		
		System.out.print("Q2-����1 : "); int b1 = scanner.nextInt();
		System.out.print("Q2-����2 : "); int b2 = scanner.nextInt();
		System.out.print("Q2-����3 : "); int b3 = scanner.nextInt();
		
		int result = b1;
		
		if (result < b2) { result = b2;	} 
		if (result < b3) { result = b3;	}
		System.out.println("���� ū ���� : " + result);
		
		// ����3 : 4���� ������ �Է¹޾� ���� ū�� ���
		
		System.out.print("Q3-����1 : "); int c1 = scanner.nextInt();
		System.out.print("Q3-����2 : "); int c2 = scanner.nextInt();
		System.out.print("Q3-����3 : "); int c3 = scanner.nextInt();
		System.out.print("Q3-����4 : "); int c4 = scanner.nextInt();
		
		int result1 = c1; // max������ ù��° �� ����
		
		if (result1 < c2) {	result1 = c2; } // ���� max ������ �ִ� ������ ũ�� ���� 
		if (result1 < c3) {	result1 = c3; } 
		if (result1 < c4) {	result1 = c4; }
		System.out.println("���� ū ���� : " + result1);
		
		// ����4 : 4���� ������ �Է¹޾� �������� ���
		
		System.out.print("Q4-����1 : "); int d1 = scanner.nextInt();
		System.out.print("Q4-����2 : "); int d2 = scanner.nextInt();
		System.out.print("Q4-����3 : "); int d3 = scanner.nextInt();
		System.out.print("Q4-����4 : "); int d4 = scanner.nextInt();
		
		int temp; // ��ȯ �� ���Ǵ� �ӽú���
		// 1. 1��° ������ 2,3,4��° ���� �� => 3��
		if (d1 > d2) { temp = d1; d1 = d2; d2 = temp; } 
		if (d1 > d3) { temp = d1; d1 = d3; d3 = temp; } 
		if (d1 > d4) { temp = d1; d1 = d4; d4 = temp; } 
		// 2. 2��° ������ 3,4��° ���� �� => 2��
		if (d2 > d3) { temp = d2; d2 = d3; d3 = temp; } 
		if (d2 > d4) { temp = d2; d2 = d4; d4 = temp; } 
		// 3. 3��° ������ 4��° ���� �� => 1��
		if (d3 > d4) { temp = d3; d3 = d4; d4 = temp; }
		// 4. 4��° ������ �񱳸� 3�� ���߱⶧���� ��x
		
		System.out.printf("�������� : %d %d %d %d\n", d1, d2, d3, d4);
		
		// ����5 : 4���� ������ �Է¹޾� �������� ���
		
		if (d1 < d2) { temp = d1; d1 = d2; d2 = temp; } 
		if (d1 < d3) { temp = d1; d1 = d3; d3 = temp; } 
		if (d1 < d4) { temp = d1; d1 = d4; d4 = temp; } 

		if (d2 < d3) { temp = d2; d2 = d3; d3 = temp; } 
		if (d2 < d4) { temp = d2; d2 = d4; d4 = temp; } 
		
		if (d3 < d4) { temp = d3; d3 = d4; d4 = temp; }
		
		System.out.printf("�������� : %d %d %d %d\n", d1, d2, d3, d4);
		
		// ����6 : �α���������
			// [ �Է� ] : ���̵�� ��й�ȣ�� �Է¹ޱ� 
			// [ ���� ] : ȸ�����̵� admin �̰� ��й�ȣ�� 1234 �� ��쿡�� �α��� ���� �ƴϸ� �α��� ���� ���
		
		System.out.print("Q6-ID : "); 		String id = scanner.next();
		System.out.print("Q6-Password : "); int pw = scanner.nextInt();
		
		if (id.equals("admin")) { // String �� �� equals �޼ҵ� ���
			if (pw == 1234) {
				System.out.println("[�α��� ����]");
			} else {
			System.out.println("[�α��� ����] �н����尡 �ٸ��ϴ�.");
			}
		} else {
			System.out.println("[�α��� ����] �������� �ʴ� ���̵��Դϴ�.");
		}
	}
	
}
