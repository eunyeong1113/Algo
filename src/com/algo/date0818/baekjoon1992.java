package com.algo.date0818;

import java.util.HashSet;
import java.util.Scanner;

public class baekjoon1992 {

	static int num;									//영상의 크기
	static int[][] vid;								//영상을 저장할 배열
	static HashSet<Integer> set = new HashSet<>();	//압축된영상에 0,1 둘중 하나만 들어갔는지 판단하는 hashset
	static StringBuilder sb= new StringBuilder();	//출력을 위한 StringBuilder
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		vid = new int[num][num];

		for (int i = 0; i < num; i++) {
			String s = sc.next();
			for (int j = 0; j < num; j++) {
				vid[i][j] = s.charAt(j) - '0';
			}
		}//입력받기
		video(0, 0, num);
		System.out.println(sb.toString());//출력
	}

	private static boolean check(int r, int c, int num) {//압축된영상에 0 or 1만 있는지 확인
		set.clear();
		for (int i = r; i < r+num; i++) {
			for (int j = c; j < c+num; j++) {
				set.add(vid[i][j]);
			}
		}	
		if (set.size() == 1) {//size가 1이면 0 or 1만 있는 것이므로 true
			return true;
		}
		return false;
	}
	private static void video(int r, int c, int num) {
		if (check(r, c, num)) {
			if(set.contains(0))
				sb.append(0);//0출력
			else
				sb.append(1);//1출력
		}
		else {	
			sb.append("(");				//분할됐으므로 괄호출력
			int size=num/2;
			video(r,c,size);			//왼쪽 위
			video(r,c+size,size);		//오른쪽 위
			video(r+size,c,size);		//왼쪽 아래
			video(r+size,c+size,size);	//오른쪽 아래
			sb.append(")");
			
		}
	}

}
