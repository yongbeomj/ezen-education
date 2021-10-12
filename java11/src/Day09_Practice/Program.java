package Day09_Practice;

public interface Program {

	// 인터페이스 : 학생, 과목
	
	// 상속 :
	
	// 1. 상수 필드
	
	// 2. 추상 메소드
	// 학생
	public void signup();	// 회원가입
	public void login();	// 로그인
	public void findid();	// id찾기
	public void findpw();	// pw찾기
	public void idcheck();  // id 중복체크
	
	// 과목
	public void class_registration();	// 수강신청
	public void class_list();	// 과목 리스트
	public void class_add();	// 수강과목 등록
	public void class_cancel();	// 수강취소
	public void classcheck();  // 과목 중복체크
	
	// 3. 디폴트 메소드
	default void action() {
		System.out.println();
	}
	// 4. 정적 메소드
	
	
	
}
