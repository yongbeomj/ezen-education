package Day12;

import java.util.Calendar;
import java.util.Scanner;

public class Day12_5_CalendarMethod {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� : ");
		int year = scanner.nextInt();
		System.out.print("�� : ");
		int month = scanner.nextInt();

		// �޼ҵ� ȣ��
		�޷º���(year, month);
	}

	// �޼ҵ� ����
	public static void �޷º���(int year, int month) {
		// 1. Ķ���� ��ü ���� => new[x], Ŭ���� �� ��ü ȣ��
		Calendar calendar = Calendar.getInstance();

		// 2. ����, ��, ��
//		int year = calendar.get(Calendar.YEAR);
//		int month = calendar.get(Calendar.MONTH)+1; // 0:1��
//		int day = calendar.get(Calendar.DAY_OF_MONTH);
		// ��������� Ķ����
		calendar.set(year, month-1, 1);
		// �ش� ���� 1�� ����ã��
		int sweek = calendar.get(Calendar.DAY_OF_WEEK); // 6
		// �ش� ���� ������ �� ã�� [.getActualMaximum : �ش� �ʵ��� �ִ밪
		int eday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);

		// 3. �޷� ���
		System.out.println("******************* " + year + "�� " + month + "�� *******************");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");

		// 4. ���� �� 1���� ��ġ �տ� ���� ä���
		for (int i = 1; i < sweek; i++) {
			System.out.print(" \t");
		}
		// 5. 1�Ϻ��� ������ ������ ���
		for (int i = 1; i <= eday; i++) {
			System.out.print(i + "\t");
			// ����ϸ��� �ٹٲ� (sweek�� 7�� ������� �ٹٲ�ó��)
			if (sweek % 7 == 0) {
				System.out.println();
			}
			sweek++; // ���� ����
		}
	}
}
