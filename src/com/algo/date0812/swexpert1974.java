package com.algo.date0812;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class swexpert1974 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		boolean ans=false;
		int [][]sudoku=new int[9][9];
		for (int tc = 1; tc <=T; tc++) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sudoku[i][j]=sc.nextInt();
				}
			}
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					arr.add(sudoku[i][j]);
				}
				Collections.sort(arr);
				for (int j = 0; j < 9; j++) {
					if(arr.get(j)==j+1)
						ans=true;
					else
						ans=false;
				}
				arr.clear();
			}
			
			print(sudoku);
			System.out.println();
		}
		
		
	}
	private static void print(int[][] map) {
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map.length; c++) {
				System.out.print(map[r][c]+" ");
			}System.out.println();
		}
	}
}
