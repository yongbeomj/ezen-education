package Day07;

public class Day07_2 {

	public static void main(String[] args) {
		
		// p.256 접근 제한자
			// public : 모든 곳에서 호출 가능
			// private : 현재 클래스 내에서만 호출 가능
			// protected : 동일한 패키지 내에서만 호출 가능
				// 상속 있을경우 다른패키지 호출 가능(부모가 다른 패키지에 있을 경우 부모 패키지에 접근 가능)
			// default[생략] : 동일한 패키지 내에서만 호출 가능
				// 상속x
		
		// p.265 Getter, Setter 메소드
			// 1. 데이터 보호 목적 : private(외부로부터 접근 불가)
			// 2. Getter, Setter : public을 통한 외부로부터 간접접근 이용
		
		// 확인문제
			// 8. 2
			// 9. 2
			// 10. 4
			// 11. 3
	}
}
