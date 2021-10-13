package Day10;

public class Day10_8 {

	public static void main(String[] args) {
		
		try {
			findClass(); // 해당 메소드가 예외 던지기 시 요청된 코드에서 예외처리
		}
		catch(Exception e){
			System.out.println("클래스 존재하지 않습니다");
		}
	}
	
	// 메소드
	public static void findClass() throws Exception {
		Class class1 = Class.forName("java.lang.String2");
				// Class.forName : 클래스명 찾기 (존재여부 검색) => 일반 예외 필수
					// 혹시나 클래스를 못찾을 때 대한 예외
				// 예외 처리방식
					// 1. try{} catch{}
					// 2. throws
	}
}
