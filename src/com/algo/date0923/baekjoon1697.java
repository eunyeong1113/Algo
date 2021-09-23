package com.algo.date0923;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon1697 {
	static int N,K;
	static int visit[]=new int[100001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()+" ");
		
		N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		if(N==K)System.out.println(0);
		else bfs(N);
		//걸을경우 N+1 or N-1
		//뛸 경우 N*2
		//5->17
		//5->10->9->18->17 = 4
		
	}
	private static void bfs(int current) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(current);
		visit[current]=1;
		
		while(!q.isEmpty()) {
			int temp=q.poll();
			
			for (int i = 0; i < 3; i++) {
				int next;
				if(i==0) next = temp+1;
				else if(i==1) next = temp-1;
				else  next = temp*2;
				
				if(next==K) {
					System.out.println(visit[temp]);
					return;
				}
				
				if(next>=0 && next<visit.length && visit[next]==0)
				{	
					q.offer(next);
					visit[next]=visit[temp]+1;
					
				}
			}
		}
		
	}
}
