package com.algo.date0803;

import java.util.Scanner;

//8  : 스위치 개수
//0 1 0 1 0 0 0 1  : 스위치 상태
//2  : 학생수
//1 3  : 남자 3  3 6
//2 3  : 여자 3  1~5 

//01110101
//10001101
public class baekjoon1244 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int []arr=new int[num];
		int gender=0;//성별
		int swi=0;//스위치
		int left=0;//왼
		int right=0;//오
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		//System.out.println(Arrays.toString(arr));
		
		int students = sc.nextInt();
		for (int i = 0; i < students; i++) {
			gender = sc.nextInt();
			swi = sc.nextInt();
			//System.out.println("gender/swi : "+gender+" "+swi);
			for (int j = 0; j < arr.length; j++) {
				if(gender==1)
				{
					int sum=j+1;
					sum=sum*swi;//1*1 1*2 1*3
					if(sum>arr.length)
						break;
					//System.out.println(sum);
					arr[sum-1]=arr[sum-1]==0?1:0;
				}
				else if (gender == 2) {
					left = (swi - 1) - j;// 2 1 0
					right = (swi - 1) + j;// 2 3 4
					
					//System.out.println("left/right : "+left+" "+right);
					if (left >= 0 && right < num) {
						if (left == right) {
							arr[left] = arr[left] == 0 ? 1 : 0;
						} else {
							if (arr[left] == arr[right]) {
								arr[left] = arr[left] == 0 ? 1 : 0;
								arr[right] = arr[right] == 0 ? 1 : 0;
							}
						}
					}
				}
			}
				
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
