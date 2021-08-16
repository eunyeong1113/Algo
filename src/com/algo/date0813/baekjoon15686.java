package com.algo.date0813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon15686 {

	static int N,m,chi=0,h=0;
	static int[][] map,chiken,home;
	static int[] number;
	static int ans=Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 1은 집 2는 치킨집
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());// 폐업하지 않는 점포의 개수
		map = new int[N][N];
		number=new int[m];
		int distance = 0;// 거리계산

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		} // 입력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 2) {
					chi++;
				}
				else if(map[i][j]==1)
					h++;
			}
		}
		chiken = new int[chi][2];// 0은 X좌표,1은 Y좌표
		home = new int[h][2];// 0은 X좌표,1은 Y좌표
		
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 2) {
					chiken[num1][0] = i;
					chiken[num1][1] = j;
					num1++;
				}
				else if (map[i][j] == 1) {
					home[num2][0] = i;
					home[num2][1] = j;
					num2++;
				}
			}
		}
		
		comb(0,0);
		System.out.println(ans);
	}
	private static void comb(int cnt, int start) {
		if(cnt==m) {
			int min=0;
			for (int i = 0; i < h; i++) {
				int distance=Integer.MAX_VALUE;
				for (int j = 0; j < m; j++) {
					distance= Math.min(distance, Math.abs(chiken[number[j]][0]-home[i][0]) + Math.abs(chiken[number[j]][1]-home[i][1]));
					//System.out.print(chiken[i][0]+" "+chiken[i][1]+" \n");				
				}
				min+=distance;
			}
			ans=Math.min(ans, min);
			return;
		}
		for (int i = start; i < chiken.length; i++) {
			number[cnt]=i;
			comb(cnt+1,i+1);
		}
		
	}

}
