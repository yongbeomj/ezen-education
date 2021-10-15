package Day11;

public class Day11_3 {

	public static void main(String[] args) {
//		// System Ŭ���� (��� ����� static �̱⿡ ��ü �ʿ����)
//			// 1. exit : ���α׷� ����
//				// ���� ���� �� ���� (return���� �����Ű�� ���� ���������� ����)
//		System.setSecurityManager(new SecurityManager() {
//			@Override
//			public void checkExit(int status) {
//				if(status != 5) {
//					throw new SecurityException();
//					// i�� 0�� �� status = 0 true => ���ܹ߻�o
//					// i�� 1�� �� status = 1 true => ���ܹ߻�o
//					// ~~~
//					// i�� 5�� �� status = 5 false => ���ܹ߻�x
//				}
//			}
//		});
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i); // ���
//			try {
//				System.exit(i); // i�� exit() �ֱ�
//				// i�� 5�� �� ���ܰ� ���⶧���� exit ����
//			} catch(Exception e) {}
//		}

		// for�� 1000000ȸ �������� �� �ɸ��� �ð�
		// 1. ���� �ð�
		long time1 = System.nanoTime();
		
		int sum = 0;
		for (int i = 0; i <= 1000000; i++) {
			sum+=i;
		}
		// 2. ������ �ð�
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000������ �� : " + sum);
		System.out.println("�ɸ��ð� : " + (time2 - time1) + " ns");
		System.out.println(System.nanoTime());
		
		// 3. �ý��� ���� �б� [System.getProperty("ȣ��Ű")]
		System.out.println("pc os : " + System.getProperty("os.name"));
		System.out.println("pc ������̸� : " + System.getProperty("user.name"));
		System.out.println("pc �����������ġ : " + System.getProperty("java.home"));
		
		
	}
}
