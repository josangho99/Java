package com.backjoon;
//1026번

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Treasure{
	public static void main(String[] args) throws IOException {
		// 각 줄에 정수 X와 Y가 주어진다.
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int input = Integer.parseInt(bf.readLine());
		String[] arr1_str = bf.readLine().split(" ");
		String[] arr2_str = bf.readLine().split(" ");
		int[] arr1 = new int[input]; 
		int[] arr2 = new int[input]; 
		
		
		for(int i=0; i<input; i++) {
			arr1[i] = Integer.parseInt(arr1_str[i]);
			arr2[i] = Integer.parseInt(arr2_str[i]);
		}
		
		int answer = 0;
		for(int i=0; i<input; i++) {
			answer += arr1[i]*arr2[i];		
		}
		System.out.println(answer);
	}
}
