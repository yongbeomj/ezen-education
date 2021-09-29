package Day02;

public class Day02_3 {

	/*
	 *  p.64 ������ (���� �� ���Ǵ� Ư������)
	 *  	��������� : + - *	/ %(������)
	 *  		+ (���Ῥ����)
	 *  	�񱳿����� : true / false
	 *  		>= �̻�(ũ�ų� ����)	> �ʰ�(ũ��)	== ����
	 *			<= ����(�۰ų� ����)	< �̸�(�۴�)	!= �����ʴ�
	 *  
	 *  	�������� : �񱳿����ڰ� 2�� �̻��� ��
	 *  		&& : AND(�̸鼭, �鼭, �̰�, �׸���, ���)
	 *  		|| : OR(�̰ų�, �ų�, �Ǵ�, �ϳ���)
	 *  		! : NOT(����(�ݴ�))
	 *  
	 *  	���Կ����� :
	 *  		=  : ������ ���� ���ʿ� ����
	 *  		+= : ������ ���� ���ʿ� ���� �� ���ʿ� ����
	 *  		*= /= -= %=
	 *  
	 *  	���������� :
	 *  		++ : 1����
	 *			-- : 1����
	 *
	 *		���ǿ����� :
	 *			���ǽ� ? �� : ����   
	 */
	
	public static void main(String[] args) {
		
		int i1 = 10; int i2 = 20;
		System.out.println("���ϱ� : " + i1 + i2); // ���� + ���� + ���� => ���Ῥ����(�����ν�)
		System.out.println("���ϱ� : " + (i1 + i2)); // ���� + (���� + ����) => ���������(�����ν�)
		System.out.println("���� : " + (i1 - i2));
		System.out.println("���ϱ� : " + (i1 * i2));
		System.out.println("������ : " + (i1 / i2));
		System.out.println("���ӱ� : " + (i1 % i2));
		
		// p40 : ���������� [++ : 1����, -- : 1����]
			// ��Ģ���� ����/����
			// i1 = i1 + 1;
			// i1 += 1;
			// i1++;	// �ӵ� ���� ����
		i1++; System.out.println("���� : " + i1);
		i1--; System.out.println("���� : " + i1);
			// ��������[++����], ��������[����++]
		System.out.println("�������� : " + ++i1);	// 1���� = 11
		System.out.println("Ȯ�� : " + i1);		// Ȯ�� = 11
		System.out.println("�������� : " + i1++); // 1���� = 11
		System.out.println("Ȯ�� : " + i1);		// Ȯ�� = 12
			// ��������[--����], ��������[����--]
		System.out.println("�������� : " + --i1);	// 1���� = 11
		System.out.println("Ȯ�� : " + i1);		// Ȯ�� = 11
		System.out.println("�������� : " + i1--); // 1���� = 11
		System.out.println("Ȯ�� : " + i1);		// Ȯ�� = 10
		
		// p.88 : �񱳿�����
		System.out.println("�̻� : " + (i1 >= i2));		// 10 >= 20 false
		System.out.println("���� : " + (i1 <= i2));		// 10 <= 20 true
		System.out.println("�ʰ� : " + (i1 > i2));		// 10 > 20	false
		System.out.println("�̸� : " + (i1 < i2));		// 10 < 20	true
		System.out.println("���� : " + (i1 == i2));		// 10 == 20	false
		System.out.println("�����ʴ� : " + (i1 != i2));	// 10 != 20	true
		
		// p.92 : �������� [AND / OR : �񱳿����ڰ� 2�� �̻��� ��]
			// AND : 2�� �̻��� �񱳿����ڰ� ��� TRUE => ��� TRUE // �ϳ��� FALSE => ��� FALSE
			// OR : 2�� �̻��� �񱳿����ڰ� �ϳ��� TRUE => ��� TRUE
		int i3 = 30; int i4 = 40;
		System.out.println("AND : " + (i1 >= i2 && i4 >= i3));	// F && T => F
		System.out.println("OR : " + (i1 >= i2 || i4 >= i3));	// F || T => T
		System.out.println("NOT : " + !(i1 >= i2 || i4 >= i3));	// !T => F
		
		// p.98 : ���Կ�����
		i1 += 1; // ������ += ��	������ ���� ���� ������ ���� �� ���� ������ ����
		i1 *= 10;	System.out.println(i1);
		i1 -= 10;	System.out.println(i1);
		i1 /= 10;	System.out.println(i1);
		
		// p.100 : ���ǿ����� [���ǽ�(�񱳿�����) ? ��(true) : ����(false)]
		int score = 85;
		char grade = score > 90? 'A' : 'B';						System.out.println(grade);
		char grade2 = score > 90? 'A' : score > 80? 'B' : 'C';	System.out.println(grade2);

	}
}
