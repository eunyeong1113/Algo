package com.algo.date0813;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon17135 {
	static int N,M,D;
	static ArrayList<point> p;
	static int number[];
	static int map[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();//행의 수
		M=sc.nextInt();//열의 수
		D=sc.nextInt();//거리제한
		number=new int[3];
		map=new int[N+1][M];
		p=new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j]=sc.nextInt();
				if(map[i][j]==1) {
					p.add(new point(i,j));//적 위치 저장
				}
			}
		}
		for (int[] ma : map) {
			System.out.println(Arrays.toString(ma));
		}
		comb(0,0);
	}
	
	private static void comb(int cnt, int start) {
		if(cnt==3) {
			
			for (int i = 0; i < 3; i++) {
				System.out.println(Arrays.toString(number));
			}
			return;
		}
		for (int i = start; i < M; i++) {
			number[cnt]=i;//number=궁수위치
			comb(cnt+1,i+1);
		}
		
	}
}
class point{
	int X;
	int Y;
	public point(int x, int y) {
		this.X = x;
		this.Y = y;
	}
}
