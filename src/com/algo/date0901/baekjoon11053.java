package com.algo.date0901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int[] arr= new int[N];
		int[] d= new int[N];
		StringTokenizer st=new StringTokenizer(br.readLine()+" ");
		for (int i = 0; i < N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		d[0]=1;
		for (int i = 1; i <N; i++) {
			d[i]=1;
			for (int j = 0; j < i; j++) {
				if(arr[i]>arr[j] &&d[i]<=d[j]) {
					d[i]=d[j]+1;
				}
			}
		}
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			max=Math.max(max, d[i]);
		}
		System.out.println(max);
	}

}
