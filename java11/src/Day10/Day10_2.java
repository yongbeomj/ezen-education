package Day10;

public class Day10_2 {

//	// 추상 클래스
//	Phone phone = new Phone("유재석");
//		// 1. 추상클래스만으로 객체 생성 불가
	
	public static void main(String[] args) {
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}
			
}
