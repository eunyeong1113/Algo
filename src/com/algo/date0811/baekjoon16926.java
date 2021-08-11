package com.algo.date0811;

import java.util.Scanner;

public class baekjoon16926 {

	static int R,C,Rotate,max;
	static int[][] arr,ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		R=sc.nextInt();
		C=sc.nextInt();
		max=Math.max(R, C);
		
		Rotate = sc.nextInt();
		
		arr=new int[R][C];
		ans=new int[R][C];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for (int k = 0; k < Rotate; k++) {
			solution(0,0,R,C);	
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					arr[i][j]=ans[i][j];
				}
			}
		}
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	private static void solution(int x,int y,int r,int c) {
		if(max==R)
		{	
			if(x>=c)
				return;
		}
		else if(max==C)
		{	
			if(y>=r)
				return;
		}
		for (int i = x; i < r-1; i++) {//왼쪽줄 
			ans[i+1][y]=arr[i][y];
		}
	
		for (int i = y; i < c-1; i++) {//맨밑
			ans[r-1][i+1]=arr[r-1][i];
		}
		for (int i = r-1; i > x; i--) {//오른쪽
			ans[i-1][c-1]=arr[i][c-1];
		}
		for (int i = c-1; i > y; i--) {//위
			ans[x][i-1]=arr[x][i];
		}
		
		
		if(r-x==1)
		{
			for (int i = x; i < c; i++) {
				ans[x][i]=arr[x][i];
			}
		}
		else if(c-y==1)
		{
			for (int i = y; i < r; i++) {
				ans[i][y]=arr[i][y];
			}
		}
		solution(x+1,y+1,r-1,c-1);
	}
}
