package com.algo.date0829;

import java.util.Scanner;

public class swexpert1208 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int N= sc.nextInt();
			int[] box=new int[100];
			for (int i = 0; i <100; i++) {
				box[i]=sc.nextInt();
			}
			int cnt=0;
			while(true) {
				int max=Integer.MIN_VALUE;
				int min=Integer.MAX_VALUE;
				int maxD=0;
				int minD=0;
				for (int i = 0; i < 100; i++) {
					if(max<box[i]) {
						max=box[i];
						maxD=i;
					}
					if(min>box[i]) {
						min=box[i];
						minD=i;
					}
				}
			
				if(cnt==N) {
					System.out.println("#"+tc+" "+(box[maxD]-box[minD]));
					break;
				}
				if(max-min==1) {
					System.out.println("#"+tc+" "+1);
					break;
				}
				box[maxD]--;
				box[minD]++;
				cnt++;
				
			}
		}

	}

}
