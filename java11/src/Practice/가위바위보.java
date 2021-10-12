package Practice;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {

	// 가위바위보
		// 1. 사용자로부터 가위[0]바위[1]보[2] 중 하나를 입력받기
		// 2. 컴퓨터는 랜덤으로 가위바위보 중 하나 선택
		// 3. 승리한 플레이어 호출
			// + : 만약에 종료[3]를 입력하면 게임종료
			// + : 게임종료 시 게임수와 최종승리 (가장 많이 이긴 플레이어 호출)
	
	public static void main(String[] args) {
		
		int player;
		int com;
		int player_count = 0;
		int com_count = 0;
		int game = 0;
		
		// 입력객체
		Scanner scanner = new Scanner(System.in);
		while(true) {
			// 사용자 입력
			System.out.print("가위[0]바위[1]보[2]종료[3] > ");
			player = scanner.nextInt();
			
			// 3번 누르면?
			if (player == 3) {
				System.out.println("게임 수 : " + game);
				if (player_count > com_count) {
					System.out.println("최종 승리자 : 플레이어 / 이긴 횟수 : " + player_count);
				} else if (player_count < com_count) {
					System.out.println("최종 승리자 : 컴퓨터 / 이긴 횟수 : " + com_count);
				} else {
					System.out.println("무승부");
				}
				break;
			}
			// 0~3 외 숫자 누르면?
			if (player < 0 || player > 3) {System.out.println("잘못된 번호 입니다. 다시 입력하세요."); continue;}
			
			// 컴퓨터 입력
			Random random = new Random();
			com = random.nextInt(3);
			System.out.println("컴퓨터 입력 > " + com);
			
			if ((player == 0 && com == 2)||(player == 1 && com == 0)||(player == 2 && com == 1)) {
				System.out.println("플레이어 승리"); // 플레이어 승리하는 경우
				player_count++;
			} else if ((player == 0 && com == 0)||(player == 1 && com == 1)||(player == 2 && com == 2)) {
				System.out.println("무승부"); // 무승부하는 경우
			} else {
				System.out.println("컴퓨터 승리"); // 그 외 컴퓨터 승리
				com_count++;
			}
			game++;
		}
		
		
	}
	
	
	
	
	
}
