package Day02;

public class Day02_2 {
	
	// ���� : �ϳ��� ���� ������ �� �ִ� �޸� ����
		// �޸�[�ֱ����ġ=RAM] : ���� ���� ���� ���α׷� ���
			// ���α׷� <--- ���μ���(������) <--- ��ɾ�(�ڵ�)
		// ���� ���� ���� ---> �뷮 ���� ---> �ӵ� ����
		// ���� ȿ���� => �ڷ���
	
	// ���� ����
		// �ڷ��� ������(����)
		// int age;
	
	// ������ ��Ģ
		// ���ڷ� ���� x	// ��ҹ��� ���� ....
	
	// ������ ����(������ ���� ���ʿ� ���� : ���Կ����� =)
		// int score; // ���� ����
		// score = 90 // ������ 90�� ����
	
	// ������ ����� ��� �������� ����� �����ϴ�.(��ȣ ������ �̵� ���� / ��ȣ ������ �̵� �Ұ�)(=��������)
	
	public static void main(String[] args) {
		
		// p.35 ��
		int value = 10; // int�� �ڷ��� value �������� ���� ���� ����� ���ÿ� 10 ����
		int result = value + 10; // ������ ������ ����
		
		System.out.println("��� : " + result);
		
		// p.38 �ڷ���
			// �ڷ��� ��� ���� : �޸� ȿ����(������ ���)
			// ��ǻ�ʹ� ���� ���(0, 1) / ���� : bit => 0 or 1
				// bit => 8bit => 1byte [01010101 = 1byte (8ĭ)]
				// ��ǻ�� ǥ�� �⺻���� : byte
		/*
		 *	[��]
		 *	boolean	1��Ʈ		true, false
		 *	[����]
		 *	char	2����Ʈ		����
		 *	[����]
		 *	byte	1����Ʈ		+-127
		 * 	short	2����Ʈ		+-3������
		 *	int		4����Ʈ		+-20������
		 *	long	8����Ʈ		+-20���̻�
		 * 	[�Ǽ�]
		 * 	float	4����Ʈ		�Ҽ��� 8�ڸ� ǥ��
		 * 	double	8����Ʈ		�Ҽ��� 18�ڸ� ǥ��
		 */
		
		// p.40 byte [-128 ~ +127]
		byte var1 = -128; 		System.out.println(var1);
		byte var2 = -30; 		System.out.println(var2);
		byte var3 = 30; 		System.out.println(var3);
		// byte var4 = 128; 	System.out.println(var4);	// ����
		
		// p.43 char [�ѱ���] : �����ڵ�
		char c1 = 'A';			System.out.println(c1);
		char c2 = 65;			System.out.println(c2);
		char c3 = '\u0041';		System.out.println(c3);
		
		char c4 = '��';			System.out.println(c4);
		char c5 = 44032;		System.out.println(c5);
		char c6 = '\uac00';		System.out.println(c6);
		// ��ǻ��[0,1]�� ���ڸ� ��� ó��??
			// �ƽ�Ű�ڵ� : �̱�[���� ---> ���� ---> ����]
			// �����ڵ�(java) : ������ ��� ���� ǥ��
		
		// p.44~45 short [2byte], int [*�⺻ ���� �ڷ��� / 4byte] Ÿ��
		short num1 = 30000;		System.out.println(num1);
		// short num2 = 40000;		System.out.println(num2);	// ����	
		int num3 = 10;			System.out.println(num3);
		int num4 = 012;			System.out.println(num4);	// 8����
		int num5 = 0xA;			System.out.println(num5);	// 16����
			// ���� ���� : ��ǻ�Ͱ� ǥ���� �� �ִ� ���� �Ѱ� �ذ�
			// 2���� [0, 1] : ����
			// 8����	[0 ~ 1] :
			// 10���� [0 ~ 9] : ��� ���
			// 16���� [0 ~ 9 A B C D E F] : �پ��� ǥ�� ����
		
		// p.46 long [8byte] : 20�� �̻�
		// long a1 = 20000000000;	System.out.println(a1);		// ����
		long a1 = 20000000000L;	System.out.println(a1);			// ���� �������� L �Է�
		
		// p.47~48 : float [4byte], double [*�⺻ �Ǽ� �ڷ��� / 8byte]
		// float val1 = 3.14; System.out.println(val1);		// ����
		float val1 = 3.14f; System.out.println(val1);		// ���� �������� f �Է�
		double val2 = 3.14; System.out.println(val2);
		
		float val3 = 0.1234567890123456789f; System.out.println(val3);
		double val4 = 0.1234567890123456789; System.out.println(val4);
		
		// p.48 boolean : bit [0(false), 1(true)]
		boolean bol = true;		System.out.println(bol);
		// boolean bol2 = 10;	// �� ���� x		
		
		// p.49 : Ÿ�Ժ�ȯ
			// 1. �ڵ� Ÿ�Ժ�ȯ (ũ��� : ���� ���ڿ��� ū ���ڷ� �̵� ����)
			// p.51
				// byte -> short -> int -> long -> float -> double
				// short�� char ȣȯ �Ұ�(ũ��� ������ Ÿ���� �ٸ�)
				// �ݴ�� �Ұ�
			byte bytevalue = 10;
			int intvalue = bytevalue; // �ڵ� ����ȯ(����) byte -> int
		// byte bytevalue2 = intvalue; // �Ұ� int -> byte
		
			// 2. ���� Ÿ�Ժ�ȯ(�޸� �ս� => ������ �ս�)
				// �ڷ��� ������ = (�ڷ���)������;
			// p.54
			byte bytevalue2 = (byte)intvalue;
			
			// ��������
				// 1 : 4
				// 2 : 1 4 5
				// 3 : byte			short		int		long
				//					char
				//								float	double
				//		boolean
			
				// 4 :	Ÿ�� : int , double
				//		�����̸� : age , price 
				//		���ͷ� : 10 , 3.14
				// 5 : 3
				// 6 : 4
				// 7 : 3
				// 8 : 1 [ ����� �⺻Ÿ�� : int ]
					//1. byte + byte => int => byte [x]
					//2. int + byte => int => int
					//3. int + float => int => float
					//4. int + double => int => double	
	}
}
