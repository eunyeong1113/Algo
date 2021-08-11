package com.algo.date0801;

import java.util.Scanner;

public class baekjoon11720 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int sum=0;
		String inputS = sc.next();
			for (int i = 0; i < input; i++) {
				sum+=inputS.charAt(i)-'0';
			}
		System.out.println(sum);
		sc.close();

	}

}
