package Day03;

public class Day03_6 {

	public static void main(String[] args) {
		
		// for (�ʱⰪ; ���ǹ�; ������) { ���๮ }
		// while (���ǹ�) {
		// 		���๮
		//		������
		// }
		
		// p.125 ����1
		
		int i = 1; // 1. �ʱⰪ
		while (i <= 10) { // 2. ���ǹ�
			System.out.print(i + " "); // 3. ���๮
			i++; // 4. ������
		}
		System.out.println();
		
		// for ����
		for (int j = 1; j <= 10; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		// p.125 ����2
		int sum = 0;
		int k = 1; // �ʱⰪ;
		while (k <= 100) {
			sum += k;
			k++;
		}
		System.out.print("1~100 �����հ� : " + sum);
		System.out.println();
		
		// for ����
		int sum2 = 0;
		for (int m = 1; m <= 100; m++) {
			sum += m;
		}
		System.out.print("1~100 �����հ� : " + sum2);
		
		// ���ѷ��� => while(true)
		while(true) {
			System.out.println("��ӽ��� ��");
		}
		
	}
}
