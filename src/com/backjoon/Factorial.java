package com.backjoon;
//10872
//꼭 class Main으로 변경 후 제출

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Factorial {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		//첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
		String input = br.readLine();
		int n = Integer.parseInt(input);
		
		if(n == 0) {
			bw.write(1 + "\n");
			bw.flush();
			bw.close();
			return;
		}
		int answer = factorial(n);
		//10
		//10 * 9 * 8... * 1;
		//fac(10) -> 10*fac9 -> 10*9*fac8 -> 10*9*8*fac7
		bw.write(answer + "\n");
		bw.flush();
		bw.close();
	}

	private static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		return n * factorial(n-1);
	}
}
