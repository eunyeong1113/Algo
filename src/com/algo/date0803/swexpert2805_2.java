package com.algo.date0803;

import java.util.Arrays;
import java.util.Scanner;

public class swexpert2805_2 {//미완성

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int num=sc.nextInt();
			int map[][]=new int[num][num];
			int center = num/2;//중간위치값
			//입력
			for (int i = 0; i < num; i++) {
				char[] tmp=sc.next().toCharArray();
				for (int j = 0; j < num; j++) {
					map[i][j]=tmp[j]-'0';
				}
			}
			//입력확인
			for (int[] cs : map) {
				System.out.println(Arrays.toString(cs));
			}
			int sum=0, begin, end, gap=0;
			for (int i = 0; i < num; i++) {//행접근. 아래로 내러감. 
				begin = center-gap;//한 행의 시작 인덱스
				end = center+gap;//한 행의 끝 인덱스
				
				for (int j = begin; j < end; j++) {//열접근. begin~end열의 값들을 수확
					sum+=map[i][j];
				}
				if(i<center) {//중간보다 위
					gap++;
				}else{//i>=center
					gap--;
				}
			}
			System.out.println("#"+tc+" "+sum);
			
			
			
		}

	}

}
