package com.algo.date0924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon7576 {
	
	static int N,M;
	static int[][] map;
	static int dx[]= {-1,1,0,0};
	static int dy[]= {0,0,-1,1};
	static Queue<point> p = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()+" ");
		
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());

		map=new int [N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()+" ");
			for (int j = 0; j < M; j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
				if(map[i][j]==1) {
					p.offer(new point(i, j));
				}
			}
		}//1 = 익은토마토, 0 =익지않은 토마토, -1 =토마토 없음
		
		bfs();
		int max=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(map[i][j]==0) {
					System.out.println(-1);
					return;
				}
				max=Math.max(max, map[i][j]);
			}
		}
		System.out.println(max-1);
	}
	private static void bfs() {
		while(!p.isEmpty()) {
			point point = p.poll();
			for (int i = 0; i < 4; i++) {
				int dr=point.x+dx[i];
				int dc=point.y+dy[i];
				
				if(dr >= 0 && dc>=0 && dr<N && dc<M) {
					if(map[dr][dc]!=0) continue;
					map[dr][dc]=map[point.x][point.y]+1;
					p.offer(new point(dr, dc));
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
