package Day10;

public class Day10_4 {

	public static void main(String[] args) {
		// ��ü �� �������̽� ����
		Button button = new Button();
		button.setOnClickListener(new CallListener());
		button.touch();
		
		button.setOnClickListener(new MessageListener());
		button.touch();
		
		
	}
}
