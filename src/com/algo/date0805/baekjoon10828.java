package com.algo.date0805;

import java.util.Scanner;
import java.util.Stack;
//시간초과
public class baekjoon10828 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st=new Stack<>();
		int T=sc.nextInt();		
		
		for (int i = 0; i < T; i++) {
			String s=sc.next();
			if(s.contains("push"))
			{
				int a=sc.nextInt();
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
