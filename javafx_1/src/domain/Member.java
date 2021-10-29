package domain;

public class Member {

	// 1. �ʵ�
	private String m_id;
	private String m_password;
	private String m_name;
	private String m_email;
	private int m_point;
	
	// 2. ������
		// 1. �� ������
	public Member() {}
		// 2. ��� �ʵ带 �޴� ������ [ DB/FILE���� ������ �� ��� ]
	public Member(String m_id, String m_password, String m_name, String m_email, int m_point) {
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_point = m_point;
	}
		// 3. ȸ������ �� ���Ǵ� ������ [ ����Ʈ ���� => �ʱⰪ ]
	public Member(String m_id, String m_password, String m_name, String m_email) {
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_point = 1000;
	}
		// 4. ȸ������ �� ���Ǵ� ������
	public Member(String m_name, String m_email) {
		this.m_name = m_name;
		this.m_email = m_email;
	}
	
	// 3. �޼ҵ�
}
