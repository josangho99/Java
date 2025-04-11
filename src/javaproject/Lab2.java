package javaproject;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		/* //numDay
		 * Scanner key = new Scanner(System.in); System.out.print("월 입력 : "); int
		 * month = key.nextInt();
		 * 
		 * numDay(month);
		 * key.close;
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 2개를 입력하시오. 형식 int,int :");
		String input = sc.nextLine();
		String[] su = input.split(",");
		int a = Integer.parseInt(su[0]);
		int b = Integer.parseInt(su[1]);
		int result = gcd(a,b);
		System.out.println(result);
		sc.close();
	}

	private static int gcd(int a, int b) {
		int bigGcd = 1;

		if (a > b) {
			for (int i = 1; i < a; i++) {
				if (a % i == 0 && b % i == 0) {
					bigGcd = i;
				}
			}
			return bigGcd;
		} else {
			for (int i = 1; i < b; i++) {
				if (a % i == 0 && b % i == 0) {
					bigGcd = i;
				}
			}
			return bigGcd;
		}
	}

	private static void numDay(int num) {

		switch (num) {
		case 2:
			System.out.print("28");
			break;
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.print("31");
			break;
		case 4, 6, 9, 11:
			System.out.print("30");
			break;
		default:
			System.out.printf("%d월은 존재하지 않습니다. 다시 입력하세요.\n", num);
			break;
		}
	}

	private static void f6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요: ");
		int year = sc.nextInt();
		boolean isLeapYear = true;
		
		System.out.print("월을 입력하세요: ");
		int month = sc.nextInt();
		int day;
		switch (month) {
			case 2 : 
				if (year % 4 == 0) {
					if (year % 100 == 0) {
						if (year % 400 == 0) {
							isLeapYear = true;
						} else {
							isLeapYear = false;
						}
					} else {
						isLeapYear = true;
					}
				} else {
					isLeapYear = false;
				}
				day = isLeapYear == true ? 29 : 28;
				System.out.printf("%d년 %d월 말일은 %d일 입니다.", year, month,day);
				break;
			case 1, 3, 5, 7, 8, 10, 12:
				day=31;
			System.out.printf("%d년 %d월 말일은 %d일 입니다.", year, month,day);
				break;
			case 4, 6, 9, 11:
				day=30;
			System.out.printf("%d년 %d월 말일은 %d일 입니다.", year, month,day);
				break;
			default:
				System.out.printf("%d월은 존재하지 않습니다. 다시 입력하세요.\n", month);
				break;
		}
		sc.close();
	}

	private static void f5() {
		int start = 1;
		int total = 0;
		for (int i = 0; i < 15; i++) {
			start += i;
			total += start;
		}
		System.out.println("15번째까지의 합 : " + total);
	}

	private static void f4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요. : ");
		int input = sc.nextInt();
		int count = 0;
		int total = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % input == 0) {
				count++;
				total += i;
			}
		}
		System.out.printf("%d의 배수 개수 = %d\n", input, count);
		System.out.printf("%d의 배수 합 = %d\n", input, total);
		sc.close();
	}

	private static void f3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		int input = sc.nextInt();
		int total = 1;
		if (input < 2 || input > 9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
		} else {
			for (int i = 1; i <= input; i++) {
				total *= i;
				System.out.printf("%d! = %d\n", i, total);
			}
		}
		sc.close();
	}

	private static void f2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2 ~ 100사이의 정수를 입력하세요. : ");
		int input = sc.nextInt();
		boolean isPrime = true;
		for (int i = 1; i < input; i++) {
			if (i != 1 && i != input && input % i == 0) {
				isPrime = false;
				break;
			} else {
				continue;
			}
		}
		if (isPrime == true) {
			System.out.printf("%d는(은) 소수입니다.", input);
		} else {
			System.out.printf("%d는(은) 소수가 아닙니다.", input);
		}
		sc.close();
	}

	private static void f1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		int input = sc.nextInt();
		if (input < 2 || input > 9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
		} else {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", input, i, input * i);
			}
		}
		sc.close();
	}

}
