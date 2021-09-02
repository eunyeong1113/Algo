package com.algo.date0827;

import java.util.Scanner;

public class baekjoon12927 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		char c[] = new char[s.length()];
		int count = 0;
		int Y = 0;
		int N = 0;
		c = s.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'Y')
				Y++;
			else
				N++;
		}

		while (true) {
			if (Y >= N) {
				for (int i = 0; i < c.length; i++) {
					if (c[i] == 'N') {
						int num = i + 1;// 1
						count++;
						if (num == 1) {
							for (int j = 0; j < c.length; j++) {
								if (c[j] == 'N')
									c[j] = 'Y';
								else
									c[j] = 'N';
							}
						} else {
							for (int j = 0; j < c.length; j++) {
								if ((j * num) - 1 >= 0 && (j * num) - 1 < c.length) {
									if (c[(j * num) - 1] == 'N')
										c[(j * num) - 1] = 'Y';
									else
										c[(j * num) - 1] = 'N';
								}
							}
						}
					}
				}

				if (!c.toString().contains("N")) {
					count++;
					break;
				}

			} else if (N > Y) {
				for (int i = 0; i < c.length; i++) {
					if (c[i] == 'Y') {
						int num = i + 1;
						count++;
						if (num == 1) {
							for (int j = 0; j < c.length; j++) {
								if (c[j] == 'N')
									c[j] = 'Y';
								else
									c[j] = 'N';
							}
						} 
						else {
							for (int j = 0; j < c.length; j++) {
								if ((j * num) - 1 >= 0 && (j * num) - 1 < c.length)
									if (c[(j * num) - 1] == 'N')
										c[(j * num) - 1] = 'Y';
									else
										c[(j * num) - 1] = 'N';
							}
						}
					}
				}
				if (!c.toString().contains("Y")) {
					break;
				}
			}
		}
		System.out.println(count);
	}
}
