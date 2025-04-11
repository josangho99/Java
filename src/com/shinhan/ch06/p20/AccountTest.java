package com.shinhan.ch06.p20;

import java.util.Scanner;

public class AccountTest {
	
	static Scanner sc = new Scanner(System.in);
	static BankApplication BA = new BankApplication();
	
	public static void main(String[] args) {
		
		boolean isEnd = false;
		while(!isEnd) {
			displayMenu();
			String input = sc.nextLine();
			int menuSelect = Integer.parseInt(input.strip());
			
			switch (menuSelect) {
				case 1 -> {
					f1();
				}
				case 2 -> {
					f2();
				}
				case 3 -> {
					f3();
				}
				case 4 -> {
					f4();
				}
				case 5 -> {
					System.out.println("프로그램 종료");
					isEnd = true;
					sc.close();
					return;
				}
				default->{
					System.out.println("제공되지 않는 메뉴입니다...");
				}
			}
		}
	}

	private static void f4() {
		// TODO Auto-generated method stub
		if(isAccount()) {
			System.out.println("----------");
			System.out.println("금");
			System.out.println("----------");
			System.out.print("계좌번호: ");
			String inputAccnum= sc.nextLine();
			System.out.print("출금액: ");
			int inputBalance = Integer.parseInt(sc.nextLine().trim());
			BA.deposit(inputAccnum, inputBalance);
		}else {
			
		}
	}

	private static void f3() {
		// TODO Auto-generated method stub
		if(isAccount()) {
			System.out.println("----------");
			System.out.println("예금");
			System.out.println("----------");
			System.out.print("계좌번호: ");
			String inputAccnum= sc.nextLine();
			System.out.print("예금액: ");
			int inputBalance = Integer.parseInt(sc.nextLine().trim());
			BA.withdraw(inputAccnum, inputBalance);
		}else {
			
		}
	}

	private static void f2() {
		if(isAccount()) {
			System.out.println("----------");
			System.out.println("계좌목록");
			System.out.println("----------");
			for(int i=0; i<Account.count; i++) {
				System.out.printf("%s \t %s \t %d\n",BA.accounts[i].getAccount_num(), BA.accounts[i].getName(),BA.accounts[i].getBalance());
			}
		}
		else {
			
		}
	}

	private static void f1() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String accNum = sc.nextLine();
		System.out.print("계좌주: ");
		String accName = sc.nextLine();
		System.out.print("초기입금: ");
		
		Boolean isBalance = false;
		int balance = -1;
		
		while(!isBalance) {
			balance = Integer.parseInt(sc.nextLine().trim());
			if(balance < 0) {
				System.out.println("입금액을 다시 입력하세요.");
				System.out.print("초기입금: ");
			}
			else {
				isBalance = true;	
			}
		}
		
		Account account = new Account(accNum, accName, balance);
		BA.accounts[Account.count] = account;
		Account.count++;
		System.out.println("결과 계좌가 생성되었습니다.");
	}
	
	private static Boolean isAccount() {
		if(Account.count !=0 ) {
			return true;
		}else {
			System.out.println("아직 생성된 계좌가 없습니다...");
			return false;
		}
	}

	private static void displayMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-------------------------------------------");
		System.out.print("선택>");
	}
}
