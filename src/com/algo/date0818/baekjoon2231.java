package com.algo.date0818;

import java.util.Scanner;

public class baekjoon2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int ans=0;
		for (int i = 0; i < num; i++) {
			int sum=i;//198+(1+9+8) = 자기자신+분해합 => i==자기자신
			int N=i;
			while(N!=0)
			{
				sum+=N%10;
				N/=10;
			}
			if(sum==num) {
				ans=i;
				break;
			}
		}
		System.out.println(ans);
	}
}
