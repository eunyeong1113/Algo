package com.algo.date0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2740 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()+" ");
		StringBuilder sb = new StringBuilder();
		int Arow = Integer.parseInt(st.nextToken());
		int Acol = Integer.parseInt(st.nextToken());
		int A[][]=new int[Arow][Acol];
		for (int i = 0; i < Arow; i++) {
			st = new StringTokenizer(br.readLine()+" ");
			for (int j = 0; j < Acol; j++) {
				A[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine()+" ");
		int Brow = Integer.parseInt(st.nextToken());
		int Bcol = Integer.parseInt(st.nextToken());
		int B[][]=new int[Brow][Bcol];
		for (int i = 0; i < Brow; i++) {
			st = new StringTokenizer(br.readLine()+" ");
			for (int j = 0; j < Bcol; j++) {
				B[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		int C[][]=new int [Arow][Bcol];
		if(Acol==Brow)
		{
			for (int i = 0; i < Arow; i++) {
				for (int j = 0; j < Bcol; j++) {
					for (int k = 0; k < Acol; k++) {
						C[i][j]+=A[i][k]*B[k][j];
					} 
				}
			}
		}
		for (int i = 0; i < Arow; i++) {
			for (int j = 0; j < Bcol; j++) {
				sb.append(C[i][j]+" ");
			}sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}

}
