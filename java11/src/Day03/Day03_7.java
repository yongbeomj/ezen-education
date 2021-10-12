package Day03;

import java.util.Scanner;

public class Day03_7 {

	public static void main(String[] args) {
		
		// p.127 :
			// 1. 무한루프로 입력을 계속 받기
				// 1. 
			// 2. 변수 제어
		
		boolean run = true;
			// boolean : true 혹은 false만 저장하는 기본 자료형
		int keycode = 0;
		int speed = 0;
		
		// 무한루프 (조건이 false 일때까지 계속 반복실행)
		while(run) { // 조건이 true 실행, false 실행x
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("1.증속 2.감속 3.중지");
			System.out.print("선택 : ");
			keycode = scanner.nextInt();
			
			// 1 입력 시 [speed 변수 1 증가]
			if (keycode == 1) {
				speed++; System.out.println("=== 현재속도 : " + speed);
			}
			// 2 입력 시 [speed 변수 1 감소]
			if (keycode == 2) {
				speed--; System.out.println("=== 현재속도 : " + speed);
			}
			// 3 입력 시 무한루프 종료
			if (keycode == 3) {
				run = false; System.out.println("프로그램 종료");
			}
		}
	}
}
