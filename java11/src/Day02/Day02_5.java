package Day02;

public class Day02_5 {

	// ���� : char	' '
	// ���ڿ� : �ڷ��� ���� => String Ŭ����	" "
	
	public static void main(String[] args) {
	
		char s1 = 'a';
		// char s2 = 'abc'; // char 2����Ʈ => �ϳ��� ���ڸ� ���� ����
		
		// 1. String �̿��� ���ڿ� ����
		String r1 = "abc";	System.out.println(r1);
		
		// 2. �迭�� �̿��� ���ڿ� ����
		char[] s2 = {'a', 'b', 'c'};	System.out.println(s2);
		
		// String : ���ڿ� ���� ���ִ� Ŭ����
			// new ��� : ũ�� ����
			// new �̻�� : ũ�� ���� (�ڷ���)
			// ��ü�� �񱳿����� �Ұ�
			// ��ü �� �޼ҵ� [.equals(���ڿ�)]
		
		String name = "���缮"; // ���� : 1����Ʈ, �ѱ� : 2����Ʈ 
		String name2 = new String("���缮");
		
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		
		
	}
}
