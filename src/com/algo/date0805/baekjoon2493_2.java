package com.algo.date0805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class baekjoon2493_2 {
//교수님 해설

	static String src="5\r\n" + 
			"6 9 5 7 4";
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		bf = new BufferedReader(new StringReader(src));
		
		Stack<Tower> stack = new Stack<>();
		int num,height;
		int N=Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		//입력받은 값들을 하나씩 꺼내서 체크
		for (num = 1 ; num <= N; num++) {
			height=Integer.parseInt(st.nextToken());
			
			//스택을 조사 
			while(!stack.empty()){
				if(stack.peek().height>=height) {//받을 수 있음
					System.out.print(stack.peek().num+" ");
					break;
				}
				stack.pop();
			}
			
			//스택이 비어있는것
			//while
			if(stack.isEmpty()) {
				System.out.print(0+" ");
			}
			
			stack.push(new Tower(num,height));
		}
		
	}
	//static inner class
	static class Tower{
		int num;//탑 번호
		int height;//탑 높이
		public Tower(int num, int height) {
			this.num = num;
			this.height = height;
		}
	}

}
