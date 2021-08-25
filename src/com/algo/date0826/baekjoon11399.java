package com.algo.date0826;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon11399 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N= Integer.parseInt(br.readLine());
		int[] ATM=new int[N];
		StringTokenizer st =new StringTokenizer(br.readLine()+" ");
		for (int i = 0; i < N; i++) {
			ATM[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(ATM);
		int sum=0;
		int[] time=new int[N]; 
		for (int i = 0; i < N; i++) {
			sum+=ATM[i];
			time[i]=sum;
		}
		int totalSum=0;
		for (int i = 0; i < N; i++) {
			totalSum+=time[i];
		}
		System.out.println(totalSum);
	}
}
