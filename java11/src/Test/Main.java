package Test;

import java.util.Scanner;

public class Main {
      //���θ޴�

      public static Member[] members = new Member[10];
      public static Ticket[] tickets = new Ticket[100]; 
      public static String cnt ; 
      
      // 0. �Է°�ü
      public static Scanner scanner = new Scanner(System.in);
      
      // mian �޼ҵ�=> �ڵ���� �������� 
      public static void main(String[] args) {
         main_menu(); // �޼ҵ� ȣ�� 
      }
      
      // 1. ���θ޴� �޼ҵ� 
      public static void main_menu() {
         while(true) {
            System.out.println("\n\n ------------------ �α��� ������ -------------");
            System.out.println(" 1.�α��� | 2.ȸ������ | 3.���̵�ã�� | 4.��й�ȣã�� ");
            System.out.print(" >>> ���� : ");   int ch = scanner.nextInt();
            if( ch == 1 ) {
               // �α��� �޼ҵ� ȣ��
               String loginid = Member.login();
                  // login �޼ҵ��� ��ȯ���� ���� ����
               // 1. �α��� ����
               if( loginid ==null ) { System.out.println(" [[ �˸� ]] : ������ ȸ�������� �����ϴ�");}
               // 2. �����ڸ޴�
               else if( loginid.equals("admin")) { admin_menu(loginid); }
               // 3.  �Ϲ�ȸ���޴�
               else { member_menu( loginid ); }
                  
            }
            if( ch == 2 ) {
               // ȸ������ �޼ҵ� ȣ�� 
                  // 1. �ٸ�Ŭ���� �޼ҵ� ȣ�� ��� 
                     // 1. ��ü������ ��ü�� ���� ��� ���� 
                        //Member member = new Member();
                        //member.login()
                     // 2. �ش� �޼ҵ� static
               Member.signup();
            }
            if( ch == 3 ) {
               // ���̵�ã�� �޼ҵ� ȣ�� 
                String findid = Member.findid();
                if( findid == null ) { System.out.println(" [[ �˸� ]] : ������ ȸ�������� �����ϴ�");}
                else {System.out.println(" [[ ȸ������ ���̵�� "+findid+" ]] ");}
            }
            if( ch == 4 ) {
               // ��й�ȣã�� �޼ҵ� ȣ�� 
                String findpw = Member.findpw();
                if( findpw == null ) { System.out.println(" [[ �˸� ]] : ������ ȸ�������� �����ϴ�");}
                else {System.out.println(" [[ ȸ������ ��й�ȣ�� "+findpw+" ]] ");}
                
            }
         }
      }
      // 2. �α��ν� �޴� �޼ҵ�  
      public static void member_menu( String loginid ) {
         Ticket ticket = new Ticket(); // Ƽ�� �ӽð�ü : �޼ҵ� ȣ���
         while(true) {
            System.out.println(" ---------- Ticket Menu ----------");
            System.out.println(" 1.��������� | 2.���ŵ�� | 3.������� | 4.�α׾ƿ� ");
            System.out.print("���� : ");   int ch = scanner.nextInt();
            if( ch == 1 ) { ticket.ticket_list(); }
            if( ch == 2 ) { ticket.ticket_rental( loginid ); } 
            if( ch == 3 ) { ticket.ticket_return( loginid ); }
            if( ch == 4 ) { System.out.println(" [[ �˸� ]] : �α׾ƿ� �Ǿ����ϴ� "); return; }
         }
      }
      
      // 3. ������ �޴� �޼ҵ� 
      public static void admin_menu(String loginid) {
         Ticket ticket = new Ticket(); 
         while(true) {
            System.out.println(" ---------- Admin Menu ----------");
            System.out.println(" 1.��������� | 2.��������Ȳ | 3.��������� | 4.�α׾ƿ� ");
            System.out.print("���� : ");   int ch = scanner.nextInt();
            if( ch == 1 ) { ticket.ticket_add();}
            if( ch == 2 ) { ticket.ticket_list(); } 
            if( ch == 3 ) { ticket.ticket_return2(loginid); } 
            if( ch == 4) { System.out.println(" [[ �˸� ]] : �α׾ƿ� �Ǿ����ϴ� "); return; }
            
         }
      }
}
