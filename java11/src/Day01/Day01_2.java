package Day01;

public class Day01_2 { // c s

	// System.out.println(); // main ���� ���� �Ұ�
	
	public static void main(String[] args) { // m s
	
		// 1. ���
			// print(��³���);	: ���
			// println(��³���);	: ��� �� �ٹٲ�
			// printf(���Ĺ���, ��³���);	: ���Ĺ��� �´� ���
				// f : format (���)
				// ���Ĺ���
					// %d : ����
					// %f : �Ǽ�
					// %s : ���ڿ�
					// %c : ����
				// ����� [p.34]
					// \ : �������� ��ȭ��ȣ \
					// \n : �ٹٲ�
					// \t : ��(�鿩���� => 5ĭ)
					// \r : ����(�Ǿ����� �̵�)
					// \\ : \ ���
		
		// ��1 : syso + ctrl + �����̽���
		System.out.print("java");
		System.out.print(1234); // �����̱⶧���� ���ڴ� ����ó�� x
		System.out.print("java123"); // ����+���� => ����
		
			// System : �̸� ������� �ý����̶�� Ŭ����
				// out : ��� ��Ʈ��
					// print(�μ�:��³���) : ��� �Լ�
			// . : Ŭ���� �� ���(�Լ�, ����) ���� ������[Ư������]
			// " " : Ű����(�̸� �ۼ��� �ܾ�), ���� �� ������ ��� ���ڿ� ó��
			// ; : �� ���� �����ڵ� �� (��ó��)
		// ctrl + F11 : ������ 
		
		// ��2
		System.out.println("java");
		System.out.println(1234);
		System.out.println("java123");
		
		// ��3
		System.out.printf("%s", "java");
		System.out.printf("%d", 1234);
		System.out.printf("%s", "java123");
		
		// printf ����
		System.out.printf("���̴� %d �Դϴ�", 20);
		System.out.println("���̴� " + 20 + " �Դϴ�");
		
		// �����
		System.out.println("\njava\n");
		System.out.println("\t 12345");
		System.out.println("\rjava10");
		System.out.println("\rjava10");
		
		// ����1
		/* ��°��
		 * 				[[ �⼮�� ]]
		 * ------------------------------------
		 * �̸�		1����	2����	3����	���
		 * ��ȣ��		�⼮		�⼮		�⼮
		 * ���缮		�⼮		�⼮		�⼮
		 * ------------------------------------
		 */
		
		System.out.println("[[ �⼮�� ]]");
		System.out.println("------------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����\t���");
		System.out.println("��ȣ��\t�⼮\t�⼮\t�⼮");
		System.out.println("���缮\t�⼮\t�⼮\t�⼮");
		System.out.println("------------------------------------");
		
		// ����2
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
		System.out.println();
		// ����3
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\"); // ����ó�� ������ => \" : " ��� 
		System.out.println("|\"`\"`    |");
		System.out.println("||_/=\\\\__|");
		
		
	} // m e
} // c e
