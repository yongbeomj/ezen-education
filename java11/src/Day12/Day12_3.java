package Day12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day12_3 {

	public static void main(String[] args) {
		// p.538
		// Date Ŭ���� : �ý��� ��¥/�ð�
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString());
		
		// SimpleDateFormat : ��¥ ����(��� �ٹ̱�) 
		SimpleDateFormat dateFormate =
				new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��"); // ���� ����
		
		// ���� ����
		System.out.println(dateFormate.format(date));
		
				
				
	}
	 
	
		
}
