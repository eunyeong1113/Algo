package com.algo.date1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon2667 {

	static int N,cnt;
	static int[][] map,visited;
	static int dx[]= {-1,1,0,0};
	static int dy[]= {0,0,-1,1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		map = new int [N][N];
		visited = new int [N][N];
		 
		
		
		for (int i = 0; i <N; i++) {
			String s = br.readLine();
			for (int j = 0; j <N; j++) {
				map[i][j]=s.charAt(j)-'0';
			}
		}
		for (int i = 0; i <N; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j]==1&&visited[i][j]==0) {
					cnt++;
					dfs(i,j);
				}
			}
		}
		
		int[] total=new int[cnt];
		System.out.println(cnt);
		for (int k = 0; k < cnt; k++) {
			for (int i = 0; i <N; i++) {
				for (int j = 0; j < N; j++) {
					if(visited[i][j]==k+1) total[k]++;
				}
			}
		}
		Arrays.sort(total);
		for (int i = 0; i <cnt; i++) {
			System.out.println(total[i]);
		}

	}
	private static void dfs(int x, int y) {		
		visited[x][y]=cnt;
		for (int i = 0; i <4; i++) {
			int dr=x+dx[i];
			int dc=y+dy[i];
			
			if(dr>=0 && dr<N && dc>=0 && dc<N) {
				if(visited[dr][dc]==0 && map[dr][dc]==1) {
					visited[dr][dc]=cnt;
					dfs(dr,dc);
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
