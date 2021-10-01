package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_7_lotto {

	// 1. 로또 판별기
		// [조건 1] : 1~45 사이의 수를 6개 입력받아 배열에 저장
			// 단, 중복불가 // 1~45 사이만 가능
		// [조건 2] : 추첨번호는 난수 생성 1~45 사이의 숫자 6개 생성하여 배열에 저장
		// [조건 3] : 두 배열 내 동일한 숫자가 몇 개 있는지 체크하여 등수 입력
		// [출력] : 몇 개가 동일한지, 등수 출력
			// 6개 동일 : 1등, 5개 동일 : 2등, 4개 동일 : 3등, 3개 동일 : 4등, 그 외 : 꽝
	
	public static void main(String[] args) {
	
		// 0. 입력객체
		Scanner scanner = new Scanner(System.in);
		
		// 0. 배열 (배열선언 : 자료형[] 배열명 = new 자료형[길이])
		int[] number = new int[6]; // int형 6개 변수를 저장할 수 있는 배열 (사용자)
		int[] lotto = new int[6]; // int형 6개 변수를 저장할 수 있는 배열 (추첨번호)
		
		// [조건 1] : 1~45 사이의 수를 6개 입력받아 배열에 저장
		// 1. 사용자로부터 6개 수를 입력받아 배열에 저장
		for (int i = 0; i < 6; i++) {
			System.out.print((i+1) + "번째 번호[1~45] 선택 : ");
			int num = scanner.nextInt(); // 입력받은 값을 i번째 인덱스 배열에 값 저장
			if (num < 1 || num > 45) {
				System.out.println("0~45만 입력 가능 합니다. 다시 입력하세요.");
				i--; // 정상적인 입력이 아니기 때문에 i 차감
				continue;
			}
			
			boolean check = true; // 중복이 없을 경우 true, 중복이 있을 경우 false
			// 중복체크 : 만약 입력한 값이 배열 내 동일한 값이 존재하면 다시 입력
			for (int j = 0; j < 6; j++) {
				if (num == number[j]) { // 중복찾기 성공
					System.out.println("선택한 수는 이미 존재합니다. 다시 입력하세요");
					i--; // 정상적인 입력이 아니기 때문에 i 차감
					check = false; // 중복이 있는 경우
					break;
				}
			}
			// 조건 모두 통과하면 배열 저장
			if (check) { number[i] = num; }
		}
		
		// 2. 출력
		System.out.println("사용자가 선택한 수 : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		
		// [조건 2] : 추첨번호는 난수 생성 1~45 사이의 숫자 6개 생성하여 배열에 저장
		
		for (int i = 0; i < 6; i++) {
			Random random = new Random();
			int num2 = random.nextInt(45)+1; // 1~45 난수 생성 (0~44 난수 + 1)
			
			boolean check = true; // 중복이 없을 경우 true, 중복이 있을 경우 false
			// 중복체크 : 만약 입력한 값이 배열 내 동일한 값이 존재하면 다시 입력
			for (int j = 0; j < 6; j++) {
				if (num2 == lotto[j]) { // 중복찾기 성공
					i--; // 정상적인 입력이 아니기 때문에 i 차감
					check = false; // 중복이 있는 경우
					break;
				}
			}
			// 조건 모두 통과하면 배열 저장
			if (check) { lotto[i] = num2; }
		}
		
		// 2. 출력
		System.out.println("사용자가 선택한 수 : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
		int count = 0;
		// [조건 3] : 두 배열 내 동일한 숫자가 몇 개 있는지 체크하여 등수 입력
		for (int i = 0; i < 6; i++) { // i => number 배열의 인덱스
			for (int j = 0; j < 6; j++) { // j => lotto 배열의 인덱스 (총 36번 비교)
				if (number[i] == lotto[j]) { // 만약 동일하면
					count++; // 맞은 횟수를 1 증가
				}
			}
		}
		System.out.println("추첨 결과 : " + count);
		
		
	}
}
