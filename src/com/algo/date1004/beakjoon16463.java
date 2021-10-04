package com.algo.date1004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon16463 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int day=13, ans=0;
		
		for (int year = 2019; year <=N; year++) {
			for (int i = 1; i <=12; i++) {
				if(day%7==4)ans++;
				day+=month[i];
				if(i==2) {
					if(year%400==0 || (year%100!=0 && year%4==0))
						day++;
				}
			}
		}
		System.out.println(ans);
	}

}
