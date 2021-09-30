package com.algo.date0929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class swexpert5643_2 {
	//dfs 코드
	static int N,M,gtCnt,ltCnt,cnt;//Cnt한개로 관리가능
	static int[][] map,rev;
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			N=Integer.parseInt(br.readLine());
			M=Integer.parseInt(br.readLine());
			
			map = new int[N+1][N+1];
			rev = new int[N+1][N+1];
			for (int k = 0; k < M; k++) {
				StringTokenizer st = new StringTokenizer(br.readLine()+" ");
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				map[a][b] = 1;
				rev[b][a] = 1;
			}
			int ans=0;
			for (int i = 1; i <=N; i++) {
				//gtCnt = ltCnt=0;
				cnt=0;
				Dfs(i,map,new boolean[N+1]);
				Dfs(i,rev,new boolean[N+1]);
				if(cnt==N-1)++ans;
			}System.out.println("#"+tc+" "+ans);
		}
		
	}
	private static void Dfs(int cur, int [][]map,boolean[] visit) {
		
		visit[cur] = true;
		
		for (int i = 1; i <=N; i++) {
			if(!visit[i]&&map[cur][i]==1) {
				++cnt;
				Dfs(i,map,visit);
			}
		}
	}
	
	
//	private static void Dfs(int cur,boolean[] visit) {
//		
//		visit[cur] = true;
//		
//		for (int i = 1; i <=N; i++) {
//			if(!visit[i]&&map[cur][i]==1) {
//				++gtCnt;
//				Dfs(i,visit);
//			}
//		}
//	}
//	
//	private static void ltDfs(int cur,boolean[] visit) {
//			
//		visit[cur] = true;
//			
//		for (int i = 1; i <=N; i++) {
//			if(!visit[i]&&map[i][cur]==1) {
//				++ltCnt;
//				ltDfs(i,visit);
//			}
//		}
//	}

}
