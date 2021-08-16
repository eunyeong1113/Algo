package com.algo.date0816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//부분집합
public class baekjoon1182 {
	
	static int N,S,count=0;
	static int number[];
	static boolean isSelected[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine()+" ");
		
		N=Integer.parseInt(st.nextToken());
		S=Integer.parseInt(st.nextToken());
		
		number=new int[N];
		isSelected=new boolean[N];
		st=new StringTokenizer(br.readLine()+" ");
		for (int i = 0; i < N; i++) {
			number[i]=Integer.parseInt(st.nextToken());
		}
		subset(0);
		System.out.println(count);
		
	}
	private static void subset(int cnt) {
		if(cnt==N) {
			int sum=0;
			int flag=0;
			for (int i = 0; i < N; i++) {
				if(isSelected[i]) {
					sum+=number[i];
					flag=1;
				}
			}
			if(flag==1 && sum==S)
				count++;
			return;
		}
		isSelected[cnt]=true;
		subset(cnt+1);
		isSelected[cnt]=false;
		subset(cnt+1);
	}

}
