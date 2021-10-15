package Day11;

public class Day11_3 {

	public static void main(String[] args) {
//		// System 클래스 (모든 멤버가 static 이기에 객체 필요없음)
//			// 1. exit : 프로그램 종료
//				// 강제 종료 시 실행 (return으로 종료시키는 것이 안전성에서 좋음)
//		System.setSecurityManager(new SecurityManager() {
//			@Override
//			public void checkExit(int status) {
//				if(status != 5) {
//					throw new SecurityException();
//					// i가 0일 때 status = 0 true => 예외발생o
//					// i가 1일 때 status = 1 true => 예외발생o
//					// ~~~
//					// i가 5일 때 status = 5 false => 예외발생x
//				}
//			}
//		});
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i); // 출력
//			try {
//				System.exit(i); // i를 exit() 넣기
//				// i가 5일 때 예외가 없기때문에 exit 실행
//			} catch(Exception e) {}
//		}

		// for이 1000000회 실행했을 때 걸리는 시간
		// 1. 시작 시간
		long time1 = System.nanoTime();
		
		int sum = 0;
		for (int i = 0; i <= 1000000; i++) {
			sum+=i;
		}
		// 2. 끝나는 시간
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000까지의 합 : " + sum);
		System.out.println("걸린시간 : " + (time2 - time1) + " ns");
		System.out.println(System.nanoTime());
		
		// 3. 시스템 정보 읽기 [System.getProperty("호출키")]
		System.out.println("pc os : " + System.getProperty("os.name"));
		System.out.println("pc 사용자이름 : " + System.getProperty("user.name"));
		System.out.println("pc 사용자폴더위치 : " + System.getProperty("java.home"));
		
		
	}
}
