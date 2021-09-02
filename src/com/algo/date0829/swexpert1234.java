package com.algo.date0829;

import java.util.ArrayList;
import java.util.Scanner;

public class swexpert1234 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			ArrayList<Integer> password = new ArrayList<>();
			String s = sc.next();
			for (int i = 0; i < N; i++) {
				password.add(s.charAt(i) - '0');
			}
			boolean check=false;
			while (true) {
				check=false;
				for (int i = 0; i < password.size(); i++) {
					if (i + 1 < password.size()) {
						if (password.get(i) == password.get(i + 1)) {
							password.remove(i);
							password.remove(i);
							check=true;
						}
					}
				}
				if(!check)
					break;
			}
			System.out.print("#"+tc+" ");
			for (int i = 0; i < password.size(); i++) {
				System.out.print(password.get(i));
			}System.out.println();
		}

	}

}
