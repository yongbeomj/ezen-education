package Day03;

import java.util.Scanner;

public class Day03_8 {

	public static void main(String[] args) {
		
		// p.135 ATM 프로그램
			// 종료버튼 누르기 전까지 무한실행 프로그램 => while(true)
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (run) { // 실행변수 true 무한루프 실행, 실행변수 false이면 무한루프 종료
			System.out.println("--------------------------------");
			System.out.println("| 1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println("--------------------------------");
			System.out.print("선택> "); int choice = scanner.nextInt();

			if (choice == 1) {
				System.out.print("예금액> "); balance += scanner.nextInt();
			} else if (choice == 2) {
				System.out.print("출금액> "); int money = scanner.nextInt();
				if (balance < money) {
					System.out.println("[[알림]] 잔고가 부족합니다.");
				} else {
					balance -= money; System.out.println("[[알림]] 출금 완료");
				}
			} else if (choice == 3) {
				System.out.println("잔고> " + balance);
			} else if (choice == 4) { // 만약 4를 입력했을 때
				run = false; // 실행변수를 false 넣어서 무한루프(while) 종료
				System.out.println("[이용해 주셔서 감사합니다]");
			} else {
				System.out.println("[[경고]] 알 수 없는 번호입니다.");
			}
			
			for (int x = 1; x <= 10; x++) {
				for (int y = 1; y <= 10; y++) {
					if (4*x + 5*y == 60) {
						System.out.printf("(%d, %d)\n", x, y);
					}
				}
			}
			
		}
		
	}
}
