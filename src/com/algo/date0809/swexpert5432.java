package com.algo.date0809;

import java.util.Scanner;
import java.util.Stack;

public class swexpert5432 {

	static char[] c;

	public static void main(String[] args) {
		Stack<Character> Iron = new Stack<Character>();
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int sum = 0;
		for (int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			c = new char[s.length()];
			for (int i = 0; i < s.length(); i++) {
				c[i] = s.charAt(i);
			}
			for (int i = 0; i < c.length; i++) {
				if (i + 1 < c.length) {
					if (c[i] == '(' && c[i + 1] == ')') {
						c[i] = '1';
						c[i + 1] = '1';
						sum += Iron.size();
					} 
					
				}
				if (c[i] == '(') {
					 Iron.push('(');
				} else if (c[i] == ')') {
					sum++;
					 Iron.pop();
				}
			}
			 System.out.println("#"+tc+" "+sum);
			 sum=0;
		}
	}

}
