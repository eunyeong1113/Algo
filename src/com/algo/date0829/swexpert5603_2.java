package com.algo.date0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swexpert5603_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for (int tc = 1; tc <=T; tc++) {
			int N=Integer.parseInt(br.readLine());
			int []arr=new int[N];
			int sum=0;
			int avg=0;
			int answer=0;
			for (int i = 0; i < N; i++) {
				arr[i]=Integer.parseInt(br.readLine());
				sum+=arr[i];
			}
			avg=sum/N;
			for (int i = 0; i < N; i++) {
				if(arr[i]>avg)
				{
					answer+=arr[i]-avg;
				}
			}
			System.out.println("#"+tc+" "+answer);

		}
	}
}
