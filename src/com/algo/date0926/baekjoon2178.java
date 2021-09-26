package com.algo.date0926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon2178 {
	static int N,M;
	static int [][]map;
	static boolean [][]visit;
	static int dx[]= {-1,1,0,0};
	static int dy[]= {0,0,-1,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()+" ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map  = new int[N+1][M+1];
		visit  = new boolean[N+1][M+1];
		for (int i = 1; i <= N; i++) {
			String s = br.readLine();
			for (int j = 1; j <= M; j++) {
				map[i][j]=s.charAt(j-1)-'0';
			}
		}
//		for (int i = 1; i <= N; i++) {
//			for (int j = 1; j <= M; j++) {
//				System.out.print(map[i][j]+" ");
//			}System.out.println();
//		}
		
		bfs();
		System.out.println(map[N][M]);
		
	}
	private static void bfs() {
		Queue<point> p = new LinkedList<point>();
		visit[0][0]=true;
		p.offer(new point(1,1));
		while(!p.isEmpty()) {
			point po = p.poll();
			for (int i = 0; i < 4; i++) {
				int dr = po.x+dx[i];
				int dc = po.y+dy[i];
				
				if(dr>=1 && dc>=1 && dr<=N && dc<=M ) {
					if(visit[dr][dc]||map[dr][dc]==0)continue;
					p.offer(new point(dr, dc));
					map[dr][dc] = map[po.x][po.y]+1;
					visit[dr][dc] = true;
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
