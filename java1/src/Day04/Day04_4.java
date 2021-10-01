package Day04;

public class Day04_4 {

	// 객체 : [클래스] 설계도 기반으로 생성된 메모리 공간
	// 변수 : [자료형] 하나의 값을 저장할수 있는 메모리 공간
		// 배열 : 같은 타입의 데이터를 연속된 공간에 나열, (저장순서) 인덱스 부여
			// 같은 타입의 변수의 관리 효율성
		// 1. 인덱스 : 저장되는 순서번호 [ 0번부터 시작 ]
		// 2. [ ] : [인덱스번호] / () {} : 메소드
		
	// int 정수1, int 정수2 ~~~ int 정수100
	// int[] 정수 = new int[100];
			
	public static void main(String[] args) {
		
		// 1. 배열 선언
			// 1. 타입[] 배열명 = {값1, 값2, 값3};
			// 2. 타입[] 배열명 = new 타입[길이];
		
		// 예1)
		int[] scroes = {83, 90, 87};
			// int[] 배열명 : 배열선언
				// = { 값1(인덱스0), 값2(인덱스1), 값3(인덱스2) }
		
		// 2. 배열 호출 [인덱스 호출하면 값이 호출된다]
		System.out.println("score[0] : " + scroes[0]);
		System.out.println("score[1] : " + scroes[1]);
		System.out.println("score[2] : " + scroes[2]);
		
		// 3. 반복문 활용
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scroes[i];
		}
		System.out.println("배열 총합 : " + sum);
		System.out.println("배열 평균 : " + (sum/3));
		
		// 예2)	// int형 변수 3개를 저장할 수 있는 배열 선언
		int[] scores2 = new int[3];
			// 1. 타입 : 자료형/클래스
				// 2. 배열명 : 임의
					// 3. new : 메모리할당 연산자
						// 4. 타입[배열의 길이]
		// 1. 해당 인덱스에 값 넣기
		scores2[0] = 3; scores2[1] = 4; scores2[2] = 5;
		
		// 2. 출력
		System.out.println(scores2); // 메모리 주소값(배열 첫번째 인덱스) 출력
		System.out.println(scores2[0]); // 해당 인덱스 값 출력
		System.out.println(scores2[1]); // 해당 인덱스 값 출력
		System.out.println(scores2[2]); // 해당 인덱스 값 출력
		
	}
}
