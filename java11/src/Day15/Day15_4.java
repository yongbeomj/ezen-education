package Day15;

import java.util.Hashtable;
import java.util.Scanner;

public class Day15_4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Hashtable<String, String> hashtable = new Hashtable<>();
		
		while(true) {
			System.out.println("1.ȸ������ 2.�α���"); int ch = scanner.nextInt();
			if (ch == 1) {
				System.out.println("���̵� : "); String id = scanner.next();
				System.out.println("��й�ȣ : "); String password = scanner.next();
				
				hashtable.put(id, password);
				
				
			}
		}
	}
}
