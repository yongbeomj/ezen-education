package Day10;

public class Day10_5 {

	public static void main(String[] args) {
		
		Annoymous annoymous = new Annoymous();
		
		annoymous.field.wake(); // 익명 자식 객체 내 메소드 호출
		annoymous.method1(); // 객체 내 메소드 호출 => 메소드 내 익명 객체
		annoymous.method2(
			new Person() {
				void study() {
					System.out.println("공부합니다");
				}
				@Override
				void wake() {
					System.out.println("정시에 일어납니다");
					study();
				}
			}
		);
	}
}
