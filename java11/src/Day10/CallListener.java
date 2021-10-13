package Day10;

import Day10.Button;

public class CallListener implements Button.OnClickListener  {
	
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다");
	}
	
}
