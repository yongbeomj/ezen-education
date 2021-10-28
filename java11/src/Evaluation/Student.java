package Evaluation;

public class Student implements Comparable<Student>{

	// 필드
	String name;
	int kor;
	int eng;
	int mat;
	int total;
	double avg;
	
	// 생성자
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.total = kor + eng + mat;
		this.avg = total / 3.f;
	}
	
	@Override
	public int compareTo(Student o) {
		if (this.total < o.total) {
			return 1;
		} else if (this.total == o.total) {
			return 0;
		} else {
			return -1;
		}
	}
	
	
	
	
	
}
