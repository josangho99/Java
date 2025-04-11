 package com.shinhan.ch06;

public class Account {
	int balance;

	static final int MAX_BALANCE = 1000000;
	static final int MIN_BALANCE = 0;
	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance < MIN_BALANCE) {
			return;
		}
		if(balance > MAX_BALANCE) {
			return;
		}
		
		this.balance = balance;
	}
}
