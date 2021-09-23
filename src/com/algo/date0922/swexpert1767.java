package com.algo.date0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class swexpert1767 {
	static int T, N, TOTAL, min = Integer.MAX_VALUE;
	static int[][] map;
	static int[] dx = { -1, 1, 0, 0 };//사방탐색 x좌표
	static int[] dy = { 0, 0, -1, 1 };//사방탐색 y좌표
	static int[][] size;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());//테스트케이스

		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			map = new int[N][N];//멕시노스
			size = new int[12][4];//방향별 map끝까지의 거리를 담을 배열
			ArrayList<point> p = new ArrayList<>();// core가있는 좌표
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine() + " ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					if (map[i][j] == 1) {
						if (i != 0 && i != N - 1 && j != 0 && j != N - 1) {
							
							p.add(new point(i, j));		//core좌표를 리스트에 저장
							
							size[cnt][0] = i - 0;		//위쪽으로의 거리
							size[cnt][1] = N - i - 1;	//아래쪽으로 거리
							size[cnt][2] = j - 0;		//왼쪽으로의 거리
							size[cnt][3] = N - j - 1;	//오른쪽으로의 거리
							cnt++;
						}
					}
				}
			}

			int d = 0;//최소거리의 방향
			int num=0;
			int dcnt=-1;
			for (int k = 0; k < p.size(); k++) {
				
				for (int L = 0; L < 4; L++) {
					// System.out.print(size[k][L]+" ");
					if (min > size[k][L]) {
						min = size[k][L];//최소거리값
						d = L;//최소거리의 방향 저장
					}
				}
				if(num==k) dcnt++;
				else dcnt=0;
				num=k;
				//System.out.println("카운트 "+dcnt);
				// System.out.println();
				int dr = p.get(k).x + dx[d];//이동할 x좌표
				int dc = p.get(k).y + dy[d];//이동할 y좌표
				System.out.println(k + " : " + min + " " + d);
				for (int i = 0; i < min; i++) {
					if (dr >= 0 && dc >= 0 && dr < N && dc < N) {//배열 벗어나지않게 조건설정
						if(map[dr][dc]==0){
							map[dr][dc] = 2;
							dr = dr+dx[d];
							dc = dc+dy[d];
						}
						else if (map[dr][dc] == 1) {//이동중 1을 만나면 막혀있는 곳이므로 size값 변경
							size[k][d] = Integer.MAX_VALUE;
							k--;
							for (int j = 0; j < i; j++) {
								dr=dr-dx[d];//0
								dc=dc-dy[d];//+1
								map[dr][dc] = 0;
							}
							break;
						}
						else if(map[dr][dc] == 2) {
							size[k][d] = Integer.MAX_VALUE;
							k--;
							for (int j = 0; j < i; j++) {
								dr=dr-dx[d];//0
								dc=dc-dy[d];//+1
								map[dr][dc] = 0;
							}
							break;
						}
					}
				}
				min = Integer.MAX_VALUE;
			}
			int count=0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					//System.out.print(map[i][j]);
					if(map[i][j]==2)count++;
				}
				//System.out.println();
			}
			System.out.println("#"+t+" "+count);
		}
	}
}

class point {
	int x;
	int y;

	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}