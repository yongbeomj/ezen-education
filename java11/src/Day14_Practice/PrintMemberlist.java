package Day14_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class PrintMemberlist {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Course<Children> childCourse = new Course<>("����", 5);
		Course<Youth> youthCourse = new Course<>("û�ҳ�", 5);
		Course<Adult> adultCourse = new Course<>("����", 5);
		
		while(true) {
			System.out.println(">>> ������� �Է� <<<");
			System.out.print("�̸� : "); String name = scanner.next();
			System.out.print("���� : "); int age = scanner.nextInt();
			
			// ����
			if (age < 8 && age > 0) {
				childCourse.add( new Children(name, age));
			} else if (age > 8 && age < 20) {
				youthCourse.add( new Youth(name, age));
			} else {
				adultCourse.add( new Adult(name, age));
			}
			
			// ��� ���
			System.out.println("/n******** ��� ���α׷� ******* ");
			total(childCourse);
			total(youthCourse);
			total(adultCourse);
			System.out.println();
		}
		
	}
	
	// ��ü��� ��� �޼ҵ�
	public static void total(Course<?> course) {
		System.out.println( course.getName()+"���� : "+ 
				Arrays.toString( course.getStudents() ));
	}
}
