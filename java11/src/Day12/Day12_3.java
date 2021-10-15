package Day12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day12_3 {

	public static void main(String[] args) {
		// p.538
		// Date 클래스 : 시스템 날짜/시간
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString());
		
		// SimpleDateFormat : 날짜 형식(모양 꾸미기) 
		SimpleDateFormat dateFormate =
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); // 형식 설정
		
		// 형식 적용
		System.out.println(dateFormate.format(date));
		
				
				
	}
	 
	
		
}
