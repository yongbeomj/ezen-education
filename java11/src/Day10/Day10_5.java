package Day10;

public class Day10_5 {

	public static void main(String[] args) {
		
		Annoymous annoymous = new Annoymous();
		
		annoymous.field.wake(); // �͸� �ڽ� ��ü �� �޼ҵ� ȣ��
		annoymous.method1(); // ��ü �� �޼ҵ� ȣ�� => �޼ҵ� �� �͸� ��ü
		annoymous.method2(
			new Person() {
				void study() {
					System.out.println("�����մϴ�");
				}
				@Override
				void wake() {
					System.out.println("���ÿ� �Ͼ�ϴ�");
					study();
				}
			}
		);
	}
}
