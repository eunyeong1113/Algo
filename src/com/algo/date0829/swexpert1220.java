package com.algo.date0829;

import java.util.Scanner;

public class swexpert1220 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		for (int tc = 1; tc <=10; tc++) {
			int N=sc.nextInt();
			int map[][]=new int[N][N];
			int count=0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j]=sc.nextInt();
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(map[i][j]==1)
					{
						for (int k = i+1; k < N; k++) {
							if(map[k][j]==1)break;
							else if(map[k][j]==2) {
								count++;
								break;
							}
						}
					}	
				}
			}
			System.out.println("#"+tc+" "+count);
		}

	}

}
