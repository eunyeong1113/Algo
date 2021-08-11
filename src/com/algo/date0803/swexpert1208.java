package com.algo.date0803;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class swexpert1208 {//미완성
	
	static int MAX=0;
	static int MIN=100;
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc=new Scanner(System.in);
		int dump = sc.nextInt();
		int []box = new int[100];
		int a=0;
		int b=0;
		for (int i = 0; i < box.length; i++) {
			box[i]=sc.nextInt();
		}
		//System.out.println(Arrays.toString(box));
		while(true)
		{
			Arrays.sort(box);// 정렬하기
			int high=box[99]-box[0];
			if(high<=1 || dump<=0) {
				System.out.println("#"+high);
				break;
			}
			dump--;
			box[99]--;
			box[0]++;
		}
		//for (int i = 0; i < dump; i++) {
//			for (int j = 0; j < box.length; j++) {
//				if(MAX<box[j])
//				{
//					MAX=box[j];
//					a=j;
//				}
//				if(MIN>box[j]) {
//					MIN=box[j];
//					b=j;
//				}
//			}
//			
//			--box[a];
//			++box[b];	
//			MAX=box[a];
//			MIN=box[b];
//			
//		}
//		System.out.println(Arrays.toString(box));
//		System.out.println(MAX);
//		System.out.println(MIN);
		
	}
}
