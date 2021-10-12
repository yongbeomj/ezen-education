package Day05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_4_Board {

	// ����1 : �Խ��� ���α׷�
		// 0. 2���� �迭 ���
		// 1. �Խ��� [ ����, ����, �ۼ���, �ۼ���[Date], ��ȸ�� ]
		// 2. ���� �޴�
		// 1.
		/*
		 * 		[�Խ���]
		 * ����	����	�ۼ���	�ۼ���	��ȸ��
		 * 1    �ȳ�	������	10-05	3
		 * 2    �ȳ�	������	10-05	3
		 * ���� : 1.�۾��� 2. �� ��������
		 */
		// [�۾��� ���� ��]
			// 1. ����, ����, �ۼ���, �ۼ��� �Է¹޾� �迭�� ����
		// [�� �������� ������ ��]
			// 1. ���������� �� �Խù� ��ȣ ����
			// 2. ������ �Խù��� �������� ���
		
		// �������� ����
		/*
		 * >> ���� : �ȳ�
		 * >> �ۼ��� :	�ۼ��� :	��ȸ�� : 
		 * >> ����
		 * 
		 * >> ���� : 1. �ڷΰ���
		 */
	public static void main(String[] args) {
		// �Է� ��ü
		Scanner scanner = new Scanner(System.in);
		
		// �Խ��� �迭
		String[][] board = new String[100][5];
		
		// ���� �޴�
		while(true) {
			System.out.println("\n===============Ŀ�´�Ƽ==================");
			System.out.printf(" %s \t %s \t %s \t %s \t %s\n","����","����","�ۼ���","�ۼ���","��ȸ��");
			// �迭�� ��� �ε��� ���
			for( int i = 0 ; i<board.length; i++ ) {
				if( board[i][0] != null ) {
					System.out.printf(" %d \t %s \t %s \t %s \t %s\n" ,
							i , board[i][0] , board[i][2],board[i][3],board[i][4]);
				}
			}
			System.out.println("======================================");
			System.out.print(" 1.�۾��� 2.�ۻ󼼺���  >>���� : ");
			int ch1 = scanner.nextInt();
			
			if( ch1 == 1 ) {
				System.out.println(" >>>>>> �Խù� ���� >>>>>>");
					scanner.nextLine(); // ���� ����
				System.out.print(" ���� : ");	String title = scanner.nextLine();
				System.out.print(" ���� : ");	String contents = scanner.nextLine();
				System.out.print(" �ۼ��� : ");	String writer = scanner.nextLine();
				// ���� ��¥ Ŭ����
				Date now = new Date();
					// ��¥ ���� Ŭ����
					SimpleDateFormat dateFormat = new SimpleDateFormat( "MM-dd" );
					String date = dateFormat.format(now);
					
				// ��ȸ��
				String count = "1";
				// ��� ������ ����� �迭�� ���� 
				for( int i = 0 ; i<board.length ;i++ ) {
					if( board[i][0] == null) {
						board[i][0] = title; board[i][1] = contents; board[i][2] = writer; 
						board[i][3] = date; board[i][4] = count; break;
					}
				}				
			} else if (ch1 == 2) {
				System.out.print("�� ��ȣ ���� > "); int num = scanner.nextInt();
				int count = Integer.parseInt(board[num][4]); // ��ȸ��(String) -> int ��ȯ
				board[num][4] = Integer.toString(++count); // ��ȸ�� ���� �� -> String ��ȯ
				
				for(int i = 0; i < board.length; i++) {
					if (board[i][0] == null) { break; }
					
					System.out.println("\n>>>>>>>>>>>>>>>>>��������<<<<<<<<<<<<<<<<<");
					System.out.printf(">> ���� : %s \n",board[num][0]);
					System.out.printf(">> �ۼ��� : %s , �ۼ��� : %s , ��ȸ�� %s \n", board[num][2], board[num][3], board[num][4]);
					System.out.printf(">> ���� : %s \n",board[num][1]);
					System.out.println(">>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<");
					break;
				}
				
				
				/*
				 * >> ���� : �ȳ�
				 * >> �ۼ��� :	�ۼ��� :	��ȸ�� : 
				 * >> ����
				 * 
				 * >> ���� : 1. �ڷΰ���
				 */
				
			} else {
				System.out.println("[[�˸�]] : �� �� ���� �ൿ�Դϴ� ");
			}
		}
			
		
		
	}
	
}
