package Day14_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class PrintMemberlist {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Course<Children> childCourse = new Course<>("유아", 5);
		Course<Youth> youthCourse = new Course<>("청소년", 5);
		Course<Adult> adultCourse = new Course<>("성인", 5);
		
		while(true) {
			System.out.println(">>> 명단정보 입력 <<<");
			System.out.print("이름 : "); String name = scanner.next();
			System.out.print("나이 : "); int age = scanner.nextInt();
			
			// 조건
			if (age < 8 && age > 0) {
				childCourse.add( new Children(name, age));
			} else if (age > 8 && age < 20) {
				youthCourse.add( new Youth(name, age));
			} else {
				adultCourse.add( new Adult(name, age));
			}
			
			// 명단 출력
			System.out.println("/n******** 명단 프로그램 ******* ");
			total(childCourse);
			total(youthCourse);
			total(adultCourse);
			System.out.println();
		}
		
	}
	
	// 전체목록 출력 메소드
	public static void total(Course<?> course) {
		System.out.println( course.getName()+"과정 : "+ 
				Arrays.toString( course.getStudents() ));
	}
}
