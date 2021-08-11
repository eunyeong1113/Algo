package com.algo.date0810;

import java.util.Scanner;

public class baekjoon1085 {
	public static void main(String[] args) {
		/*6 2 10 3 = x y w h 시작 0.0 답=1*/  
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int w=sc.nextInt();
		int h=sc.nextInt();
		int min=1000;
		int []a={x-0,y-0,w-x,h-y};
		for (int i = 0; i < a.length; i++) {
			
			if(min>a[i])
				min=a[i];
		}
		System.out.println(min);
		
	}
}
