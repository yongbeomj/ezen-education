package Day02;

import java.util.Scanner;

public class Day02_4 {
		
	// ����1 : �޿� ���� 
	/*
	 * [����] �Է¹ޱ� : �⺻�� , ���� 
	 * [���] �Ǽ��ɾ� = �⺻�� + ���� - ����[ �⺻��10% ]
	 * 
	 */
	
	// ����2 : ���� ���� ���� 
	/*
	 * [����] : �ʸ��� ������ �ݾ��� ����޾ 
	 * [���] : �Է¹��� �ݾ��� ����� ���� 
	 * [��� �� ] : 356789  
	 * 		�ʸ��� : 3�� 
	 *		���� : 5�� 
	 * 		õ�� : 6�� 
	 * 		��� : 7��
	 */
	
	//����3 : �ϳ��� ������ �Է¹޾� 7�� ������� ���[ true , false ]
	
	//����4 : �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� [ true , false ]
	
	//����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� [ true , false ]

	//����6 : �ΰ��� ������ �Է¹޾� �� ū�� ���  [ true , false ]
	
	//����7 : �������� �Է¹޾� �� ���� ����ϱ� 
		// �� ���� ���� => ������ * ������ * ������[3.14]
	
	//����8 : �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�
		// ��) 54.5   84.3 �̸�    64.285714%
	
	//����9 : ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�]
			//��ٸ��� ���� = > (���� * �غ�) * ���� / 2
		
	//����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
		//ǥ��ü�� ���� = > (Ű - 100) * 0.9
	
	//����11: Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
		//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))
	
	//����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ�
	
	//����13:  �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
		//�Ҽ� ��° �ڸ� ���� ���� ����ϱ�
		//�߰���� �ݿ����� => 30 %
		//�⸻��� �ݿ����� => 30 %
		//������ �ݿ����� => 40 %
	
	//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
	 	//int x = 10;
		//int y = x-- + 5 + --x;
		//printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
	
	public static void main(String[] args) {
		
		// �Է°�ü ���� = Scanner Ŭ������ �̿��� ��ü ���� 
		Scanner scanner = new Scanner(System.in);

		
		// ����1 : �޿� ����

		System.out.print("�⺻�� : ");
		int a1 = scanner.nextInt();
		System.out.print("���� : ");
		int a2 = scanner.nextInt();
		double tax = a1 * 0.1;
		System.out.println("�Ǽ��ɾ� = " + (a1 + a2 - tax));

		// ����2 : ���� ���� ���� 

		System.out.print("�ݾ� : ");
		int price = scanner.nextInt();

		System.out.println("�ʸ��� : " + (price / 100000) % 10);
		System.out.println("���� : " + (price / 10000) % 10);
		System.out.println("õ�� : " + (price / 1000) % 10);
		System.out.println("��� : " + (price / 100) % 10);
		
		// �ٸ� Ǯ��
		// 1. �ʸ��� �� 
		System.out.println("�ʸ��� : " + (price/100000) +"��");
			// �ݾ� = �ݾ� - (�ݾ�/100000) * 100000 ;
			price -= (price/100000) * 100000 ; // �ʸ��� ���� ���� 
		// 2. ���� �� 
		System.out.println("���� : " + (price/10000) + "�� ");
			price -= (price/10000) * 10000 ; // ���� ���� ���� 
		// 3. õ�� �� 
		System.out.println("õ�� : " + (price/1000) + "��");
			price -= (price/1000) * 1000; // õ�� ���� ���� 
		// 4. ��� 
		System.out.println("��� : " + (price/100) + "��");
		
		//����3 : �ϳ��� ������ �Է¹޾� 7�� ������� ���[ true , false ]
			// * ��� ã�� 
				// �� % �� == 0   �������� 0 �̸� ���� �� �� �� ��� 
		
		System.out.println("����3 ���� �Է� : ");
		int num1 = scanner.nextInt();
		System.out.println("7�� ������� : " + (num1 % 7 == 0));
		
		//����4 : �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� [ true , false ]
			// * Ȧ�� ã�� 
				// �� % 2 == 1	������ 2�� ������ �������� 0 �̸� ���� ¦�� 1�̸� Ȧ�� 
		
		System.out.print("����4 ���� �Է� : ");
		int num2 = scanner.nextInt();
		System.out.println("Ȧ������ : " + (num2 % 2 == 1));
		
		//����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� [ true , false ]
		
		System.out.print("����5 ���� �Է� : ");
		int num3 = scanner.nextInt();
		System.out.println("7�ǹ�� + ¦������ : " + (num3 % 7 == 0 && num3 % 2 == 0));
		
		//����6 : �ΰ��� ������ �Է¹޾� �� ū�� ���  [ true , false ]
		
		System.out.print("����6 ���� 2�� �Է� : ");
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		System.out.println("����1 > ����2 : " + (num4 > num5));
		
		//����7 : �������� �Է¹޾� �� ���� ����ϱ� 
			// �� ���� ���� => ������ * ������ * ������[3.14]
		System.out.print("����7 ������ �Է� : ");
		int rad = scanner.nextInt();
		double circle = rad * rad * 3.14;
		System.out.println("������ : " + circle);
		
		//����8 : �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�
				// ��) 54.5   84.3 �̸�    64.285714%
		
		System.out.print("����8 �Ǽ� 2�� �Է� : ");
		double q1 = scanner.nextDouble();
		double q2 = scanner.nextDouble();
		double percent = q1 / q2 * 100;
		System.out.println("�Ǽ�1�� �Ǽ�2�� ����� : " + percent + "%");
		// �Ҽ��� ���� ���� ����
		System.out.printf("�Ǽ�1�� �Ǽ�2�� ����� : %2f%% \n", percent);
			// ���Ĺ��� : %f [ �Ǽ� ] 
				// %.����f [ ���� : �Ҽ��� �ڸ��� ]
				// %.2f [ �Ҽ��� 2�ڸ��� ]
		
		//����9 : ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�]
			//��ٸ��� ���� = > (���� * �غ�) * ���� / 2
		
		System.out.print("����9 ���� �Է� : ");		int upper = scanner.nextInt();
		System.out.print("����9 �غ� �Է� : ");		int under = scanner.nextInt();
		System.out.print("����9 ���� �Է� : ");		int height = scanner.nextInt();
		double result = (upper + under) * height / 2;
		System.out.println("��ٸ��� ���� : " + result);
		
		//����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
				//ǥ��ü�� ���� = > (Ű - 100) * 0.9
		
		System.out.println("����10 Ű �Է� : ");
		double h1 = scanner.nextDouble();
		double w1 = (h1 - 100) * 0.9; 
		System.out.println("ǥ��ü�� : " + w1);
		
		//����11: Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
			//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))
		
		System.out.println("����11 Ű �Է� : ");		double h2 = scanner.nextDouble();
		System.out.println("����11 ������ �Է� : ");	double w2 = scanner.nextDouble();
		double bmi = w2 / ((h1 / 100) * (h1 / 100)); 
		System.out.printf("BMI : %.1f \n", bmi);
		
		//����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ�
		
		System.out.println("����12 inch �Է� : ");
		int inch = scanner.nextInt();
		double cm = inch * 2.54;
		System.out.println("����ȯ��(cm) : " + cm + "cm");
		
		//����13:  �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
			//�Ҽ� ��° �ڸ� ���� ���� ����ϱ�
			//�߰���� �ݿ����� => 30 %
			//�⸻��� �ݿ����� => 30 %
			//������ �ݿ����� => 40 %
		
		System.out.print("����13 �߰���� ���� : ");	double score1 = scanner.nextDouble();
		System.out.print("����13 �⸻��� ���� : ");	double score2 = scanner.nextDouble();
		System.out.print("����13 ������ ���� : ");	double score3 = scanner.nextDouble();
		
		double scoref = score1 * 0.3 + score2 * 0.3 + score3 + 0.4;
		
		System.out.printf("�ݿ������� ���� : %.2f ", scoref);
		
		//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
		 	//int x = 10;	// x == 10
			//int y = x-- + 5 + --x;
			//printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
				// 1. x-- + 5 	=> 10 + 5
				// 2. x-- 		=> 10 -> 9
				// 3. --x 		=>  9 -> 8
				// 4. 15 + 8	=> 23 
		
	}
}
