package com.algo.date0805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2493 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int []arr=new int[N];
		int []ans=new int[N];
		for (int i = 0; i < N; i++) {
			
			arr[i]=Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i<j)
				{
					if(arr[i]>arr[j])
					{
						ans[j]=i+1;
					}
				}
			}
			System.out.print(ans[i]+" ");
			
		}System.out.println();
			
		bf.close();
	}

}
