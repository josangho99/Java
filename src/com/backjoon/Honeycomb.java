package com.backjoon;
//2292번 문제
//제출시 class명 변경하기!!!

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Honeycomb {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		//첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
		String input = br.readLine();
		int n = Integer.parseInt(input);
		
		int index=0;
		int answer = -1;
		int a1 = 1;
		while(true) {
			if(n <= a1) {
				answer = index+1;
				break;
			}
			a1 = a1+ 6 * ++index;
		}
		bw.write(answer + "\n");
		bw.flush();
		bw.close();
		
		//1 -> 
		//2-7 -> 1+6 
		//~19 -> 7+12(2*6)
		//~37 -> 19+18(3*6)
		//~61 -> +24
	}
}
