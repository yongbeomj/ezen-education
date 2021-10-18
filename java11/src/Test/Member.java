package Test;


import java.util.Scanner;

public class Member {
   // 1. �ʵ� [ ���̵� , ��й�ȣ , �̸� , ����ó ��� ]
   private String t_id ;
   private String t_pw ;
   private String t_name;
   private String t_phone;
      
   // 2. ������ [ ��ü ������ �ʵ��� �ʱⰪ ]
      // 1. ȸ�����Խ� �����Ǵ� ��ü�� ������ 
   public Member(String t_id, String t_pw, String t_name, String t_phone) {
      this.t_id = t_id;
      this.t_pw = t_pw;
      this.t_name = t_name;
      this.t_phone = t_phone;
   }
      // 2. �� ������ 
   public Member() {}

   // 3. �޼ҵ� [ ���� ]
      // 2. ȸ������ �޼ҵ� [ �Է¹��� ������ ��ü �����ؼ� �迭�� ���� ]
   public static boolean signup() {
      // public : main�� ���� Ŭ���� ( �ܺ�Ŭ���� ) �� ȣ�� �ϱ� ����
      // 1. �Է¹ޱ� 
      System.out.println("------------------ȸ������ ������ ----------------");
      System.out.println(" ���̵� : ");      String t_id = Main.scanner.next();
         // ���̵� �ߺ�üũ 
         boolean check = idcheck(t_id);
         if( check ) {
            System.out.println(" [[ �˸� ]] : ����Ҽ� ���� ���̵� �Դϴ� ");
            return false; // ȸ������ ����  
         }
      System.out.println(" ��й�ȣ : ");   String t_pw = Main.scanner.next();
      System.out.println(" ���� : ");      String t_name = Main.scanner.next();
      System.out.println(" ����ó : ");      String t_phone = Main.scanner.next();
      
      // 2. �Է¹��� ������ ��ü ���� [ ������ ] 
      Member member = new Member(t_id, t_pw, t_name, t_phone);
      
      // 3. ���� ��ü�� �迭�� �ֱ� [ ������� ã�Ƽ� �ֱ� ]
      for( int i = 0 ; i < Main.members.length ; i ++ ) {
         if( Main.members[i] == null ) {
            Main.members[i] = member;
            return true;  // ȸ������ ����     // ��ȯ�� : ȸ�����Լ���/���� => TRUE / FALSE
         }
      }
      return false; // ȸ������ ����  [ ������� ������� ]
   }
   // 6. ���̵� üũ(�ߺ�üũ) �޼ҵ�
   public static boolean idcheck( String check_id ) {
      for( int i = 0 ; i<Main.members.length; i++ ) {
         if( Main.members[i] != null && 
               Main.members[i].getT_id().equals(check_id) ) {
            return true; // �μ��� ������ ���̵� �迭�� �����ϸ� true 
         }
      }
      return false; // �迭�� ������ ���� ������� 
   }

   
   
      // 3. �α��� �޼ҵ� [ �Է¹��� ���̵�� ��й�ȣ�� �迭�� �����ϸ� �α��� ���� �ƴϸ� ���� ]
   public static String login() {
      // 1. ���̵� , ��й�ȣ �Է¹ޱ�
      System.out.println("------------------�α��� ������ ----------------");
      System.out.println(" ���̵� : "); String t_id = Main.scanner.next();
      System.out.println(" ��й�ȣ : "); String t_pw = Main.scanner.next();
      // 2. �迭�� �����ϸ� �α��� ���� 
      for( int i = 0 ; i<Main.members.length ; i++ ) {
         if(Main.members[i] != null && 
               Main.members[i].getT_id().equals(t_id) && 
               Main.members[i].getT_pw().equals(t_pw) ) {
            return t_id; // �α��� ������ ������ ���̵� ��ȯ
         }
      }
      return null; // �α��� ����  // ��ȯ�� : �α��� ������ => ������ ���̵� / ���н� null
   }
      // 4. ���̵�ã�� �޼ҵ� ( �̸� , ����ó �Է¹޾� => ���̵� �˷��ֱ� ) 
   public static String findid() {
      // 1. �Է¹ޱ� 
      System.out.println("------------------���̵�ã�� ������ ----------------");
      System.out.println(" ���� : "); String t_name = Main.scanner.next();
      System.out.println(" ����ó : "); String t_phone = Main.scanner.next();
      // 2. �迭�� ������ ������ ��ü ã�� 
      for( int i = 0 ; i<Main.members.length ; i++ ) {
         if(Main.members[i] != null && 
               Main.members[i].getT_name().equals(t_name) && 
               Main.members[i].getT_phone().equals(t_phone) ){
            return Main.members[i].getT_id(); // ���̵� ã�� ���� 
         }
      }
      return null;    // ��ȯ�� : ã������� => ���̵� / ���н� null
   }
      // 5. ��й�ȣã�� �޼ҵ� ( ���̵� , ����ó �Է¹޾� => ��й�ȣ �˷��ֱ� )
   public static String findpw() {
      // 1. �Է¹ޱ� 
      System.out.println("------------------��й�ȣã�� ������ ----------------");
      System.out.println(" ���̵� : "); String t_id = Main.scanner.next();
      System.out.println(" ����ó : "); String t_phone = Main.scanner.next();
      // 2. �迭�� ������ ������ ��ü ã�� 
      for( int i = 0 ; i<Main.members.length ; i++ ) {
         if(Main.members[i] != null && 
               Main.members[i].getT_id().equals(t_id) && 
               Main.members[i].getT_phone().equals(t_phone) ){
            return Main.members[i].getT_pw(); // ���̵� ã�� ���� 
         }
      }
      return null;    // ��ȯ�� : ã������� => ��й�ȣ / ���н� null
   }

      // 1. �ʵ带 private => get, set �޼ҵ� ��� 
   public String getT_id() {
      return t_id;
   }
   public void setT_id(String t_id) {
      this.t_id = t_id;
   }
   public String getT_pw() {
      return t_pw;
   }
   public void setT_pw(String t_pw) {
      this.t_pw = t_pw;
   }
   public String getT_name() {
      return t_name;
   }
   public void setM_name(String t_name) {
      this.t_name = t_name;
   }
   public String getT_phone() {
      return t_phone;
   }
   public void setT_phone(String t_phone) {
      this.t_phone = t_phone;
   }

}