package Day15_Practice;

import java.util.Scanner;
import java.util.Stack;

public class Day15_문제4_1 {

//	스택구조를 이용한 문자열 역순 출력
//	스택구조
//	입력받은 문자열을 순서대로 스택에 저장
//	문자열 반대로 출력
//	ABC -> CBA
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// 입력
		System.out.println("문자열 입력 : ");
		String 문자 = scanner.next();
		// 문자열 분리
		String[] strArray = 문자.split("");
		// 원래 입력 문자열
		System.out.print("원래 입력 문자열 : ");
		for(String temp : strArray) {
			System.out.print(temp);
		}
		
		// 스택 생성
		Stack<문자열> str = new Stack<>();
		// 스택에 객체 넣기
		for (String temp : strArray) {
			str.push(new 문자열(temp));
		}
		
		// 스택에서 꺼내기
		System.out.print("\n스택 꺼낸 후 문자열 : ");
		while( !str.isEmpty() ) {
			System.out.print(str.pop());
		}
		
	}
	
}
