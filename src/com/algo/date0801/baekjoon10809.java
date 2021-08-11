package com.algo.date0801;

import java.util.Scanner;

public class baekjoon10809 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []i=new int[26]; 
		String input=sc.next();
		int count=0;
		for (int j = 0; j <i.length; j++) {
			i[j]=-1;
			for (int j2 = 0; j2 < input.length(); j2++) {
				if(input.charAt(j2)-'a'==j&&count==0)
				{
					i[j]=j2;
					count++;
				}
				
			}count=0;
			System.out.print(i[j]+" ");
		}
		
		sc.close();
	}

}
