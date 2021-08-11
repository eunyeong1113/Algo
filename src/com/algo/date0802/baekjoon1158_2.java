package com.algo.date0802;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon1158_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt=sc.nextInt();
		Queue<Integer> sort = new LinkedList<Integer>();
		Queue<Integer> ans = new LinkedList<Integer>();
		
		for (int i = 1; i <= N; i++) {
			sort.offer(i);//1234567
		}
		while(true) {
			
			if(ans.size()!=N)
			{
				for (int i = 1; i <= cnt; i++) {
					if(i==cnt)
						ans.offer(sort.poll());
					else
						sort.offer(sort.poll());
						
				}
			}
			else
				break;
			
		}
		System.out.print("<");
		for (int i = 0; i < N-1; i++) {
			System.out.print(ans.poll()+", ");
		}
		System.out.println(ans.poll()+">");
	}

}

