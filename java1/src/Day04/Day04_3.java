package Day04;

import java.util.Scanner;

public class Day04_3 {

	// console Ű����ũ
	// 1. �޴��� [ 1.�ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ]
	// 2. �ʱ� ��� [ 10���� ] �ȷ��� �� ��� ����, ��� ������ ���� �Ұ�
	// 3. ������ �ݾ��� �Է¹޾Ƽ� ������ ��ŭ ������ �� �ܵ� ���

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		// ����� (�������� : ����� ��ȣ �ȿ����� ��� �����ϴ�)
		int coke = 10;
		int fanta = 10;
		int cider = 10;
		
		// ��ٱ��Ϻ���
		int cokecnt = 0;
		int fantacnt = 0;
		int cidercnt = 0;
		
		while(true) {
			System.out.println("----------------�޴�-----------------");
			System.out.println("1.�ݶ� 2.ȯŸ 3.���̴� 4.����");
			System.out.println("�޴��� �Է��ϼ��� > "); int menu = scanner.nextInt();
			
			// �ݶ�
			if (menu == 1) {
				if( coke == 0 ) { System.out.println(" [[ �ݶ� ��� �����ϴ� : ��ǰ �غ��� ]] "); }
				else {
					System.out.println(" [[ �ݶ� ��ҽ��ϴ� ]] ");
					cokecnt++;
					coke--;
				}
			}
			// ȯŸ
			if (menu == 2) {
				if( fanta == 0 ) { System.out.println(" [[ ȯŸ ��� �����ϴ� : ��ǰ �غ��� ]] "); }
				else {
					System.out.println(" [[ ȯŸ ��ҽ��ϴ� ]] "); 
					fantacnt++;
					fanta--;
				}
			}
			// ���̴�
			if (menu == 3) {
				if( cider == 0 ) { System.out.println(" [[ �ݶ� ��� �����ϴ� : ��ǰ �غ��� ]] "); }
				else {
					System.out.println(" [[ �ݶ� ��ҽ��ϴ� ]] "); 
					cidercnt++;
					cider--;
				}
			}

			////////////////////////////��ٱ��� ��� ////////////////////////////
			System.out.println("----------------��ٱ���-----------------");
			System.out.println("��ǰ��\t��ǰ����\t������");
			if (cokecnt > 0) { System.out.println("�ݶ�\t" + cokecnt + "\t" + cokecnt*300); }
			if (fantacnt > 0) {	System.out.println("ȯŸ\t" + fantacnt + "\t" + fantacnt*200); }
			if (cidercnt > 0) {	System.out.println("���̴�\t" + cidercnt + "\t" + cidercnt*100); }
			
			System.out.println("������ : " + (cokecnt*300 + fantacnt*200 + cidercnt*100));
			
			if (menu == 4) {
				if (cokecnt == 0 && fantacnt == 0 && cidercnt == 0) {
					System.out.println("������ ��ǰ�� �����ϴ�");
				} else {
					System.out.println("���� �Ͻðڽ��ϱ�? [y] [n]"); String ch = scanner.next();
					
					while(true) {
						if(ch.equals("y")) {
							System.out.print("�ݾ� ���� : "); int money = scanner.nextInt();
							int totalpay = (cokecnt*300 + fantacnt*200 + cidercnt*100);
						
							if (money < totalpay) {
								System.out.println("�ݾ��� �����մϴ�");
							} else {
								System.out.println("[�����Ϸ�] �ܵ� : " + (money - totalpay));
								cokecnt = 0; fantacnt = 0; cidercnt = 0;
								break;
							}
						} else if (ch.equals("n")) {
							cokecnt = 0; fantacnt = 0; cidercnt = 0;
							break;
						} else {
							System.out.println("�� �� ���� �ൿ�Դϴ�");
						}
					}
					
				}
			}
		}
		
		
	}
}
