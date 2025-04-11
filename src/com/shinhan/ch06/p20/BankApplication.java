package com.shinhan.ch06.p20;

public class BankApplication {
	public Account[] accounts = new Account[100];

	public void withdraw(String id, int balance) {
		for(int i=0; i<Account.count; i++) {
			if(accounts[i].getAccount_num().equals(id)) {
				accounts[i].setBalance(accounts[i].getBalance() + balance);
				System.out.println("입금완료");
			}
		}
	}

	public void deposit(String id, int balance) {
		for(int i=0; i<Account.count; i++) {
			if(accounts[i].getAccount_num().equals(id)) {
				if(accounts[i].getBalance() - balance < 0) {
					accounts[i].setBalance(accounts[i].getBalance() - balance);
					System.out.println("출금완료");
				}
			}
		}
	}

}
