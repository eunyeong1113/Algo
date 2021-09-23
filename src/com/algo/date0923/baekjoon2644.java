package com.algo.date0923;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2644 {
	
	static int N,M,p1,p2,result=-1;
	static int[][] graph;
	static boolean visit[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()+" ");
		p1 = Integer.parseInt(st.nextToken())-1;
		p2 = Integer.parseInt(st.nextToken())-1;
		M = Integer.parseInt(br.readLine());
		
		graph = new int[N][N];
		visit = new boolean[N];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine()+" ");
			int a=Integer.parseInt(st.nextToken())-1;
			int b=Integer.parseInt(st.nextToken())-1;
			graph[a][b]=1;
			graph[b][a]=1;
		}
		
		dfs(p1,0);
		System.out.println(result);
	}
	private static void dfs(int cur,int count) {
		if(cur==p2) {
			result=count;
			return;
		}
		visit[cur]=true;
		for (int i = 0; i < N; i++) {
			if(!visit[i]&&graph[cur][i]==1)
			{	
				visit[i]=true;
				dfs(i,count+1);
				visit[i]=false;
			}
		}
		
	}

}
