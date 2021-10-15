package Day12;

import java.util.Arrays; // import : 다른 패키지로부터 클래스 가져오기
import java.util.Collections;
	// java.lang 생략

public class Day12_1 {

	public static void main(String[] args) {
		
		// p.521
		// 1. Arrays 클래스
		char[] arr1 = {'j', 'a', 'v', 'a'};
			// char : 기본 자료형 ['문자']
			// String : 클래스 ["문자열"]
		
			// 배열길이 = 배열명.length : 필드
			// 문자열길이 = 문자열.length : 메소드
		
		// 방법1
			// 1. .copyOf(복사배열 , 복사길이) : 배열 복사
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
					// 현재클래스에서 다른클래스 내 메소드 호출하는 방법
						// . : 접근제한자를 통한 메소드 호출
						// 1. 객체를 통한 메소드 호출
							// 클래스명 객체명 = new 생성자()
							// 객체명.메소드명()
						// 2. static 메소드 객체없이 호출
							// 클래스명.메소드명()
		
			// 2. Arrays.toString(배열) : 인덱스 순으로 데이터 출력
		System.out.println(Arrays.toString(arr2));
		
		// 방법2
			// 3. copyOfRange(복사배열, 시작인덱스, 끝인덱스)
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); // [1] ~ [2]
		System.out.println(Arrays.toString(arr3));
			
		// 방법3
			// 4. System.arraycopy(원본배열, 시작인덱스, 타겟배열, 타겟시작인덱스, 복사개수)
		char[] arr4 = new char[arr1.length]; // 배열1의 길이만큼 배열4 선언
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println(Arrays.toString(arr4));
		
		// p.522
			// 5. Arrays.equals(배열1, 배열2) : 1차원 배열 비교
			// 6. Arrays.deepEquals(배열1, 배열2) : 2차원 배열 비교
		System.out.println("1차 배열비교 : " + Arrays.equals(arr1, arr2));
//		System.out.println("2차이상 배열비교 : " + Arrays.deepEquals(arr1, arr2));
		
			// 7. Arrays.sort(배열명); : 해당 배열 내 오름차순 정렬
		Arrays.sort(arr1);
		System.out.println("배열주소 : " + arr1.toString());
		System.out.println("배열 내 데이터 주소 : " + Arrays.toString(arr1));
			// 8. Arrays.sort(배열명, Collections.reverseOrder()) : 해당 배열 내 내림차순
				// 주의 : 해당 배열이 기본자료형일 경우 불가 (ex. int, char 등...  => Integer, Character 변환 필요)
//		Arrays.sort(arr1, Collections.reverseOrder());
		
		// p.526
			// 9. Arrays.binarySearch(배열명, 데이터) : 해당 데이터의 인덱스 번호
				// 주의 : 오름차순(sort) 정렬 후 사용
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println(index);
		System.out.println(Arrays.binarySearch(arr1,'j'));
		
	}
}
