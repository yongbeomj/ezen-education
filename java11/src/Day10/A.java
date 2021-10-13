package Day10;

public class A {

	// 생성자 : 현재 클래스명과 이름이 동일하면 생성자 (동일하지 않으면 메소드)
	A() {
		System.out.println("A 객체가 생성됨");
	}
	
	// 인스턴스 멤버 클래스
	class B {
		// 1. 필드
		int field1;
		// 2. 생성자
		B() {
			System.out.println("B 객체가 생성됨");
		}
		// 3. 메소드
		void method() { }
	}
	
	// 정적 멤버 클래스
	static class C {
		// 1. 필드
		int field1;
		static int field2;
		// 2. 생성자
		C() {
			System.out.println("C 객체가 생성됨");
		}
		// 3. 메소드
		void method1() { }
		static void method2() { }
	}

	// A클래스 내 메소드
	void method() {
		class D {
			// 1. 필드
			int field1;
			// 2. 생성자
			D() {
				System.out.println("D 객체가 생성됨");
			}
			// 3. 메소드
			void method1() { }
		}
		// 메소드 내 지역변수
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

}
