package com.algo.date0829;

import java.util.Scanner;

public class swexpert2805 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for (int tc = 1; tc <=T; tc++) {
			int N=sc.nextInt();
			int sum=0;
			int arr[][]=new int[N][N];
			for (int i = 0; i < N; i++) {
				String s= sc.next();
				for (int j = 0; j < N; j++) {
					arr[i][j]=s.charAt(j)-'0';
				}
			}
			int num=N/2;
			int k=N/2-1;
			for (int i = 0; i < N/2+1; i++) {
				for (int j = num-i; j <=num+i; j++) {
					sum+=arr[i][j];
				}
			}
			for (int i = N/2+1; i<N; i++) {
				for (int j = num-k; j <=num+k; j++) {
					sum+=arr[i][j];
				}
				k--;
			}
			System.out.println("#"+tc+" "+sum);
		}

	}

}
