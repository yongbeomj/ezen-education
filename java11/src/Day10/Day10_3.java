package Day10;

public class Day10_3 {

	public static void main(String[] args) {
		
		// p.394 ��øŬ����
		A a = new A(); // AŬ������ �޸��Ҵ�� �� ��ø�� Ŭ�������� �޸��Ҵ� x
		
		// �ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b = a.new B(); // �ν��Ͻ� Ŭ����
			b.field1 = 3; // ���� Ŭ����
			b.method();
		
		// ���� ��� Ŭ���� ��ü ����
		A.C c = new A.C();
			c.field1 = 3;
			c.method1();
		
		A.C.field2 = 3; // static : ��ü �������� ���� ���� 
		A.C.method2();
		
		// ����Ŭ���� ��ü ����
		a.method();
		
		
	}
}
