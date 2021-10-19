package Day14_Practice_SHW;

public class 명단<T> {
	   private String name;
	   private T[] students;
	   
	   // 생성자
	   public 명단(String name, int capacity) {
	      this.name = name;
	      students = (T[])new Object[capacity];
	      
	   }         
	   
	   // 메소드
	   public String getName() { return name;}
	   public T[] getStudents() {return students;}
	   
	   public void add(T t) {
	      for(int i =0; i< students.length; i++) {
	         if(students[i] == null) {
	            students[i] = t; break;
	         }
	      }
	   }
	}
