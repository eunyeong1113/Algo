package com.algo.date0812;

import java.util.Scanner;

public class baekjoon2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		while(true) {
			if(num%5==0)
			{
				count+=num/5;
				System.out.println(count);
				break;
			}
			else {
				num-=3;
				count++;
			}
			if(num<0)
			{
				System.out.println(-1);
				break;
			}
		}

	}
}
