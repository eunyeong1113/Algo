package com.algo.date0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1149 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int RGB[][]=new int[N][3];
		int d[][]=new int[N][3];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()+" ");
			for (int j = 0; j < 3; j++) {
				RGB[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		d[0][0]=RGB[0][0];
		d[0][1]=RGB[0][1];
		d[0][2]=RGB[0][2];
		for (int i = 1; i < N; i++) {
			d[i][0]=Math.min(d[i-1][1],d[i-1][2])+RGB[i][0];
			d[i][1]=Math.min(d[i-1][0],d[i-1][2])+RGB[i][1];
			d[i][2]=Math.min(d[i-1][0],d[i-1][1])+RGB[i][2];
		}
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			min=Math.min(min,d[N-1][i]);
		}
		System.out.println(min);
		
	}

}
