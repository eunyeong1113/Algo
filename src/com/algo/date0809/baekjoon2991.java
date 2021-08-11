package com.algo.date0809;

import java.util.Scanner;
//Main
public class baekjoon2991 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // A분동안 사나움 12
		int B = sc.nextInt(); // B분동안 쉼 34
		int C = sc.nextInt(); // C분동안 사나움
		int D = sc.nextInt(); // D분동안 쉼

		for (int t = 0; t < 3; t++) {
			int person = sc.nextInt();// 1 3 4
			int dog1=0;
			int dog2=0;	
			int cnt=0;
			while(dog1<=person)
			{
				for (int i = 1; i <= A+B; i++) {
					++dog1;
					if(i<=A){
						if(dog1==person)
							cnt++;
					}
				}
			}
			while(dog2<=person)
			{
				for (int i = 1; i <= C+D; i++) {
					++dog2;
					if(i<=C) {
						if(dog2==person)
							cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
