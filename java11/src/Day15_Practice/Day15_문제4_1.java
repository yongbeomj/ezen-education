package Day15_Practice;

import java.util.Scanner;
import java.util.Stack;

public class Day15_����4_1 {

//	���ñ����� �̿��� ���ڿ� ���� ���
//	���ñ���
//	�Է¹��� ���ڿ��� ������� ���ÿ� ����
//	���ڿ� �ݴ�� ���
//	ABC -> CBA
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// �Է�
		System.out.println("���ڿ� �Է� : ");
		String ���� = scanner.next();
		// ���ڿ� �и�
		String[] strArray = ����.split("");
		// ���� �Է� ���ڿ�
		System.out.print("���� �Է� ���ڿ� : ");
		for(String temp : strArray) {
			System.out.print(temp);
		}
		
		// ���� ����
		Stack<���ڿ�> str = new Stack<>();
		// ���ÿ� ��ü �ֱ�
		for (String temp : strArray) {
			str.push(new ���ڿ�(temp));
		}
		
		// ���ÿ��� ������
		System.out.print("\n���� ���� �� ���ڿ� : ");
		while( !str.isEmpty() ) {
			System.out.print(str.pop());
		}
		
	}
	
}
