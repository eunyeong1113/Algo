package com.algo.date0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swexpert5603 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for (int tc = 1; tc <=T; tc++) {
			int N=Integer.parseInt(br.readLine());
			int []arr=new int[N];
			for (int i = 0; i < N; i++) {
				arr[i]=Integer.parseInt(br.readLine());
			}
			int minD=0;
			int maxD=0;
			int count=0;
			while(true) {
				int min = Integer.MAX_VALUE;
				int max = Integer.MIN_VALUE;
				for (int i = 0; i < N; i++) {
					if(min>arr[i])
					{
						min=arr[i];
						minD=i;
					}
					if(max<arr[i])
					{
						max=arr[i];
						maxD=i;
					}
				}
				arr[minD]++;
				arr[maxD]--;
				if(max==min)
					break;
				count++;
			}
			System.out.println("#"+tc+" "+count);

		}
	}
}
