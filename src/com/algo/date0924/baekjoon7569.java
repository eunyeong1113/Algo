package com.algo.date0924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon7569 {
	
	static int N,M,H;
	static int[][][] map;
	static int dx[]={-1,1,0,0,0,0};
	static int dy[]={0,0,-1,1,0,0};
	static int dz[]={0,0,0,0,-1,1};
	static Queue<point1> p = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()+" ");
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		H=Integer.parseInt(st.nextToken());
		
		map=new int [H][M][N];
		for (int k = 0; k < H; k++) {
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine()+" ");
				for (int j = 0; j < N; j++) {
					map[k][i][j]=Integer.parseInt(st.nextToken());
					if(map[k][i][j]==1) {
						p.offer(new point1(i, j, k));
					}
				}
			}
		}
		//1 = 익은토마토, 0 =익지않은 토마토, -1 =토마토 없음
		bfs();
		int max=0;
		
		for (int k = 0; k < H; k++) {
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if(map[k][i][j]==0) {
						System.out.println(-1);
						return;
					}
					max=Math.max(max, map[k][i][j]);
				}
			}
		}
		System.out.println(max-1);
	}
	private static void bfs() {
		while(!p.isEmpty()) {
			point1 point = p.poll();
			for (int i = 0; i < 6; i++) {
				int dr=point.x+dx[i];
				int dc=point.y+dy[i];
				int dh=point.z+dz[i];
				
				if(dr >= 0 && dc>=0 && dr<M && dc<N && dh>=0 && dh<H) {
					if(map[dh][dr][dc]!=0) continue;
					map[dh][dr][dc]=map[point.z][point.x][point.y]+1;
					p.offer(new point1(dr, dc, dh));
				}
				
			}
		}
		
	}

}
class point1{
	int x;
	int y;
	int z;
	public point1(int x, int y,int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
