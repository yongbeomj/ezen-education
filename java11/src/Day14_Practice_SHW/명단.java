package Day14_Practice_SHW;

public class ���<T> {
	   private String name;
	   private T[] students;
	   
	   // ������
	   public ���(String name, int capacity) {
	      this.name = name;
	      students = (T[])new Object[capacity];
	      
	   }         
	   
	   // �޼ҵ�
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
