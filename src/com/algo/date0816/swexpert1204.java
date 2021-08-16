package com.algo.date0816;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swexpert1204 {
	//0802강의 최빈수 구하기
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("input (1).txt"));;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		int []arr=new int[1000];
		int []score=new int[100];
		int count=0;
		int max=0;
		int maxScore=0;
		for (int i = 0; i < 100; i++) {
			score[i]=i+1;
		}//배열에 점수 넣기		
		for (int tc = 1; tc <=T; tc++) {
			int testcase=Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine()+" ");
			for (int i = 0; i < 1000; i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			max=0;
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 1000; j++) {
					if(arr[j]==score[i])
					{
						count++;
					}
				}
				max=Math.max(max, count);
				if(count==max)
				{
					maxScore=score[i];
				}
				count=0;
			}
			System.out.println("#"+tc+" "+maxScore);
		}
		
	}

}
