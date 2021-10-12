package Day09;

public class Tire {

	// 필드
	public int maxRotation; // 최대 회전수(타이어 수명)
	public int accumulatedRotation; // 누적 회전수
	public String location; // 타이어 위치

	// 생성자
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}

	// 메소드
	public boolean roll() {
		++accumulatedRotation; // 누적 회전수 1 증가
		if (accumulatedRotation < maxRotation) { // 최대회전수가 더 크면
			System.out.println(location + " Tire 수명 : " + (maxRotation-accumulatedRotation) + "회"); // 남은 수명 출력
			return true; // true : 수명이 남음을 표시하는 반환
		} else { // 최대회전수가 더 작으면
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false; // false : 수명이 없음을 표시하는 반환
		}
	}
	
	
}
