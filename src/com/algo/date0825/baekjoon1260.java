package com.algo.date0825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon1260 {

	static int N,M,V;
	static int[][] graph;
	static boolean visit[];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()+" ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		V=Integer.parseInt(st.nextToken())-1;
		
		graph=new int[N][N];
		visit=new boolean[N];
		for (int i = 0; i < M; i++) {
			st=new StringTokenizer(br.readLine()+" ");
			int a=Integer.parseInt(st.nextToken())-1;
			int b=Integer.parseInt(st.nextToken())-1;
			graph[a][b]=1;
			graph[b][a]=1;
		}
//		for (int[] g : graph) {
//			System.out.println(Arrays.toString(g));
//		}
		dfs(V);
		System.out.println();
		Arrays.fill(visit, false);
		bfs(V);
	}
	
	private static void dfs(int current) {
		visit[current]=true;
		System.out.print(current+1+" ");
		for (int i = 0; i <N; i++) {
			if(!visit[i]&&graph[current][i]==1)
			{	
				dfs(i);
			}
		}
	}
	private static void bfs(int current) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(current);
		visit[current]=true;
		while(!q.isEmpty()) {
			int temp=q.poll();
			System.out.print(temp+1+" ");
			for (int i = 0; i < N; i++) {
				if(!visit[i]&&graph[temp][i]==1)
				{	
					q.offer(i);
					visit[i]=true;
					
				}
			}
		}
		
	}
		
}
