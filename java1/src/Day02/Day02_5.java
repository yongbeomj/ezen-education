package Day02;

public class Day02_5 {

	// 문자 : char	' '
	// 문자열 : 자료형 없음 => String 클래스	" "
	
	public static void main(String[] args) {
	
		char s1 = 'a';
		// char s2 = 'abc'; // char 2바이트 => 하나의 문자만 저장 가능
		
		// 1. String 이용한 문자열 저장
		String r1 = "abc";	System.out.println(r1);
		
		// 2. 배열을 이용한 문자열 저장
		char[] s2 = {'a', 'b', 'c'};	System.out.println(s2);
		
		// String : 문자열 관리 해주는 클래스
			// new 사용 : 크기 가변
			// new 미사용 : 크기 고정 (자료형)
			// 객체는 비교연산자 불가
			// 객체 비교 메소드 [.equals(문자열)]
		
		String name = "유재석"; // 영문 : 1바이트, 한글 : 2바이트 
		String name2 = new String("유재석");
		
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		
		
	}
}
