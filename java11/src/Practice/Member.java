package Practice;

public class Member {

	// �ʵ�
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;

	// ������
	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	
	// �޼ҵ�
		// 1. �α���
		public String login() {
			// id, pw �Է¹ޱ�
			System.out.println("-----------�α��� ������----------");
			System.out.print("���̵� : "); String m_id = BookApplication.scanner.next();
			System.out.print("��й�ȣ : "); String m_pw = BookApplication.scanner.next();
			
			// �迭 �� ���� ��ġ�ϸ� ���� 
			for (int i = 0; i < BookApplication.members.length; i++) {
				if (BookApplication.members[i] != null && 
						BookApplication.members[i].getM_id().equals(m_id) &&
						BookApplication.members[i].getM_pw().equals(m_pw)) {
					return m_id; // ����
				}
			}
			return null; // ����
		}
//		// 2. ȸ������
//		public boolean signup() {
//			// �Է¹ޱ�
//			System.out.println("-----------�α��� ������----------");
//			System.out.print("���̵� : "); String m_id = BookApplication.scanner.next();
//			System.out.print("��й�ȣ : "); String m_pw = BookApplication.scanner.next();
//			System.out.print("�̸� : "); String m_pw = BookApplication.scanner.next();
//			System.out.print("����ó : "); String m_pw = BookApplication.scanner.next();
//			
//			return true;
//		}
//		// 3. ���̵� ã��
//		public String findid() {
//			return;
//		}
//		// 4. ��й�ȣ ã��
//		public String findpw() {
//			return;
//		}
		// 5. ���̵� �ߺ� üũ
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
