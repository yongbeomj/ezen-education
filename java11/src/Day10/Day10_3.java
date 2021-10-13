package Day10;

public class Day10_3 {

	public static void main(String[] args) {
		
		// p.394 중첩클래스
		A a = new A(); // A클래스가 메모리할당될 때 중첩된 클래스들은 메모리할당 x
		
		// 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B(); // 인스턴스 클래스
			b.field1 = 3; // 정적 클래스
			b.method();
		
		// 정적 멤버 클래스 객체 생성
		A.C c = new A.C();
			c.field1 = 3;
			c.method1();
		
		A.C.field2 = 3; // static : 객체 생성없이 접근 가능 
		A.C.method2();
		
		// 로컬클래스 객체 생성
		a.method();
		
		
	}
}
