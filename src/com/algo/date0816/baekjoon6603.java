package com.algo.date0816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//조합
public class baekjoon6603 {
	static int N;
	static int[] number,combi=new int[6];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			StringTokenizer st = new StringTokenizer(br.readLine()+" ");
			N=Integer.parseInt(st.nextToken());
			if(N==0)
				break;
			number = new int[N];
			for (int i = 0; i < N; i++) {
				number[i]=Integer.parseInt(st.nextToken());
			}
			comb(0,0);
			System.out.println();
			//System.out.println(Arrays.toString(number));
		}
	}
	private static void comb(int cnt, int start) {
		if(cnt==6) {
			for (int i = 0; i < 6; i++) {
				System.out.print(combi[i]+" ");
			}System.out.println();
			return;
		}
		for (int i = start; i < N; i++) {
			combi[cnt]=number[i];
			comb(cnt+1,i+1);
		}
	}
}
