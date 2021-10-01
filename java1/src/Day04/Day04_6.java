package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_6 {
	
	// 배열을 이용한 틱택토 게임
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 1. 게임판 생성 [배열로 9칸 생성]
		// String 객체 9개를 저장하는 배열 선언
		String[] game = {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"};
		String winner = ""; // 승리 알을 담을 변수
		int count = 0; 
		
		while(true) {
			// 2. 게임판 출력
			for (int i = 0; i < game.length; i++) {
				System.out.print(game[i]);
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			// 6. 승리자 나왔을 때 게임 종료
			if (winner.equals("[O]")) {
				System.out.println("플레이어 승리");
				break;
			} else if (winner.equals("[X]")) {
				System.out.println("컴퓨터 승리");
				break;
			}
			
			
			while(true) {
				// 3. 플레이어가 위치를 선택하여 알 두기
				System.out.print(">>>>> 플레이어 위치 선택 :"); int index = scanner.nextInt();
				
				// 선택한 위치에 이미 알이 있을 경우
				if (game[index].equals("[ ]")) {
					game[index] = "[O]";
					count++;
					break;
				} else {
					System.out.println("중복입니다. 다시 선택하세요");
				}
			}
				// 7. 9칸 알이 모두 존재했을 때
				if (count == 9) {
					System.out.println("무승부");
					break;
				}
				
			while(true) {
				// 4. 컴퓨터 (난수 생성해서 알 두기)
				System.out.println(">>>>> 컴퓨터 위치 선택 중");
				Random random = new Random();
				int com = random.nextInt(9);
				
				if (game[com].equals("[ ]")) {
					game[com] = "[X]";
					count++;
					break;
				}
			}
			
			// 5. 승리자 판단
			// 가로
			for (int i = 0; i <= 6; i++) {
				if (game[i].equals(game[i+1]) && game[i+1].equals(game[i+2])) {
					if (!game[i].equals("[ ]")) {
						winner = game[i];
					}
				}
			}
			// 세로
			for (int i = 0; i <= 2; i++) {
				if (game[i].equals(game[i+3]) && game[i+3].equals(game[i+6])) {
					if (!game[i].equals("[ ]")) {
						winner = game[i];
					}
				}
			}
			// 대각선
			if (game[0].equals(game[4]) && game[4].equals(game[8])) {
				if (!game[0].equals("[ ]")) {
					winner = game[0];
				}
			}
			if (game[2].equals(game[4]) && game[4].equals(game[6])) {
				if (!game[2].equals("[ ]")) {
					winner = game[2];
				}
			}
			
		}
		
		
		
	}
}
