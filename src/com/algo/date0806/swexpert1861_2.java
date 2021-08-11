package com.algo.date0806;

import java.util.Scanner;

public class swexpert1861_2 {

	static int dx[] = { -1, 1, 0, 0 };
	static int dy[] = { 0, 0, -1, 1 };
	static int[][] room;
	static int[][] visit;
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			
			room=new int[N][N];
			visit=new int[N][N];
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					room[i][j] = sc.nextInt();
				}
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(visit[i][j]==0)//아직 방문안한 칸
						check(i,j);
				}
			}
			int max=-1;
			int no=0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(max<visit[i][j]) {
						max = visit[i][j];
						no = room[i][j];
					}else if(max==visit[i][j]) {
						no = Math.min(no, room[i][j]);
					}
						
				}
			}
			System.out.println("#"+tc+" "+no+max);
		}
	}

	private static void check(int i, int j) {
		visit[j][j] = 1;
		
		for (int k=0; k<4; k++) {
			int nx=i+dx[k];
			int ny=j+dx[k];
			
			if(!inRange(nx,ny))continue;
			if(room[nx][ny] == room[i][j]+1)
			{
				check(nx,ny);
				visit[i][j]= visit[nx][ny]+1;
			}
		}
	}

	private static boolean inRange(int nx, int ny) {
		return (nx>=0 && ny>=0 && nx<N && ny<N);
	}
}
