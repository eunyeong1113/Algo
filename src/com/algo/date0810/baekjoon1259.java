package com.algo.date0810;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		
		
		while (true) {
			boolean a = true;
			String s = sc.nextLine();
			
			if (s.equals("0"))
				System.exit(0);
			
			for (int i = 0; i < s.length(); i++) {
				arr.add(s.charAt(i) - '0');
			}
			for (int i = 0; i < arr.size() / 2; i++) {
				if (arr.get(i) != arr.get(arr.size() - i - 1)) {
					a = false;
				}
			}
			arr.clear();
			if (a == true) {
				System.out.println("yes");
			} else
				System.out.println("no");	
		}
	}
}
