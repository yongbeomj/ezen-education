package Day10;

public class Day10_4 {

	public static void main(String[] args) {
		// 객체 내 인터페이스 존재
		Button button = new Button();
		button.setOnClickListener(new CallListener());
		button.touch();
		
		button.setOnClickListener(new MessageListener());
		button.touch();
		
		
	}
}
