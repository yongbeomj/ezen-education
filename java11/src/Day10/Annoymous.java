package Day10;

public class Annoymous{

	// 필드
	Person person = new Person(); // 객체
	// 익명객체
	Person field = new Person() {
		
		// 일반 메소드
		void work() {
			System.out.println("출근합니다");
		}
		
		// 메소드 : 오버라이딩
		@Override
		void wake() {
			System.out.println("6시에 일어납니다");
			work();
		}
		
	}; // 익명객체 구현 끝
	
	// 생성자
	
	// 메소드
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다");
			}
			@Override
			void wake() {
//				super.wake();
				System.out.println("7시에 일어납니다");
				wake();
			}
		};
	}
	void method2(Person person) {
		person.wake();
	}
	
}
