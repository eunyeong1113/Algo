package com.algo.date0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon1759 {

	static int L,C;
	static char []key,number;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()+" ");
		
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		key =new char[C];
		number =new char[L];
		st = new StringTokenizer(br.readLine()+" ");
		
		for (int i = 0; i < C; i++) {
			key[i]=st.nextToken().charAt(0);
		}
		Arrays.sort(key);
		comb(0,0);
		System.out.println(sb.toString());
	}

	private static void comb(int cnt, int start) {
		String s="";
		int count=0;
		for (int i = 0; i < L; i++) {
			s+=number[i];
			if(number[i]!='a'&&number[i]!='e'&&number[i]!='i'&&number[i]!='o'&&number[i]!='u')
				count++;
		}
		
		if(cnt==L)
		{
			if((s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u"))&&count>=2)
				sb.append(s+"\n");
			return;
		}
		for (int i = start; i < C; i++) {
			number[cnt]=key[i];
			comb(cnt+1,i+1);
		}
	}

}
