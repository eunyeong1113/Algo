package com.algo.date0825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon10026 {

	static int N;
	static char[][] map,red;
	static boolean[][] visited,visited2;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	static int cnt1=0,cnt2=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		map=new char[N][N];
		red=new char[N][N];
		visited = new boolean[N][N];
		visited2 = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = s.charAt(j);
				if(map[i][j]=='G') red[i][j]='R';
				else red[i][j]=map[i][j];					
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {				
				if(!visited[i][j]){	
					bfs(new point(i,j));
					cnt1++;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {				
				if(!visited2[i][j]){	
					bfsRed(new point(i,j));
					cnt2++;
				}
			}
		}
		System.out.println(cnt1+" "+cnt2);
		
	}
	private static void bfs(point p) {
		Queue<point>  q = new LinkedList<point>();
		q.offer(p);
		visited[p.x][p.y]=true;
		while(!q.isEmpty()) {
			point current = q.poll();
			for (int i = 0; i < 4; i++) {
				int R = current.x+dx[i];
				int C = current.y+dy[i];
				if(R>=0 && R<N && C>=0 &&C<N && map[current.x][current.y]==map[R][C] && !visited[R][C] ) {
					q.offer(new point(R,C));
					visited[R][C]=true;
				}
			}
		}
	}
	private static void bfsRed(point p) {
		Queue<point>  q = new LinkedList<point>();
		q.offer(p);
		visited2[p.x][p.y]=true;
		while(!q.isEmpty()) {
			point current = q.poll();
			for (int i = 0; i < 4; i++) {
				int R = current.x+dx[i];
				int C = current.y+dy[i];
				if(R>=0 && R<N && C>=0 &&C<N && !visited2[R][C] && red[current.x][current.y]==red[R][C]) {
					q.offer(new point(R,C));
					visited2[R][C]=true;
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
