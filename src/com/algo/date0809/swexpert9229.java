package com.algo.date0809;

import java.util.Scanner;

public class swexpert9229 {
	static int cookie[],numbers[];
	static int N,M,totalCnt;
	static int sum=0;
	static int max=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for (int tc = 1; tc <=T; tc++) {
			N=sc.nextInt();
			M = sc.nextInt();
			cookie = new int[N];
			numbers = new int[2];
			for (int i = 0; i < N; i++) {
				cookie[i] = sc.nextInt();
			}
			snack(0,1);
			System.out.println("#"+tc+" "+max);
			max=0;
		}
	}

	private static void snack(int cnt, int start) {
		if(cnt==2)
		{
			totalCnt++;
			sum=numbers[0]+numbers[1];
			if(sum<=M) {
				if(max<sum)
				{
					max=sum;
				}
			}
			else if(max==0)
				max=-1;
			
			return;
		}
		for (int i = start; i <= N; i++) {
			numbers[cnt]=cookie[i-1];
			snack(cnt+1,i+1);
		}
	} 
}
