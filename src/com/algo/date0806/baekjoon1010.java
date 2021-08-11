package com.algo.date0806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1010 {
	static int N,M,numbers[],totalCnt;
	static boolean[] isSelected;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <=T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N=Integer.parseInt(st.nextToken());
			M=Integer.parseInt(st.nextToken());
		
			numbers = new int[N];
			bridge(0,1);
			sb.append(totalCnt).append("\n");
			totalCnt=0;
		}
		System.out.println(sb.toString());

	}
	
	private static void bridge(int cnt, int start) {//1 6
		
		if(cnt==N) {
			totalCnt++;
			return;
		}
		
		for (int i = start; i <= M; i++) {
			numbers[cnt]=i;
			bridge(cnt+1,i+1);
		}
		
	}

}
