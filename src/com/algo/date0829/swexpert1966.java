package com.algo.date0829;

import java.util.Scanner;

public class swexpert1966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] num = new int[N];
			for (int i = 0; i < N; i++) {
				num[i] = sc.nextInt();
			}
			boolean check=false;
			while (true) {
				check=false;
				for (int i = 0; i < N; i++) {
					if (i + 1 < N && num[i] > num[i + 1]) {
						int temp = num[i];
						num[i] = num[i + 1];
						num[i + 1] = temp;
						check=true;
					}
				}
				if(!check)
					break;
				
			}
			System.out.print("#"+tc+" ");
			for (int i = 0; i < N; i++) {
				System.out.print(num[i]+" ");
			}System.out.println();
		}

	}
}
