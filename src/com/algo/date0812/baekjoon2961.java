package com.algo.date0812;

import java.util.Scanner;

public class baekjoon2961 {
	static boolean[] isSelected;
	static int T,min=Integer.MAX_VALUE;
	static flavor[] taste;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		taste=new flavor[T];
		isSelected = new boolean[T];
		for (int tc = 0; tc <T; tc++) {
			int sour=sc.nextInt();
			int bitter=sc.nextInt();
			taste[tc]=new flavor(sour, bitter);
		}
		
		subset(0);
		System.out.println(min);
		min=Integer.MAX_VALUE;
	}

	private static void subset(int cnt) {
		int tasteS=1;
		int tasteB=0;
		int flag=0;
		if (cnt == T) {
			for (int i = 0; i <T; i++) {
				if (isSelected[i]) {
					tasteS*=taste[i].Sour;
					tasteB+=taste[i].Bitter;
					 flag = 1;	
				}
			}//System.out.print(tasteS+" "+tasteB+"\n");
			if(min>Math.abs(tasteS-tasteB)&&flag==1)
			{
				min=Math.abs(tasteS-tasteB);
			}
			
			return;
		}
		//부분집합 코드
		isSelected[cnt] = true;
		subset(cnt + 1);
		isSelected[cnt] = false;
		subset(cnt + 1);
	}

}
class flavor{
	public int Sour;
	public int Bitter;
	public flavor(int sour, int bitter) {
		this.Sour = sour;
		this.Bitter = bitter;
	}
}
