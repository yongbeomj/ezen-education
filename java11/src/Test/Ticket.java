package Test;



public class Ticket {
   // 1. �ʵ� [ ������, �ڸ�, ����, �ð� ]
      private String t_������;
      private String t_�ڸ�;
      private String t_����;
      private String t_�ð�;
      private boolean t_rental;
      private String t_id;
      // 2. ������
         // 1. ������ �ڸ� ���� ��߽ð� �����ð� [ ��� �ʵ� ]

      public Ticket(String t_������, String t_�ڸ�, String t_����, String t_�ð�, boolean t_rental, String t_id) {
         this.t_������ = t_������;
         this.t_�ڸ� = t_�ڸ�;
         this.t_���� = t_����;
         this.t_�ð� = t_�ð�;
         this.t_rental = t_rental;
      }
          // 2. ������� [ �ʵ�X ]
      public Ticket() {
         // TODO Auto-generated constructor stub
      }
      
      
      // 3. �޼ҵ�
         // 2. ���� ������ ��� �޼ҵ� 
      public boolean ticket_add() {
         // 1. �Է¹ޱ� 
         System.out.println("------------------������ ��� ������ ----------------");
         System.out.println(" ������ �Է� : ");   String t_������ = Main.scanner.next();
            // �ߺ�üũ 
            boolean check = ticketcheck(t_������);
            if( check ) {
               System.out.println(" [[ �˸� ]] : �̹� �������� �����մϴ�. ");
               return false;
            }
         System.out.println(" �ڸ� �Է� : ");   String t_�ڸ� = Main.scanner.next();
         System.out.println(" ���� �Է� : ");   String t_���� = Main.scanner.next();
         System.out.println(" �ð� �Է� : ");   String t_�ð� = Main.scanner.next();
         
         
         // 2. ��ü ����      // �ڸ� �ʱⰪ => true       // ȸ�� �ʱⰪ => null
         Ticket ticket = new Ticket(t_������, t_�ڸ�,t_����, t_�ð�, true , null);
         // 3. ��ü �迭���� 
         for( int i = 0 ; i< Main.tickets.length ; i++ ) {
            if( Main.tickets[i] == null ) { 
               Main.tickets[i] = ticket ; return true; }
         }
         return false;
      }
      // 6. �ڸ� üũ �޼ҵ� [ üũ�� ����� �μ��� �޾Ƽ� �迭�� �����ϸ� true �ƴϸ� false ]
      public boolean ticketcheck( String check_isbn ) {
         for( int i = 0 ; i< Main.tickets.length ; i++ ) {
            if( Main.tickets[i] != null && 
                  Main.tickets[i].getT_������().equals(check_isbn) ) {
               return true;
            }
         }
         return false;
      }
      
      
         // 3. ���� ��� �޼ҵ� 
      public void ticket_list() {
         System.out.println("------------------���� ���� ������ ----------------");
         System.out.println("������\t�ڸ�\t����\t�ð�\t�ڸ�����\t����ȸ��");
         
         for( int i = 0 ; i< Main.tickets.length ; i++ ) {
            if( Main.tickets[i] == null ) return;
            Ticket ticket = Main.tickets[i];

            
            System.out.println( ticket.getT_������()+"\t"+ticket.getT_�ڸ�()
               +"\t"+ticket.getT_����()+"\t"+ticket.getT_�ð�() + "\t" + ticket.getT_rental()+"\t" + ticket.t_id );
         }
         return;
      }
         // 4. ���� ��� �޼ҵ� 
      public boolean ticket_rental( String loginid ) {
         System.out.println("------------------���� ������ ----------------");
         System.out.println(" �������� �Է��ϼ��� : ");   String t_������ = Main.scanner.next();
            // ������ ���翩�� üũ 
         boolean check = ticketcheck(t_������);
         if( check ) {
            
            for( int i = 0 ; i<Main.tickets.length ;i++ ) {
               if( Main.tickets[i] != null && 
                     Main.tickets[i].getT_������().equals(t_������)) { // ������ �������� �����ϸ�
                  // ���ſ��� Ȯ�� 
                  if( Main.tickets[i].getT_rental() ) {
                     System.out.println(" [[ �˸� ]] : " + t_������ +" ���� ����"  );
                     // 1. ���ſ��� true => false
                     Main.tickets[i].setT_rental(false);
                     // 2. ���ż����� ����ȸ���� ���� �α��ε� ���̵� ���� 
                     Main.tickets[i].setT_id(loginid);
                     // 3. ���� ������ �ڸ� �ο� ī��Ʈ �ϱ� 
                     Main.cnt = Main.tickets[i].getT_�ڸ�();
                     int t_cnt = Integer.parseInt(Main.cnt);
                     t_cnt--;
                     Main.tickets[i].setT_�ڸ�(Integer.toString(t_cnt));
                     
                     
                     return true;
                  }
                  else { System.out.println(" [[ �˸� ]] : ���� ���źҰ�!!!"); return false; }
               }
            }   
         }else {
            System.out.println("[[�˸�]] : ���������� �ٸ��ϴ�.");
            return false;
         }
         return false;
      }
         // 5. ������� �޼ҵ� 
      public boolean ticket_return( String loginid ) {
      
         System.out.println("------------------���� ��� ������ ----------------");
         System.out.println(" ����� ������ : ");   String t_������ = Main.scanner.next();
         
         // 1.�������� �������� ã�� 
         for( int i = 0 ; i< Main.tickets.length ; i++) {
            if( Main.tickets[i] !=null && !Main.tickets[i].getT_rental() ) {
               // ! : ���� ( true => false )
               // 2.�Է¹��� ������ 
               if( Main.tickets[i].getT_������().equals(t_������) ) {
                  // 3.�Ϲ� ȸ�� == �α��ε� ���� ȸ��
                  if( Main.tickets[i].getT_id().equals( loginid ) ) {
                     System.out.println(" [[ �˸� ]] : ���� ��� ���� !!! ");
                     Main.tickets[i].setT_id(null); 
                     Main.tickets[i].setT_rental(true); 
                     
                     Main.cnt = Main.tickets[i].getT_�ڸ�();
                     int t_cnt = Integer.parseInt(Main.cnt);
                     t_cnt++;
                     Main.tickets[i].setT_�ڸ�(Integer.toString(t_cnt));
                     return true;
                  }
               }
            }
         }
         System.out.println(" [[ �˸� ]] : �������� ��ġ���� �ʽ��ϴ�. "  );
         return true;
      }
      // ������ ������� 
      public boolean ticket_return2( String loginid ) {
         
         System.out.println("------------------���� ��� ������ ----------------");
         System.out.println(" ����� ������ : ");   String t_������ = Main.scanner.next();
         
          
         for( int i = 0 ; i< Main.tickets.length ; i++) {
            if( Main.tickets[i] !=null && Main.tickets[i].getT_rental() ) {
               
               if( Main.tickets[i].getT_������().equals(t_������) ) {
                  
                  
                  System.out.println(" [[ �˸� ]] : ���� ��� ���� !!! ");
                  Main.tickets[i].setT_������(null); 
                  Main.tickets[i].setT_�ڸ�(null); 
                  Main.tickets[i].setT_����(null); 
                  Main.tickets[i].setT_�ð�(null); 
                  Main.tickets[i].setT_rental(false); 
                  Main.tickets[i].setT_id(null);
                  return true;
                  
               }
            }
         }
         System.out.println(" [[ �˸� ]] : �������� ��ġ���� �ʽ��ϴ�."  );
         return true;
      }
      
      public String getT_������() {
         return t_������;
      }
      public void setT_������(String t_������) {
         this.t_������ = t_������;
      }
      public String getT_�ڸ�() {
         return t_�ڸ�;
      }
      public void setT_�ڸ�(String t_�ڸ�) {
         this.t_�ڸ� = t_�ڸ�;
      }
      public String getT_����() {
         return t_����;
      }
      public void setT_����(String t_����) {
         this.t_���� = t_����;
      }
      public String getT_�ð�() {
         return t_�ð�;
      }
      public void setT_�ð�(String t_�ð�) {
         this.t_�ð� = t_�ð�;
      }
      public boolean getT_rental() {
         return t_rental;
      }
      public void setT_rental(boolean t_rental) {
         this.t_rental = t_rental;
      }
      public String getT_id() {
         return t_id;
      }
      public void setT_id(String t_id) {
         this.t_id = t_id;
      }

      
         
      
      
}
