package Practice;

import java.util.Scanner;

public class BankApplication {

	// 100�� ��ü ������ �� �ִ� �迭
	static Account[] accountArray = new Account[100];
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------");
			System.out.print("���� > ");
			int selectNo = scanner.nextInt();
			// �޼ҵ� �̸� �Է����� �� ��
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				System.out.println("����");
				run = false;
			}
		}
	}
	// ���»���
	static void createAccount() {
		System.out.println("-------");
		System.out.println("���»���");
		System.out.println("-------");
		// 1. �Է�
		System.out.print(">> ���¹�ȣ"); String ano = scanner.next();
		System.out.print(">> ������"); String owner = scanner.next();
		System.out.print(">> �ʱ��Աݾ�"); int balance = scanner.nextInt();
		// 2. ��ü ����
			// ���� �Է� �޾Ƽ� Account Ŭ���� �ȿ��� �ڵ� ����
			// ������� account��� ��ü������ ����
		Account account = new Account(ano, owner, balance);
		
		// 3. �迭 ����
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) { // ���� i��°�� ������ ��
				accountArray[i] = account; // Account ����� i��°�� ����
				System.out.println("���� ���� �Ϸ�");
				break;
			}
		}
	}
	// ���¸��
	static void accountList() {
		System.out.println("-------");
		System.out.println("���¸��");
		System.out.println("-------");
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) { break; } // i��°�� �����̸� �ݺ��� Ż��
			System.out.printf("%s \t %s \t %s \n", // �ƴϸ� ���� (Account �޼ҵ� ȣ��) 
					accountArray[i].getAno(),accountArray[i].getOwner(),accountArray[i].getBalance());
		}
	}
	
	// ���� �ߺ�üũ
	// �Է°��� �迭���� �ϳ��� ���Ͽ� ���� �� ã��
	static Account findAccount(String ano) {
		Account account = null; // ������ ���� �ϳ� ����
		for (int i = 0; i < accountArray.length; i++) {
			// ���� i��° �迭�� ��������ʰ� �Է°��� �����ϸ�
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				account = accountArray[i]; // i��° �� ����
				break;
			}
		}
		return account; // ����� ����
	}
	
	// ����
	static void deposit() {
		System.out.println("-------");
		System.out.println("����");
		System.out.println("-------");
		// �Է�
		System.out.print(">> ���¹�ȣ"); String ano = scanner.next();
		System.out.print(">> ���ݾ�"); int balance = scanner.nextInt();
		
		// �ߺ� üũ �� account�� �Է�
		Account account = findAccount(ano);
		
		// �ߺ����� ������
		if (account == null) {
			System.out.println("���� ����");
			return;
		}
		// �ߺ����� ������
		account.setBalance(account.getBalance() + balance);
		System.out.println("���� ����");
	}
	// ���
	static void withdraw() {
		System.out.println("-------");
		System.out.println("���");
		System.out.println("-------");
		
		System.out.print(">> ���¹�ȣ"); String ano = scanner.next();
		System.out.print(">> ���ݾ�"); int balance = scanner.nextInt();
		
		// ��ü ����
		Account account = findAccount(ano);
		
		// �ߺ����� ������
		if (account == null) {
			System.out.println("���� ����");
			return;
		}
		// �ߺ����� ������
		account.setBalance(account.getBalance() - balance);
		System.out.println("��� ����");
		
	}
	
	
}
