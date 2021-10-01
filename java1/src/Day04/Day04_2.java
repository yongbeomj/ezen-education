package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_2 {

	public static void main(String[] args) {
		
		// 가위바위보
			// 1. 사용자로부터 가위바위보 중 하나를 입력받기
			// 2. 컴퓨터는 랜덤으로 가위바위보 중 하나 선택
			// 3. 승리한 플레이어 호출
				// + : 만약에 종료[3]를 입력하면 게임종료
				// + : 게임종료 시 게임수와 최종승리 (가장 많이 이긴 플레이어 호출)
		
		Scanner scanner = new Scanner(System.in);
		int player;
		int com;
		int game = 0;
		int playercount = 0;
		int comcount = 0;
		int winner = 0;
		
		while(true) {
			// 1. 변수
			
			
			// 2. 입력
			System.out.print("가위[0]바위[1]보[2]종료[3] 입력 > ");
			player = scanner.nextInt();
			
				// 3 입력 시 탈출
				if (player == 3) {
					System.out.println("[게임종료] 게임횟수 : " + game);
					if (playercount > comcount) {
						System.out.println("최종승리자 : 플레이어" + playercount);
					} else if (playercount < comcount) {
						System.out.println("최종승리자 : 컴퓨터" + comcount);
					} else {
						System.out.println("무승부");
					}
					break;
				}
				
				// 0~3 외 입력 시
				if (player < 0 || player > 3) {
					System.out.println("알 수 없는 번호입니다. 다시 입력");
					continue; // 가장 가까운 반복문 이동
				}
				
			Random random = new Random();
			com = random.nextInt(3);
			System.out.println("컴퓨터 선택 > " + com);
			
			// 0 가위 1 바위 2 보
			if ((player == 0 && com == 2) || (player == 1 && com == 0) || (player == 2 && com == 1)) { 
				System.out.println("플레이어 승리");
				playercount++;
			} else if ((player == 0 && com == 0) || (player == 1 && com == 1) || (player == 2 && com == 2)) {
				System.out.println("무승부");
			} else {
				System.out.println("컴퓨터 승리");
				comcount++;
			}
			game++;
			
		}
	}
}
