package com.backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int input = Integer.parseInt(br.readLine());
		int count = input;
		for (int i = 0; i < input; i++) {
			String str = br.readLine();
			char[] arr = str.toCharArray();
			String answer = String.valueOf(arr[0]);
			for (int j = 1; j < str.length(); j++) {

				if (arr[j - 1] != arr[j]) {
					if (answer.contains(Character.toString(arr[j]))) {
						count--;
						break;
					}
					answer += arr[j];
				}
			}
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}