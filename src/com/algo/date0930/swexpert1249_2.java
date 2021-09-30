package com.algo.date0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class swexpert1249_2 {
	static int N;
	static int[][] map;
	static final int INF = Integer.MAX_VALUE;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <=T; tc++) {
			N = Integer.parseInt(br.readLine());
			
			map = new int [N][N];
			for (int i = 0; i <N; i++) {
				String s=br.readLine();
				
				for (int j = 0; j <N; j++) {
					map[i][j]=s.charAt(j)-'0';
				}
			}
			System.out.println("#"+tc+" "+dijkstra(0,0));
		}
	}
	private static int dijkstra(int startR, int startC) {
		boolean visit[][] = new boolean[N][N];
		int minTime[][] = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				minTime[i][j]=INF;
			}
		}
		
		minTime[startR][startC]=0;
		
		int r=0,c=0,minCost=0,nr,nc;
		while(true) {
			minCost=INF;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(!visit[i][j] && minCost>minTime[i][j]) {
						minCost = minTime[i][j];
						r=i;
						c=j;
					}
				}
			}
			visit[r][c]=true;
			if(r==N-1 && c==N-1) return minCost;
			for (int d = 0; d < 4; d++) {
				nr = r+dx[d];
				nc = c+dy[d];
				
				if(nr>=0 && nc>=0 && nr<N &&nc<N &&!visit[nr][nc]
						&& minTime[nr][nc]>minCost+map[nr][nc]) {
					minTime[nr][nc]=minCost+map[nr][nc];
				}
			}
		}
	}
}
