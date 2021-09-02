package com.algo.date0827;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon12927_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String temp = br.readLine();
		char[] input = new char[temp.length()+1];
		input[0] = '0';
		for(int i=1; i<temp.length()+1;i++) {
			input[i] = temp.charAt(i-1);
		}
		int count = 0;

		
		for(int i=1; i<input.length; i++) {
			if(input[i]=='N') continue;
			for(int j=i; j<input.length; j+=i) {
				if(input[j]=='N') input[j] = 'Y';
				else if(input[j]=='Y') input[j] = 'N';
			}
			count++;
		}
		System.out.println(count);
	}
}
