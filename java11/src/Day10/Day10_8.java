package Day10;

public class Day10_8 {

	public static void main(String[] args) {
		
		try {
			findClass(); // �ش� �޼ҵ尡 ���� ������ �� ��û�� �ڵ忡�� ����ó��
		}
		catch(Exception e){
			System.out.println("Ŭ���� �������� �ʽ��ϴ�");
		}
	}
	
	// �޼ҵ�
	public static void findClass() throws Exception {
		Class class1 = Class.forName("java.lang.String2");
				// Class.forName : Ŭ������ ã�� (���翩�� �˻�) => �Ϲ� ���� �ʼ�
					// Ȥ�ó� Ŭ������ ��ã�� �� ���� ����
				// ���� ó�����
					// 1. try{} catch{}
					// 2. throws
	}
}
