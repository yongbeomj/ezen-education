package Day09;

public class Day09_3 {

	// 인터페이스 : 객체의 사용방법을 정의하는 타입
		// 목적 : 클래스들이 구현해야 하는 동작을 지정하는데 사용되는 추상자료
		// 추상
		// 예 : 오락기
			// 인터페이스[버튼] = 이동버튼, 공격버튼, 방어버튼
			// 게임들[게임들] = 비행게임, 사냥게임, RPG
				// 동일한 목적 하에 서로다른 클래스들을 조작 
		// 인터페이스는 자체적으로 객체 생성 불가
	
	public static void main(String[] args) {
		
		// p.347 ~ p.354
			// 1. 인터페이스 설계 : RemoteControl
			// 2. 클래스 설계 : Television implements RemoteControl
			// 3. 클래스 설계 : Audio implements RemoteControl
		
		// 1. 리모컨 생성 [메모리 할당 x]
		RemoteControl rc;
		// 2. 리모컨에 텔레비전 클래스 연결
		rc = new Television(); // 해당 리모컨은 텔레비전으로 사용
			// 텔레비전 리모컨 사용
			rc.turnOn();
			rc.turnOff();
			rc.setVolume(5);
		// 3. 텔레비전 리모컨을 오디오 리모컨으로 변경
		rc = new Audio();
			// 오디오 리모컨 사용
			rc.turnOn();
			rc.turnOff();
			rc.setVolume(15);
	}
	
	
}
