package Practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[9]; // �ڿ��� ���� �迭
		// �Է� �ޱ� + �迭�� ����
		for (int i = 0; i <= 8; i++) {
			array[i] = scanner.nextInt();
		}
		
		int max = 0;
		for (int i = 0; i <= 8; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println(max); // �ִ밪
		for (int i = 0; i <= 8; i++) { // �� ��°����
			if (max == array[i]) {
				System.out.println(i+1);
			}
		}
	}
}
