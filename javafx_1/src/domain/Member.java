package domain;

public class Member {

	// 1. 필드
	private String m_id;
	private String m_password;
	private String m_name;
	private String m_email;
	private int m_point;
	
	// 2. 생성자
		// 1. 빈 생성자
	public Member() {}
		// 2. 모든 필드를 받는 생성자 [ DB/FILE에서 가져올 때 사용 ]
	public Member(String m_id, String m_password, String m_name, String m_email, int m_point) {
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_point = m_point;
	}
		// 3. 회원가입 시 사용되는 생성자 [ 포인트 제외 => 초기값 ]
	public Member(String m_id, String m_password, String m_name, String m_email) {
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_point = 1000;
	}
		// 4. 회원수정 시 사용되는 생성자
	public Member(String m_name, String m_email) {
		this.m_name = m_name;
		this.m_email = m_email;
	}
	
	// 3. 메소드
}
