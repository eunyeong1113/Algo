package com.algo.date0926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon15650 {

	static int N,M;
	static int[] num;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()+" ");

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		num = new int[M];
		//System.out.println(Arrays.toString(num));
		
		comb(1,0);
	}
	private static void comb(int start, int cnt) {
		if(cnt==M) {
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]+" ");
			}
			System.out.println();
			return;
		}
		for (int i = start ; i <=N; i++) {
			num[cnt]=i;
			comb(i+1,cnt+1);
		}
	}
}
