package Evaluation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		// 입력객체
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Student> treeSet = new ArrayList<>();
		TreeSet<Student> treeSet2 = new TreeSet<>();
		
		try {
			while(true) {
				// 5회 입력
				for(int i = 1; i <= 5; i++) {
					System.out.println("[[" + i + "번째 학생 점수 입력]]");
					System.out.print("이름 : "); String name = scanner.next();
					System.out.print("국어점수 : "); int kor = scanner.nextInt();
					System.out.print("영어점수 : "); int eng = scanner.nextInt();
					System.out.print("수학점수 : "); int mat = scanner.nextInt();
					// treeset 추가
					treeSet.add(new Student(name, kor, eng, mat));
					treeSet2.add(new Student(name, kor, eng, mat));
				}
				
				// 출력
				System.out.println("Arraylist ver.");
				int a = 1;
				System.out.println("------------------------------------------------------------");
				System.out.println("\t\t성\t적\t표");
				System.out.println("------------------------------------------------------------");
				System.out.println(" 번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				System.out.println("------------------------------------------------------------");
				for (Student temp : treeSet) {
					System.out.printf(" %d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
							a,temp.name,temp.kor,temp.eng,temp.mat,temp.total,temp.avg,a);
					a++;
				}
				System.out.println("------------------------------------------------------------\n");
				
				// 출력
				System.out.println("Treeset ver.");
				int a1 = 1;
				System.out.println("------------------------------------------------------------");
				System.out.println("\t\t성\t적\t표");
				System.out.println("------------------------------------------------------------");
				System.out.println(" 번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				System.out.println("------------------------------------------------------------");
				for (Student temp : treeSet2) {
					System.out.printf(" %d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
							a1,temp.name,temp.kor,temp.eng,temp.mat,temp.total,temp.avg,a1);
					a1++;
				}
				System.out.println("------------------------------------------------------------\n");
				// 이전 데이터 제거 : 매회 5개 데이터만 출력
				treeSet.removeAll(treeSet);			
			}
		} catch(Exception e) {
			System.out.println("[[알림]] 입력 오류");
		}
		
	}
}
