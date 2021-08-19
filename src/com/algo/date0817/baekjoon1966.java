package com.algo.date0817;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon1966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<text> que = new LinkedList<text>();
		int N= sc.nextInt();//테스트케이스
		
		for (int i = 0; i < N; i++) {
			int num=sc.nextInt();//문서의 수
			int dir=sc.nextInt();//문서의 위치
			int max=-1;
			for (int j = 0; j < num; j++) {
				que.offer(new text(j, sc.nextInt()));
			}
			int count=0;
			int index=0;
			while(!que.isEmpty()) {
				
				for (int j = 0; j < que.size(); j++) {
					max=Math.max(max, que.peek().txt);
					que.add(que.poll());
				}
				while(true) {
					if(que.peek().txt==max)
					{	count++;
						if(que.peek().D==dir)
							index=count;
						que.poll();
						break;
					}	
					que.offer(que.poll());
				}
				
				max=-1;
			}
			System.out.println(index);
		}

	}

}
class text{
	int D;//위치
	int txt;
	public text(int d, int txt) {
		this.D = d;
		this.txt = txt;
	}
	
}
