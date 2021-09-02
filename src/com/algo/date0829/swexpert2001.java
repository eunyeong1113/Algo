package com.algo.date0829;

import java.util.Arrays;
import java.util.Scanner;

public class swexpert2001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] arr=new int[N][N];
			int[][] fly=new int[M][M];
			int sum=0;
			int max=0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					for (int r = 0; r < M; r++) {
						for (int c = 0; c < M; c++) {
							if(i+r<N&&j+c<N)
								fly[r][c]=arr[i+r][j+c];
							sum+=fly[r][c];
						}
					}
					max=Math.max(max, sum);
					sum=0;
					for (int[] js : fly) {
						Arrays.fill(js, 0);
					}
				}
			}
			System.out.println("#"+tc+" "+max);
		}

	}

}
