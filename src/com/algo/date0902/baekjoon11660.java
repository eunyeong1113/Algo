package com.algo.date0902;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11660 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()+" ");
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int [][]arr= new int[N][N];
		int [][]count=new int[M][4];
		int x1=0,y1=1,x2=2,y2=3;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()+" ");
			for (int j = 0; j < N; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine()+" ");
			for (int j = 0; j < 4; j++) {
				count[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		int sum=0;
		int cnt=0;
		for (int k = 0; k < M; k++) {
			for (int i = count[k][x1]-1; i <= count[k][x2]-1; i++) {
				for (int j = count[k][y1]-1; j <= count[k][y2]-1; j++) {
					sum+=arr[i][j];
				}
			}
			System.out.println(sum);
			sum=0;
		}
	}
}
