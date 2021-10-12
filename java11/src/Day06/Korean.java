package Day06;

public class Korean {
	
	// 1. 필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 2. 생성자
	public Korean() {
		// TODO Auto-generated constructor stub
	}
	public Korean(String name, String ssn) { // 객체 선언 시 생성자로부터 n,s값을 입력받기
		this.name = name; // 생성자로부터 들어온 n을 현재 필드에 저장
		this.ssn = ssn; // 생성자로부터 들어온 s을 현재 필드에 저장
		// this. : 내부변수
	}
	
	// 3. 메소드
}
