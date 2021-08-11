package com.algo.date0803;

import java.util.Scanner;

public class swexpert1954 {

	static int T,N,C;
	static int [][]arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T= sc.nextInt();
		for (int k = 0; k < T; k++) {
			N = sc.nextInt();
			C=N*N;
			arr=new int[N][N];
			solution(1,0,N);
			System.out.println("#"+(k+1));
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
	private static void solution(int a, int x, int y) {
		if(a>C)
			return;
		
		for (int j = x; j < y; j++) {
			arr[x][j]=a;
			a++;
		}
	
		for (int i = x+1; i < y; i++) {
			arr[i][y-1]=a;
			a++;
		}
		for (int j = y-2; j >= x; j--) {
			arr[y-1][j]=a;
			a++;
		}
		for (int i = y-2; i > x; i--) {
			arr[i][x]=a;
			a++;
		}
		
		solution(a, x+1,y-1);
	}

}
