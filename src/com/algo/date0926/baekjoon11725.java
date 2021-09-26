package com.algo.date0926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon11725 {
	
	static int N;
	//static int [][]map;
	static int []ans;
	static boolean visit[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N=Integer.parseInt(br.readLine());
		ArrayList<Integer>[] graph = new ArrayList[N+1];
		//map=new int[N+1][N+1];
		visit=new boolean[N+1];
		ans=new int[N+1];
		for(int i=1; i <= N; i++){
            graph[i] = new ArrayList<>();
        }
		for (int i = 1; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()+" ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			graph[a].add(b);
	        graph[b].add(a);
//			map[a][b]=1;
//			map[b][a]=1;
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		visit[1]=true;
		q.offer(1);
		while(!q.isEmpty()) {
			int temp = q.poll();
			for (int i : graph[temp]) {
				if(!visit[i]) {
					q.offer(i);
					ans[i]=temp;
					visit[i]=true;
				}
			}
		}
		
		for (int i = 2; i <=N; i++) {
			sb.append(ans[i]+"\n");
		}
		System.out.println(sb.toString());
		
	}

}
