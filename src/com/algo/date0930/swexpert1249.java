package com.algo.date0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class swexpert1249 {
	static int N,min= Integer.MAX_VALUE;
	static int[][] map,dis;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <=T; tc++) {
			N = Integer.parseInt(br.readLine());
			
			map = new int [N][N];
			dis = new int [N][N];
			for (int i = 0; i < N; i++) {
				Arrays.fill(dis[i], Integer.MAX_VALUE);
			}
			dis[0][0]=0;
			for (int i = 0; i <N; i++) {
				String s=br.readLine();
				
				for (int j = 0; j <N; j++) {
					map[i][j]=s.charAt(j)-'0';
				}
			}
			min= Integer.MAX_VALUE;
			bfs();
			System.out.println("#"+tc+" "+min);
		}
	}
	private static void bfs() {
		Queue<point> q = new LinkedList<point>();
		boolean visit[][] = new boolean[N][N];
		q.offer(new point(0, 0));
		visit[0][0]=true;
		
		while(!q.isEmpty()) {
			point p = q.poll();
			
			if(p.x==N-1 && p.y==N-1) {
				min = Math.min(min, dis[N-1][N-1]);
			}
			if(min<=dis[p.x][p.y])continue;
			for (int i = 0; i < 4; i++) {
				int dr = p.x+dx[i];
				int dc = p.y+dy[i];
				if(dr>=0 && dc>=0 &&dr<N &&dc<N) {
					if(!visit[dr][dc]||dis[dr][dc]>dis[p.x][p.y]+map[dr][dc]) {
						visit[dr][dc]=true;
						dis[dr][dc]=dis[p.x][p.y]+map[dr][dc];
						q.offer(new point(dr, dc));
					}
				}
				
			}
		}
		
	}
}
class point{
	int x;
	int y;
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
