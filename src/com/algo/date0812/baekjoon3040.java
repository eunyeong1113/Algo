package com.algo.date0812;

import java.util.Scanner;

public class baekjoon3040 {

	static int N = 7;
	static int[] num,dwarf,ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = new int[N];
		ans = new int[N];
		dwarf = new int[9];
		for (int i = 0; i < 9; i++) {
			dwarf[i] = sc.nextInt();
		}
		com(0, 0);
	}

	// 조합
	private static void com(int cnt, int start) {// 0,1
		int sum=0;
		if (cnt == N) {
			for (int j = 0; j < 7; j++) {
				sum+=num[j];
				ans[j]=num[j];
			}	
			
			for (int i = 0; i < 7; i++) {
				if(sum==100)
					System.out.println(ans[i]+" ");
			}

			return;
		}
		for (int i = start; i < 9; i++) {
			num[cnt] =dwarf[i];
			com(cnt + 1, i + 1);
		}
	}
}
