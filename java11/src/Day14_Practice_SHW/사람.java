package Day14_Practice_SHW;

public class 사람 {
   // 필드
   private String name;
   private int age;
   
   // 생성자
   public 사람(String name, int age) {
      this.name = name;
      this.age = age;
   }
   
   
   // 메소드
   
   public String getName() {
      return name;
   }


   public void setName(String name) {
      this.name = name;
   }


   public int getAge() {
      return age;
   }


   public void setAge(int age) {
      this.age = age;
   }
   

   // 정보출력
   @Override
   public String toString() {
      return this.name;
   }


   
   
}
