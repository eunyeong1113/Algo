package com.algo.date0810;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Character> answer = new LinkedList<>();
		boolean a = false;
		int num=sc.nextInt();
		for (int i = 0; i < num; i++) {
			String s=sc.next();
			if(s.length()%2==0) {//입력하는 개수가 짝수일때 
				a=true;
				for (int j = 0; j < s.length(); j++) {
					if(s.charAt(j)=='(') // ( 큐에 넣기
						answer.offer('(');
					else if(s.charAt(j)==')') // )일 때 큐에서 빼기
					{	if(!answer.isEmpty())// 큐가 비어있지 않을때 
							answer.poll(); //( 빼기
						else//큐가 비어있을때 )나오면 개수가 안맞는 것이므로 false
							a=false;//
					}	
				}//for j
				if(!answer.isEmpty())
					a=false;

			}//if 입력개수 짝수
			else {
				a=false;
			}
			answer.clear();
			
			if(a==true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}	
		
	}

}
