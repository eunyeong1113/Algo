package com.algo.date0802;

import java.util.Scanner;
import java.io.FileInputStream;

public class swexpert1289 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String a=sc.next();
			int count=0;
			
//			if(a.startsWith("1"))
//			{
//				count++;
//			}
//			for (int i = 0; i <a.length()-1; i++) {
//				if(a.charAt(i)!=a.charAt(i+1))
//				{
//					count++;
//				}
//					
//			}
			char[] arr=a.toCharArray();
			if(arr[0]=='1')
			{
				count++;
			}
			for (int i = 0; i < arr.length; i++) {
				if(i+1<arr.length)
				{	
					if(arr[i+1]!=arr[i])
					{
						count++;
					}
				}
			}
			System.out.println("#"+test_case+" "+count);
			//0011=>0011 count=1
			//100=>111=>100 count=2
			//1010=>1111=>1000=>1011=>1010 count=4
			
		}
		
	}
}