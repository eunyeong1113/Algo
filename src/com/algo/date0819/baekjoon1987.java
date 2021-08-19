package com.algo.date0819;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1987 {
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int R, C;
	static char[][] map;
	static boolean visit[] = new boolean[26];
	static int max = Integer.MIN_VALUE;

	private static void dfs(int x, int y, int count) {
		if(visit[map[x][y]-'A'])
		{
			max = Math.max(max, count);
			return;
		}else {
			
			visit[map[x][y]-'A']=true;
			for (int i = 0; i < 4; i++) {
				int dx=x+dr[i];
				int dy=y+dc[i];
				if(dx>=0&&dx<R&&dy>=0&&dy<C)
					dfs(dx,dy,count+1);
			}
			visit[map[x][y]-'A']=false;//for문에 안들어갔으면 false
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine() + " ");

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new char[R][C];
		for (int i = 0; i < R; i++) {
			String s = br.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		dfs(0, 0, 0);
		System.out.println(max);
	}
}
