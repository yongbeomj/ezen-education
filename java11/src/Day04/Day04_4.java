package Day04;

public class Day04_4 {

	// ��ü : [Ŭ����] ���赵 ������� ������ �޸� ����
	// ���� : [�ڷ���] �ϳ��� ���� �����Ҽ� �ִ� �޸� ����
		// �迭 : ���� Ÿ���� �����͸� ���ӵ� ������ ����, (�������) �ε��� �ο�
			// ���� Ÿ���� ������ ���� ȿ����
		// 1. �ε��� : ����Ǵ� ������ȣ [ 0������ ���� ]
		// 2. [ ] : [�ε�����ȣ] / () {} : �޼ҵ�
		
	// int ����1, int ����2 ~~~ int ����100
	// int[] ���� = new int[100];
			
	public static void main(String[] args) {
		
		// 1. �迭 ����
			// 1. Ÿ��[] �迭�� = {��1, ��2, ��3};
			// 2. Ÿ��[] �迭�� = new Ÿ��[����];
		
		// ��1)
		int[] scroes = {83, 90, 87};
			// int[] �迭�� : �迭����
				// = { ��1(�ε���0), ��2(�ε���1), ��3(�ε���2) }
		
		// 2. �迭 ȣ�� [�ε��� ȣ���ϸ� ���� ȣ��ȴ�]
		System.out.println("score[0] : " + scroes[0]);
		System.out.println("score[1] : " + scroes[1]);
		System.out.println("score[2] : " + scroes[2]);
		
		// 3. �ݺ��� Ȱ��
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scroes[i];
		}
		System.out.println("�迭 ���� : " + sum);
		System.out.println("�迭 ��� : " + (sum/3));
		
		// ��2)	// int�� ���� 3���� ������ �� �ִ� �迭 ����
		int[] scores2 = new int[3];
			// 1. Ÿ�� : �ڷ���/Ŭ����
				// 2. �迭�� : ����
					// 3. new : �޸��Ҵ� ������
						// 4. Ÿ��[�迭�� ����]
		// 1. �ش� �ε����� �� �ֱ�
		scores2[0] = 3; scores2[1] = 4; scores2[2] = 5;
		
		// 2. ���
		System.out.println(scores2); // �޸� �ּҰ�(�迭 ù��° �ε���) ���
		System.out.println(scores2[0]); // �ش� �ε��� �� ���
		System.out.println(scores2[1]); // �ش� �ε��� �� ���
		System.out.println(scores2[2]); // �ش� �ε��� �� ���
		
	}
}
