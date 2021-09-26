package com.algo.date0926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon16953{

	static int A,B;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()+" ");
		
		A = Integer.parseInt(st.nextToken());
		String s = st.nextToken();
		B = Integer.parseInt(s);
		int cnt=0;
		int lastchar = s.charAt(s.length()-1)-'0';
		while(true) {
			if(B==A) {
				cnt++;
				System.out.println(cnt);
				break;
			}
			else if(B<A) {
				System.out.println(-1);
				break;
			}
			if(lastchar!=1 && B%2!=0)  {
				System.out.println(-1);
				break;
			}
			else if(lastchar==1) {
				B=B/10;
				s=Integer.toString(B);
				lastchar = s.charAt(s.length()-1)-'0';
				cnt++;
			}
			else if(B%2==0) {
				B=B/2;
				s=Integer.toString(B);
				lastchar = s.charAt(s.length()-1)-'0';
				cnt++;
			}
			
		}
		//42->21->20->10->5
	}
}
