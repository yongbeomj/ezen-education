package Test;

public class Account {

	// 1. �ʵ� : ���¹�ȣ, ������, ���ݾ� 
	String ano;
	String owner;
	int balance;
	
	// 2. ������
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// 3. �޼ҵ�
	public String getAno() { return ano; }
	public void setAno(String ano) { this.ano = ano; }
	public String getOwner() { return owner; }
	public void setOwner(String owner) { this.owner = owner; }
	public int getBalance() { return balance; }
	public void setBalance(int balance) { this.balance = balance; }
	
}
