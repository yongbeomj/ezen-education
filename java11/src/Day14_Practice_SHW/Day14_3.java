package Day14_Practice_SHW;

import java.util.Arrays;
import java.util.Scanner;

public class Day14_3 {
   // ��� ���α׷�
      // �޴�[���ѷ���]
         // 1.����߰�
         // 2.������
      // �̸�,���� �Է� �޾� �Ʒ� ���ǿ� ���� ��� ���
      // ���̰� 8�� �̸��̸� ���� ��� ���
      // ���̰� 20�� �̸��̸� û�ҳ� ��� ���
      // �׿ܴ� ���� ��� ���
      // �����½� ��ܺ� �ο����� ��� �̸� ���
         // ����, û�ҳ�, ���� => ������κ��� ���
   
   public static void main(String[] args) {
      
      
      Scanner sc = new Scanner(System.in);
      ���<���> ������ = new ���<>("���",5);
      ���<û�ҳ�> û�ҳ��� = new ���<>("û�ҳ�",5);
      ���<����> ���Ƹ�� = new ���<>("����",5);
      ���<����> ���θ�� = new ���<>("����",5);
      
      while(true) {
         System.out.println("-------------- ��ܰ������α׷� --------------");
         System.out.println("�̸� �Է�"); String name = sc.next();
         System.out.println("���� �Է�"); int age = sc.nextInt();
         
            if(age < 8 ) {   
            ���Ƹ��.add(new ����(name, age));
            }
            else if (8 <= age && age <20) {
            û�ҳ���.add(new û�ҳ�(name, age));
            }
            else {
            ���θ��.add(new ����(name, age));
            }
            
            System.out.println("-------------- ��� ��� ---------------");
            register���(���Ƹ��);
            register���(û�ҳ���);
            register���(���θ��);         
      }         
   }
   
   public static void register���(���<?> ���) {
      System.out.println(���.getName()+ " ��� : "+ Arrays.toString(���.getStudents()));                                                   
   }

}
