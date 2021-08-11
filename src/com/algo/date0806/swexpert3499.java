package com.algo.date0806;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class swexpert3499 {

	public static void main(String[] args) {
		Queue<String> card=new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		int num,num2;
		for (int tc = 1; tc <= T; tc++) {
			num=sc.nextInt();
			String[] s=new String[num];
			for (int i = 0; i < num; i++) {
				s[i] = sc.next();
			}//입력
			//System.out.println(Arrays.toString(s));
			
			num2=num%2==0? num/2:(num/2)+1;
			String [] a=new String[num2];
			String [] b=new String[num/2];
			int cnt=0;
			for (int i = 0; i < num; i++) {
				if(i<num2)
					a[i]=s[i];
				else
				{	b[cnt]=s[i];
					cnt++;
				}
			}
			for (int i = 0; i <num2; i++) {
				card.offer(a[i]);
				if(a.length!=b.length)
				{	if(i<num2-1)
						card.offer(b[i]);
				}	
				else
					card.offer(b[i]);
			}
			System.out.print("#"+tc+" ");
			for (int i = 0; i < num; i++) {
				System.out.print(card.poll()+" ");
			}System.out.println();
			
		}
	}
}
