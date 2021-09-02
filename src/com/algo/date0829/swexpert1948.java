package com.algo.date0829;

import java.util.Scanner;

public class swexpert1948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int sMonth=sc.nextInt();
			int sDay=sc.nextInt();
			int eMonth=sc.nextInt();
			int eDay=sc.nextInt();
			int sum=0;
			int [][]day= {
					{1,31},{2,28},{3,31},{4,30},{5,31},{6,30},{7,31},{8,31},{9,30},{10,31},{11,30},{12,31}
			};
			for (int i = sMonth; i <= eMonth; i++) {
				if(sMonth!= eMonth && i==sMonth)
					sum+=day[i-1][1]-sDay+1;
				else if(i==eMonth)
					sum+=eDay;
				else
					sum+=day[i-1][1];
			}
			System.out.println("#"+tc+" "+sum);
		}

	}

}
