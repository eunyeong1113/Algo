package com.algo.date0810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(bf.readLine());
		String s[]=new String[num];
		String ans[]=new String[num];
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < num; i++) {
			s[i]=bf.readLine();
		}
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < num; j++) {
				if(min>s[j].length())
				{
					min=s[j].length();
				}
			}
			
			
		}
		
		
	}

}
