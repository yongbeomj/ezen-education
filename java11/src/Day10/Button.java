package Day10;

public class Button {

	// ��ø �������̽� : Ŭ���� ���ο� �������̽� ����
	interface OnClickListener {
		void onClick();
	}
	
	// 1. �ʵ� : �������̽� �ʵ�
	OnClickListener listener;
	
	// 2. ������ 
	
	
	// 3. �޼ҵ�
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}
	
	
}
