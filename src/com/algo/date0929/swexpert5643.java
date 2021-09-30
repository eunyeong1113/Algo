package com.algo.date0929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class swexpert5643 {
	
	static int N,M;
	static int map[][];
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			N=Integer.parseInt(br.readLine());
			M=Integer.parseInt(br.readLine());
			
			map = new int[N+1][N+1];
			for (int k = 0; k < M; k++) {
				StringTokenizer st = new StringTokenizer(br.readLine()+" ");
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				map[a][b] = 1;
			}
			int ans=0;
			for (int i = 1; i <=N; i++) {
				if(bfs(i)+ltBfs(i)==N-1)++ans;
			}System.out.println("#"+tc+" "+ans);
		}
		
	}
	private static int bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean[] visit= new boolean[N+1]; 
		
		q.offer(start);
		visit[start]=true;
		
		int cnt=0;
		while(!q.isEmpty()) {
			int cur = q.poll();
			for (int i = 1; i <= N; i++) {
				if(!visit[i]&&map[cur][i]==1) {
					q.offer(i);
					visit[i]=true;
					++cnt;
				}
			}
		}
		return cnt;
	}
	
	private static int ltBfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean[] visit= new boolean[N+1]; 
		
		q.offer(start);
		visit[start]=true;
		
		int cnt=0;
		while(!q.isEmpty()) {
			int cur = q.poll();
			for (int i = 1; i <= N; i++) {
				if(!visit[i]&&map[i][cur]==1) {
					q.offer(i);
					visit[i]=true;
					++cnt;
				}
			}
		}
		return cnt;
	}

}
