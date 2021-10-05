package Day05;

public class Day05_6 {

	// 쇼핑몰의 회원 설계
		// 1. 필드 : 속성
			// 1. Id, Password, Name, Phone 등
	
		// 2. 메소드 : 동작
			// 1. 회원가입, 로그인, 회원탈퇴, 회원수정
	
	// 객체 만들기
	public static void main(String[] args) {
		// 1. 객체 생성
		Member obj1 = new Member();
		// Member : 사용자 만든 클래스
			// obj1 : 클래스명(임의)
				// new : 객체의 메모리 할당(메모리 할당 시 무조건)
				// 예외 : 기본자료형(미리 정해져 있기 때문에)
					// int 정수 = 10;
					// String 문자열 = "유재석"; (영문 1바이트, 한글 2바이트)
						// Member() : 객체 생성 시 초기값
		
		// 2. 객체 내용물 넣기 [. : 접근연산자]
			// 객체 내 필드에 접근해서 해당 필드에 값 넣기
		obj1.id = "q";
		obj1.pw = "q";
		obj1.name = "q";
		obj1.phone = 123;
		
		// 3. 객체 내용물 호출
		System.out.println("객체 : " + obj1);
		System.out.println("객체 내 필드 => 아이디 : " + obj1.id);
		System.out.println("객체 내 필드 => 비밀번호 : " + obj1.pw);
		System.out.println("객체 내 필드 => 이름 : " + obj1.name);
		System.out.println("객체 내 필드 => 연락처 : " + obj1.phone);
		
	}
	
}
