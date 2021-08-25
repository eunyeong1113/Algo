package com.algo.date0824;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11723_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int bit=0;
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine()+" ");
			String s= st.nextToken();
			int num;
			switch(s) {
			case "all" :
				bit =(1<<21)-1;
				break;
			case "empty" :
				bit = 0;
				break;
			case "add" :
				num=Integer.parseInt(st.nextToken());
				bit |=(1<<num);
				break;
			case "remove" :
				num=Integer.parseInt(st.nextToken());
				bit &=~(1<<num);
				break;
			case "toggle" :
				num=Integer.parseInt(st.nextToken());
				bit ^=(1<<num);
				break;
			case "check" :
				num=Integer.parseInt(st.nextToken());
				sb.append((bit & (1<<num)) > 0 ? "1\n" : "0\n");
				break;
			}
		}
		System.out.println(sb.toString());
	}
}
