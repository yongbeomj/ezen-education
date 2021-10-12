package Day04;

import java.util.Scanner;

public class Day04_3 {

	// console 키오스크
	// 1. 메뉴판 [ 1.콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ]
	// 2. 초기 재고 [ 10개씩 ] 팔렸을 때 재고 감소, 재고가 없으면 구매 불가
	// 3. 결제를 금액을 입력받아서 결제액 만큼 차감한 후 잔돈 출력

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		// 재고변수 (지역변수 : 선언된 괄호 안에서만 사용 가능하다)
		int coke = 10;
		int fanta = 10;
		int cider = 10;
		
		// 장바구니변수
		int cokecnt = 0;
		int fantacnt = 0;
		int cidercnt = 0;
		
		while(true) {
			System.out.println("----------------메뉴-----------------");
			System.out.println("1.콜라 2.환타 3.사이다 4.결제");
			System.out.println("메뉴를 입력하세요 > "); int menu = scanner.nextInt();
			
			// 콜라
			if (menu == 1) {
				if( coke == 0 ) { System.out.println(" [[ 콜라 재고가 없습니다 : 제품 준비중 ]] "); }
				else {
					System.out.println(" [[ 콜라 담았습니다 ]] ");
					cokecnt++;
					coke--;
				}
			}
			// 환타
			if (menu == 2) {
				if( fanta == 0 ) { System.out.println(" [[ 환타 재고가 없습니다 : 제품 준비중 ]] "); }
				else {
					System.out.println(" [[ 환타 담았습니다 ]] "); 
					fantacnt++;
					fanta--;
				}
			}
			// 사이다
			if (menu == 3) {
				if( cider == 0 ) { System.out.println(" [[ 콜라 재고가 없습니다 : 제품 준비중 ]] "); }
				else {
					System.out.println(" [[ 콜라 담았습니다 ]] "); 
					cidercnt++;
					cider--;
				}
			}

			////////////////////////////장바구니 목록 ////////////////////////////
			System.out.println("----------------장바구니-----------------");
			System.out.println("제품명\t제품수량\t결제액");
			if (cokecnt > 0) { System.out.println("콜라\t" + cokecnt + "\t" + cokecnt*300); }
			if (fantacnt > 0) {	System.out.println("환타\t" + fantacnt + "\t" + fantacnt*200); }
			if (cidercnt > 0) {	System.out.println("사이다\t" + cidercnt + "\t" + cidercnt*100); }
			
			System.out.println("결제액 : " + (cokecnt*300 + fantacnt*200 + cidercnt*100));
			
			if (menu == 4) {
				if (cokecnt == 0 && fantacnt == 0 && cidercnt == 0) {
					System.out.println("결제할 제품이 없습니다");
				} else {
					System.out.println("결제 하시겠습니까? [y] [n]"); String ch = scanner.next();
					
					while(true) {
						if(ch.equals("y")) {
							System.out.print("금액 투여 : "); int money = scanner.nextInt();
							int totalpay = (cokecnt*300 + fantacnt*200 + cidercnt*100);
						
							if (money < totalpay) {
								System.out.println("금액이 부족합니다");
							} else {
								System.out.println("[결제완료] 잔돈 : " + (money - totalpay));
								cokecnt = 0; fantacnt = 0; cidercnt = 0;
								break;
							}
						} else if (ch.equals("n")) {
							cokecnt = 0; fantacnt = 0; cidercnt = 0;
							break;
						} else {
							System.out.println("알 수 없는 행동입니다");
						}
					}
					
				}
			}
		}
		
		
	}
}
