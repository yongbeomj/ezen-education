package Day03;

import java.util.Scanner;

public class Day03_3 {

	// if(������), switch(����������)
		// ����� ���� ������ �ִ� ��� => switch(�ӵ�����)
		// ����� ���� ������ ���� �ʴ� ��� => if
			/* ���� : switch (key : �˻���) { 
			  		case �˻� : ���๮;
			  		case �˻� : ���๮;
			  		case �˻� : ���๮;
			  		default : ���๮;
			 */
			// break : switch Ȥ�� �ݺ����� Ż�� �� ���Ǵ� Ű���� (���� ����� �߰�ȣ Ż��)
	public static void main(String[] args) {
		
		// ��1)
		int score = 80;
		switch (score) { // score�� �˻�
			// score�� 90�̸�
			case 90 : System.out.println("A��� �Դϴ�"); break;
			// score�� 80�̸�
			case 80 : System.out.println("B��� �Դϴ�"); break;
			// score�� 70�̸�
			case 70 : System.out.println("C��� �Դϴ�"); break;
			// �� ��
			default : System.out.println("Ż�� �Դϴ�"); 
		}
		
		// ��2 ) 
		int b = 3; 
		switch( b ) {
			case 1 : System.out.println(" 1������ �̵� "); break;
			case 2 : System.out.println(" 2������ �̵� "); break;
			case 3 : System.out.println(" 3������ �̵� "); break;
			default : System.out.println(" ���� ");
		}	
		
		// p.118 char switch
		char grade = 'B';
		switch (grade) {
			case 'A' :
			case 'a' :
				System.out.println("��� ȸ���Դϴ�."); break;
			case 'B' :
			case 'b' :
				System.out.println("�Ϲ� ȸ���Դϴ�."); break;
			default :
				System.out.println("�մ��Դϴ�.");
		}
		
		// p.119 String switch
		String position = "����";
		switch (position) {
			case "����" :
				System.out.println("700����"); break;
			case "����" :
				System.out.println("500����"); break;
			default :
				System.out.println("300����");
		}
		
		// ����1 : ������ ������ �Է¹޾� ����� 90�� �̻��̸� "A���", 80�� �̻��̸� "B���" ������ Ż��
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� : "); int kor = scanner.nextInt();
		System.out.print("���� : "); int eng = scanner.nextInt();
		System.out.print("���� : "); int mat = scanner.nextInt();
		
		int average = (kor + eng + mat) / 3;
		
		switch (average / 10) { // 1�� �ڸ� ����
			case 10 :
			case 9 :
				System.out.println("A���"); break;
			case 8 :
				System.out.println("B���"); break;
			default :
				System.out.println("Ż��");
		}
	}
}
