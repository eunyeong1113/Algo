package com.algo.date0805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon10828_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> st=new Stack<>();
		int T=Integer.parseInt(bf.readLine());		
		
		for (int i = 0; i < T; i++) {
			String s=bf.readLine();
			if(s.contains("push"))
			{   String spt[] = s.split(" ");
				int a=Integer.parseInt(spt[1]);
				st.push(a);
			}
			else if(s.equals("top"))
				System.out.println(st.isEmpty()? -1: st.peek());
			else if(s.equals("size"))
				System.out.println(st.size());
			else if(s.equals("empty"))
				System.out.println(st.isEmpty()? 1: 0);
			else if(s.equals("pop"))
				System.out.println(st.isEmpty()? -1: st.pop());
			
		}
		
	}
}
