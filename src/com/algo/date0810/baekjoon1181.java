package com.algo.date0810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class baekjoon1181{
	static String s[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(bf.readLine());
		s=new String[num];
		for (int i = 0; i < num; i++) {
			s[i]=bf.readLine();
		}
		
		Arrays.sort(s,new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if(s1.length()==s2.length()) {
					return s1.compareTo(s2); 
				}
				else {
					return s1.length()-s2.length();	
				}
				
			}
		});
		
		for (int i = 0; i < num; i++) {
			if(i+1<num && s[i].equals(s[i+1]))
				continue;
			System.out.println(s[i]);
		}
	}

}
