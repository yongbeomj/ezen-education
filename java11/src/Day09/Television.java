package Day09;

public class Television implements RemoteControl {
	// extends : 설계도 연장(상속)
	// implements : (추상메소드 정의) 구현

	// 1. 필드
	public int volume;
	// 2. 생성자
	
	// 3. 메소드
	// 연결된 인터페이스의 추상메소드 정의
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	@Override // @Override 생략 가능
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	@Override
	public void setVolume(int volume) {
		// 현재 소음이 최대 소음보다 크면
		if (volume > RemoteControl.MAX_VOLUME) {
			// 최대 소음 대입 (최대 소음보다 커질 수 없음)
			this.volume = RemoteControl.MAX_VOLUME;
		// 현재 소음이 최저 소음(0)보다 작으면
		} else if (volume < RemoteControl.MIN_VOLUME) {
			// 최저 소음 대입 (최저 소음보다 작아질 수 없음)
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	
}
