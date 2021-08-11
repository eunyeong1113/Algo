package com.algo.date0810;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon1436 {	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		ArrayList<String> six = new ArrayList<>();
		for (int i = 1; i <=3000000; i++) {
			String to=Integer.toString(i);
			if(to.contains("666"))
				six.add(to);
		}
		System.out.println(six.get(s-1));
	}
}
