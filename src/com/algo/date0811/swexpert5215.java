package com.algo.date0811;

import java.util.Scanner;

public class swexpert5215 {
	static int T, food, kal, sumKal, sumFood, MAX=0;
	static int[][] menu;
	static boolean[] isSelected;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			food = sc.nextInt();//재료의 개수
			kal = sc.nextInt();//제한 칼로리 
			isSelected = new boolean[food];
			menu = new int[food][2];
			for (int i = 0; i < food; i++) {
				for (int j = 0; j < 2; j++) {
					menu[i][j] = sc.nextInt();
				}
			} // menu[i][0]=점수,menu[i][1]=칼로리

			subset(0);
			System.out.println("#"+tc+" "+MAX);
			MAX=0;
		}

	}

	private static void subset(int cnt) {
		if (cnt == food) {
			sumKal = 0;
			sumFood = 0;
			for (int i = 0; i < food; i++) {
				if (isSelected[i]) {
					sumKal += menu[i][1];// menu[i][0]=점수,menu[i][1]=칼로리
					sumFood += menu[i][0];//맛 점수 합
				}
			}
			if (sumKal <= kal) {// 제한칼로리
				//System.out.println(sumKal+" "+sumFood);
				if (MAX < sumFood) {
					MAX=sumFood;
				}
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
