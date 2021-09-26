package com.algo.date0926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon16953_2 {

	static int A,B;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()+" ");
		
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		int cnt=1;
		while(B!=A) {
			if(B<A) {
				cnt=-1;
				break;
			}
			String s=Integer.toString(B);
			if(s.charAt(s.length()-1)!='1' && B%2!=0)  {
				cnt=-1;
				break;
			}
			
			if(B%2==0) {
				B=B/2;
			}
			else {
				 s = s.substring(0, s.length() - 1);
	             B = Integer.parseInt(s);
			}
			cnt++;
		}
		System.out.println(cnt);
		//42->21->20->10->5
	}
}
