package Day04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day04_5 {

	// �迭�� �̿��� �������� ���α׷�
		// 1. �л� ���� �Է¹޾� �л� �� ��ŭ �迭�� ���� �Ҵ�
		// 2. �޴� [1.�л��� 2.�����Է� 3.�м�[���,���] 4.����]
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Integer[] list = null; // �迭 ���� �� ���� �ֱ�
		
		while(true) {
			System.out.println("1.�л��� 2.�����Է� 3.�м� 4.����");
			System.out.print("���� : "); int ch = scanner.nextInt();
			
			if (ch == 1) {
				System.out.print("�л� �� �Է�[�迭����] : "); int arraylist = scanner.nextInt();
				// �迭�� �޸� �Ҵ�
				list = new Integer[arraylist]; // �Է¹��� �� ��ŭ �޸� �Ҵ�
				System.out.println(arraylist + "��ŭ �л���� ����");
			}
			if (ch == 2) {
				// �л� �� ��ŭ ���� �Է� �ޱ� [�迭��.length : �迭�� ����]
				for (int i = 0; i < list.length; i++) {
					System.out.println((i+1) + "��° �л� ���� �Է� : ");
					list[i] = scanner.nextInt();
				}
			}

			
			if (ch == 3) {
				// ���
				// 2. Ŭ���� �̿��� ����  [ �迭 ���� Ŭ���� = Arrays ] 
				Arrays.sort( list ); // �������� / �������� �ݴ�� �������� 
				Arrays.sort( list, Collections.reverseOrder() );
						// Collections.reverseOrder() : ���� ������ [ �⺻ �ڷ����� �Ұ� // ��ü�� ���� ]
				
				// 2. ��� 
				int sum = 0 ;
				for( int i = 0 ; i<list.length ; i++ ) {
					System.out.println( (i+1) + "�� ���� : " + list[i]);
					sum += list[i];
				}
				System.out.println(" ��� �л����� ���� ��� : " +  sum / list.length );
				
			}
			if( ch == 4) break;
		}
		
	}
}
