package Day11;

import java.io.IOException;

public class BookApplication {
	public static void main(String[] args) throws IOException {
		 String [] ������� = {
				 "�ȴ�! ���̹� ��α� & ����Ʈ" ,
				 "������ ��Ʈ ����Ȱ�� ������" ,
				 "Tucker�� Go ��� ���α׷���" , 
				 "ȥ�� �����ϴ� C���"};
		 
		 // Ű����κ��� ����Ʈ�� �о�ö� /r/n ���� 
		 
		 while(true) {
			 System.out.println("1.�˻� 2.����");
			 byte[] b = new byte[100];  // Ű����κ��� ���� ����Ʈ �迭 ���� 
			 int count = System.in.read(b);	
			 	// �Է¹��ڼ� + 2[\n , \r ]
			 	// Ű����κ��� ����Ʈ�� �޾� �迭�� ����
			 String ch = new String( b ,0, count-2 ); // ����Ʈ -> ���ڿ�
			 					// 0���� �Է��� ���ڼ����� ��ȯ
			 if( ch.equals("1") ) {
				 System.out.println(" �˻� ���� : "); 
				 int count2 = System.in.read(b);
				 	// �Է¹��ڼ� + 2[\n , \r ]
				 	// Ű����κ��� ����Ʈ�� �޾� �迭�� ����
				 String book = new String(b , 0 , count2-2); // ����Ʈ -> ���ڿ�
				 					// 0���� �Է��� ���ڼ����� ��ȯ
				 // �����˻�[å��=�迭] => ��� å�� �˻� => for
				 for( int i = 0 ; i<�������.length; i++ ) {
					 if( �������[i].contains( book ) ) {
						System.out.println( i +"��  "+ �������[i]); 
					 }
				 }
				 
				 
			 }else if( ch.equals("2") ) {
				 System.out.println(" �˻� ���� : "); 
				 int count2 = System.in.read(b);
				 	// �Է¹��ڼ� + 2[\n , \r ]
				 	// Ű����κ��� ����Ʈ�� �޾� �迭�� ����
				 String book = new String(b , 0 , count2-2); // ����Ʈ -> ���ڿ�
				 					// 0���� �Է��� ���ڼ����� ��ȯ
				 // �����˻�[å��=�迭] => ��� å�� �˻� => for
				 for( int i = 0 ; i<�������.length; i++ ) {
					 if( �������[i].contains( book ) ) {
						System.out.println( i +"��  "+ �������[i]); 
					 }
				 }
				 
				 // ������ ������ȣ [ �ε��� ]  
				 System.out.println(" ������ ������ȣ : "); 

				 int count3 = System.in.read(b);
				 int index = Integer.parseInt(new String( b , 0 , count3-2 ) );
				 
				 System.out.println("������ ���� : ");
				 count3 = System.in.read(b);
				 String oldbook = new String(b , 0 , count3-2); // ����Ʈ -> ���ڿ�
				 
				 System.out.println("���ο� ���� : ");
				 count3 = System.in.read(b);
				 String newbook = new String(b , 0 , count3-2); // ����Ʈ -> ���ڿ�
				 
				 // ġȯ
				 �������[index] = �������[index].replace(oldbook, newbook);
				 
			 }
		 }
	}
}
