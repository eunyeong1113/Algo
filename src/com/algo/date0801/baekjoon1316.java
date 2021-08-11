package com.algo.date0801;

import java.util.Scanner;

public class baekjoon1316 { //미완성

	public static void main(String[] args) {
		// aaabbbzzzb  abchsdfb
		//aba 스트링 
		/*그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
		예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
		aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.*/
		char[] ch = new char[26];
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int count=0;
		for (int i = 0; i < input; i++) {
			String s=sc.next();
			
			for(int j=0;j<s.length();j++)
			{
				for(int k=0;k<ch.length;k++)
				{
					
					ch[k]=(char)(97+k);
				
					char c=s.charAt(j);
					if(c==ch[k])
					{
						count++;
					}			
				}
				System.out.println(count);	
			}count=0;
			System.out.println(count);
		}
			
			//happy
			//new
			//year
			//aba=x aaba=x aabb=0 aaaaabbbbba=x
		System.out.println();		
	}
}
