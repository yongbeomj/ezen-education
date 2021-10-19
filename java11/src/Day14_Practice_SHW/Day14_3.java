package Day14_Practice_SHW;

import java.util.Arrays;
import java.util.Scanner;

public class Day14_3 {
   // 명단 프로그램
      // 메뉴[무한루프]
         // 1.명단추가
         // 2.명단출력
      // 이름,나이 입력 받아 아래 조건에 따라 명단 등록
      // 나이가 8세 미만이면 유아 명단 등록
      // 나이가 20세 미만이면 청소년 명단 등록
      // 그외는 성인 명단 등록
      // 명단출력시 명단별 인원들의 모든 이름 출력
         // 유아, 청소년, 성인 => 사람으로부터 상속
   
   public static void main(String[] args) {
      
      
      Scanner sc = new Scanner(System.in);
      명단<사람> 사람명단 = new 명단<>("사람",5);
      명단<청소년> 청소년명단 = new 명단<>("청소년",5);
      명단<유아> 유아명단 = new 명단<>("유아",5);
      명단<성인> 성인명단 = new 명단<>("성인",5);
      
      while(true) {
         System.out.println("-------------- 명단관리프로그램 --------------");
         System.out.println("이름 입력"); String name = sc.next();
         System.out.println("나이 입력"); int age = sc.nextInt();
         
            if(age < 8 ) {   
            유아명단.add(new 유아(name, age));
            }
            else if (8 <= age && age <20) {
            청소년명단.add(new 청소년(name, age));
            }
            else {
            성인명단.add(new 성인(name, age));
            }
            
            System.out.println("-------------- 모든 명단 ---------------");
            register명단(유아명단);
            register명단(청소년명단);
            register명단(성인명단);         
      }         
   }
   
   public static void register명단(명단<?> 명단) {
      System.out.println(명단.getName()+ " 명단 : "+ Arrays.toString(명단.getStudents()));                                                   
   }

}
