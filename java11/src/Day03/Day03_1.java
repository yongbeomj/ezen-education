package Day03;

public class Day03_1 {

	// p.108 ��� : if(������), switch(����������)
		// ���� : ����� ���� ���� �ڵ� ó��
			// ��) ���������� : ��ư [if(���� ��¹�ư�� ��������)]
		// if : true, false�� ���� ����
			// ����1 : if(��) true���๮;
			// ����2 : if(��) true���๮;
			//		  else false���๮;
			// ����3 : if(��) { true���๮; }
			//		  else { false���๮; }
			// ����4 : if(��) { }
			//		  else if(��2) { }
			//	      else if(��3) { }
			//	      else if(��4) { }
			//	      else { }
	
	public static void main(String[] args) {
		// ��1) true�̸� ���๮ ����
		if (3 > 1) System.out.println("��1) 3�� 1���� ũ��");
		// ��2) false�̸� ���๮ ����x
		if (3 > 5) System.out.println("��2) 3�� 5���� ũ��");
		// ��3) true false �̸� ���๮ ����
		if (3 > 5) System.out.println("��3) 3�� 5���� ũ��");
		else System.out.println("��3) 3�� 5���� �۴�");
		// ��4) { }�� ���Ǵ� ��� => ���๮ 2�� �̻��� ��
		if (3 > 2) {
			System.out.println("true�̸� ����Ǵ� �ڸ�");
			System.out.println("��4) 3�� 2���� ũ��");
		} else {
			System.out.println("false�̸� ����Ǵ� �ڸ�");
			System.out.println("��4) 3�� 2���� �۴�");
		}
		// ��5-1) �پ��� ����� ���� ���� ����
		if (3 > 5) System.out.println("��5) 3�� 5���� ũ��");
		else if (3 > 4) System.out.println("��5) 3�� 4���� ũ��");
		else if (3 > 3) System.out.println("��5) 3�� 3���� ũ��");
		else if (3 > 2) System.out.println("��5) 3�� 2���� ũ��");
		else System.out.println("��5) true�� ����");

		// ��5-2) �پ��� ����� ���� ���� ����
		if (3 > 5) System.out.println("��5) 3�� 5���� ũ��");
		if (3 > 4) System.out.println("��5) 3�� 4���� ũ��");
		if (3 > 3) System.out.println("��5) 3�� 3���� ũ��");
		if (3 > 2) System.out.println("��5) 3�� 2���� ũ��");
		else System.out.println("��5) true�� ����");
		
		// p.109 ����
		int score = 93;
		// ������ 90���� ũ�� ������ ����
		if (score >= 90) {
			System.out.println("������ 90���� Ů�ϴ�");
			System.out.println("����� A �Դϴ�");
		}
		// ������ 90 �̸��̱� ������ ����x
		if (score < 90) {
			System.out.println("������ 90���� �۽��ϴ�");
			System.out.println("����� B �Դϴ�");	
		}
			
		// p.111 ����
		
		int score2 = 85;
		if (score >= 90) {
			System.out.println("������ 90���� Ů�ϴ�");
			System.out.println("����� A �Դϴ�");
		} else {
			System.out.println("������ 90���� �۽��ϴ�");
			System.out.println("����� B �Դϴ�");	
		}		
			
		// p.112 ����
		
		int score3 = 75;
		if (score >= 90) {
			System.out.println("������ 100~90 �Դϴ�");
			System.out.println("����� A �Դϴ�");
		} else if (score >= 80 ) {
			System.out.println("������ 80~89 �Դϴ�");
			System.out.println("����� B �Դϴ�");	
		} else if (score >= 70 ) {
			System.out.println("������ 70~79 �Դϴ�");
			System.out.println("����� C �Դϴ�");	
		} else {
			System.out.println("������ 70 �̸� �Դϴ�");
			System.out.println("����� D �Դϴ�");	
		}		
			
			
	}
}
