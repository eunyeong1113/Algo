package com.algo.date0810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2563 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb=new StringBuilder();
		int T= Integer.parseInt(br.readLine());
		int [][]arr=new int[100][100];
		int count=0;
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			
			for (int i = 0; i <10; i++) {
				for (int j = 0; j < 10; j++) {
					arr[y+i][x+j]=1;
				}	
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j]==1)
					count++;
			}
		}
		System.out.println(count);
	}

}
