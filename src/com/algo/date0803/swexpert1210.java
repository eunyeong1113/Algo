package com.algo.date0803;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class swexpert1210 {//미완성
	static int dx[]= {0,0};
	static int dy[]= {-1,1};
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input1.txt"));
		Scanner sc=new Scanner(System.in);
		int start = sc.nextInt();
		int [][]arr=new int[100][100];
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				
				arr[i][j]=sc.nextInt();
			}
		}
//		for (int[] is : arr) {
//			System.out.println(Arrays.toString(is));
//		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i+1<100) {
				if(arr[i+1][j]==1)
				{
					arr[i][j]=3;
					for (int j2 = 0; j2 < 2; j2++) {
						int x=i+dx[j2];
						int y=j+dy[j2];
						if(x>=0&&x<100&&y>=0&&y<100)
						{
							if(arr[x][j]==1)
							{
								arr[x][y]=3;
							}
						}
					}
					
				}
			}
				if(i==arr.length-1)
				{
					if(arr[i][j]==2)
						System.out.println("#"+start+" "+j);
				}
			}
		}
//		for (int[] is : arr) {
//			System.out.println(Arrays.toString(is));
//		}
//		System.out.println();
	}

}
