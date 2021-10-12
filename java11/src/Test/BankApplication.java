package Test;

import java.util.Scanner;

public class BankApplication {

	// 100�� ���� ������ �迭
	static Account[] accountArray = new Account[100];
	// �Է°�ü
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.�Ա� | 4.��� | 5.����");
			System.out.println("------------------------------------------");
			System.out.print("���� > ");
			int choiceNo = scanner.nextInt();
			
			if (choiceNo == 1) { // 1�� ���� ��
				createAccount();
			} else if (choiceNo == 2) { // 2�� ���� �� 
				accountList();
			} else if (choiceNo == 3) { // 3�� ���� ��
				deposit();
			} else if (choiceNo == 4) { // 4�� ���� ��
				withdraw();
			} else if (choiceNo == 5) { // 5�� ���� ��
				System.out.println("���α׷� ����");
				run = false;
			}
		}
	}
	
	// �޼ҵ� ����
	// ���»���
	static void createAccount() {
		System.out.println("--------");
		System.out.println("���»���");
		System.out.println("--------");
		// �Է�
		System.out.print(">> ���¹�ȣ : "); String ano = scanner.next();
		System.out.print(">> ������ : "); String owner = scanner.next();
		System.out.print(">> �ʱ⿹�ݾ� : "); int balance = scanner.nextInt();
		
		// ��ü ����
		Account account = new Account(ano, owner, balance);
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) { // i��°�� �� �����̸�
				accountArray[i] = account; // i��°�� ����
				break; // �ݺ��� ����
			}
		}
	}
	// ���¸��
	static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) { break; } // �迭�� �� �����̸� �ݺ��� ����
			System.out.printf("%s \t %s \t %s \n",
					accountArray[i].getAno(),accountArray[i].getOwner(),accountArray[i].getBalance());
		}
	}
	
	// ���� �ߺ�üũ
	static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			// �迭�� ������� �����鼭 �Է°��� ���ٸ�
			if (accountArray[i] != null && accountArray[i].equals(ano)) {
				account = accountArray[i]; // i��° �� ����
				break;
			}
		}
		return account;
	}
	
	// �Ա�
	static void deposit() {
		System.out.println("--------");
		System.out.println("���»���");
		System.out.println("--------");
		// �Է�
		System.out.print(">> ���¹�ȣ : "); String ano = scanner.next();
		System.out.print(">> �Աݾ� : "); int balance = scanner.nextInt();
		
		// �ߺ� üũ
		Account account = findAccount(ano);
		
		// ��ü ����
		// �Աݾ��� �Ա� ������? => ���� �Աݾ� + �Աݾ�
		// �ߺ����� ������ (���°� ������)
		if (account == null) {
			System.out.println("���� ����");
			return;
		}
		account.setBalance(account.getBalance() + balance);
		System.out.println("�Ա� �Ϸ�");
		//
		
	}
	
	// ���
	static void withdraw() {
		
	}
	
}
