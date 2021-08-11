package com.algo.date0811;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon2164 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int num=sc.nextInt();
	 Queue<Integer> card = new LinkedList<Integer>();
	 
	 for (int i = 0; i < num; i++) {
		card.offer(i+1);
	}
	 
	 while(card.size()>1) {//큐에 1개가 남을때 까지
		 card.poll();
		 card.offer(card.poll());
	 }
	 System.out.println(card.peek());
	 
	}

}
