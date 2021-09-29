package Day02;

public class Day02_3 {

	/*
	 *  p.64 연산자 (연산 시 사용되는 특수문자)
	 *  	산술연산자 : + - *	/ %(나머지)
	 *  		+ (연결연산자)
	 *  	비교연산자 : true / false
	 *  		>= 이상(크거나 같다)	> 초과(크다)	== 같다
	 *			<= 이하(작거나 같다)	< 미만(작다)	!= 같지않다
	 *  
	 *  	논리연산자 : 비교연산자가 2개 이상일 때
	 *  		&& : AND(이면서, 면서, 이고, 그리고, 모두)
	 *  		|| : OR(이거나, 거나, 또는, 하나라도)
	 *  		! : NOT(부정(반대))
	 *  
	 *  	대입연산자 :
	 *  		=  : 오른쪽 값을 왼쪽에 대입
	 *  		+= : 오른쪽 값을 왼쪽에 더한 후 왼쪽에 대입
	 *  		*= /= -= %=
	 *  
	 *  	증감연산자 :
	 *  		++ : 1증가
	 *			-- : 1감소
	 *
	 *		조건연산자 :
	 *			조건식 ? 참 : 거짓   
	 */
	
	public static void main(String[] args) {
		
		int i1 = 10; int i2 = 20;
		System.out.println("더하기 : " + i1 + i2); // 문자 + 숫자 + 숫자 => 연결연산자(문자인식)
		System.out.println("더하기 : " + (i1 + i2)); // 문자 + (숫자 + 숫자) => 산술연산자(숫자인식)
		System.out.println("빼기 : " + (i1 - i2));
		System.out.println("곱하기 : " + (i1 * i2));
		System.out.println("나누기 : " + (i1 / i2));
		System.out.println("나머기 : " + (i1 % i2));
		
		// p40 : 증감연산자 [++ : 1증가, -- : 1감소]
			// 규칙적인 증가/감소
			// i1 = i1 + 1;
			// i1 += 1;
			// i1++;	// 속도 가장 빠름
		i1++; System.out.println("증가 : " + i1);
		i1--; System.out.println("감소 : " + i1);
			// 선위증가[++변수], 후위증가[변수++]
		System.out.println("선위증가 : " + ++i1);	// 1증가 = 11
		System.out.println("확인 : " + i1);		// 확인 = 11
		System.out.println("후위증가 : " + i1++); // 1증가 = 11
		System.out.println("확인 : " + i1);		// 확인 = 12
			// 선위감소[--변수], 후위감소[변수--]
		System.out.println("선위감소 : " + --i1);	// 1감소 = 11
		System.out.println("확인 : " + i1);		// 확인 = 11
		System.out.println("후위감소 : " + i1--); // 1감소 = 11
		System.out.println("확인 : " + i1);		// 확인 = 10
		
		// p.88 : 비교연산자
		System.out.println("이상 : " + (i1 >= i2));		// 10 >= 20 false
		System.out.println("이하 : " + (i1 <= i2));		// 10 <= 20 true
		System.out.println("초과 : " + (i1 > i2));		// 10 > 20	false
		System.out.println("미만 : " + (i1 < i2));		// 10 < 20	true
		System.out.println("같다 : " + (i1 == i2));		// 10 == 20	false
		System.out.println("같지않다 : " + (i1 != i2));	// 10 != 20	true
		
		// p.92 : 논리연산자 [AND / OR : 비교연산자가 2개 이상일 때]
			// AND : 2개 이상의 비교연산자가 모두 TRUE => 결과 TRUE // 하나라도 FALSE => 결과 FALSE
			// OR : 2개 이상의 비교연산자가 하나라도 TRUE => 결과 TRUE
		int i3 = 30; int i4 = 40;
		System.out.println("AND : " + (i1 >= i2 && i4 >= i3));	// F && T => F
		System.out.println("OR : " + (i1 >= i2 || i4 >= i3));	// F || T => T
		System.out.println("NOT : " + !(i1 >= i2 || i4 >= i3));	// !T => F
		
		// p.98 : 대입연산자
		i1 += 1; // 변수명 += 값	오른쪽 값을 왼쪽 변수에 더한 후 왼쪽 변수에 대입
		i1 *= 10;	System.out.println(i1);
		i1 -= 10;	System.out.println(i1);
		i1 /= 10;	System.out.println(i1);
		
		// p.100 : 조건연산자 [조건식(비교연산자) ? 참(true) : 거짓(false)]
		int score = 85;
		char grade = score > 90? 'A' : 'B';						System.out.println(grade);
		char grade2 = score > 90? 'A' : score > 80? 'B' : 'C';	System.out.println(grade2);

	}
}
