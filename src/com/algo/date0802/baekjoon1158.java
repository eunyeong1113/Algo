package com.algo.date0802;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baekjoon1158 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		List<Integer> num=new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			num.add(i);
		}
		System.out.print("<");
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<k-1; j++) {
				num.add(num.get(0));
				num.remove(0);
			}
			if(i==n-1) {
				System.out.print(String.valueOf(num.get(0)));
				num.remove(0);
				break;
			}
			System.out.print(String.valueOf(num.get(0))+", ");
			num.remove(0);
		}System.out.println(">");
	}
}

