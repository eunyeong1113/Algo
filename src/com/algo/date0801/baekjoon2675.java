package com.algo.date0801;

import java.util.Scanner;

public class baekjoon2675 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int test=sc.nextInt();
		for (int i = 0; i <test; i++) {
			int num=sc.nextInt();
			String input=sc.next();
			for (int j2=0; j2 <input.length(); j2++) {
				//char c=input.charAt(j2);	
				for (int j = 0; j < num; j++) {		
					System.out.print(input.charAt(j2));
				}
			}	
			System.out.println();
		}
		
		sc.close();
	}
}
