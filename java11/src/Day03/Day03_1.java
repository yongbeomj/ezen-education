package Day03;

public class Day03_1 {

	// p.108 제어문 : if(논리제어), switch(데이터제어)
		// 목적 : 경우의 수에 따른 코드 처리
			// 예) 엘리베이터 : 버튼 [if(만약 상승버튼을 눌렀는지)]
		// if : true, false만 제어 가능
			// 형태1 : if(논리) true실행문;
			// 형태2 : if(논리) true실행문;
			//		  else false실행문;
			// 형태3 : if(논리) { true실행문; }
			//		  else { false실행문; }
			// 형태4 : if(논리) { }
			//		  else if(논리2) { }
			//	      else if(논리3) { }
			//	      else if(논리4) { }
			//	      else { }
	
	public static void main(String[] args) {
		// 예1) true이면 실행문 실행
		if (3 > 1) System.out.println("예1) 3이 1보다 크다");
		// 예2) false이면 실행문 실행x
		if (3 > 5) System.out.println("예2) 3이 5보다 크다");
		// 예3) true false 이면 실행문 실행
		if (3 > 5) System.out.println("예3) 3이 5보다 크다");
		else System.out.println("예3) 3이 5보다 작다");
		// 예4) { }가 사용되는 경우 => 실행문 2개 이상일 때
		if (3 > 2) {
			System.out.println("true이면 실행되는 자리");
			System.out.println("예4) 3이 2보다 크다");
		} else {
			System.out.println("false이면 실행되는 자리");
			System.out.println("예4) 3이 2보다 작다");
		}
		// 예5-1) 다양한 경우의 수에 따른 제어
		if (3 > 5) System.out.println("예5) 3이 5보다 크다");
		else if (3 > 4) System.out.println("예5) 3이 4보다 크다");
		else if (3 > 3) System.out.println("예5) 3이 3보다 크다");
		else if (3 > 2) System.out.println("예5) 3이 2보다 크다");
		else System.out.println("예5) true가 없다");

		// 예5-2) 다양한 경우의 수에 따른 제어
		if (3 > 5) System.out.println("예5) 3이 5보다 크다");
		if (3 > 4) System.out.println("예5) 3이 4보다 크다");
		if (3 > 3) System.out.println("예5) 3이 3보다 크다");
		if (3 > 2) System.out.println("예5) 3이 2보다 크다");
		else System.out.println("예5) true가 없다");
		
		// p.109 예제
		int score = 93;
		// 점수가 90보다 크기 때문에 실행
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다");
		}
		// 점수가 90 미만이기 때문에 실행x
		if (score < 90) {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B 입니다");	
		}
			
		// p.111 예제
		
		int score2 = 85;
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다");
		} else {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B 입니다");	
		}		
			
		// p.112 예제
		
		int score3 = 75;
		if (score >= 90) {
			System.out.println("점수가 100~90 입니다");
			System.out.println("등급은 A 입니다");
		} else if (score >= 80 ) {
			System.out.println("점수가 80~89 입니다");
			System.out.println("등급은 B 입니다");	
		} else if (score >= 70 ) {
			System.out.println("점수가 70~79 입니다");
			System.out.println("등급은 C 입니다");	
		} else {
			System.out.println("점수가 70 미만 입니다");
			System.out.println("등급은 D 입니다");	
		}		
			
			
	}
}
