package com.algo.date0803;

import java.util.Arrays;
import java.util.Scanner;

public class swexpert2805 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int num=sc.nextInt();
			int map[][]=new int[num][num];
			int center = num/2;//중간위치값
			//입력
			for (int j = 0; j < num; j++) {
				String s=sc.next();
				for (int j2 = 0; j2 < s.length(); j2++) {
					map[j][j2]=s.charAt(j2)-'0';
				}
			}
			for (int j = 0; j < map.length; j++) {
				for (int j2 = 0; j2 < map.length; j2++) {
					
				}
			}
			
			
			for (int[] cs : map) {
				System.out.println(Arrays.toString(cs));
			}
		}

	}

}
