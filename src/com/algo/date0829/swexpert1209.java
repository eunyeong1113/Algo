package com.algo.date0829;

import java.util.Scanner;

public class swexpert1209 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int T = 0; T < 10; T++) {
			int tc=sc.nextInt();
			int sum=0;
			int max=0;
			
			int arr[][]=new int[100][100];
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					sum+=arr[i][j];
				}
				max=Math.max(max, sum);
				sum=0;
			}
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					sum+=arr[j][i];
				}
				max=Math.max(max, sum);
				sum=0;
			}
			for (int i = 0; i < 100; i++) {
				sum+=arr[i][i];
			}
			max=Math.max(max, sum);
			sum=0;
			for (int i = 0; i < 100; i++) {
				sum+=arr[99-i][i];
			}
			max=Math.max(max, sum);
			sum=0;
			
			System.out.println("#"+tc+" "+max);
		}

	}

}
