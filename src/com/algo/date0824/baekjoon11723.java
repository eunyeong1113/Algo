package com.algo.date0824;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class baekjoon11723 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		HashSet<Integer> arr = new HashSet<>();
		
		String s[][] = new String[N][2];
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			if(input.contains("all")||input.contains("empty"))
				input+=" null";
			st = new StringTokenizer(input+" ");
			
			for (int j = 0; j < 2; j++) {
				s[i][j] = st.nextToken();
			}
			
			if(s[i][0].equals("add")) {
				arr.add(Integer.parseInt(s[i][1]));
			}
			else if(s[i][0].equals("remove"))
			{
				if(arr.contains(Integer.parseInt(s[i][1]))) {
					arr.remove(Integer.parseInt(s[i][1]));
				}
				else
					continue;
			}
			else if(s[i][0].equals("toggle"))
			{
				if(arr.contains(Integer.parseInt(s[i][1]))) {
					arr.remove(Integer.parseInt(s[i][1]));
				}
				else
					arr.add(Integer.parseInt(s[i][1]));
			}
			else if(s[i][0].equals("all"))
			{
				arr.clear();
				for (int j = 1; j <= 20; j++) {
					arr.add(j);
				}
			}
			else if(s[i][0].equals("empty"))
			{
				arr.clear();
			}
			else if(s[i][0].equals("check"))
			{
				if(arr.contains(Integer.parseInt(s[i][1]))) {
					sb.append(1+"\n");
				}
				else
					sb.append(0+"\n");
			}
		}
		System.out.println(sb.toString());
	}
}
