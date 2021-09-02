package com.algo.date0828;

import java.util.Scanner;

public class baekjoon8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		int count=0;
		int sum=0;
		for (int i = 0; i < T; i++) {
			count=0;
			sum=0;
			String s= sc.next();
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j)=='O') {
					count++;
				}
				else {
					count=0;
				}
				sum+=count;
			}
			System.out.println(sum);
		}

	}

}
