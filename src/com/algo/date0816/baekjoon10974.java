package com.algo.date0816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//순열
public class baekjoon10974 {

	static int N;
	static int[] number;
	static boolean isSelected[];
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		number=new int[N];
		isSelected=new boolean[N];
		permutation(0);
		System.out.println(sb.toString());
		
	}
	private static void permutation(int cnt) {
		if(cnt==N) {
			for (int i = 0; i < N; i++) {
				if(isSelected[i])
					sb.append(number[i]+1+" ");
			}sb.append("\n");
			return;
		}
		for (int i = 0; i < N; i++) {
			if(isSelected[i]) continue;
			
			number[cnt]=i;
			isSelected[i]=true;
			
			permutation(cnt+1);
			isSelected[i]=false;
		} 
	}
}
