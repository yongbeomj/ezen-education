package Day10;

public class Annoymous{

	// �ʵ�
	Person person = new Person(); // ��ü
	// �͸�ü
	Person field = new Person() {
		
		// �Ϲ� �޼ҵ�
		void work() {
			System.out.println("����մϴ�");
		}
		
		// �޼ҵ� : �������̵�
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�");
			work();
		}
		
	}; // �͸�ü ���� ��
	
	// ������
	
	// �޼ҵ�
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�");
			}
			@Override
			void wake() {
//				super.wake();
				System.out.println("7�ÿ� �Ͼ�ϴ�");
				wake();
			}
		};
	}
	void method2(Person person) {
		person.wake();
	}
	
}
