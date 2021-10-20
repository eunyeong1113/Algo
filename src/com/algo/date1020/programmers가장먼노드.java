package com.algo.date1020;

import java.util.LinkedList;
import java.util.Queue;

public class programmers가장먼노드 {

	public static void main(String[] args) {
		//[[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]
		System.out.println(solution());
	}
	public static int solution() {
		
		int answer = 0;
		int n=6;
		int [][]edge= {
				{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}
		};
		
		//시작
		int map[][]=new int[n+1][n+1];
		int visited[]=new int[n+1];
		for (int i = 0; i < edge.length; i++) {
			map[edge[i][0]][edge[i][1]]=map[edge[i][1]][edge[i][0]]=1;
		}
        
        Queue<Integer> q = new LinkedList<Integer>();
		int cnt=1;
		q.offer(1);
		visited[1]=cnt;
		
		int max=0;
		while(!q.isEmpty()) {
			int temp=q.poll();
			cnt=visited[temp];
			for (int i = 1; i <=n; i++) {
				if(visited[i]==0&&map[temp][i]==1) {
					q.offer(i);
					visited[i]=cnt+1;
					if(max<visited[i])	max=visited[i];
				}
			}
		}
		for (Integer i : visited) {
			if(max==i)	answer++;
		}
        
        //끝
        return answer;
    }
}
