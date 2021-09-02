package com.algo.date0830;

import java.util.Scanner;

public class building {

	static int dx[]= {-1,-1,-1,0,0,1,1,1};
	static int dy[]= {-1,0,1,-1,1,-1,0,1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for (int tc = 1; tc <=T; tc++) {
			int N=sc.nextInt();
			char[][] build= new char[N][N];
			boolean[][] check=new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					build[i][j]=sc.next().charAt(0);
				}
			}
			int max=0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					for (int k = 0; k < 8; k++) {
						int dr=i+dx[k];
						int dc=j+dy[k];
						if(dr>=0&&dr<N && dc>=0&& dc<N) {
							if(build[i][j]=='B'&& build[dr][dc]=='B') {
								check[i][j]=true;
							}
							else {
								check[i][j]= false;
								break;
							}
						}
					}
					int count=0;
					if(check[i][j]) {
						for (int r = 0; r < N; r++) {
							if(build[i][r]=='B') {
								count++;
							}
							if(build[r][j]=='B') {
								count++;
							}
						}
						max=Math.max(max, count);
					}
				}
			}
			System.out.println(max-1);
			
		}

	}

}
