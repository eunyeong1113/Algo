package com.algo.date0806;

import java.util.Arrays;
import java.util.Scanner;

public class swexpert1861 {

	static int dx[] = { -1, 1, 0, 0 };
	static int dy[] = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int cnt = 1;
		for (int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt();
			int[][] arr = new int[num][num];
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for (int[] is : arr) {
				System.out.println(Arrays.toString(is));
			}
		}
	}
}
