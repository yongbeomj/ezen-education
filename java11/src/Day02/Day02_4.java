package Day02;

import java.util.Scanner;

public class Day02_4 {
		
	// 문제1 : 급여 명세서 
	/*
	 * [조건] 입력받기 : 기본급 , 수당 
	 * [출력] 실수령액 = 기본급 + 수당 - 세금[ 기본급10% ]
	 * 
	 */
	
	// 문제2 : 지폐 개수 세기 
	/*
	 * [조건] : 십만원 단위의 금액을 입뭐騁 
	 * [출력] : 입력받은 금액의 지폐수 세기 
	 * [출력 예 ] : 356789  
	 * 		십만원 : 3장 
	 *		만원 : 5장 
	 * 		천원 : 6장 
	 * 		백원 : 7개
	 */
	
	//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
	
	//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
	
	//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]

	//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
	
	//문제7 : 반지름을 입력받아 원 넓이 출력하기 
		// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
	
	//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
		// 예) 54.5   84.3 이면    64.285714%
	
	//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
			//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
		
	//문제10: 키를 정수를 입력받아 표준체중 출력하기
		//표준체중 계산식 = > (키 - 100) * 0.9
	
	//문제11: 키와 몸무게를 입력받아 BMI 출력하기
		//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
	
	//문제12: inch 를 입력받아 cm 로 변환하기
	
	//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
		//소수 둘째 자리 까지 점수 출력하기
		//중간고사 반영비율 => 30 %
		//기말고사 반영비율 => 30 %
		//수행평가 반영비율 => 40 %
	
	//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
	 	//int x = 10;
		//int y = x-- + 5 + --x;
		//printf(" x의 값 : %d , y의값 :  %d ", x, y)
	
	public static void main(String[] args) {
		
		// 입력객체 선언 = Scanner 클래스를 이용한 객체 선언 
		Scanner scanner = new Scanner(System.in);

		
		// 문제1 : 급여 명세서

		System.out.print("기본급 : ");
		int a1 = scanner.nextInt();
		System.out.print("수당 : ");
		int a2 = scanner.nextInt();
		double tax = a1 * 0.1;
		System.out.println("실수령액 = " + (a1 + a2 - tax));

		// 문제2 : 지폐 개수 세기 

		System.out.print("금액 : ");
		int price = scanner.nextInt();

		System.out.println("십만원 : " + (price / 100000) % 10);
		System.out.println("만원 : " + (price / 10000) % 10);
		System.out.println("천원 : " + (price / 1000) % 10);
		System.out.println("백원 : " + (price / 100) % 10);
		
		// 다른 풀이
		// 1. 십만원 권 
		System.out.println("십만원 : " + (price/100000) +"장");
			// 금액 = 금액 - (금액/100000) * 100000 ;
			price -= (price/100000) * 100000 ; // 십만원 단위 제거 
		// 2. 만원 권 
		System.out.println("만원 : " + (price/10000) + "장 ");
			price -= (price/10000) * 10000 ; // 만원 단위 제거 
		// 3. 천원 권 
		System.out.println("천원 : " + (price/1000) + "장");
			price -= (price/1000) * 1000; // 천원 단위 제거 
		// 4. 백원 
		System.out.println("백원 : " + (price/100) + "개");
		
		//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
			// * 배수 찾기 
				// 값 % 수 == 0   나머지가 0 이면 값은 그 수 의 배수 
		
		System.out.println("문제3 정수 입력 : ");
		int num1 = scanner.nextInt();
		System.out.println("7의 배수여부 : " + (num1 % 7 == 0));
		
		//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
			// * 홀수 찾기 
				// 값 % 2 == 1	나누기 2를 했을때 나머지가 0 이면 값은 짝수 1이면 홀수 
		
		System.out.print("문제4 정수 입력 : ");
		int num2 = scanner.nextInt();
		System.out.println("홀수여부 : " + (num2 % 2 == 1));
		
		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
		
		System.out.print("문제5 정수 입력 : ");
		int num3 = scanner.nextInt();
		System.out.println("7의배수 + 짝수여부 : " + (num3 % 7 == 0 && num3 % 2 == 0));
		
		//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
		
		System.out.print("문제6 정수 2개 입력 : ");
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		System.out.println("정수1 > 정수2 : " + (num4 > num5));
		
		//문제7 : 반지름을 입력받아 원 넓이 출력하기 
			// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
		System.out.print("문제7 반지름 입력 : ");
		int rad = scanner.nextInt();
		double circle = rad * rad * 3.14;
		System.out.println("원넓이 : " + circle);
		
		//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
				// 예) 54.5   84.3 이면    64.285714%
		
		System.out.print("문제8 실수 2개 입력 : ");
		double q1 = scanner.nextDouble();
		double q2 = scanner.nextDouble();
		double percent = q1 / q2 * 100;
		System.out.println("실수1과 실수2의 백분율 : " + percent + "%");
		// 소숫점 단위 형식 변경
		System.out.printf("실수1과 실수2의 백분율 : %2f%% \n", percent);
			// 형식문자 : %f [ 실수 ] 
				// %.숫자f [ 숫자 : 소수점 자리수 ]
				// %.2f [ 소수점 2자리수 ]
		
		//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
			//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
		
		System.out.print("문제9 윗변 입력 : ");		int upper = scanner.nextInt();
		System.out.print("문제9 밑변 입력 : ");		int under = scanner.nextInt();
		System.out.print("문제9 높이 입력 : ");		int height = scanner.nextInt();
		double result = (upper + under) * height / 2;
		System.out.println("사다리꼴 넓이 : " + result);
		
		//문제10: 키를 정수를 입력받아 표준체중 출력하기
				//표준체중 계산식 = > (키 - 100) * 0.9
		
		System.out.println("문제10 키 입력 : ");
		double h1 = scanner.nextDouble();
		double w1 = (h1 - 100) * 0.9; 
		System.out.println("표준체중 : " + w1);
		
		//문제11: 키와 몸무게를 입력받아 BMI 출력하기
			//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
		
		System.out.println("문제11 키 입력 : ");		double h2 = scanner.nextDouble();
		System.out.println("문제11 몸무게 입력 : ");	double w2 = scanner.nextDouble();
		double bmi = w2 / ((h1 / 100) * (h1 / 100)); 
		System.out.printf("BMI : %.1f \n", bmi);
		
		//문제12: inch 를 입력받아 cm 로 변환하기
		
		System.out.println("문제12 inch 입력 : ");
		int inch = scanner.nextInt();
		double cm = inch * 2.54;
		System.out.println("단위환산(cm) : " + cm + "cm");
		
		//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
			//소수 둘째 자리 까지 점수 출력하기
			//중간고사 반영비율 => 30 %
			//기말고사 반영비율 => 30 %
			//수행평가 반영비율 => 40 %
		
		System.out.print("문제13 중간고사 점수 : ");	double score1 = scanner.nextDouble();
		System.out.print("문제13 기말고사 점수 : ");	double score2 = scanner.nextDouble();
		System.out.print("문제13 수행평가 점수 : ");	double score3 = scanner.nextDouble();
		
		double scoref = score1 * 0.3 + score2 * 0.3 + score3 + 0.4;
		
		System.out.printf("반영비율별 점수 : %.2f ", scoref);
		
		//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
		 	//int x = 10;	// x == 10
			//int y = x-- + 5 + --x;
			//printf(" x의 값 : %d , y의값 :  %d ", x, y)
				// 1. x-- + 5 	=> 10 + 5
				// 2. x-- 		=> 10 -> 9
				// 3. --x 		=>  9 -> 8
				// 4. 15 + 8	=> 23 
		
	}
}
