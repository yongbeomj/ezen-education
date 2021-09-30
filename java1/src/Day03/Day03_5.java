package Day03;

import java.util.Scanner;

public class Day03_5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// �ݺ����� �� ��� ���
		// ����1) �Է¹��� ������ŭ �� ��� (i�� 1���� �Է¹��� �������� 1�� ����)
		System.out.print("����1) �� ���� : "); int s = scanner.nextInt();
		for (int i = 1; i <= s; i++) {
			System.out.print("* ");
		}
		System.out.println("\n---------------------------------");
		
		// ����2) �Է¹��� ������ŭ �� ��� // 5������ �� �ٲ�
		System.out.print("����2) �� ���� : "); int s2 = scanner.nextInt();
		for (int i = 1; i <= s2; i++) {
			System.out.print("* ");
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n---------------------------------");
		
//		������3 : �Է¹��� �� ��ŭ ���
//		*
//		**
//		***
//		****
//		***** 
		System.out.print("����3) ���� �� : "); int s3 = scanner.nextInt();
		for (int i = 1; i <= s3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------");
		
//		������4 : �Է¹��� �� ��ŭ ���
//		*****
//		****
//		***
//		**
//		*
		System.out.print("����4) ���� �� : "); int s4 = scanner.nextInt();
		for (int i = s4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------");
		
//		������5 : �Է¹��� �� ��ŭ ���
//	        *
//	       **
//	      ***
//	     ****
//		*****
		System.out.print("����5) ���� �� : "); int s5 = scanner.nextInt();
		for (int i = 1; i <= s5; i++) {
			for (int j = s5-1; j >= 0; j--) {
				if (i <= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");	
				}
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------");
		
//		������6 : �Է¹��� �� ��ŭ ���
//		*****
//		 ****
//		  ***
//		   **
//		    *
		System.out.print("����6) ���� �� : "); int s6 = scanner.nextInt();
		for (int i = 1; i <= s6; i++) {
			// ����
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			// �����
			for (int k = 1; k <= s6-i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------");
		
//		������7 : �Է¹��� �� ��ŭ ���
//	        *
//	       ***
//	      *****
//	     *******
//		*********
		System.out.print("����7) ���� �� : "); int s7 = scanner.nextInt();
		for (int i = 1; i <= s7; i++) {
			// ����
			for (int j = 1; j <= s7 - i; j++) {
				System.out.print(" ");
			}
			// �����
			for (int k = 1; k <= i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------");
		
//		������8 : �Է¹��� �ٸ�ŭ ��� 
//		    1
//	       222
//	      33333
//	     4444444
//		555555555
		System.out.print("����8) ���� �� : "); int s8 = scanner.nextInt();
		for (int i = 1; i <= s8; i++) {
			// ����
			for (int j = 1; j <= s8 - i; j++) {
				System.out.print(" ");
			}
			// �����
			for (int k = 1; k <= i*2-1; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------");
		
//		������9 : �Է¹��� �ٸ�ŭ ���
//		*********	
//		 *******	
//		  *****		
//		   ***		
//		    *		
		System.out.print("����9) ���� �� : "); int s9 = scanner.nextInt();
		for (int i = 1; i <= s9; i++) {
			// ����
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			// �����
			for (int k = 1; k <= (s9*2-(i*2-1)); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n---------------------------------");
		
//		������11 : �Է¹��� �ٸ�ŭ ��� [ �Է¹��� ��/�� ���� ] 
//				
//				*     *		i = 1		j = 1 2		k = 5	7-i*2				
//				 *   *		i = 2		j = 1 2		k = 3
//				  * *		i = 3		j = 1 2		k = 1
//				   *		i = 4		j = 1		k = 0
//			      * *		i = 5		j = 1 2		k = 1
//			     *   *		i = 6		j = 1 2		k = 3
//			    *     *		i = 7		j = 1 2		k = 5
//							line		��			����
		System.out.print("����11) ���� �� : "); int s11 = scanner.nextInt();
		for (int i = 1; i <= s11; i++) {
			// ����
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			// �����
			System.out.println("*");
			// ���� ����
			for (int j = (s11-i*2); j >= 0; j--) {
				System.out.print(" ");
			}
			// �����

		}
		System.out.println("\n---------------------------------");
		
		
	}
}
