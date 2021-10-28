package Evaluation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		// �Է°�ü
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Student> treeSet = new ArrayList<>();
		TreeSet<Student> treeSet2 = new TreeSet<>();
		
		try {
			while(true) {
				// 5ȸ �Է�
				for(int i = 1; i <= 5; i++) {
					System.out.println("[[" + i + "��° �л� ���� �Է�]]");
					System.out.print("�̸� : "); String name = scanner.next();
					System.out.print("�������� : "); int kor = scanner.nextInt();
					System.out.print("�������� : "); int eng = scanner.nextInt();
					System.out.print("�������� : "); int mat = scanner.nextInt();
					// treeset �߰�
					treeSet.add(new Student(name, kor, eng, mat));
					treeSet2.add(new Student(name, kor, eng, mat));
				}
				
				// ���
				System.out.println("Arraylist ver.");
				int a = 1;
				System.out.println("------------------------------------------------------------");
				System.out.println("\t\t��\t��\tǥ");
				System.out.println("------------------------------------------------------------");
				System.out.println(" ��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				System.out.println("------------------------------------------------------------");
				for (Student temp : treeSet) {
					System.out.printf(" %d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
							a,temp.name,temp.kor,temp.eng,temp.mat,temp.total,temp.avg,a);
					a++;
				}
				System.out.println("------------------------------------------------------------\n");
				
				// ���
				System.out.println("Treeset ver.");
				int a1 = 1;
				System.out.println("------------------------------------------------------------");
				System.out.println("\t\t��\t��\tǥ");
				System.out.println("------------------------------------------------------------");
				System.out.println(" ��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				System.out.println("------------------------------------------------------------");
				for (Student temp : treeSet2) {
					System.out.printf(" %d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
							a1,temp.name,temp.kor,temp.eng,temp.mat,temp.total,temp.avg,a1);
					a1++;
				}
				System.out.println("------------------------------------------------------------\n");
				// ���� ������ ���� : ��ȸ 5�� �����͸� ���
				treeSet.removeAll(treeSet);			
			}
		} catch(Exception e) {
			System.out.println("[[�˸�]] �Է� ����");
		}
		
	}
}
