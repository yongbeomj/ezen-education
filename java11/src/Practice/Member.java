package Practice;

public class Member {

	// 필드
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;

	// 생성자
	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	
	// 메소드
		// 1. 로그인
		public String login() {
			// id, pw 입력받기
			System.out.println("-----------로그인 페이지----------");
			System.out.print("아이디 : "); String m_id = BookApplication.scanner.next();
			System.out.print("비밀번호 : "); String m_pw = BookApplication.scanner.next();
			
			// 배열 내 정보 일치하면 성공 
			for (int i = 0; i < BookApplication.members.length; i++) {
				if (BookApplication.members[i] != null && 
						BookApplication.members[i].getM_id().equals(m_id) &&
						BookApplication.members[i].getM_pw().equals(m_pw)) {
					return m_id; // 성공
				}
			}
			return null; // 실패
		}
//		// 2. 회원가입
//		public boolean signup() {
//			// 입력받기
//			System.out.println("-----------로그인 페이지----------");
//			System.out.print("아이디 : "); String m_id = BookApplication.scanner.next();
//			System.out.print("비밀번호 : "); String m_pw = BookApplication.scanner.next();
//			System.out.print("이름 : "); String m_pw = BookApplication.scanner.next();
//			System.out.print("연락처 : "); String m_pw = BookApplication.scanner.next();
//			
//			return true;
//		}
//		// 3. 아이디 찾기
//		public String findid() {
//			return;
//		}
//		// 4. 비밀번호 찾기
//		public String findpw() {
//			return;
//		}
		// 5. 아이디 중복 체크
		public boolean idcheck() {
			return true;
		}
		// getter, setter
	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_phone() {
		return m_phone;
	}

	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}

	
	
}
