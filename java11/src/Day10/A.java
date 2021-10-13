package Day10;

public class A {

	// ������ : ���� Ŭ������� �̸��� �����ϸ� ������ (�������� ������ �޼ҵ�)
	A() {
		System.out.println("A ��ü�� ������");
	}
	
	// �ν��Ͻ� ��� Ŭ����
	class B {
		// 1. �ʵ�
		int field1;
		// 2. ������
		B() {
			System.out.println("B ��ü�� ������");
		}
		// 3. �޼ҵ�
		void method() { }
	}
	
	// ���� ��� Ŭ����
	static class C {
		// 1. �ʵ�
		int field1;
		static int field2;
		// 2. ������
		C() {
			System.out.println("C ��ü�� ������");
		}
		// 3. �޼ҵ�
		void method1() { }
		static void method2() { }
	}

	// AŬ���� �� �޼ҵ�
	void method() {
		class D {
			// 1. �ʵ�
			int field1;
			// 2. ������
			D() {
				System.out.println("D ��ü�� ������");
			}
			// 3. �޼ҵ�
			void method1() { }
		}
		// �޼ҵ� �� ��������
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

}
