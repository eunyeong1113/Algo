package com.algo.date0803;

import java.util.Scanner;

public class baekjoon1015_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];//원래 배열
		int ans[]=new int[num];
		int a=0;
		for (int i = 0; i < num; i++) {
			arr[i]=sc.nextInt();
		}
		int min=1001;
			for (int k = 0; k < num; k++) {
				for (int i = 0; i < num; i++) {
					
					if(arr[i]!=-1)
					{	
						if(min>arr[i])
							min=arr[i];
					}
					
				}
				for (int i = 0; i < num; i++) {
					if(min==arr[i])
					{
						ans[i]=a;
						a++;
						arr[i]=-1;
						min=1001;
					}
				}
			}
			
			for (int i = 0; i < ans.length; i++) {
				System.out.print(ans[i]+" ");
			}
			
	}
}
