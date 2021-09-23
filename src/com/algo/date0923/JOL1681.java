package com.algo.date0923;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JOL1681 {

	static int N,answer=Integer.MAX_VALUE;
	static int tree[][];
	static boolean[] visited;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		tree=new int[N][N];
		visited=new boolean[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()+" ");
			for (int j = 0; j < N; j++) {
				tree[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		visited[0]=true;
		dfs(1,0,0);
		System.out.println(answer);
	}
	private static void dfs(int cnt, int current, int sum) {
		if(sum>answer) return;
		if(cnt==N) {
			if(tree[current][0]!=0 ) {
				answer=Math.min(answer, sum+tree[current][0]);
			}
		}
		for (int i = 1; i <N; i++) {
			if(visited[i]||tree[current][i]==0) continue;
			visited[i]=true;
			dfs(cnt+1,i,sum+tree[current][i]);
			visited[i]=false;
		}
	}
}
